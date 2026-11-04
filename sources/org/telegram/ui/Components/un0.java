package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class un0 extends jt {
    public boolean W;
    public int f38828a0;
    public int f38829b0;
    public ValueAnimator f38830c0;
    public final oo0 f38831d0;

    public un0(oo0 oo0Var, Context context, bo0 bo0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, bo0Var, null, 1, true, e6Var);
        this.f38831d0 = oo0Var;
    }

    @Override
    public final void c(float f10) {
        this.f38831d0.Z0();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.W) {
            xs editText = this.f38831d0.f36886l1.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f38829b0 - editText.getScrollY()) + (this.f38828a0 - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new y50(editText, 18));
            ValueAnimator valueAnimator = this.f38830c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f38830c0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(xq.f40452f);
            ofFloat.start();
            this.W = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void f() {
        super.f();
        ey emojiView = getEmojiView();
        oo0 oo0Var = this.f38831d0;
        if (emojiView != null) {
            emojiView.f33592x0 = false;
            emojiView.f33598y2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(oo0Var.f36914z2.d);
        }
        FrameLayout frameLayout = oo0Var.V1;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        tn0 tn0Var = oo0Var.k1;
        if (tn0Var != null) {
            tn0Var.bringToFront();
        }
        tn0 tn0Var2 = oo0Var.f36889n1;
        if (tn0Var2 != null) {
            tn0Var2.bringToFront();
        }
    }

    @Override
    public final void q(int i3, int i10) {
        oo0 oo0Var = this.f38831d0;
        tn0 tn0Var = oo0Var.k1;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.W = true;
            this.f38828a0 = getEditText().getMeasuredHeight();
            this.f38829b0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.W = false;
        }
        oo0Var.f36892o2 = tn0Var.getTop() + oo0Var.f36890n2;
        tn0Var.invalidate();
    }
}
