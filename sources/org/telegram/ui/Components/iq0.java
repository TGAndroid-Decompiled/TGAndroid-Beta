package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class iq0 extends qu {
    public boolean V;
    public int W;
    public int f27327a0;
    public ValueAnimator f27328b0;
    public final dr0 f27329c0;

    public iq0(dr0 dr0Var, Context context, oq0 oq0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, oq0Var, null, 1, true, d6Var);
        this.f27329c0 = dr0Var;
    }

    @Override
    public final void c(float f7) {
        this.f27329c0.Z0();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            iu editText = this.f27329c0.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f27327a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new b80(editText, 19));
            ValueAnimator valueAnimator = this.f27328b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f27328b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(bs.f25037f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void f() {
        super.f();
        tz emojiView = getEmojiView();
        dr0 dr0Var = this.f27329c0;
        if (emojiView != null) {
            emojiView.f30816w0 = false;
            emojiView.f30818w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(dr0Var.G0.d);
        }
        FrameLayout frameLayout = dr0Var.f25663c0;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        hq0 hq0Var = dr0Var.f25662c;
        if (hq0Var != null) {
            hq0Var.bringToFront();
        }
        hq0 hq0Var2 = dr0Var.f25666f;
        if (hq0Var2 != null) {
            hq0Var2.bringToFront();
        }
    }

    @Override
    public final void q(int i10, int i11) {
        dr0 dr0Var = this.f27329c0;
        hq0 hq0Var = dr0Var.f25662c;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f27327a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        dr0Var.f25685v0 = hq0Var.getTop() + dr0Var.f25684u0;
        hq0Var.invalidate();
    }
}
