package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class wp0 extends nu {
    public boolean V;
    public int W;
    public int f28813a0;
    public ValueAnimator f28814b0;
    public final sq0 f28815c0;

    public wp0(sq0 sq0Var, Context context, dq0 dq0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, dq0Var, null, 1, true, f6Var);
        this.f28815c0 = sq0Var;
    }

    @Override
    public final void c(float f7) {
        this.f28815c0.Y0();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            fu editText = this.f28815c0.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f28813a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new q70(editText, 18));
            ValueAnimator valueAnimator = this.f28814b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f28814b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(wr.f28819f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void f() {
        super.f();
        rz emojiView = getEmojiView();
        sq0 sq0Var = this.f28815c0;
        if (emojiView != null) {
            emojiView.f26867w0 = false;
            emojiView.f26873x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(sq0Var.G0.d);
        }
        FrameLayout frameLayout = sq0Var.f27170c0;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        vp0 vp0Var = sq0Var.f27169c;
        if (vp0Var != null) {
            vp0Var.bringToFront();
        }
        vp0 vp0Var2 = sq0Var.f27173f;
        if (vp0Var2 != null) {
            vp0Var2.bringToFront();
        }
    }

    @Override
    public final void q(int i10, int i11) {
        sq0 sq0Var = this.f28815c0;
        vp0 vp0Var = sq0Var.f27169c;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f28813a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        sq0Var.f27192v0 = vp0Var.getTop() + sq0Var.f27191u0;
        vp0Var.invalidate();
    }
}
