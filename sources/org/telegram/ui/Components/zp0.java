package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class zp0 extends ku {
    public boolean V;
    public int W;
    public int f30956a0;
    public ValueAnimator f30957b0;
    public final uq0 f30958c0;

    public zp0(uq0 uq0Var, Context context, fq0 fq0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, fq0Var, null, 1, true, d6Var);
        this.f30958c0 = uq0Var;
    }

    @Override
    public final void c(float f7) {
        this.f30958c0.Y0();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            cu editText = this.f30958c0.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f30956a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new s70(editText, 18));
            ValueAnimator valueAnimator = this.f30957b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f30957b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(rr.f28030f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void f() {
        super.f();
        lz emojiView = getEmojiView();
        uq0 uq0Var = this.f30958c0;
        if (emojiView != null) {
            emojiView.f26298w0 = false;
            emojiView.f26300w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(uq0Var.G0.d);
        }
        FrameLayout frameLayout = uq0Var.f28877c0;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        yp0 yp0Var = uq0Var.f28876c;
        if (yp0Var != null) {
            yp0Var.bringToFront();
        }
        yp0 yp0Var2 = uq0Var.f28880f;
        if (yp0Var2 != null) {
            yp0Var2.bringToFront();
        }
    }

    @Override
    public final void q(int i10, int i11) {
        uq0 uq0Var = this.f30958c0;
        yp0 yp0Var = uq0Var.f28876c;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f30956a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        uq0Var.f28899v0 = yp0Var.getTop() + uq0Var.f28898u0;
        yp0Var.invalidate();
    }
}
