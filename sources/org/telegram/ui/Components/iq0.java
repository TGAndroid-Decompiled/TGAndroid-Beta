package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class iq0 extends qu {
    public boolean V;
    public int W;
    public int f27335a0;
    public ValueAnimator f27336b0;
    public final er0 f27337c0;

    public iq0(er0 er0Var, Context context, oq0 oq0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, oq0Var, null, 1, true, d6Var);
        this.f27337c0 = er0Var;
    }

    @Override
    public final void c(float f7) {
        this.f27337c0.a1();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            iu editText = this.f27337c0.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f27335a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new b80(editText, 19));
            ValueAnimator valueAnimator = this.f27336b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f27336b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(bs.f25012f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void f() {
        super.f();
        tz emojiView = getEmojiView();
        er0 er0Var = this.f27337c0;
        if (emojiView != null) {
            emojiView.f30830w0 = false;
            emojiView.f30832w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(er0Var.H0.d);
        }
        FrameLayout frameLayout = er0Var.f25981d0;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        hq0 hq0Var = er0Var.f25979c;
        if (hq0Var != null) {
            hq0Var.bringToFront();
        }
        hq0 hq0Var2 = er0Var.f25983f;
        if (hq0Var2 != null) {
            hq0Var2.bringToFront();
        }
    }

    @Override
    public final void q(int i10, int i11) {
        er0 er0Var = this.f27337c0;
        hq0 hq0Var = er0Var.f25979c;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f27335a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        er0Var.f26004w0 = hq0Var.getTop() + er0Var.f26002v0;
        hq0Var.invalidate();
    }
}
