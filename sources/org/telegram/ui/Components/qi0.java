package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class qi0 extends AnimatorListenerAdapter {
    public final int f27724a;
    public final ri0 f27725b;

    public qi0(ri0 ri0Var, int i10) {
        this.f27724a = i10;
        this.f27725b = ri0Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27724a) {
            case 1:
                ri0 ri0Var = this.f27725b;
                AnimatorSet animatorSet = ri0Var.f27975s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ri0Var.f27975s = null;
                    ri0Var.getClass();
                    return;
                }
                return;
            case 2:
                ri0 ri0Var2 = this.f27725b;
                AnimatorSet animatorSet2 = ri0Var2.f27975s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ri0Var2.f27975s = null;
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
        int i10 = this.f27724a;
        ri0 ri0Var = this.f27725b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = ri0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ri0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            case 1:
                AnimatorSet animatorSet2 = ri0Var.f27975s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ri0Var.f27975s = null;
                    if (ri0Var.f27976w) {
                        ri0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            default:
                AnimatorSet animatorSet3 = ri0Var.f27975s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    ri0Var.f27975s = null;
                    AndroidUtilities.runOnUIThread(new kc0(this, 15));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
        }
    }
}
