package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class zi0 extends AnimatorListenerAdapter {
    public final int f32941a;
    public final aj0 f32942b;

    public zi0(aj0 aj0Var, int i10) {
        this.f32941a = i10;
        this.f32942b = aj0Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f32941a) {
            case 1:
                aj0 aj0Var = this.f32942b;
                AnimatorSet animatorSet = aj0Var.f24615s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    aj0Var.f24615s = null;
                    aj0Var.getClass();
                    return;
                }
                return;
            case 2:
                aj0 aj0Var2 = this.f32942b;
                AnimatorSet animatorSet2 = aj0Var2.f24615s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    aj0Var2.f24615s = null;
                    aj0Var2.getClass();
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
        int i10 = this.f32941a;
        aj0 aj0Var = this.f32942b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = aj0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    aj0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            case 1:
                AnimatorSet animatorSet2 = aj0Var.f24615s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    aj0Var.f24615s = null;
                    if (aj0Var.f24616w) {
                        aj0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            default:
                AnimatorSet animatorSet3 = aj0Var.f24615s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    aj0Var.f24615s = null;
                    AndroidUtilities.runOnUIThread(new rc0(this, 14));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
        }
    }
}
