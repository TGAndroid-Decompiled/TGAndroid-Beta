package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class aa0 extends AnimatorListenerAdapter {
    public final int f22400a;
    public final int f22401b;
    public final boolean f22402c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public aa0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z10, int i11) {
        this.f22400a = i11;
        this.d = notificationCenterDelegate;
        this.f22401b = i10;
        this.f22402c = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f22400a) {
            case 1:
                AnimatorSet[] animatorSetArr = ((ux0) this.d).I;
                int i10 = this.f22401b;
                AnimatorSet animatorSet = animatorSetArr[i10];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[i10] = null;
                    return;
                }
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        float dp;
        switch (this.f22400a) {
            case 0:
                ca0 ca0Var = (ca0) this.d;
                p6[] p6VarArr = ca0Var.f23003x;
                org.telegram.ui.ActionBar.i5[] i5VarArr = ca0Var.f23002w;
                float[] fArr = ca0Var.Z;
                float f11 = 0.0f;
                boolean z10 = this.f22402c;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                int i10 = this.f22401b;
                fArr[i10] = f7;
                org.telegram.ui.ActionBar.i5 i5Var = i5VarArr[i10];
                float f12 = 1.111f;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 1.111f;
                }
                i5Var.setScaleX(f10);
                org.telegram.ui.ActionBar.i5 i5Var2 = i5VarArr[i10];
                if (z10) {
                    f12 = 1.0f;
                }
                i5Var2.setScaleY(f12);
                org.telegram.ui.ActionBar.i5 i5Var3 = i5VarArr[i10];
                if (z10) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(8.0f);
                }
                i5Var3.setTranslationY(dp);
                p6 p6Var = p6VarArr[i10];
                if (z10) {
                    f11 = 1.0f;
                }
                p6Var.setAlpha(f11);
                if (!z10) {
                    p6VarArr[i10].setVisibility(8);
                    return;
                }
                return;
            default:
                ux0 ux0Var = (ux0) this.d;
                AnimatorSet[] animatorSetArr = ux0Var.I;
                int i11 = this.f22401b;
                AnimatorSet animatorSet = animatorSetArr[i11];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f22402c) {
                        ux0Var.J[i11].setVisibility(4);
                    }
                    animatorSetArr[i11] = null;
                    return;
                }
                return;
        }
    }
}
