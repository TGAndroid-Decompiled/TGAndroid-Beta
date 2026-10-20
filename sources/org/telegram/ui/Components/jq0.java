package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class jq0 extends qu {
    public boolean V;
    public int W;
    public int f27616a0;
    public ValueAnimator f27617b0;
    public final fr0 f27618c0;

    public jq0(fr0 fr0Var, Context context, pq0 pq0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, pq0Var, null, 1, true, d6Var);
        this.f27618c0 = fr0Var;
    }

    @Override
    public final void c(float f7) {
        this.f27618c0.a1();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            iu editText = this.f27618c0.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f27616a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new b80(editText, 19));
            ValueAnimator valueAnimator = this.f27617b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f27617b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(bs.f25021f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void f() {
        super.f();
        tz emojiView = getEmojiView();
        fr0 fr0Var = this.f27618c0;
        if (emojiView != null) {
            emojiView.f30784w0 = false;
            emojiView.f30786w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(fr0Var.H0.d);
        }
        FrameLayout frameLayout = fr0Var.f26369d0;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        iq0 iq0Var = fr0Var.f26367c;
        if (iq0Var != null) {
            iq0Var.bringToFront();
        }
        iq0 iq0Var2 = fr0Var.f26371f;
        if (iq0Var2 != null) {
            iq0Var2.bringToFront();
        }
    }

    @Override
    public final void q(int i10, int i11) {
        fr0 fr0Var = this.f27618c0;
        iq0 iq0Var = fr0Var.f26367c;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f27616a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        fr0Var.f26392w0 = iq0Var.getTop() + fr0Var.f26390v0;
        iq0Var.invalidate();
    }
}
