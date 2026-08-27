package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.NotificationCenter;

public final class b3 extends AnimatorListenerAdapter {

    public final int f22778a;

    public final c3 f22779b;

    public b3(c3 c3Var, int i10) {
        this.f22778a = i10;
        this.f22779b = c3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f22778a;
        c3 c3Var = this.f22779b;
        switch (i10) {
            case 0:
                c3Var.f22817y = 0.0f;
                c3Var.C.containerView.setTranslationX(0.0f);
                c3Var.C.container.invalidate();
                break;
            case 1:
                c3Var.C.skipDismissAnimation = true;
                c3Var.C.containerView.setTranslationX(c3Var.getMeasuredWidth());
                c3Var.C.dismiss();
                c3Var.C.container.invalidate();
                break;
            case 2:
                c3Var.C.containerView.setTranslationY(0.0f);
                c3Var.C.onContainerViewTranslation();
                e3 e3Var = c3Var.C;
                e3Var.onSmoothContainerViewLayout(e3Var.containerView.getTranslationY());
                c3Var.invalidate();
                break;
            default:
                AnimatorSet animatorSet = c3Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    c3Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
        }
    }
}
