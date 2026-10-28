package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class sq0 extends ru {
    public boolean V;
    public int W;
    public int f32657a0;
    public ValueAnimator f32658b0;
    public final nr0 f32659c0;

    public sq0(nr0 nr0Var, Context context, yq0 yq0Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, yq0Var, null, 1, true, u6Var);
        this.f32659c0 = nr0Var;
    }

    @Override
    public final void c(float f7) {
        this.f32659c0.b1();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            ju editText = this.f32659c0.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f32657a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new f80(editText, 19));
            ValueAnimator valueAnimator = this.f32658b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f32658b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(ds.f27530f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void f() {
        super.f();
        sz emojiView = getEmojiView();
        nr0 nr0Var = this.f32659c0;
        if (emojiView != null) {
            emojiView.f32775w0 = false;
            emojiView.f32781x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(nr0Var.H0.d);
        }
        FrameLayout frameLayout = nr0Var.f31035d0;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        rq0 rq0Var = nr0Var.f31033c;
        if (rq0Var != null) {
            rq0Var.bringToFront();
        }
        rq0 rq0Var2 = nr0Var.f31037f;
        if (rq0Var2 != null) {
            rq0Var2.bringToFront();
        }
    }

    @Override
    public final void q(int i10, int i11) {
        nr0 nr0Var = this.f32659c0;
        rq0 rq0Var = nr0Var.f31033c;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f32657a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        nr0Var.f31058w0 = rq0Var.getTop() + nr0Var.f31056v0;
        rq0Var.invalidate();
    }
}
