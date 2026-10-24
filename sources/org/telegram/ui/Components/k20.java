package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class k20 extends AnimatorListenerAdapter {
    public final int f27836a;
    public final l20 f27837b;

    public k20(l20 l20Var, int i10) {
        this.f27836a = i10;
        this.f27837b = l20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27836a) {
            case 0:
                l20 l20Var = this.f27837b;
                NotificationCenter.getInstance(l20Var.f28144r.f28490a).onAnimationFinish(l20Var.f28142f);
                l20Var.requestLayout();
                return;
            default:
                l20 l20Var2 = this.f27837b;
                l20Var2.d = null;
                l20Var2.f28139a = null;
                l20Var2.f28140b = false;
                return;
        }
    }
}
