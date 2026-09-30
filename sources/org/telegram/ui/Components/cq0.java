package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class cq0 extends mu {
    public boolean V;
    public int W;
    public int f23397a0;
    public ValueAnimator f23398b0;
    public final xq0 f23399c0;

    public cq0(xq0 xq0Var, Context context, iq0 iq0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, iq0Var, null, 1, true, d6Var);
        this.f23399c0 = xq0Var;
    }

    @Override
    public final void c(float f7) {
        this.f23399c0.Y0();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            eu editText = this.f23399c0.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f23397a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new v70(editText, 18));
            ValueAnimator valueAnimator = this.f23398b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f23398b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(tr.f28636f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void f() {
        super.f();
        nz emojiView = getEmojiView();
        xq0 xq0Var = this.f23399c0;
        if (emojiView != null) {
            emojiView.f26880w0 = false;
            emojiView.f26882w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(xq0Var.G0.d);
        }
        FrameLayout frameLayout = xq0Var.f30458c0;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        bq0 bq0Var = xq0Var.f30457c;
        if (bq0Var != null) {
            bq0Var.bringToFront();
        }
        bq0 bq0Var2 = xq0Var.f30461f;
        if (bq0Var2 != null) {
            bq0Var2.bringToFront();
        }
    }

    @Override
    public final void q(int i10, int i11) {
        xq0 xq0Var = this.f23399c0;
        bq0 bq0Var = xq0Var.f30457c;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f23397a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        xq0Var.f30480v0 = bq0Var.getTop() + xq0Var.f30479u0;
        bq0Var.invalidate();
    }
}
