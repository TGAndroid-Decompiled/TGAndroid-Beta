package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class ua0 extends AnimatorListenerAdapter {
    public final int f30885a;
    public final int f30886b;
    public final boolean f30887c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public ua0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z10, int i11) {
        this.f30885a = i11;
        this.d = notificationCenterDelegate;
        this.f30886b = i10;
        this.f30887c = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f30885a) {
            case 1:
                AnimatorSet[] animatorSetArr = ((qy0) this.d).I;
                int i10 = this.f30886b;
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
        switch (this.f30885a) {
            case 0:
                wa0 wa0Var = (wa0) this.d;
                q6[] q6VarArr = wa0Var.f32054x;
                org.telegram.ui.ActionBar.j5[] j5VarArr = wa0Var.f32053w;
                float[] fArr = wa0Var.Z;
                float f11 = 0.0f;
                boolean z10 = this.f30887c;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                int i10 = this.f30886b;
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
                qy0 qy0Var = (qy0) this.d;
                AnimatorSet[] animatorSetArr = qy0Var.I;
                int i11 = this.f30886b;
                AnimatorSet animatorSet = animatorSetArr[i11];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f30887c) {
                        qy0Var.J[i11].setVisibility(4);
                    }
                    animatorSetArr[i11] = null;
                    return;
                }
                return;
        }
    }
}
