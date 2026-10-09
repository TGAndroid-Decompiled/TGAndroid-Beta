package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class rq0 extends zu {
    public boolean V;
    public int W;
    public int f30482a0;
    public ValueAnimator f30483b0;
    public final mr0 f30484c0;

    public rq0(mr0 mr0Var, Context context, xq0 xq0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, xq0Var, null, 1, true, e6Var);
        this.f30484c0 = mr0Var;
    }

    @Override
    public final void c(float f7) {
        this.f30484c0.Z0();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            ru editText = this.f30484c0.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f30482a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new j80(editText, 19));
            ValueAnimator valueAnimator = this.f30483b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f30483b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(hs.f27118f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void f() {
        super.f();
        a00 emojiView = getEmojiView();
        mr0 mr0Var = this.f30484c0;
        if (emojiView != null) {
            emojiView.f24464w0 = false;
            emojiView.f24466w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(mr0Var.G0.d);
        }
        FrameLayout frameLayout = mr0Var.f28897c0;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        qq0 qq0Var = mr0Var.f28896c;
        if (qq0Var != null) {
            qq0Var.bringToFront();
        }
        qq0 qq0Var2 = mr0Var.f28901f;
        if (qq0Var2 != null) {
            qq0Var2.bringToFront();
        }
    }

    @Override
    public final void q(int i10, int i11) {
        mr0 mr0Var = this.f30484c0;
        qq0 qq0Var = mr0Var.f28896c;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f30482a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        mr0Var.f28920v0 = qq0Var.getTop() + mr0Var.f28919u0;
        qq0Var.invalidate();
    }
}
