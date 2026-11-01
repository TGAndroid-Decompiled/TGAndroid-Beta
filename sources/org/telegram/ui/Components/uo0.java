package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class uo0 extends wt {
    public boolean V;
    public int W;
    public int f31050a0;
    public ValueAnimator f31051b0;
    public final pp0 f31052c0;

    public uo0(pp0 pp0Var, Context context, cp0 cp0Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, cp0Var, null, 1, true, p6Var);
        this.f31052c0 = pp0Var;
    }

    @Override
    public final void c(float f7) {
        this.f31052c0.Z0();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            mt editText = this.f31052c0.f29479k1.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f31050a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new r60(editText, 18));
            ValueAnimator valueAnimator = this.f31051b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f31051b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(gr.f26523f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void f() {
        super.f();
        vy emojiView = getEmojiView();
        pp0 pp0Var = this.f31052c0;
        if (emojiView != null) {
            emojiView.f32005w0 = false;
            emojiView.f32011x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(pp0Var.f29507y2.d);
        }
        FrameLayout frameLayout = pp0Var.U1;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        to0 to0Var = pp0Var.f29477j1;
        if (to0Var != null) {
            to0Var.bringToFront();
        }
        to0 to0Var2 = pp0Var.f29482m1;
        if (to0Var2 != null) {
            to0Var2.bringToFront();
        }
    }

    @Override
    public final void q(int i10, int i11) {
        pp0 pp0Var = this.f31052c0;
        to0 to0Var = pp0Var.f29477j1;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f31050a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        pp0Var.f29485n2 = to0Var.getTop() + pp0Var.f29483m2;
        to0Var.invalidate();
    }
}
