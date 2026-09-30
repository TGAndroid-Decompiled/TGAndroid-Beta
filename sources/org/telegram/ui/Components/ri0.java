package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class ri0 extends AnimatorListenerAdapter {
    public final int f28029a;
    public final si0 f28030b;

    public ri0(si0 si0Var, int i10) {
        this.f28029a = i10;
        this.f28030b = si0Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f28029a) {
            case 1:
                si0 si0Var = this.f28030b;
                AnimatorSet animatorSet = si0Var.f28270s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    si0Var.f28270s = null;
                    si0Var.getClass();
                    return;
                }
                return;
            case 2:
                si0 si0Var2 = this.f28030b;
                AnimatorSet animatorSet2 = si0Var2.f28270s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    si0Var2.f28270s = null;
                    si0Var2.getClass();
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
        int i10 = this.f28029a;
        si0 si0Var = this.f28030b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = si0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    si0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            case 1:
                AnimatorSet animatorSet2 = si0Var.f28270s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    si0Var.f28270s = null;
                    if (si0Var.f28271w) {
                        si0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            default:
                AnimatorSet animatorSet3 = si0Var.f28270s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    si0Var.f28270s = null;
                    AndroidUtilities.runOnUIThread(new lc0(this, 15));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
        }
    }
}
