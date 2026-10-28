package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.wh;
import org.telegram.ui.Components.aq;
public final class x7 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public t7[] f25721a;
    public MessageObject[] f25722b;
    public int[] f25723c;
    public u7 d;
    public int e;
    public boolean f25724f;
    public boolean h;
    public Paint f25725n;
    public int f25726r;
    public int f25727s;

    public static int a(int i10) {
        if (AndroidUtilities.isTablet()) {
            return (AndroidUtilities.dp(490.0f) - (AndroidUtilities.dp(2.0f) * (i10 - 1))) / i10;
        }
        return (AndroidUtilities.displaySize.x - (AndroidUtilities.dp(2.0f) * (i10 - 1))) / i10;
    }

    public final void b(int i10, boolean z10, boolean z11) {
        float f7;
        t7 t7Var = this.f25721a[i10];
        FrameLayout frameLayout = t7Var.f25457f;
        aq aqVar = t7Var.e;
        if (aqVar.getVisibility() != 0) {
            aqVar.setVisibility(0);
        }
        aqVar.a(z10, true);
        AnimatorSet animatorSet = t7Var.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            t7Var.h = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        t7Var.h = animatorSet2;
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
        t7Var.h.setDuration(200L);
        t7Var.h.addListener(new kg.e(t7Var, 18));
        t7Var.h.start();
    }

    public final void c(MessageObject messageObject, int i10, int i11) {
        t7[] t7VarArr = this.f25721a;
        MessageObject[] messageObjectArr = this.f25722b;
        messageObjectArr[i10] = messageObject;
        this.f25723c[i10] = i11;
        if (messageObject != null) {
            t7VarArr[i10].setVisibility(0);
            t7VarArr[i10].setMessageObject(messageObject);
            return;
        }
        t7VarArr[i10].clearAnimation();
        t7VarArr[i10].setVisibility(4);
        messageObjectArr[i10] = null;
    }

    public u7 getDelegate() {
        return this.d;
    }

    @Override
    public final void invalidate() {
        for (int i10 = 0; i10 < 6; i10++) {
            this.f25721a[i10].invalidate();
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
        View[] viewArr = this.f25721a;
        if (this.f25726r == 1) {
            a2 = wh.C(2.0f, this.e - 1, View.MeasureSpec.getSize(i10)) / this.e;
        } else {
            a2 = a(this.e);
        }
        this.h = true;
        int i12 = 0;
        for (int i13 = 0; i13 < this.e; i13++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i13].getLayoutParams();
            if (this.f25724f) {
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
        if (!this.f25724f) {
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

    public void setDelegate(u7 u7Var) {
        this.d = u7Var;
    }

    public void setIsFirst(boolean z10) {
        this.f25724f = z10;
    }

    public void setItemsCount(int i10) {
        int i11;
        t7[] t7VarArr = this.f25721a;
        for (int i12 = 0; i12 < t7VarArr.length; i12++) {
            t7VarArr[i12].clearAnimation();
            t7 t7Var = t7VarArr[i12];
            if (i12 < i10) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            t7Var.setVisibility(i11);
        }
        this.e = i10;
    }

    @Override
    public final void updateColors() {
        try {
            this.f25725n.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Lh, false));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
