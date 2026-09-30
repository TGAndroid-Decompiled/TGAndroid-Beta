package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class oa0 extends AnimatorListenerAdapter {
    public final int f27048a;
    public final int f27049b;
    public final boolean f27050c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public oa0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z10, int i11) {
        this.f27048a = i11;
        this.d = notificationCenterDelegate;
        this.f27049b = i10;
        this.f27050c = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27048a) {
            case 1:
                AnimatorSet[] animatorSetArr = ((iy0) this.d).I;
                int i10 = this.f27049b;
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
        switch (this.f27048a) {
            case 0:
                qa0 qa0Var = (qa0) this.d;
                p6[] p6VarArr = qa0Var.f27636x;
                org.telegram.ui.ActionBar.h5[] h5VarArr = qa0Var.f27635w;
                float[] fArr = qa0Var.Z;
                float f11 = 0.0f;
                boolean z10 = this.f27050c;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                int i10 = this.f27049b;
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
                iy0 iy0Var = (iy0) this.d;
                AnimatorSet[] animatorSetArr = iy0Var.I;
                int i11 = this.f27049b;
                AnimatorSet animatorSet = animatorSetArr[i11];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f27050c) {
                        iy0Var.J[i11].setVisibility(4);
                    }
                    animatorSetArr[i11] = null;
                    return;
                }
                return;
        }
    }
}
