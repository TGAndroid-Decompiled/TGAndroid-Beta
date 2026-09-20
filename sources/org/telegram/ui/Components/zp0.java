package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class zp0 extends ju {
    public boolean V;
    public int W;
    public int f30893a0;
    public ValueAnimator f30894b0;
    public final uq0 f30895c0;

    public zp0(uq0 uq0Var, Context context, fq0 fq0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, fq0Var, null, 1, true, f6Var);
        this.f30895c0 = uq0Var;
    }

    @Override
    public final void c(float f7) {
        this.f30895c0.Y0();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            bu editText = this.f30895c0.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f30893a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new p70(editText, 18));
            ValueAnimator valueAnimator = this.f30894b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f30894b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(qr.f27642f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void f() {
        super.f();
        kz emojiView = getEmojiView();
        uq0 uq0Var = this.f30895c0;
        if (emojiView != null) {
            emojiView.f25960w0 = false;
            emojiView.f25962w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(uq0Var.G0.d);
        }
        FrameLayout frameLayout = uq0Var.f28808c0;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        yp0 yp0Var = uq0Var.f28807c;
        if (yp0Var != null) {
            yp0Var.bringToFront();
        }
        yp0 yp0Var2 = uq0Var.f28811f;
        if (yp0Var2 != null) {
            yp0Var2.bringToFront();
        }
    }

    @Override
    public final void q(int i10, int i11) {
        uq0 uq0Var = this.f30895c0;
        yp0 yp0Var = uq0Var.f28807c;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f30893a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        uq0Var.f28830v0 = yp0Var.getTop() + uq0Var.f28829u0;
        yp0Var.invalidate();
    }
}
