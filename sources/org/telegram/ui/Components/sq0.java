package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class sq0 extends av {
    public boolean V;
    public int W;
    public int f30834a0;
    public ValueAnimator f30835b0;
    public final nr0 f30836c0;

    public sq0(nr0 nr0Var, Context context, yq0 yq0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, yq0Var, null, 1, true, e6Var);
        this.f30836c0 = nr0Var;
    }

    @Override
    public final void c(float f7) {
        this.f30836c0.Z0();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            su editText = this.f30836c0.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f30834a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new k80(editText, 19));
            ValueAnimator valueAnimator = this.f30835b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f30835b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(is.f27443f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void f() {
        super.f();
        b00 emojiView = getEmojiView();
        nr0 nr0Var = this.f30836c0;
        if (emojiView != null) {
            emojiView.f24752w0 = false;
            emojiView.f24754w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(nr0Var.G0.d);
        }
        FrameLayout frameLayout = nr0Var.f29194c0;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        rq0 rq0Var = nr0Var.f29193c;
        if (rq0Var != null) {
            rq0Var.bringToFront();
        }
        rq0 rq0Var2 = nr0Var.f29198f;
        if (rq0Var2 != null) {
            rq0Var2.bringToFront();
        }
    }

    @Override
    public final void q(int i10, int i11) {
        nr0 nr0Var = this.f30836c0;
        rq0 rq0Var = nr0Var.f29193c;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f30834a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        nr0Var.f29217v0 = rq0Var.getTop() + nr0Var.f29216u0;
        rq0Var.invalidate();
    }
}
