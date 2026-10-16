package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class ab0 extends AnimatorListenerAdapter {
    public final int f23188a;
    public final int f23189b;
    public final boolean f23190c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public ab0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z10, int i11) {
        this.f23188a = i11;
        this.d = notificationCenterDelegate;
        this.f23189b = i10;
        this.f23190c = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f23188a) {
            case 1:
                AnimatorSet[] animatorSetArr = ((uy0) this.d).I;
                int i10 = this.f23189b;
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
        switch (this.f23188a) {
            case 0:
                cb0 cb0Var = (cb0) this.d;
                s6[] s6VarArr = cb0Var.f23680x;
                org.telegram.ui.ActionBar.h5[] h5VarArr = cb0Var.f23679w;
                float[] fArr = cb0Var.Z;
                float f11 = 0.0f;
                boolean z10 = this.f23190c;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                int i10 = this.f23189b;
                fArr[i10] = f7;
                org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[i10];
                float f12 = 1.111f;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 1.111f;
                }
                h5Var.setScaleX(f10);
                org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[i10];
                if (z10) {
                    f12 = 1.0f;
                }
                h5Var2.setScaleY(f12);
                org.telegram.ui.ActionBar.h5 h5Var3 = h5VarArr[i10];
                if (z10) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(8.0f);
                }
                h5Var3.setTranslationY(dp);
                s6 s6Var = s6VarArr[i10];
                if (z10) {
                    f11 = 1.0f;
                }
                s6Var.setAlpha(f11);
                if (!z10) {
                    s6VarArr[i10].setVisibility(8);
                    return;
                }
                return;
            default:
                uy0 uy0Var = (uy0) this.d;
                AnimatorSet[] animatorSetArr = uy0Var.I;
                int i11 = this.f23189b;
                AnimatorSet animatorSet = animatorSetArr[i11];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f23190c) {
                        uy0Var.J[i11].setVisibility(4);
                    }
                    animatorSetArr[i11] = null;
                    return;
                }
                return;
        }
    }
}
