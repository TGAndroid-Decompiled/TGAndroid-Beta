package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class bq0 extends ju {
    public boolean V;
    public int W;
    public int f23074a0;
    public ValueAnimator f23075b0;
    public final wq0 f23076c0;

    public bq0(wq0 wq0Var, Context context, hq0 hq0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, hq0Var, null, 1, true, f6Var);
        this.f23076c0 = wq0Var;
    }

    @Override
    public final void c(float f7) {
        this.f23076c0.Y0();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            bu editText = this.f23076c0.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f23074a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new s70(editText, 18));
            ValueAnimator valueAnimator = this.f23075b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f23075b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(qr.f27653f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void f() {
        super.f();
        kz emojiView = getEmojiView();
        wq0 wq0Var = this.f23076c0;
        if (emojiView != null) {
            emojiView.f25920w0 = false;
            emojiView.f25922w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(wq0Var.G0.d);
        }
        FrameLayout frameLayout = wq0Var.f30101c0;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        aq0 aq0Var = wq0Var.f30100c;
        if (aq0Var != null) {
            aq0Var.bringToFront();
        }
        aq0 aq0Var2 = wq0Var.f30104f;
        if (aq0Var2 != null) {
            aq0Var2.bringToFront();
        }
    }

    @Override
    public final void q(int i10, int i11) {
        wq0 wq0Var = this.f23076c0;
        aq0 aq0Var = wq0Var.f30100c;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f23074a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        wq0Var.f30123v0 = aq0Var.getTop() + wq0Var.f30122u0;
        aq0Var.invalidate();
    }
}
