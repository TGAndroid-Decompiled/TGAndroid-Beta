package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class sn0 extends kt {
    public boolean V;
    public int W;
    public int f38085a0;
    public ValueAnimator f38086b0;
    public final mo0 f38087c0;

    public sn0(mo0 mo0Var, Context context, zn0 zn0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, zn0Var, null, 1, true, f6Var);
        this.f38087c0 = mo0Var;
    }

    @Override
    public final void c(float f10) {
        this.f38087c0.Z0();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            ys editText = this.f38087c0.f36003k1.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f38085a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new c60(editText, 17));
            ValueAnimator valueAnimator = this.f38086b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f38086b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(xq.f40329f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void f() {
        super.f();
        gy emojiView = getEmojiView();
        mo0 mo0Var = this.f38087c0;
        if (emojiView != null) {
            emojiView.f34085w0 = false;
            emojiView.f34091x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(mo0Var.f36030y2.d);
        }
        FrameLayout frameLayout = mo0Var.U1;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        rn0 rn0Var = mo0Var.f36001j1;
        if (rn0Var != null) {
            rn0Var.bringToFront();
        }
        rn0 rn0Var2 = mo0Var.f36006m1;
        if (rn0Var2 != null) {
            rn0Var2.bringToFront();
        }
    }

    @Override
    public final void q(int i7, int i10) {
        mo0 mo0Var = this.f38087c0;
        rn0 rn0Var = mo0Var.f36001j1;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f38085a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        mo0Var.f36008n2 = rn0Var.getTop() + mo0Var.f36007m2;
        rn0Var.invalidate();
    }
}
