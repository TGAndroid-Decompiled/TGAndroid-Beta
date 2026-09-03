package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class da0 extends AnimatorListenerAdapter {
    public final int f26243a;
    public final int f26244b;
    public final boolean f26245c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public da0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z4, int i11) {
        this.f26243a = i11;
        this.d = notificationCenterDelegate;
        this.f26244b = i10;
        this.f26245c = z4;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f26243a) {
            case 1:
                AnimatorSet[] animatorSetArr = ((xx0) this.d).F;
                int i10 = this.f26244b;
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
        switch (this.f26243a) {
            case 0:
                fa0 fa0Var = (fa0) this.d;
                k6[] k6VarArr = fa0Var.f26858x;
                org.telegram.ui.ActionBar.l5[] l5VarArr = fa0Var.f26857w;
                float[] fArr = fa0Var.W;
                float f12 = 0.0f;
                boolean z4 = this.f26245c;
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                int i10 = this.f26244b;
                fArr[i10] = f10;
                org.telegram.ui.ActionBar.l5 l5Var = l5VarArr[i10];
                float f13 = 1.111f;
                if (z4) {
                    f11 = 1.0f;
                } else {
                    f11 = 1.111f;
                }
                l5Var.setScaleX(f11);
                org.telegram.ui.ActionBar.l5 l5Var2 = l5VarArr[i10];
                if (z4) {
                    f13 = 1.0f;
                }
                l5Var2.setScaleY(f13);
                org.telegram.ui.ActionBar.l5 l5Var3 = l5VarArr[i10];
                if (z4) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(8.0f);
                }
                l5Var3.setTranslationY(dp);
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
                int i11 = this.f26244b;
                AnimatorSet animatorSet = animatorSetArr[i11];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f26245c) {
                        xx0Var.G[i11].setVisibility(4);
                    }
                    animatorSetArr[i11] = null;
                    return;
                }
                return;
        }
    }
}
