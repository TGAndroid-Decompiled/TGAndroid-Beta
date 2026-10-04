package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class qi0 extends AnimatorListenerAdapter {
    public final int f30050a;
    public final ri0 f30051b;

    public qi0(ri0 ri0Var, int i10) {
        this.f30050a = i10;
        this.f30051b = ri0Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f30050a) {
            case 1:
                ri0 ri0Var = this.f30051b;
                AnimatorSet animatorSet = ri0Var.f30422s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ri0Var.f30422s = null;
                    ri0Var.getClass();
                    return;
                }
                return;
            case 2:
                ri0 ri0Var2 = this.f30051b;
                AnimatorSet animatorSet2 = ri0Var2.f30422s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ri0Var2.f30422s = null;
                    ri0Var2.getClass();
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
        int i10 = this.f30050a;
        ri0 ri0Var = this.f30051b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = ri0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ri0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            case 1:
                AnimatorSet animatorSet2 = ri0Var.f30422s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ri0Var.f30422s = null;
                    if (ri0Var.f30423w) {
                        ri0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            default:
                AnimatorSet animatorSet3 = ri0Var.f30422s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    ri0Var.f30422s = null;
                    AndroidUtilities.runOnUIThread(new lc0(this, 15));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
        }
    }
}
