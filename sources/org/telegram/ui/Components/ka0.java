package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class ka0 extends AnimatorListenerAdapter {
    public final int f25658a;
    public final int f25659b;
    public final boolean f25660c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public ka0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z10, int i11) {
        this.f25658a = i11;
        this.d = notificationCenterDelegate;
        this.f25659b = i10;
        this.f25660c = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f25658a) {
            case 1:
                AnimatorSet[] animatorSetArr = ((iy0) this.d).I;
                int i10 = this.f25659b;
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
        switch (this.f25658a) {
            case 0:
                ma0 ma0Var = (ma0) this.d;
                o6[] o6VarArr = ma0Var.f26415x;
                org.telegram.ui.ActionBar.j5[] j5VarArr = ma0Var.f26414w;
                float[] fArr = ma0Var.Z;
                float f11 = 0.0f;
                boolean z10 = this.f25660c;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                int i10 = this.f25659b;
                fArr[i10] = f7;
                org.telegram.ui.ActionBar.j5 j5Var = j5VarArr[i10];
                float f12 = 1.111f;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 1.111f;
                }
                j5Var.setScaleX(f10);
                org.telegram.ui.ActionBar.j5 j5Var2 = j5VarArr[i10];
                if (z10) {
                    f12 = 1.0f;
                }
                j5Var2.setScaleY(f12);
                org.telegram.ui.ActionBar.j5 j5Var3 = j5VarArr[i10];
                if (z10) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(8.0f);
                }
                j5Var3.setTranslationY(dp);
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
                iy0 iy0Var = (iy0) this.d;
                AnimatorSet[] animatorSetArr = iy0Var.I;
                int i11 = this.f25659b;
                AnimatorSet animatorSet = animatorSetArr[i11];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f25660c) {
                        iy0Var.J[i11].setVisibility(4);
                    }
                    animatorSetArr[i11] = null;
                    return;
                }
                return;
        }
    }
}
