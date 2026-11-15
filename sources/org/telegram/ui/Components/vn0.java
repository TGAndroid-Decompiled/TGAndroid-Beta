package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class vn0 extends rt {
    public boolean W;
    public int f40471a0;
    public int f40472b0;
    public ValueAnimator f40473c0;
    public final po0 f40474d0;

    public vn0(po0 po0Var, Context context, co0 co0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, co0Var, null, 1, true, e6Var);
        this.f40474d0 = po0Var;
    }

    @Override
    public final void c(float f10) {
        this.f40474d0.Z0();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.W) {
            ft editText = this.f40474d0.f38354o1.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f40472b0 - editText.getScrollY()) + (this.f40471a0 - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new f60(editText, 17));
            ValueAnimator valueAnimator = this.f40473c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f40473c0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(er.f34419f);
            ofFloat.start();
            this.W = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void f() {
        super.f();
        ly emojiView = getEmojiView();
        po0 po0Var = this.f40474d0;
        if (emojiView != null) {
            emojiView.f37003x0 = false;
            emojiView.f37009y2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(po0Var.C2.d);
        }
        FrameLayout frameLayout = po0Var.Y1;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        un0 un0Var = po0Var.n1;
        if (un0Var != null) {
            un0Var.bringToFront();
        }
        un0 un0Var2 = po0Var.f38358q1;
        if (un0Var2 != null) {
            un0Var2.bringToFront();
        }
    }

    @Override
    public final void q(int i7, int i10) {
        po0 po0Var = this.f40474d0;
        un0 un0Var = po0Var.n1;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.W = true;
            this.f40471a0 = getEditText().getMeasuredHeight();
            this.f40472b0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.W = false;
        }
        po0Var.f38361r2 = un0Var.getTop() + po0Var.f38359q2;
        un0Var.invalidate();
    }
}
