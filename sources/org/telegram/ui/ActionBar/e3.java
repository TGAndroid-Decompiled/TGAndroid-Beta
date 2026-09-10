package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.NotificationCenter;
public final class e3 extends AnimatorListenerAdapter {
    public final int f17668a;
    public final f3 f17669b;

    public e3(f3 f3Var, int i10) {
        this.f17668a = i10;
        this.f17669b = f3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f17668a;
        f3 f3Var = this.f17669b;
        switch (i10) {
            case 0:
                f3Var.f17713y = 0.0f;
                f3Var.G.containerView.setTranslationX(0.0f);
                f3Var.G.container.invalidate();
                return;
            case 1:
                f3Var.G.skipDismissAnimation = true;
                f3Var.G.containerView.setTranslationX(f3Var.getMeasuredWidth());
                f3Var.G.dismiss();
                f3Var.G.container.invalidate();
                return;
            case 2:
                f3Var.G.containerView.setTranslationY(0.0f);
                f3Var.G.onContainerViewTranslation();
                h3 h3Var = f3Var.G;
                h3Var.onSmoothContainerViewLayout(h3Var.containerView.getTranslationY());
                f3Var.invalidate();
                return;
            default:
                AnimatorSet animatorSet = f3Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    f3Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
        }
    }
}
