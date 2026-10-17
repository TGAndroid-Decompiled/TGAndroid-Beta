package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class m20 extends AnimatorListenerAdapter {
    public final int f28373a;
    public final n20 f28374b;

    public m20(n20 n20Var, int i10) {
        this.f28373a = i10;
        this.f28374b = n20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28373a) {
            case 0:
                n20 n20Var = this.f28374b;
                NotificationCenter.getInstance(n20Var.f28638r.f28864a).onAnimationFinish(n20Var.f28636f);
                n20Var.requestLayout();
                return;
            default:
                n20 n20Var2 = this.f28374b;
                n20Var2.d = null;
                n20Var2.f28633a = null;
                n20Var2.f28634b = false;
                return;
        }
    }
}
