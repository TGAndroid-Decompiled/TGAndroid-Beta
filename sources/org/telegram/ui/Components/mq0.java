package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class mq0 extends ou {
    public boolean V;
    public int W;
    public int f28672a0;
    public ValueAnimator f28673b0;
    public final hr0 f28674c0;

    public mq0(hr0 hr0Var, Context context, sq0 sq0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, sq0Var, null, 1, true, g6Var);
        this.f28674c0 = hr0Var;
    }

    @Override
    public final void c(float f7) {
        this.f28674c0.e1();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            gu editText = this.f28674c0.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f28672a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new b80(editText, 19));
            ValueAnimator valueAnimator = this.f28673b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f28673b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(zr.f33337f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void f() {
        super.f();
        rz emojiView = getEmojiView();
        hr0 hr0Var = this.f28674c0;
        if (emojiView != null) {
            emojiView.f30372w0 = false;
            emojiView.f30378x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(hr0Var.H0.d);
        }
        FrameLayout frameLayout = hr0Var.f27126d0;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        lq0 lq0Var = hr0Var.f27123c;
        if (lq0Var != null) {
            lq0Var.bringToFront();
        }
        lq0 lq0Var2 = hr0Var.f27128f;
        if (lq0Var2 != null) {
            lq0Var2.bringToFront();
        }
    }

    @Override
    public final void q(int i10, int i11) {
        hr0 hr0Var = this.f28674c0;
        lq0 lq0Var = hr0Var.f27123c;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f28672a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        hr0Var.f27149w0 = lq0Var.getTop() + hr0Var.f27147v0;
        lq0Var.invalidate();
    }
}
