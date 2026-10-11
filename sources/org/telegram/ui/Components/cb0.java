package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class cb0 extends AnimatorListenerAdapter {
    public final int f25184a;
    public final int f25185b;
    public final boolean f25186c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public cb0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z10, int i11) {
        this.f25184a = i11;
        this.d = notificationCenterDelegate;
        this.f25185b = i10;
        this.f25186c = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f25184a) {
            case 1:
                AnimatorSet[] animatorSetArr = ((zy0) this.d).I;
                int i10 = this.f25185b;
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
        switch (this.f25184a) {
            case 0:
                eb0 eb0Var = (eb0) this.d;
                r6[] r6VarArr = eb0Var.f25966x;
                org.telegram.ui.ActionBar.h5[] h5VarArr = eb0Var.f25965w;
                float[] fArr = eb0Var.Z;
                float f11 = 0.0f;
                boolean z10 = this.f25186c;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                int i10 = this.f25185b;
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
                r6 r6Var = r6VarArr[i10];
                if (z10) {
                    f11 = 1.0f;
                }
                r6Var.setAlpha(f11);
                if (!z10) {
                    r6VarArr[i10].setVisibility(8);
                    return;
                }
                return;
            default:
                zy0 zy0Var = (zy0) this.d;
                AnimatorSet[] animatorSetArr = zy0Var.I;
                int i11 = this.f25185b;
                AnimatorSet animatorSet = animatorSetArr[i11];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f25186c) {
                        zy0Var.J[i11].setVisibility(4);
                    }
                    animatorSetArr[i11] = null;
                    return;
                }
                return;
        }
    }
}
