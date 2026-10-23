package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class va0 extends AnimatorListenerAdapter {
    public final int f31397a;
    public final int f31398b;
    public final boolean f31399c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public va0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z10, int i11) {
        this.f31397a = i11;
        this.d = notificationCenterDelegate;
        this.f31398b = i10;
        this.f31399c = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f31397a) {
            case 1:
                AnimatorSet[] animatorSetArr = ((ty0) this.d).I;
                int i10 = this.f31398b;
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
        switch (this.f31397a) {
            case 0:
                xa0 xa0Var = (xa0) this.d;
                q6[] q6VarArr = xa0Var.f32509x;
                org.telegram.ui.ActionBar.n5[] n5VarArr = xa0Var.f32508w;
                float[] fArr = xa0Var.Z;
                float f11 = 0.0f;
                boolean z10 = this.f31399c;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                int i10 = this.f31398b;
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
                q6 q6Var = q6VarArr[i10];
                if (z10) {
                    f11 = 1.0f;
                }
                q6Var.setAlpha(f11);
                if (!z10) {
                    q6VarArr[i10].setVisibility(8);
                    return;
                }
                return;
            default:
                ty0 ty0Var = (ty0) this.d;
                AnimatorSet[] animatorSetArr = ty0Var.I;
                int i11 = this.f31398b;
                AnimatorSet animatorSet = animatorSetArr[i11];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f31399c) {
                        ty0Var.J[i11].setVisibility(4);
                    }
                    animatorSetArr[i11] = null;
                    return;
                }
                return;
        }
    }
}
