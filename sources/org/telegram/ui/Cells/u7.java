package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.bi;
import org.telegram.ui.Components.qp;
public final class u7 extends FrameLayout {
    public q7[] f23527a;
    public MessageObject[] f23528b;
    public int[] f23529c;
    public r7 d;
    public int f23530e;
    public boolean f23531f;
    public boolean h;
    public Paint f23532n;
    public int f23533r;
    public int f23534s;

    public static int a(int i10) {
        if (AndroidUtilities.isTablet()) {
            return (AndroidUtilities.dp(490.0f) - (AndroidUtilities.dp(2.0f) * (i10 - 1))) / i10;
        }
        return (AndroidUtilities.displaySize.x - (AndroidUtilities.dp(2.0f) * (i10 - 1))) / i10;
    }

    public final void b(int i10, boolean z10) {
        float f7;
        q7 q7Var = this.f23527a[i10];
        FrameLayout frameLayout = q7Var.f22694f;
        qp qpVar = q7Var.f22693e;
        if (qpVar.getVisibility() != 0) {
            qpVar.setVisibility(0);
        }
        qpVar.a(z10, true);
        AnimatorSet animatorSet = q7Var.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            q7Var.h = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        q7Var.h = animatorSet2;
        float f10 = 0.81f;
        if (z10) {
            f7 = 0.81f;
        } else {
            f7 = 1.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(frameLayout, View.SCALE_X, f7);
        if (!z10) {
            f10 = 1.0f;
        }
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(frameLayout, View.SCALE_Y, f10));
        q7Var.h.setDuration(200L);
        q7Var.h.addListener(new org.telegram.ui.u4(q7Var, 11));
        q7Var.h.start();
    }

    public final void c(int i10, int i11, MessageObject messageObject) {
        q7[] q7VarArr = this.f23527a;
        MessageObject[] messageObjectArr = this.f23528b;
        messageObjectArr[i10] = messageObject;
        this.f23529c[i10] = i11;
        if (messageObject != null) {
            q7VarArr[i10].setVisibility(0);
            q7VarArr[i10].setMessageObject(messageObject);
            return;
        }
        q7VarArr[i10].clearAnimation();
        q7VarArr[i10].setVisibility(4);
        messageObjectArr[i10] = null;
    }

    public r7 getDelegate() {
        return this.d;
    }

    @Override
    public final void invalidate() {
        for (int i10 = 0; i10 < 6; i10++) {
            this.f23527a[i10].invalidate();
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
        View[] viewArr = this.f23527a;
        if (this.f23533r == 1) {
            a2 = bi.A(2.0f, this.f23530e - 1, View.MeasureSpec.getSize(i10)) / this.f23530e;
        } else {
            a2 = a(this.f23530e);
        }
        this.h = true;
        int i12 = 0;
        for (int i13 = 0; i13 < this.f23530e; i13++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i13].getLayoutParams();
            if (this.f23531f) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(2.0f);
            }
            layoutParams.topMargin = dp;
            layoutParams.leftMargin = (AndroidUtilities.dp(2.0f) + a2) * i13;
            if (i13 == this.f23530e - 1) {
                if (AndroidUtilities.isTablet()) {
                    layoutParams.width = AndroidUtilities.dp(490.0f) - ((AndroidUtilities.dp(2.0f) + a2) * (this.f23530e - 1));
                } else {
                    layoutParams.width = AndroidUtilities.displaySize.x - ((AndroidUtilities.dp(2.0f) + a2) * (this.f23530e - 1));
                }
            } else {
                layoutParams.width = a2;
            }
            layoutParams.height = a2;
            layoutParams.gravity = 51;
            viewArr[i13].setLayoutParams(layoutParams);
        }
        this.h = false;
        if (!this.f23531f) {
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

    public void setDelegate(r7 r7Var) {
        this.d = r7Var;
    }

    public void setIsFirst(boolean z10) {
        this.f23531f = z10;
    }

    public void setItemsCount(int i10) {
        int i11;
        q7[] q7VarArr = this.f23527a;
        for (int i12 = 0; i12 < q7VarArr.length; i12++) {
            q7VarArr[i12].clearAnimation();
            q7 q7Var = q7VarArr[i12];
            if (i12 < i10) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            q7Var.setVisibility(i11);
        }
        this.f23530e = i10;
    }
}
