package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class aq0 extends lu {
    public boolean V;
    public int W;
    public int f22727a0;
    public ValueAnimator f22728b0;
    public final vq0 f22729c0;

    public aq0(vq0 vq0Var, Context context, gq0 gq0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, gq0Var, null, 1, true, d6Var);
        this.f22729c0 = vq0Var;
    }

    @Override
    public final void c(float f7) {
        this.f22729c0.Y0();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            du editText = this.f22729c0.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f22727a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new t70(editText, 18));
            ValueAnimator valueAnimator = this.f22728b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f22728b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(sr.f28339f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void f() {
        super.f();
        mz emojiView = getEmojiView();
        vq0 vq0Var = this.f22729c0;
        if (emojiView != null) {
            emojiView.f26610w0 = false;
            emojiView.f26612w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(vq0Var.G0.d);
        }
        FrameLayout frameLayout = vq0Var.f29719c0;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        zp0 zp0Var = vq0Var.f29718c;
        if (zp0Var != null) {
            zp0Var.bringToFront();
        }
        zp0 zp0Var2 = vq0Var.f29722f;
        if (zp0Var2 != null) {
            zp0Var2.bringToFront();
        }
    }

    @Override
    public final void q(int i10, int i11) {
        vq0 vq0Var = this.f22729c0;
        zp0 zp0Var = vq0Var.f29718c;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f22727a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        vq0Var.f29741v0 = zp0Var.getTop() + vq0Var.f29740u0;
        zp0Var.invalidate();
    }
}
