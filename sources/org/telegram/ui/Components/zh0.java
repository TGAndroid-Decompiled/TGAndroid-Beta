package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class zh0 extends AnimatorListenerAdapter {
    public final int f35350a;
    public final ai0 f35351b;

    public zh0(ai0 ai0Var, int i10) {
        this.f35350a = i10;
        this.f35351b = ai0Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f35350a) {
            case 1:
                ai0 ai0Var = this.f35351b;
                AnimatorSet animatorSet = ai0Var.f26781s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ai0Var.f26781s = null;
                    ai0Var.getClass();
                    return;
                }
                return;
            case 2:
                ai0 ai0Var2 = this.f35351b;
                AnimatorSet animatorSet2 = ai0Var2.f26781s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ai0Var2.f26781s = null;
                    ai0Var2.getClass();
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
        int i10 = this.f35350a;
        ai0 ai0Var = this.f35351b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = ai0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ai0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            case 1:
                AnimatorSet animatorSet2 = ai0Var.f26781s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ai0Var.f26781s = null;
                    if (ai0Var.f26782w) {
                        ai0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            default:
                AnimatorSet animatorSet3 = ai0Var.f26781s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    ai0Var.f26781s = null;
                    AndroidUtilities.runOnUIThread(new xb0(this, 14));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
        }
    }
}
