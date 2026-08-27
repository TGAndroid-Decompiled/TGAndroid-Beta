package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

public final class rh0 extends AnimatorListenerAdapter {

    public final int f32169a;

    public final sh0 f32170b;

    public rh0(sh0 sh0Var, int i10) {
        this.f32169a = i10;
        this.f32170b = sh0Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f32169a) {
            case 1:
                sh0 sh0Var = this.f32170b;
                AnimatorSet animatorSet = sh0Var.f32448s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    sh0Var.f32448s = null;
                    sh0Var.getClass();
                    break;
                }
                break;
            case 2:
                sh0 sh0Var2 = this.f32170b;
                AnimatorSet animatorSet2 = sh0Var2.f32448s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    sh0Var2.f32448s = null;
                    sh0Var2.getClass();
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
        int i10 = this.f32169a;
        sh0 sh0Var = this.f32170b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = sh0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    sh0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            case 1:
                AnimatorSet animatorSet2 = sh0Var.f32448s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    sh0Var.f32448s = null;
                    if (sh0Var.f32449w) {
                        sh0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            default:
                AnimatorSet animatorSet3 = sh0Var.f32448s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    sh0Var.f32448s = null;
                    AndroidUtilities.runOnUIThread(new mb0(this, 14));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
        }
    }
}
