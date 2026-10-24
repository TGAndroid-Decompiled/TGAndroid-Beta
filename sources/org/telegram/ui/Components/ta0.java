package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class ta0 extends AnimatorListenerAdapter {
    public final int f30771a;
    public final int f30772b;
    public final boolean f30773c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public ta0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z10, int i11) {
        this.f30771a = i11;
        this.d = notificationCenterDelegate;
        this.f30772b = i10;
        this.f30773c = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f30771a) {
            case 1:
                AnimatorSet[] animatorSetArr = ((sy0) this.d).I;
                int i10 = this.f30772b;
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
        switch (this.f30771a) {
            case 0:
                va0 va0Var = (va0) this.d;
                o6[] o6VarArr = va0Var.f31408x;
                org.telegram.ui.ActionBar.n5[] n5VarArr = va0Var.f31407w;
                float[] fArr = va0Var.Z;
                float f11 = 0.0f;
                boolean z10 = this.f30773c;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                int i10 = this.f30772b;
                fArr[i10] = f7;
                org.telegram.ui.ActionBar.n5 n5Var = n5VarArr[i10];
                float f12 = 1.111f;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 1.111f;
                }
                n5Var.setScaleX(f10);
                org.telegram.ui.ActionBar.n5 n5Var2 = n5VarArr[i10];
                if (z10) {
                    f12 = 1.0f;
                }
                n5Var2.setScaleY(f12);
                org.telegram.ui.ActionBar.n5 n5Var3 = n5VarArr[i10];
                if (z10) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(8.0f);
                }
                n5Var3.setTranslationY(dp);
                o6 o6Var = o6VarArr[i10];
                if (z10) {
                    f11 = 1.0f;
                }
                o6Var.setAlpha(f11);
                if (!z10) {
                    o6VarArr[i10].setVisibility(8);
                    return;
                }
                return;
            default:
                sy0 sy0Var = (sy0) this.d;
                AnimatorSet[] animatorSetArr = sy0Var.I;
                int i11 = this.f30772b;
                AnimatorSet animatorSet = animatorSetArr[i11];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f30773c) {
                        sy0Var.J[i11].setVisibility(4);
                    }
                    animatorSetArr[i11] = null;
                    return;
                }
                return;
        }
    }
}
