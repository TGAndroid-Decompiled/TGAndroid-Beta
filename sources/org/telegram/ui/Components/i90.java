package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class i90 extends AnimatorListenerAdapter {
    public final int f29394a;
    public final int f29395b;
    public final boolean f29396c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public i90(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i9, boolean z10, int i10) {
        this.f29394a = i10;
        this.d = notificationCenterDelegate;
        this.f29395b = i9;
        this.f29396c = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f29394a) {
            case 1:
                AnimatorSet[] animatorSetArr = ((cx0) this.d).E;
                int i9 = this.f29395b;
                AnimatorSet animatorSet = animatorSetArr[i9];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[i9] = null;
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
        switch (this.f29394a) {
            case 0:
                k90 k90Var = (k90) this.d;
                j6[] j6VarArr = k90Var.f30041x;
                org.telegram.ui.ActionBar.h5[] h5VarArr = k90Var.f30040w;
                float[] fArr = k90Var.V;
                float f12 = 0.0f;
                boolean z10 = this.f29396c;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                int i9 = this.f29395b;
                fArr[i9] = f10;
                org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[i9];
                float f13 = 1.111f;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 1.111f;
                }
                h5Var.setScaleX(f11);
                org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[i9];
                if (z10) {
                    f13 = 1.0f;
                }
                h5Var2.setScaleY(f13);
                org.telegram.ui.ActionBar.h5 h5Var3 = h5VarArr[i9];
                if (z10) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(8.0f);
                }
                h5Var3.setTranslationY(dp);
                j6 j6Var = j6VarArr[i9];
                if (z10) {
                    f12 = 1.0f;
                }
                j6Var.setAlpha(f12);
                if (!z10) {
                    j6VarArr[i9].setVisibility(8);
                    return;
                }
                return;
            default:
                cx0 cx0Var = (cx0) this.d;
                AnimatorSet[] animatorSetArr = cx0Var.E;
                int i10 = this.f29395b;
                AnimatorSet animatorSet = animatorSetArr[i10];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f29396c) {
                        cx0Var.F[i10].setVisibility(4);
                    }
                    animatorSetArr[i10] = null;
                    return;
                }
                return;
        }
    }
}
