package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class eq0 extends mu {
    public boolean V;
    public int W;
    public int f26104a0;
    public ValueAnimator f26105b0;
    public final zq0 f26106c0;

    public eq0(zq0 zq0Var, Context context, kq0 kq0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, kq0Var, null, 1, true, d6Var);
        this.f26106c0 = zq0Var;
    }

    @Override
    public final void c(float f7) {
        this.f26106c0.V0();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            eu editText = this.f26106c0.d.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f26104a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new v70(editText, 18));
            ValueAnimator valueAnimator = this.f26105b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f26105b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(tr.f31141f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void f() {
        super.f();
        nz emojiView = getEmojiView();
        zq0 zq0Var = this.f26106c0;
        if (emojiView != null) {
            emojiView.f29155w0 = false;
            emojiView.f29157w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(zq0Var.G0.d);
        }
        FrameLayout frameLayout = zq0Var.f33600c0;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        dq0 dq0Var = zq0Var.f33599c;
        if (dq0Var != null) {
            dq0Var.bringToFront();
        }
        dq0 dq0Var2 = zq0Var.f33604f;
        if (dq0Var2 != null) {
            dq0Var2.bringToFront();
        }
    }

    @Override
    public final void q(int i10, int i11) {
        zq0 zq0Var = this.f26106c0;
        dq0 dq0Var = zq0Var.f33599c;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f26104a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        zq0Var.f33623v0 = dq0Var.getTop() + zq0Var.f33622u0;
        dq0Var.invalidate();
    }
}
