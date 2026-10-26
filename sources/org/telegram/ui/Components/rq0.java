package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class rq0 extends ru {
    public boolean V;
    public int W;
    public int f32287a0;
    public ValueAnimator f32288b0;
    public final mr0 f32289c0;

    public rq0(mr0 mr0Var, Context context, xq0 xq0Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, xq0Var, null, 1, true, u6Var);
        this.f32289c0 = mr0Var;
    }

    @Override
    public final void c(float f7) {
        this.f32289c0.b1();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            ju editText = this.f32289c0.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f32287a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new e80(editText, 19));
            ValueAnimator valueAnimator = this.f32288b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f32288b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(ds.f27586f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void f() {
        super.f();
        sz emojiView = getEmojiView();
        mr0 mr0Var = this.f32289c0;
        if (emojiView != null) {
            emojiView.f32781w0 = false;
            emojiView.f32787x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(mr0Var.H0.d);
        }
        FrameLayout frameLayout = mr0Var.f30704d0;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        qq0 qq0Var = mr0Var.f30702c;
        if (qq0Var != null) {
            qq0Var.bringToFront();
        }
        qq0 qq0Var2 = mr0Var.f30706f;
        if (qq0Var2 != null) {
            qq0Var2.bringToFront();
        }
    }

    @Override
    public final void q(int i10, int i11) {
        mr0 mr0Var = this.f32289c0;
        qq0 qq0Var = mr0Var.f30702c;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f32287a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        mr0Var.f30727w0 = qq0Var.getTop() + mr0Var.f30725v0;
        qq0Var.invalidate();
    }
}
