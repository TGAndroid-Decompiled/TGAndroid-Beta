package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class bq0 extends lu {
    public boolean V;
    public int W;
    public int f23053a0;
    public ValueAnimator f23054b0;
    public final wq0 f23055c0;

    public bq0(wq0 wq0Var, Context context, hq0 hq0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, hq0Var, null, 1, true, d6Var);
        this.f23055c0 = wq0Var;
    }

    @Override
    public final void c(float f7) {
        this.f23055c0.Y0();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            du editText = this.f23055c0.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f23053a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new u70(editText, 18));
            ValueAnimator valueAnimator = this.f23054b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f23054b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(sr.f28346f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void f() {
        super.f();
        mz emojiView = getEmojiView();
        wq0 wq0Var = this.f23055c0;
        if (emojiView != null) {
            emojiView.f26593w0 = false;
            emojiView.f26595w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(wq0Var.G0.d);
        }
        FrameLayout frameLayout = wq0Var.f30122c0;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        aq0 aq0Var = wq0Var.f30121c;
        if (aq0Var != null) {
            aq0Var.bringToFront();
        }
        aq0 aq0Var2 = wq0Var.f30125f;
        if (aq0Var2 != null) {
            aq0Var2.bringToFront();
        }
    }

    @Override
    public final void q(int i10, int i11) {
        wq0 wq0Var = this.f23055c0;
        aq0 aq0Var = wq0Var.f30121c;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f23053a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        wq0Var.f30144v0 = aq0Var.getTop() + wq0Var.f30143u0;
        aq0Var.invalidate();
    }
}
