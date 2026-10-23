package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class nq0 extends qu {
    public boolean V;
    public int W;
    public int f28999a0;
    public ValueAnimator f29000b0;
    public final ir0 f29001c0;

    public nq0(ir0 ir0Var, Context context, tq0 tq0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, tq0Var, null, 1, true, g6Var);
        this.f29001c0 = ir0Var;
    }

    @Override
    public final void c(float f7) {
        this.f29001c0.e1();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            iu editText = this.f29001c0.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f28999a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new d80(editText, 19));
            ValueAnimator valueAnimator = this.f29000b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f29000b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(bs.f25133f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void f() {
        super.f();
        tz emojiView = getEmojiView();
        ir0 ir0Var = this.f29001c0;
        if (emojiView != null) {
            emojiView.f31028w0 = false;
            emojiView.f31034x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(ir0Var.H0.d);
        }
        FrameLayout frameLayout = ir0Var.f27414d0;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        mq0 mq0Var = ir0Var.f27411c;
        if (mq0Var != null) {
            mq0Var.bringToFront();
        }
        mq0 mq0Var2 = ir0Var.f27416f;
        if (mq0Var2 != null) {
            mq0Var2.bringToFront();
        }
    }

    @Override
    public final void q(int i10, int i11) {
        ir0 ir0Var = this.f29001c0;
        mq0 mq0Var = ir0Var.f27411c;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f28999a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        ir0Var.f27437w0 = mq0Var.getTop() + ir0Var.f27435v0;
        mq0Var.invalidate();
    }
}
