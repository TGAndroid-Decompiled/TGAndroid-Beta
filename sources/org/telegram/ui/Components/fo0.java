package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class fo0 extends wt {
    public boolean W;
    public int f35178a0;
    public int f35179b0;
    public ValueAnimator f35180c0;
    public final zo0 f35181d0;

    public fo0(zo0 zo0Var, Context context, mo0 mo0Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, mo0Var, null, 1, true, i6Var);
        this.f35181d0 = zo0Var;
    }

    @Override
    public final void c(float f10) {
        this.f35181d0.a1();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.W) {
            mt editText = this.f35181d0.f42984o1.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f35179b0 - editText.getScrollY()) + (this.f35178a0 - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new e60(editText, 19));
            ValueAnimator valueAnimator = this.f35180c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f35180c0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(kr.f36858f);
            ofFloat.start();
            this.W = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void f() {
        super.f();
        qy emojiView = getEmojiView();
        zo0 zo0Var = this.f35181d0;
        if (emojiView != null) {
            emojiView.f39109x0 = false;
            emojiView.f39115y2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(zo0Var.C2.d);
        }
        FrameLayout frameLayout = zo0Var.Y1;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        eo0 eo0Var = zo0Var.n1;
        if (eo0Var != null) {
            eo0Var.bringToFront();
        }
        eo0 eo0Var2 = zo0Var.f42988q1;
        if (eo0Var2 != null) {
            eo0Var2.bringToFront();
        }
    }

    @Override
    public final void q(int i7, int i10) {
        zo0 zo0Var = this.f35181d0;
        eo0 eo0Var = zo0Var.n1;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.W = true;
            this.f35178a0 = getEditText().getMeasuredHeight();
            this.f35179b0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.W = false;
        }
        zo0Var.f42991r2 = eo0Var.getTop() + zo0Var.f42989q2;
        eo0Var.invalidate();
    }
}
