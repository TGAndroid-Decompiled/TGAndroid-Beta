package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class mi0 extends AnimatorListenerAdapter {
    public final int f29118a;
    public final ni0 f29119b;

    public mi0(ni0 ni0Var, int i10) {
        this.f29118a = i10;
        this.f29119b = ni0Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f29118a) {
            case 1:
                ni0 ni0Var = this.f29119b;
                AnimatorSet animatorSet = ni0Var.f29518s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ni0Var.f29518s = null;
                    ni0Var.getClass();
                    return;
                }
                return;
            case 2:
                ni0 ni0Var2 = this.f29119b;
                AnimatorSet animatorSet2 = ni0Var2.f29518s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ni0Var2.f29518s = null;
                    ni0Var2.getClass();
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
        int i10 = this.f29118a;
        ni0 ni0Var = this.f29119b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = ni0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ni0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            case 1:
                AnimatorSet animatorSet2 = ni0Var.f29518s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ni0Var.f29518s = null;
                    if (ni0Var.f29519w) {
                        ni0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            default:
                AnimatorSet animatorSet3 = ni0Var.f29518s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    ni0Var.f29518s = null;
                    AndroidUtilities.runOnUIThread(new ec0(this, 14));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
        }
    }
}
