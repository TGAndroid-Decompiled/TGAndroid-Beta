package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.ll;
import org.telegram.ui.Components.dp;
public final class s7 extends FrameLayout {
    public o7[] f25280a;
    public MessageObject[] f25281b;
    public int[] f25282c;
    public p7 d;
    public int f25283e;
    public boolean f25284f;
    public boolean h;
    public Paint f25285n;
    public int f25286r;
    public int f25287s;

    public static int a(int i9) {
        if (AndroidUtilities.isTablet()) {
            return (AndroidUtilities.dp(490.0f) - (AndroidUtilities.dp(2.0f) * (i9 - 1))) / i9;
        }
        return (AndroidUtilities.displaySize.x - (AndroidUtilities.dp(2.0f) * (i9 - 1))) / i9;
    }

    public final void b(int i9, boolean z10) {
        float f10;
        o7 o7Var = this.f25280a[i9];
        FrameLayout frameLayout = o7Var.f24836f;
        dp dpVar = o7Var.f24835e;
        if (dpVar.getVisibility() != 0) {
            dpVar.setVisibility(0);
        }
        dpVar.a(z10, true);
        AnimatorSet animatorSet = o7Var.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            o7Var.h = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        o7Var.h = animatorSet2;
        float f11 = 0.81f;
        if (z10) {
            f10 = 0.81f;
        } else {
            f10 = 1.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(frameLayout, View.SCALE_X, f10);
        if (!z10) {
            f11 = 1.0f;
        }
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(frameLayout, View.SCALE_Y, f11));
        o7Var.h.setDuration(200L);
        o7Var.h.addListener(new mh.x(o7Var, 17));
        o7Var.h.start();
    }

    public final void c(int i9, int i10, MessageObject messageObject) {
        o7[] o7VarArr = this.f25280a;
        MessageObject[] messageObjectArr = this.f25281b;
        messageObjectArr[i9] = messageObject;
        this.f25282c[i9] = i10;
        if (messageObject != null) {
            o7VarArr[i9].setVisibility(0);
            o7VarArr[i9].setMessageObject(messageObject);
            return;
        }
        o7VarArr[i9].clearAnimation();
        o7VarArr[i9].setVisibility(4);
        messageObjectArr[i9] = null;
    }

    public p7 getDelegate() {
        return this.d;
    }

    @Override
    public final void invalidate() {
        for (int i9 = 0; i9 < 6; i9++) {
            this.f25280a[i9].invalidate();
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
    public final void onMeasure(int i9, int i10) {
        int a2;
        int dp;
        View[] viewArr = this.f25280a;
        if (this.f25286r == 1) {
            a2 = ll.A(2.0f, this.f25283e - 1, View.MeasureSpec.getSize(i9)) / this.f25283e;
        } else {
            a2 = a(this.f25283e);
        }
        this.h = true;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f25283e; i12++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i12].getLayoutParams();
            if (this.f25284f) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(2.0f);
            }
            layoutParams.topMargin = dp;
            layoutParams.leftMargin = (AndroidUtilities.dp(2.0f) + a2) * i12;
            if (i12 == this.f25283e - 1) {
                if (AndroidUtilities.isTablet()) {
                    layoutParams.width = AndroidUtilities.dp(490.0f) - ((AndroidUtilities.dp(2.0f) + a2) * (this.f25283e - 1));
                } else {
                    layoutParams.width = AndroidUtilities.displaySize.x - ((AndroidUtilities.dp(2.0f) + a2) * (this.f25283e - 1));
                }
            } else {
                layoutParams.width = a2;
            }
            layoutParams.height = a2;
            layoutParams.gravity = 51;
            viewArr[i12].setLayoutParams(layoutParams);
        }
        this.h = false;
        if (!this.f25284f) {
            i11 = AndroidUtilities.dp(2.0f);
        }
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(i11 + a2, 1073741824));
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

    public void setIsFirst(boolean z10) {
        this.f25284f = z10;
    }

    public void setItemsCount(int i9) {
        int i10;
        o7[] o7VarArr = this.f25280a;
        for (int i11 = 0; i11 < o7VarArr.length; i11++) {
            o7VarArr[i11].clearAnimation();
            o7 o7Var = o7VarArr[i11];
            if (i11 < i9) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            o7Var.setVisibility(i10);
        }
        this.f25283e = i9;
    }
}
