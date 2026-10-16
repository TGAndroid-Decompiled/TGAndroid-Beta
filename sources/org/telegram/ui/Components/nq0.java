package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class nq0 extends vu {
    public boolean V;
    public int W;
    public int f27385a0;
    public ValueAnimator f27386b0;
    public final ir0 f27387c0;

    public nq0(ir0 ir0Var, Context context, tq0 tq0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, tq0Var, null, 1, true, c6Var);
        this.f27387c0 = ir0Var;
    }

    @Override
    public final void c(float f7) {
        this.f27387c0.Z0();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            nu editText = this.f27387c0.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f27385a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new f80(editText, 19));
            ValueAnimator valueAnimator = this.f27386b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f27386b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(es.f24465f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void f() {
        super.f();
        wz emojiView = getEmojiView();
        ir0 ir0Var = this.f27387c0;
        if (emojiView != null) {
            emojiView.f30769w0 = false;
            emojiView.f30771w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(ir0Var.G0.d);
        }
        FrameLayout frameLayout = ir0Var.f25744c0;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        mq0 mq0Var = ir0Var.f25743c;
        if (mq0Var != null) {
            mq0Var.bringToFront();
        }
        mq0 mq0Var2 = ir0Var.f25747f;
        if (mq0Var2 != null) {
            mq0Var2.bringToFront();
        }
    }

    @Override
    public final void q(int i10, int i11) {
        ir0 ir0Var = this.f27387c0;
        mq0 mq0Var = ir0Var.f25743c;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f27385a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        ir0Var.f25766v0 = mq0Var.getTop() + ir0Var.f25765u0;
        mq0Var.invalidate();
    }
}
