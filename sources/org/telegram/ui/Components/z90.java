package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class z90 extends AnimatorListenerAdapter {
    public final int f30445a;
    public final int f30446b;
    public final boolean f30447c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public z90(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z10, int i11) {
        this.f30445a = i11;
        this.d = notificationCenterDelegate;
        this.f30446b = i10;
        this.f30447c = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f30445a) {
            case 1:
                AnimatorSet[] animatorSetArr = ((wx0) this.d).I;
                int i10 = this.f30446b;
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
        switch (this.f30445a) {
            case 0:
                ba0 ba0Var = (ba0) this.d;
                n6[] n6VarArr = ba0Var.f22689x;
                org.telegram.ui.ActionBar.k5[] k5VarArr = ba0Var.f22688w;
                float[] fArr = ba0Var.Z;
                float f11 = 0.0f;
                boolean z10 = this.f30447c;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                int i10 = this.f30446b;
                fArr[i10] = f7;
                org.telegram.ui.ActionBar.k5 k5Var = k5VarArr[i10];
                float f12 = 1.111f;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 1.111f;
                }
                k5Var.setScaleX(f10);
                org.telegram.ui.ActionBar.k5 k5Var2 = k5VarArr[i10];
                if (z10) {
                    f12 = 1.0f;
                }
                k5Var2.setScaleY(f12);
                org.telegram.ui.ActionBar.k5 k5Var3 = k5VarArr[i10];
                if (z10) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(8.0f);
                }
                k5Var3.setTranslationY(dp);
                n6 n6Var = n6VarArr[i10];
                if (z10) {
                    f11 = 1.0f;
                }
                n6Var.setAlpha(f11);
                if (!z10) {
                    n6VarArr[i10].setVisibility(8);
                    return;
                }
                return;
            default:
                wx0 wx0Var = (wx0) this.d;
                AnimatorSet[] animatorSetArr = wx0Var.I;
                int i11 = this.f30446b;
                AnimatorSet animatorSet = animatorSetArr[i11];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f30447c) {
                        wx0Var.J[i11].setVisibility(4);
                    }
                    animatorSetArr[i11] = null;
                    return;
                }
                return;
        }
    }
}
