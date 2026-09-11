package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class mp0 extends hu {
    public boolean V;
    public int W;
    public int f28480a0;
    public ValueAnimator f28481b0;
    public final hq0 f28482c0;

    public mp0(hq0 hq0Var, Context context, sp0 sp0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, sp0Var, null, 1, true, f6Var);
        this.f28482c0 = hq0Var;
    }

    @Override
    public final void c(float f7) {
        this.f28482c0.Y0();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            zt editText = this.f28482c0.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f28480a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new h70(editText, 18));
            ValueAnimator valueAnimator = this.f28481b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f28481b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(pr.f29466f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void f() {
        super.f();
        kz emojiView = getEmojiView();
        hq0 hq0Var = this.f28482c0;
        if (emojiView != null) {
            emojiView.f27995w0 = false;
            emojiView.f28001x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(hq0Var.G0.d);
        }
        FrameLayout frameLayout = hq0Var.f26791c0;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        lp0 lp0Var = hq0Var.f26790c;
        if (lp0Var != null) {
            lp0Var.bringToFront();
        }
        lp0 lp0Var2 = hq0Var.f26795f;
        if (lp0Var2 != null) {
            lp0Var2.bringToFront();
        }
    }

    @Override
    public final void q(int i10, int i11) {
        hq0 hq0Var = this.f28482c0;
        lp0 lp0Var = hq0Var.f26790c;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f28480a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        hq0Var.f26814v0 = lp0Var.getTop() + hq0Var.f26813u0;
        lp0Var.invalidate();
    }
}
