package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class mp0 extends ju {
    public boolean V;
    public int W;
    public int f26210a0;
    public ValueAnimator f26211b0;
    public final hq0 f26212c0;

    public mp0(hq0 hq0Var, Context context, sp0 sp0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, sp0Var, null, 1, true, e6Var);
        this.f26212c0 = hq0Var;
    }

    @Override
    public final void c(float f7) {
        this.f26212c0.Y0();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            bu editText = this.f26212c0.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f26210a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new h70(editText, 18));
            ValueAnimator valueAnimator = this.f26211b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f26211b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(qr.f27423f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void f() {
        super.f();
        kz emojiView = getEmojiView();
        hq0 hq0Var = this.f26212c0;
        if (emojiView != null) {
            emojiView.f25765w0 = false;
            emojiView.f25767w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(hq0Var.G0.d);
        }
        FrameLayout frameLayout = hq0Var.f24752c0;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        lp0 lp0Var = hq0Var.f24751c;
        if (lp0Var != null) {
            lp0Var.bringToFront();
        }
        lp0 lp0Var2 = hq0Var.f24755f;
        if (lp0Var2 != null) {
            lp0Var2.bringToFront();
        }
    }

    @Override
    public final void q(int i10, int i11) {
        hq0 hq0Var = this.f26212c0;
        lp0 lp0Var = hq0Var.f24751c;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f26210a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        hq0Var.f24774v0 = lp0Var.getTop() + hq0Var.f24773u0;
        lp0Var.invalidate();
    }
}
