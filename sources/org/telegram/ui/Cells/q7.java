package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.hp;
public final class q7 extends FrameLayout {
    public m7[] f25072a;
    public MessageObject[] f25073b;
    public int[] f25074c;
    public n7 d;
    public int f25075e;
    public boolean f25076f;
    public boolean h;
    public Paint f25077n;
    public int f25078r;
    public int f25079s;

    public static int a(int i10) {
        if (AndroidUtilities.isTablet()) {
            return (AndroidUtilities.dp(490.0f) - (AndroidUtilities.dp(2.0f) * (i10 - 1))) / i10;
        }
        return (AndroidUtilities.displaySize.x - (AndroidUtilities.dp(2.0f) * (i10 - 1))) / i10;
    }

    public final void b(int i10, boolean z10) {
        float f9;
        m7 m7Var = this.f25072a[i10];
        FrameLayout frameLayout = m7Var.f24705f;
        hp hpVar = m7Var.f24704e;
        if (hpVar.getVisibility() != 0) {
            hpVar.setVisibility(0);
        }
        hpVar.a(z10, true);
        AnimatorSet animatorSet = m7Var.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            m7Var.h = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        m7Var.h = animatorSet2;
        float f10 = 0.81f;
        if (z10) {
            f9 = 0.81f;
        } else {
            f9 = 1.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(frameLayout, View.SCALE_X, f9);
        if (!z10) {
            f10 = 1.0f;
        }
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(frameLayout, View.SCALE_Y, f10));
        m7Var.h.setDuration(200L);
        m7Var.h.addListener(new nh.q5(m7Var, 19));
        m7Var.h.start();
    }

    public final void c(int i10, int i11, MessageObject messageObject) {
        m7[] m7VarArr = this.f25072a;
        MessageObject[] messageObjectArr = this.f25073b;
        messageObjectArr[i10] = messageObject;
        this.f25074c[i10] = i11;
        if (messageObject != null) {
            m7VarArr[i10].setVisibility(0);
            m7VarArr[i10].setMessageObject(messageObject);
            return;
        }
        m7VarArr[i10].clearAnimation();
        m7VarArr[i10].setVisibility(4);
        messageObjectArr[i10] = null;
    }

    public n7 getDelegate() {
        return this.d;
    }

    @Override
    public final void invalidate() {
        for (int i10 = 0; i10 < 6; i10++) {
            this.f25072a[i10].invalidate();
        }
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int a2;
        int dp;
        View[] viewArr = this.f25072a;
        if (this.f25078r == 1) {
            a2 = org.telegram.ui.b.z(2.0f, this.f25075e - 1, View.MeasureSpec.getSize(i10)) / this.f25075e;
        } else {
            a2 = a(this.f25075e);
        }
        this.h = true;
        int i12 = 0;
        for (int i13 = 0; i13 < this.f25075e; i13++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i13].getLayoutParams();
            if (this.f25076f) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(2.0f);
            }
            layoutParams.topMargin = dp;
            layoutParams.leftMargin = (AndroidUtilities.dp(2.0f) + a2) * i13;
            if (i13 == this.f25075e - 1) {
                if (AndroidUtilities.isTablet()) {
                    layoutParams.width = AndroidUtilities.dp(490.0f) - ((AndroidUtilities.dp(2.0f) + a2) * (this.f25075e - 1));
                } else {
                    layoutParams.width = AndroidUtilities.displaySize.x - ((AndroidUtilities.dp(2.0f) + a2) * (this.f25075e - 1));
                }
            } else {
                layoutParams.width = a2;
            }
            layoutParams.height = a2;
            layoutParams.gravity = 51;
            viewArr[i13].setLayoutParams(layoutParams);
        }
        this.h = false;
        if (!this.f25076f) {
            i12 = AndroidUtilities.dp(2.0f);
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i12 + a2, 1073741824));
    }

    @Override
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }

    public void setDelegate(n7 n7Var) {
        this.d = n7Var;
    }

    public void setIsFirst(boolean z10) {
        this.f25076f = z10;
    }

    public void setItemsCount(int i10) {
        int i11;
        m7[] m7VarArr = this.f25072a;
        for (int i12 = 0; i12 < m7VarArr.length; i12++) {
            m7VarArr[i12].clearAnimation();
            m7 m7Var = m7VarArr[i12];
            if (i12 < i10) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            m7Var.setVisibility(i11);
        }
        this.f25075e = i10;
    }
}
