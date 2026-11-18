package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class eo0 extends wt {
    public boolean W;
    public int f34776a0;
    public int f34777b0;
    public ValueAnimator f34778c0;
    public final yo0 f34779d0;

    public eo0(yo0 yo0Var, Context context, lo0 lo0Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, lo0Var, null, 1, true, i6Var);
        this.f34779d0 = yo0Var;
    }

    @Override
    public final void c(float f10) {
        this.f34779d0.a1();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.W) {
            mt editText = this.f34779d0.f42567o1.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f34777b0 - editText.getScrollY()) + (this.f34776a0 - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new e60(editText, 19));
            ValueAnimator valueAnimator = this.f34778c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f34778c0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(lr.f37208f);
            ofFloat.start();
            this.W = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void f() {
        super.f();
        ry emojiView = getEmojiView();
        yo0 yo0Var = this.f34779d0;
        if (emojiView != null) {
            emojiView.f39407x0 = false;
            emojiView.f39413y2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(yo0Var.C2.d);
        }
        FrameLayout frameLayout = yo0Var.Y1;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        do0 do0Var = yo0Var.n1;
        if (do0Var != null) {
            do0Var.bringToFront();
        }
        do0 do0Var2 = yo0Var.f42571q1;
        if (do0Var2 != null) {
            do0Var2.bringToFront();
        }
    }

    @Override
    public final void q(int i7, int i10) {
        yo0 yo0Var = this.f34779d0;
        do0 do0Var = yo0Var.n1;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.W = true;
            this.f34776a0 = getEditText().getMeasuredHeight();
            this.f34777b0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.W = false;
        }
        yo0Var.f42574r2 = do0Var.getTop() + yo0Var.f42572q2;
        do0Var.invalidate();
    }
}
