package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class ki0 extends AnimatorListenerAdapter {
    public final int f26278a;
    public final li0 f26279b;

    public ki0(li0 li0Var, int i10) {
        this.f26278a = i10;
        this.f26279b = li0Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f26278a) {
            case 1:
                li0 li0Var = this.f26279b;
                AnimatorSet animatorSet = li0Var.f26772s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    li0Var.f26772s = null;
                    li0Var.getClass();
                    return;
                }
                return;
            case 2:
                li0 li0Var2 = this.f26279b;
                AnimatorSet animatorSet2 = li0Var2.f26772s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    li0Var2.f26772s = null;
                    li0Var2.getClass();
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
        int i10 = this.f26278a;
        li0 li0Var = this.f26279b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = li0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    li0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            case 1:
                AnimatorSet animatorSet2 = li0Var.f26772s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    li0Var.f26772s = null;
                    if (li0Var.f26773w) {
                        li0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            default:
                AnimatorSet animatorSet3 = li0Var.f26772s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    li0Var.f26772s = null;
                    AndroidUtilities.runOnUIThread(new cc0(this, 14));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
        }
    }
}
