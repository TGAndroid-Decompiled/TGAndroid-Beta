package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class fq0 extends mu {
    public boolean V;
    public int W;
    public int f26563a0;
    public ValueAnimator f26564b0;
    public final br0 f26565c0;

    public fq0(br0 br0Var, Context context, mq0 mq0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, mq0Var, null, 1, true, d6Var);
        this.f26565c0 = br0Var;
    }

    @Override
    public final void c(float f7) {
        this.f26565c0.V0();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            eu editText = this.f26565c0.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f26563a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new v70(editText, 18));
            ValueAnimator valueAnimator = this.f26564b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f26564b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(tr.f31215f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void f() {
        super.f();
        nz emojiView = getEmojiView();
        br0 br0Var = this.f26565c0;
        if (emojiView != null) {
            emojiView.f29257w0 = false;
            emojiView.f29259w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(br0Var.G0.d);
        }
        FrameLayout frameLayout = br0Var.f25055c0;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        eq0 eq0Var = br0Var.f25054c;
        if (eq0Var != null) {
            eq0Var.bringToFront();
        }
        eq0 eq0Var2 = br0Var.f25059f;
        if (eq0Var2 != null) {
            eq0Var2.bringToFront();
        }
    }

    @Override
    public final void q(int i10, int i11) {
        br0 br0Var = this.f26565c0;
        eq0 eq0Var = br0Var.f25054c;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f26563a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        br0Var.f25078v0 = eq0Var.getTop() + br0Var.f25077u0;
        eq0Var.invalidate();
    }
}
