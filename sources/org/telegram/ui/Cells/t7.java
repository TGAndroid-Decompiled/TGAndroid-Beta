package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.mk;
import org.telegram.ui.Components.xp;
public final class t7 extends FrameLayout {
    public p7[] f23200a;
    public MessageObject[] f23201b;
    public int[] f23202c;
    public q7 d;
    public int e;
    public boolean f23203f;
    public boolean h;
    public Paint f23204n;
    public int f23205r;
    public int f23206s;

    public static int a(int i10) {
        if (AndroidUtilities.isTablet()) {
            return (AndroidUtilities.dp(490.0f) - (AndroidUtilities.dp(2.0f) * (i10 - 1))) / i10;
        }
        return (AndroidUtilities.displaySize.x - (AndroidUtilities.dp(2.0f) * (i10 - 1))) / i10;
    }

    public final void b(int i10, boolean z10) {
        float f7;
        p7 p7Var = this.f23200a[i10];
        FrameLayout frameLayout = p7Var.f22756f;
        xp xpVar = p7Var.e;
        if (xpVar.getVisibility() != 0) {
            xpVar.setVisibility(0);
        }
        xpVar.a(z10, true);
        AnimatorSet animatorSet = p7Var.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            p7Var.h = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        p7Var.h = animatorSet2;
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
        p7Var.h.setDuration(200L);
        p7Var.h.addListener(new m.a(p7Var, 16));
        p7Var.h.start();
    }

    public final void c(MessageObject messageObject, int i10, int i11) {
        p7[] p7VarArr = this.f23200a;
        MessageObject[] messageObjectArr = this.f23201b;
        messageObjectArr[i10] = messageObject;
        this.f23202c[i10] = i11;
        if (messageObject != null) {
            p7VarArr[i10].setVisibility(0);
            p7VarArr[i10].setMessageObject(messageObject);
            return;
        }
        p7VarArr[i10].clearAnimation();
        p7VarArr[i10].setVisibility(4);
        messageObjectArr[i10] = null;
    }

    public q7 getDelegate() {
        return this.d;
    }

    @Override
    public final void invalidate() {
        for (int i10 = 0; i10 < 6; i10++) {
            this.f23200a[i10].invalidate();
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
        View[] viewArr = this.f23200a;
        if (this.f23205r == 1) {
            a2 = mk.B(2.0f, this.e - 1, View.MeasureSpec.getSize(i10)) / this.e;
        } else {
            a2 = a(this.e);
        }
        this.h = true;
        int i12 = 0;
        for (int i13 = 0; i13 < this.e; i13++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i13].getLayoutParams();
            if (this.f23203f) {
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
        if (!this.f23203f) {
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

    public void setDelegate(q7 q7Var) {
        this.d = q7Var;
    }

    public void setIsFirst(boolean z10) {
        this.f23203f = z10;
    }

    public void setItemsCount(int i10) {
        int i11;
        p7[] p7VarArr = this.f23200a;
        for (int i12 = 0; i12 < p7VarArr.length; i12++) {
            p7VarArr[i12].clearAnimation();
            p7 p7Var = p7VarArr[i12];
            if (i12 < i10) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            p7Var.setVisibility(i11);
        }
        this.e = i10;
    }
}
