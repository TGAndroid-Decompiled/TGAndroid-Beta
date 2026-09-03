package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class li0 extends AnimatorListenerAdapter {
    public final int f26762a;
    public final mi0 f26763b;

    public li0(mi0 mi0Var, int i10) {
        this.f26762a = i10;
        this.f26763b = mi0Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f26762a) {
            case 1:
                mi0 mi0Var = this.f26763b;
                AnimatorSet animatorSet = mi0Var.f27069s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    mi0Var.f27069s = null;
                    mi0Var.getClass();
                    return;
                }
                return;
            case 2:
                mi0 mi0Var2 = this.f26763b;
                AnimatorSet animatorSet2 = mi0Var2.f27069s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    mi0Var2.f27069s = null;
                    mi0Var2.getClass();
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
        int i10 = this.f26762a;
        mi0 mi0Var = this.f26763b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = mi0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    mi0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            case 1:
                AnimatorSet animatorSet2 = mi0Var.f27069s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    mi0Var.f27069s = null;
                    if (mi0Var.f27070w) {
                        mi0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            default:
                AnimatorSet animatorSet3 = mi0Var.f27069s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    mi0Var.f27069s = null;
                    AndroidUtilities.runOnUIThread(new dc0(this, 14));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
        }
    }
}
