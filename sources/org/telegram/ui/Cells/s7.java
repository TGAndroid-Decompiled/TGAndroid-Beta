package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.lp;
public final class s7 extends FrameLayout {
    public o7[] f21945a;
    public MessageObject[] f21946b;
    public int[] f21947c;
    public p7 d;
    public int e;
    public boolean f21948f;
    public boolean h;
    public Paint f21949n;
    public int f21950r;
    public int f21951s;

    public static int a(int i10) {
        if (AndroidUtilities.isTablet()) {
            return (AndroidUtilities.dp(490.0f) - (AndroidUtilities.dp(2.0f) * (i10 - 1))) / i10;
        }
        return (AndroidUtilities.displaySize.x - (AndroidUtilities.dp(2.0f) * (i10 - 1))) / i10;
    }

    public final void b(int i10, boolean z4) {
        float f10;
        o7 o7Var = this.f21945a[i10];
        FrameLayout frameLayout = o7Var.f21524f;
        lp lpVar = o7Var.e;
        if (lpVar.getVisibility() != 0) {
            lpVar.setVisibility(0);
        }
        lpVar.a(z4, true);
        AnimatorSet animatorSet = o7Var.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            o7Var.h = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        o7Var.h = animatorSet2;
        float f11 = 0.81f;
        if (z4) {
            f10 = 0.81f;
        } else {
            f10 = 1.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(frameLayout, View.SCALE_X, f10);
        if (!z4) {
            f11 = 1.0f;
        }
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(frameLayout, View.SCALE_Y, f11));
        o7Var.h.setDuration(200L);
        o7Var.h.addListener(new org.telegram.ui.s5(o7Var, 10));
        o7Var.h.start();
    }

    public final void c(int i10, int i11, MessageObject messageObject) {
        o7[] o7VarArr = this.f21945a;
        MessageObject[] messageObjectArr = this.f21946b;
        messageObjectArr[i10] = messageObject;
        this.f21947c[i10] = i11;
        if (messageObject != null) {
            o7VarArr[i10].setVisibility(0);
            o7VarArr[i10].setMessageObject(messageObject);
            return;
        }
        o7VarArr[i10].clearAnimation();
        o7VarArr[i10].setVisibility(4);
        messageObjectArr[i10] = null;
    }

    public p7 getDelegate() {
        return this.d;
    }

    @Override
    public final void invalidate() {
        for (int i10 = 0; i10 < 6; i10++) {
            this.f21945a[i10].invalidate();
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
        View[] viewArr = this.f21945a;
        if (this.f21950r == 1) {
            a2 = org.telegram.ui.b.z(2.0f, this.e - 1, View.MeasureSpec.getSize(i10)) / this.e;
        } else {
            a2 = a(this.e);
        }
        this.h = true;
        int i12 = 0;
        for (int i13 = 0; i13 < this.e; i13++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i13].getLayoutParams();
            if (this.f21948f) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(2.0f);
            }
            layoutParams.topMargin = dp;
            layoutParams.leftMargin = (AndroidUtilities.dp(2.0f) + a2) * i13;
            if (i13 == this.e - 1) {
                if (AndroidUtilities.isTablet()) {
                    layoutParams.width = AndroidUtilities.dp(490.0f) - ((AndroidUtilities.dp(2.0f) + a2) * (this.e - 1));
                } else {
                    layoutParams.width = AndroidUtilities.displaySize.x - ((AndroidUtilities.dp(2.0f) + a2) * (this.e - 1));
                }
            } else {
                layoutParams.width = a2;
            }
            layoutParams.height = a2;
            layoutParams.gravity = 51;
            viewArr[i13].setLayoutParams(layoutParams);
        }
        this.h = false;
        if (!this.f21948f) {
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

    public void setDelegate(p7 p7Var) {
        this.d = p7Var;
    }

    public void setIsFirst(boolean z4) {
        this.f21948f = z4;
    }

    public void setItemsCount(int i10) {
        int i11;
        o7[] o7VarArr = this.f21945a;
        for (int i12 = 0; i12 < o7VarArr.length; i12++) {
            o7VarArr[i12].clearAnimation();
            o7 o7Var = o7VarArr[i12];
            if (i12 < i10) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            o7Var.setVisibility(i11);
        }
        this.e = i10;
    }
}
