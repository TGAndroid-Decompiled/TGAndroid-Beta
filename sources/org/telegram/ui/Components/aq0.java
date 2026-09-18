package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class aq0 extends ju {
    public boolean V;
    public int W;
    public int f22693a0;
    public ValueAnimator f22694b0;
    public final vq0 f22695c0;

    public aq0(vq0 vq0Var, Context context, gq0 gq0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, gq0Var, null, 1, true, e6Var);
        this.f22695c0 = vq0Var;
    }

    @Override
    public final void c(float f7) {
        this.f22695c0.Y0();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            bu editText = this.f22695c0.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f22693a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new q70(editText, 18));
            ValueAnimator valueAnimator = this.f22694b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f22694b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(qr.f27715f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void f() {
        super.f();
        kz emojiView = getEmojiView();
        vq0 vq0Var = this.f22695c0;
        if (emojiView != null) {
            emojiView.f25954w0 = false;
            emojiView.f25956w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(vq0Var.G0.d);
        }
        FrameLayout frameLayout = vq0Var.f29716c0;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        zp0 zp0Var = vq0Var.f29715c;
        if (zp0Var != null) {
            zp0Var.bringToFront();
        }
        zp0 zp0Var2 = vq0Var.f29719f;
        if (zp0Var2 != null) {
            zp0Var2.bringToFront();
        }
    }

    @Override
    public final void q(int i10, int i11) {
        vq0 vq0Var = this.f22695c0;
        zp0 zp0Var = vq0Var.f29715c;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f22693a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        vq0Var.f29738v0 = zp0Var.getTop() + vq0Var.f29737u0;
        zp0Var.invalidate();
    }
}
