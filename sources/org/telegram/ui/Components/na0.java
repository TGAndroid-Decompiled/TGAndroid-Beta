package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class na0 extends AnimatorListenerAdapter {
    public final int f26731a;
    public final int f26732b;
    public final boolean f26733c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public na0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z10, int i11) {
        this.f26731a = i11;
        this.d = notificationCenterDelegate;
        this.f26732b = i10;
        this.f26733c = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f26731a) {
            case 1:
                AnimatorSet[] animatorSetArr = ((hy0) this.d).I;
                int i10 = this.f26732b;
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
        switch (this.f26731a) {
            case 0:
                pa0 pa0Var = (pa0) this.d;
                p6[] p6VarArr = pa0Var.f27330x;
                org.telegram.ui.ActionBar.h5[] h5VarArr = pa0Var.f27329w;
                float[] fArr = pa0Var.Z;
                float f11 = 0.0f;
                boolean z10 = this.f26733c;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                int i10 = this.f26732b;
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
                hy0 hy0Var = (hy0) this.d;
                AnimatorSet[] animatorSetArr = hy0Var.I;
                int i11 = this.f26732b;
                AnimatorSet animatorSet = animatorSetArr[i11];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f26733c) {
                        hy0Var.J[i11].setVisibility(4);
                    }
                    animatorSetArr[i11] = null;
                    return;
                }
                return;
        }
    }
}
