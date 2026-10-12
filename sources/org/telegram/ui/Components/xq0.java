package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class xq0 extends cv {
    public boolean V;
    public int W;
    public int f32820a0;
    public ValueAnimator f32821b0;
    public final sr0 f32822c0;

    public xq0(sr0 sr0Var, Context context, dr0 dr0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, dr0Var, null, 1, true, c6Var);
        this.f32822c0 = sr0Var;
    }

    @Override
    public final void c(float f7) {
        this.f32822c0.Z0();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            uu editText = this.f32822c0.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f32820a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new m80(editText, 19));
            ValueAnimator valueAnimator = this.f32821b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f32821b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(js.f27634f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void f() {
        super.f();
        d00 emojiView = getEmojiView();
        sr0 sr0Var = this.f32822c0;
        if (emojiView != null) {
            emojiView.f25135w0 = false;
            emojiView.f25137w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(sr0Var.G0.d);
        }
        FrameLayout frameLayout = sr0Var.f30636c0;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        wq0 wq0Var = sr0Var.f30635c;
        if (wq0Var != null) {
            wq0Var.bringToFront();
        }
        wq0 wq0Var2 = sr0Var.f30640f;
        if (wq0Var2 != null) {
            wq0Var2.bringToFront();
        }
    }

    @Override
    public final void q(int i10, int i11) {
        sr0 sr0Var = this.f32822c0;
        wq0 wq0Var = sr0Var.f30635c;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f32820a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        sr0Var.f30659v0 = wq0Var.getTop() + sr0Var.f30658u0;
        wq0Var.invalidate();
    }
}
