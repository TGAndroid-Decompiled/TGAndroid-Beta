package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class np0 extends ju {
    public boolean V;
    public int W;
    public int f26514a0;
    public ValueAnimator f26515b0;
    public final iq0 f26516c0;

    public np0(iq0 iq0Var, Context context, tp0 tp0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, tp0Var, null, 1, true, f6Var);
        this.f26516c0 = iq0Var;
    }

    @Override
    public final void c(float f7) {
        this.f26516c0.Y0();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            bu editText = this.f26516c0.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f26514a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new h70(editText, 18));
            ValueAnimator valueAnimator = this.f26515b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f26515b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(qr.f27383f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void f() {
        super.f();
        kz emojiView = getEmojiView();
        iq0 iq0Var = this.f26516c0;
        if (emojiView != null) {
            emojiView.f25778w0 = false;
            emojiView.f25780w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(iq0Var.G0.d);
        }
        FrameLayout frameLayout = iq0Var.f24991c0;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        mp0 mp0Var = iq0Var.f24990c;
        if (mp0Var != null) {
            mp0Var.bringToFront();
        }
        mp0 mp0Var2 = iq0Var.f24994f;
        if (mp0Var2 != null) {
            mp0Var2.bringToFront();
        }
    }

    @Override
    public final void q(int i10, int i11) {
        iq0 iq0Var = this.f26516c0;
        mp0 mp0Var = iq0Var.f24990c;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f26514a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        iq0Var.f25013v0 = mp0Var.getTop() + iq0Var.f25012u0;
        mp0Var.invalidate();
    }
}
