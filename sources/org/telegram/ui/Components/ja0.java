package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class ja0 extends AnimatorListenerAdapter {
    public final int f24334a;
    public final int f24335b;
    public final boolean f24336c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public ja0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z10, int i11) {
        this.f24334a = i11;
        this.d = notificationCenterDelegate;
        this.f24335b = i10;
        this.f24336c = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f24334a) {
            case 1:
                AnimatorSet[] animatorSetArr = ((hy0) this.d).I;
                int i10 = this.f24335b;
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
        switch (this.f24334a) {
            case 0:
                la0 la0Var = (la0) this.d;
                o6[] o6VarArr = la0Var.f24927x;
                org.telegram.ui.ActionBar.l5[] l5VarArr = la0Var.f24926w;
                float[] fArr = la0Var.Z;
                float f11 = 0.0f;
                boolean z10 = this.f24336c;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                int i10 = this.f24335b;
                fArr[i10] = f7;
                org.telegram.ui.ActionBar.l5 l5Var = l5VarArr[i10];
                float f12 = 1.111f;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 1.111f;
                }
                l5Var.setScaleX(f10);
                org.telegram.ui.ActionBar.l5 l5Var2 = l5VarArr[i10];
                if (z10) {
                    f12 = 1.0f;
                }
                l5Var2.setScaleY(f12);
                org.telegram.ui.ActionBar.l5 l5Var3 = l5VarArr[i10];
                if (z10) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(8.0f);
                }
                l5Var3.setTranslationY(dp);
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
                hy0 hy0Var = (hy0) this.d;
                AnimatorSet[] animatorSetArr = hy0Var.I;
                int i11 = this.f24335b;
                AnimatorSet animatorSet = animatorSetArr[i11];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f24336c) {
                        hy0Var.J[i11].setVisibility(4);
                    }
                    animatorSetArr[i11] = null;
                    return;
                }
                return;
        }
    }
}
