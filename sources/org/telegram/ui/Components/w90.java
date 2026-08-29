package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class w90 extends AnimatorListenerAdapter {
    public final int f34353a;
    public final int f34354b;
    public final boolean f34355c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public w90(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z10, int i11) {
        this.f34353a = i11;
        this.d = notificationCenterDelegate;
        this.f34354b = i10;
        this.f34355c = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f34353a) {
            case 1:
                AnimatorSet[] animatorSetArr = ((nx0) this.d).E;
                int i10 = this.f34354b;
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
        float f9;
        float f10;
        float dp;
        switch (this.f34353a) {
            case 0:
                y90 y90Var = (y90) this.d;
                o6[] o6VarArr = y90Var.f35003x;
                org.telegram.ui.ActionBar.h5[] h5VarArr = y90Var.f35002w;
                float[] fArr = y90Var.V;
                float f11 = 0.0f;
                boolean z10 = this.f34355c;
                if (z10) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                int i10 = this.f34354b;
                fArr[i10] = f9;
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
                nx0 nx0Var = (nx0) this.d;
                AnimatorSet[] animatorSetArr = nx0Var.E;
                int i11 = this.f34354b;
                AnimatorSet animatorSet = animatorSetArr[i11];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f34355c) {
                        nx0Var.F[i11].setVisibility(4);
                    }
                    animatorSetArr[i11] = null;
                    return;
                }
                return;
        }
    }
}
