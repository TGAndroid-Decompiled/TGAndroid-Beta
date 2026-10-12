package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class oq0 extends vu {
    public boolean V;
    public int W;
    public int f28017a0;
    public ValueAnimator f28018b0;
    public final jr0 f28019c0;

    public oq0(jr0 jr0Var, Context context, uq0 uq0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, uq0Var, null, 1, true, c6Var);
        this.f28019c0 = jr0Var;
    }

    @Override
    public final void c(float f7) {
        this.f28019c0.Z0();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            nu editText = this.f28019c0.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f28017a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new g80(editText, 19));
            ValueAnimator valueAnimator = this.f28018b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f28018b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(es.f24771f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void f() {
        super.f();
        wz emojiView = getEmojiView();
        jr0 jr0Var = this.f28019c0;
        if (emojiView != null) {
            emojiView.f31076w0 = false;
            emojiView.f31078w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(jr0Var.G0.d);
        }
        FrameLayout frameLayout = jr0Var.f26461c0;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        nq0 nq0Var = jr0Var.f26460c;
        if (nq0Var != null) {
            nq0Var.bringToFront();
        }
        nq0 nq0Var2 = jr0Var.f26464f;
        if (nq0Var2 != null) {
            nq0Var2.bringToFront();
        }
    }

    @Override
    public final void q(int i10, int i11) {
        jr0 jr0Var = this.f28019c0;
        nq0 nq0Var = jr0Var.f26460c;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f28017a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        jr0Var.f26483v0 = nq0Var.getTop() + jr0Var.f26482u0;
        nq0Var.invalidate();
    }
}
