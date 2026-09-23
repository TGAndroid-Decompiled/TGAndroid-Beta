package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class ei0 extends AnimatorListenerAdapter {
    public final int f23700a;
    public final fi0 f23701b;

    public ei0(fi0 fi0Var, int i10) {
        this.f23700a = i10;
        this.f23701b = fi0Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f23700a) {
            case 1:
                fi0 fi0Var = this.f23701b;
                AnimatorSet animatorSet = fi0Var.f23990s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    fi0Var.f23990s = null;
                    fi0Var.getClass();
                    return;
                }
                return;
            case 2:
                fi0 fi0Var2 = this.f23701b;
                AnimatorSet animatorSet2 = fi0Var2.f23990s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    fi0Var2.f23990s = null;
                    fi0Var2.getClass();
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
        int i10 = this.f23700a;
        fi0 fi0Var = this.f23701b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = fi0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    fi0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            case 1:
                AnimatorSet animatorSet2 = fi0Var.f23990s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    fi0Var.f23990s = null;
                    if (fi0Var.f23991w) {
                        fi0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            default:
                AnimatorSet animatorSet3 = fi0Var.f23990s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    fi0Var.f23990s = null;
                    AndroidUtilities.runOnUIThread(new ac0(this, 14));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
        }
    }
}
