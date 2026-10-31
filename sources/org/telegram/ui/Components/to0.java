package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class to0 extends wt {
    public boolean V;
    public int W;
    public int f30662a0;
    public ValueAnimator f30663b0;
    public final op0 f30664c0;

    public to0(op0 op0Var, Context context, bp0 bp0Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, bp0Var, null, 1, true, p6Var);
        this.f30664c0 = op0Var;
    }

    @Override
    public final void c(float f7) {
        this.f30664c0.Z0();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            mt editText = this.f30664c0.f29124k1.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f30662a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new r60(editText, 18));
            ValueAnimator valueAnimator = this.f30663b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f30663b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(gr.f26495f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void f() {
        super.f();
        vy emojiView = getEmojiView();
        op0 op0Var = this.f30664c0;
        if (emojiView != null) {
            emojiView.f31927w0 = false;
            emojiView.f31933x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(op0Var.f29152y2.d);
        }
        FrameLayout frameLayout = op0Var.U1;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        so0 so0Var = op0Var.f29122j1;
        if (so0Var != null) {
            so0Var.bringToFront();
        }
        so0 so0Var2 = op0Var.f29127m1;
        if (so0Var2 != null) {
            so0Var2.bringToFront();
        }
    }

    @Override
    public final void q(int i10, int i11) {
        op0 op0Var = this.f30664c0;
        so0 so0Var = op0Var.f29122j1;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f30662a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        op0Var.f29130n2 = so0Var.getTop() + op0Var.f29128m2;
        so0Var.invalidate();
    }
}
