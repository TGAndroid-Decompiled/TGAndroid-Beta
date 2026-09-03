package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class ca0 extends AnimatorListenerAdapter {
    public final int f23912a;
    public final int f23913b;
    public final boolean f23914c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public ca0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z4, int i11) {
        this.f23912a = i11;
        this.d = notificationCenterDelegate;
        this.f23913b = i10;
        this.f23914c = z4;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f23912a) {
            case 1:
                AnimatorSet[] animatorSetArr = ((xx0) this.d).F;
                int i10 = this.f23913b;
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
        float f10;
        float f11;
        float dp;
        switch (this.f23912a) {
            case 0:
                ea0 ea0Var = (ea0) this.d;
                k6[] k6VarArr = ea0Var.f24562x;
                org.telegram.ui.ActionBar.k5[] k5VarArr = ea0Var.f24561w;
                float[] fArr = ea0Var.W;
                float f12 = 0.0f;
                boolean z4 = this.f23914c;
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                int i10 = this.f23913b;
                fArr[i10] = f10;
                org.telegram.ui.ActionBar.k5 k5Var = k5VarArr[i10];
                float f13 = 1.111f;
                if (z4) {
                    f11 = 1.0f;
                } else {
                    f11 = 1.111f;
                }
                k5Var.setScaleX(f11);
                org.telegram.ui.ActionBar.k5 k5Var2 = k5VarArr[i10];
                if (z4) {
                    f13 = 1.0f;
                }
                k5Var2.setScaleY(f13);
                org.telegram.ui.ActionBar.k5 k5Var3 = k5VarArr[i10];
                if (z4) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(8.0f);
                }
                k5Var3.setTranslationY(dp);
                k6 k6Var = k6VarArr[i10];
                if (z4) {
                    f12 = 1.0f;
                }
                k6Var.setAlpha(f12);
                if (!z4) {
                    k6VarArr[i10].setVisibility(8);
                    return;
                }
                return;
            default:
                xx0 xx0Var = (xx0) this.d;
                AnimatorSet[] animatorSetArr = xx0Var.F;
                int i11 = this.f23913b;
                AnimatorSet animatorSet = animatorSetArr[i11];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f23914c) {
                        xx0Var.G[i11].setVisibility(4);
                    }
                    animatorSetArr[i11] = null;
                    return;
                }
                return;
        }
    }
}
