package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class go0 extends yt {
    public boolean W;
    public int f35645a0;
    public int f35646b0;
    public ValueAnimator f35647c0;
    public final ap0 f35648d0;

    public go0(ap0 ap0Var, Context context, no0 no0Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, no0Var, null, 1, true, h6Var);
        this.f35648d0 = ap0Var;
    }

    @Override
    public final void c(float f10) {
        this.f35648d0.a1();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.W) {
            ot editText = this.f35648d0.f33576o1.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f35646b0 - editText.getScrollY()) + (this.f35645a0 - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new h60(editText, 19));
            ValueAnimator valueAnimator = this.f35647c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f35647c0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(nr.f37960f);
            ofFloat.start();
            this.W = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void f() {
        super.f();
        ty emojiView = getEmojiView();
        ap0 ap0Var = this.f35648d0;
        if (emojiView != null) {
            emojiView.f40153x0 = false;
            emojiView.f40159y2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(ap0Var.C2.d);
        }
        FrameLayout frameLayout = ap0Var.Y1;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        fo0 fo0Var = ap0Var.n1;
        if (fo0Var != null) {
            fo0Var.bringToFront();
        }
        fo0 fo0Var2 = ap0Var.f33580q1;
        if (fo0Var2 != null) {
            fo0Var2.bringToFront();
        }
    }

    @Override
    public final void q(int i7, int i10) {
        ap0 ap0Var = this.f35648d0;
        fo0 fo0Var = ap0Var.n1;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.W = true;
            this.f35645a0 = getEditText().getMeasuredHeight();
            this.f35646b0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.W = false;
        }
        ap0Var.f33583r2 = fo0Var.getTop() + ap0Var.f33581q2;
        fo0Var.invalidate();
    }
}
