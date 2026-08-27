package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

public final class m90 extends AnimatorListenerAdapter {

    public final int f30629a;

    public final int f30630b;

    public final boolean f30631c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public m90(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z10, int i11) {
        this.f30629a = i11;
        this.d = notificationCenterDelegate;
        this.f30630b = i10;
        this.f30631c = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f30629a) {
            case 1:
                AnimatorSet[] animatorSetArr = ((ex0) this.d).E;
                int i10 = this.f30630b;
                AnimatorSet animatorSet = animatorSetArr[i10];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[i10] = null;
                    break;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30629a) {
            case 0:
                o90 o90Var = (o90) this.d;
                j6[] j6VarArr = o90Var.f31245x;
                org.telegram.ui.ActionBar.h5[] h5VarArr = o90Var.f31244w;
                float[] fArr = o90Var.V;
                boolean z10 = this.f30631c;
                float f10 = z10 ? 1.0f : 0.0f;
                int i10 = this.f30630b;
                fArr[i10] = f10;
                h5VarArr[i10].setScaleX(z10 ? 1.0f : 1.111f);
                h5VarArr[i10].setScaleY(z10 ? 1.0f : 1.111f);
                h5VarArr[i10].setTranslationY(z10 ? 0.0f : AndroidUtilities.dp(8.0f));
                j6VarArr[i10].setAlpha(z10 ? 1.0f : 0.0f);
                if (!z10) {
                    j6VarArr[i10].setVisibility(8);
                }
                break;
            default:
                ex0 ex0Var = (ex0) this.d;
                AnimatorSet[] animatorSetArr = ex0Var.E;
                int i11 = this.f30630b;
                AnimatorSet animatorSet = animatorSetArr[i11];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f30631c) {
                        ex0Var.F[i11].setVisibility(4);
                    }
                    animatorSetArr[i11] = null;
                    break;
                }
                break;
        }
    }
}
