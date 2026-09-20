package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.rk;
import org.telegram.ui.Components.np;
public final class v7 extends FrameLayout {
    public r7[] f21692a;
    public MessageObject[] f21693b;
    public int[] f21694c;
    public s7 d;
    public int e;
    public boolean f21695f;
    public boolean h;
    public Paint f21696n;
    public int f21697r;
    public int f21698s;

    public static int a(int i10) {
        if (AndroidUtilities.isTablet()) {
            return (AndroidUtilities.dp(490.0f) - (AndroidUtilities.dp(2.0f) * (i10 - 1))) / i10;
        }
        return (AndroidUtilities.displaySize.x - (AndroidUtilities.dp(2.0f) * (i10 - 1))) / i10;
    }

    public final void b(int i10, boolean z10) {
        float f7;
        r7 r7Var = this.f21692a[i10];
        FrameLayout frameLayout = r7Var.f20884f;
        np npVar = r7Var.e;
        if (npVar.getVisibility() != 0) {
            npVar.setVisibility(0);
        }
        npVar.a(z10, true);
        AnimatorSet animatorSet = r7Var.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            r7Var.h = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        r7Var.h = animatorSet2;
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
        r7Var.h.setDuration(200L);
        r7Var.h.addListener(new org.telegram.ui.t4(r7Var, 11));
        r7Var.h.start();
    }

    public final void c(int i10, int i11, MessageObject messageObject) {
        r7[] r7VarArr = this.f21692a;
        MessageObject[] messageObjectArr = this.f21693b;
        messageObjectArr[i10] = messageObject;
        this.f21694c[i10] = i11;
        if (messageObject != null) {
            r7VarArr[i10].setVisibility(0);
            r7VarArr[i10].setMessageObject(messageObject);
            return;
        }
        r7VarArr[i10].clearAnimation();
        r7VarArr[i10].setVisibility(4);
        messageObjectArr[i10] = null;
    }

    public s7 getDelegate() {
        return this.d;
    }

    @Override
    public final void invalidate() {
        for (int i10 = 0; i10 < 6; i10++) {
            this.f21692a[i10].invalidate();
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
        View[] viewArr = this.f21692a;
        if (this.f21697r == 1) {
            a2 = rk.B(2.0f, this.e - 1, View.MeasureSpec.getSize(i10)) / this.e;
        } else {
            a2 = a(this.e);
        }
        this.h = true;
        int i12 = 0;
        for (int i13 = 0; i13 < this.e; i13++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i13].getLayoutParams();
            if (this.f21695f) {
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
        if (!this.f21695f) {
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

    public void setDelegate(s7 s7Var) {
        this.d = s7Var;
    }

    public void setIsFirst(boolean z10) {
        this.f21695f = z10;
    }

    public void setItemsCount(int i10) {
        int i11;
        r7[] r7VarArr = this.f21692a;
        for (int i12 = 0; i12 < r7VarArr.length; i12++) {
            r7VarArr[i12].clearAnimation();
            r7 r7Var = r7VarArr[i12];
            if (i12 < i10) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            r7Var.setVisibility(i11);
        }
        this.e = i10;
    }
}
