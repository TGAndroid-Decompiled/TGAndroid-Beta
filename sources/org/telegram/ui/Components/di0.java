package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class di0 extends AnimatorListenerAdapter {
    public final int f23339a;
    public final ei0 f23340b;

    public di0(ei0 ei0Var, int i10) {
        this.f23339a = i10;
        this.f23340b = ei0Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f23339a) {
            case 1:
                ei0 ei0Var = this.f23340b;
                AnimatorSet animatorSet = ei0Var.f23675s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ei0Var.f23675s = null;
                    ei0Var.getClass();
                    return;
                }
                return;
            case 2:
                ei0 ei0Var2 = this.f23340b;
                AnimatorSet animatorSet2 = ei0Var2.f23675s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ei0Var2.f23675s = null;
                    ei0Var2.getClass();
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
        int i10 = this.f23339a;
        ei0 ei0Var = this.f23340b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = ei0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ei0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            case 1:
                AnimatorSet animatorSet2 = ei0Var.f23675s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ei0Var.f23675s = null;
                    if (ei0Var.f23676w) {
                        ei0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            default:
                AnimatorSet animatorSet3 = ei0Var.f23675s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    ei0Var.f23675s = null;
                    AndroidUtilities.runOnUIThread(new bc0(this, 14));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
        }
    }
}
