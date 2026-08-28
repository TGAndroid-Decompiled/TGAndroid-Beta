package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class vo0 extends ut {
    public boolean R;
    public int S;
    public int T;
    public ValueAnimator U;
    public final rp0 V;

    public vo0(rp0 rp0Var, Context context, cp0 cp0Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, cp0Var, null, 1, true, b6Var);
        this.V = rp0Var;
    }

    @Override
    public final void c(float f10) {
        this.V.Y0();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.R) {
            mt editText = this.V.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.T - editText.getScrollY()) + (this.S - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new q60(editText, 18));
            ValueAnimator valueAnimator = this.U;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.U = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(gr.f28844f);
            ofFloat.start();
            this.R = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void f() {
        super.f();
        wy emojiView = getEmojiView();
        rp0 rp0Var = this.V;
        if (emojiView != null) {
            emojiView.f34442s0 = false;
            emojiView.f34447t2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(rp0Var.C0.d);
        }
        FrameLayout frameLayout = rp0Var.Y;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        uo0 uo0Var = rp0Var.f32244c;
        if (uo0Var != null) {
            uo0Var.bringToFront();
        }
        uo0 uo0Var2 = rp0Var.f32249f;
        if (uo0Var2 != null) {
            uo0Var2.bringToFront();
        }
    }

    @Override
    public final void q(int i9, int i10) {
        rp0 rp0Var = this.V;
        uo0 uo0Var = rp0Var.f32244c;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.R = true;
            this.S = getEditText().getMeasuredHeight();
            this.T = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.R = false;
        }
        rp0Var.f32263r0 = uo0Var.getTop() + rp0Var.f32261q0;
        uo0Var.invalidate();
    }
}
