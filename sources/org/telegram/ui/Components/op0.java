package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class op0 extends cu {
    public boolean S;
    public int T;
    public int U;
    public ValueAnimator V;
    public final lq0 W;

    public op0(lq0 lq0Var, Context context, wp0 wp0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, wp0Var, null, 1, true, f6Var);
        this.W = lq0Var;
    }

    @Override
    public final void c(float f10) {
        this.W.Y0();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.S) {
            ut editText = this.W.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.U - editText.getScrollY()) + (this.T - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new j70(editText, 18));
            ValueAnimator valueAnimator = this.V;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.V = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(mr.f27122f);
            ofFloat.start();
            this.S = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void f() {
        super.f();
        kz emojiView = getEmojiView();
        lq0 lq0Var = this.W;
        if (emojiView != null) {
            emojiView.f26482t0 = false;
            emojiView.f26487u2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(lq0Var.D0.d);
        }
        FrameLayout frameLayout = lq0Var.Z;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        np0 np0Var = lq0Var.f26835c;
        if (np0Var != null) {
            np0Var.bringToFront();
        }
        np0 np0Var2 = lq0Var.f26839f;
        if (np0Var2 != null) {
            np0Var2.bringToFront();
        }
    }

    @Override
    public final void q(int i10, int i11) {
        lq0 lq0Var = this.W;
        np0 np0Var = lq0Var.f26835c;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.S = true;
            this.T = getEditText().getMeasuredHeight();
            this.U = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.S = false;
        }
        lq0Var.f26855s0 = np0Var.getTop() + lq0Var.f26853r0;
        np0Var.invalidate();
    }
}
