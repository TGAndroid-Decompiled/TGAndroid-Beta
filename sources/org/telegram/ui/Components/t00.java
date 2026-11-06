package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t00 extends AnimatorListenerAdapter {
    public final int f38210a;
    public final u00 f38211b;

    public t00(u00 u00Var, int i7) {
        this.f38210a = i7;
        this.f38211b = u00Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38210a) {
            case 0:
                u00 u00Var = this.f38211b;
                org.telegram.messenger.qs.f(u00Var.f38468r.f38782a).j(u00Var.f38466f);
                u00Var.requestLayout();
                return;
            default:
                u00 u00Var2 = this.f38211b;
                u00Var2.d = null;
                u00Var2.f38462a = null;
                u00Var2.f38463b = false;
                return;
        }
    }
}
