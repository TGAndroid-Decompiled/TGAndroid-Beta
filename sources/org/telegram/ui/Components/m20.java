package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class m20 extends AnimatorListenerAdapter {
    public final int f28364a;
    public final n20 f28365b;

    public m20(n20 n20Var, int i10) {
        this.f28364a = i10;
        this.f28365b = n20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28364a) {
            case 0:
                n20 n20Var = this.f28365b;
                NotificationCenter.getInstance(n20Var.f28658r.f28881a).onAnimationFinish(n20Var.f28656f);
                n20Var.requestLayout();
                return;
            default:
                n20 n20Var2 = this.f28365b;
                n20Var2.d = null;
                n20Var2.f28653a = null;
                n20Var2.f28654b = false;
                return;
        }
    }
}
