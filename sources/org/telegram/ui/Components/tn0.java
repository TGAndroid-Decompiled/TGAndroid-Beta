package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class tn0 extends lt {
    public boolean V;
    public int W;
    public int f38458a0;
    public ValueAnimator f38459b0;
    public final no0 f38460c0;

    public tn0(no0 no0Var, Context context, ao0 ao0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, ao0Var, null, 1, true, g6Var);
        this.f38460c0 = no0Var;
    }

    @Override
    public final void c(float f10) {
        this.f38460c0.Z0();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            zs editText = this.f38460c0.f36441k1.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f38458a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new d60(editText, 17));
            ValueAnimator valueAnimator = this.f38459b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f38459b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(xq.f40458f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void f() {
        super.f();
        hy emojiView = getEmojiView();
        no0 no0Var = this.f38460c0;
        if (emojiView != null) {
            emojiView.f34476w0 = false;
            emojiView.f34482x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(no0Var.f36468y2.d);
        }
        FrameLayout frameLayout = no0Var.U1;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        sn0 sn0Var = no0Var.f36439j1;
        if (sn0Var != null) {
            sn0Var.bringToFront();
        }
        sn0 sn0Var2 = no0Var.f36444m1;
        if (sn0Var2 != null) {
            sn0Var2.bringToFront();
        }
    }

    @Override
    public final void q(int i7, int i10) {
        no0 no0Var = this.f38460c0;
        sn0 sn0Var = no0Var.f36439j1;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f38458a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        no0Var.f36446n2 = sn0Var.getTop() + no0Var.f36445m2;
        sn0Var.invalidate();
    }
}
