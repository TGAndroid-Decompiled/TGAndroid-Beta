package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class tq0 extends av {
    public boolean V;
    public int W;
    public int f31132a0;
    public ValueAnimator f31133b0;
    public final or0 f31134c0;

    public tq0(or0 or0Var, Context context, zq0 zq0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, zq0Var, null, 1, true, d6Var);
        this.f31134c0 = or0Var;
    }

    @Override
    public final void c(float f7) {
        this.f31134c0.Z0();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            su editText = this.f31134c0.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f31132a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new k80(editText, 19));
            ValueAnimator valueAnimator = this.f31133b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f31133b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(is.f27451f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void f() {
        super.f();
        b00 emojiView = getEmojiView();
        or0 or0Var = this.f31134c0;
        if (emojiView != null) {
            emojiView.f24725w0 = false;
            emojiView.f24727w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(or0Var.G0.d);
        }
        FrameLayout frameLayout = or0Var.f29479c0;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        sq0 sq0Var = or0Var.f29478c;
        if (sq0Var != null) {
            sq0Var.bringToFront();
        }
        sq0 sq0Var2 = or0Var.f29483f;
        if (sq0Var2 != null) {
            sq0Var2.bringToFront();
        }
    }

    @Override
    public final void q(int i10, int i11) {
        or0 or0Var = this.f31134c0;
        sq0 sq0Var = or0Var.f29478c;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f31132a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        or0Var.f29502v0 = sq0Var.getTop() + or0Var.f29501u0;
        sq0Var.invalidate();
    }
}
