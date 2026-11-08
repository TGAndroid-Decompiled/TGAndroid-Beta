package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u00 extends AnimatorListenerAdapter {
    public final int f38472a;
    public final v00 f38473b;

    public u00(v00 v00Var, int i7) {
        this.f38472a = i7;
        this.f38473b = v00Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38472a) {
            case 0:
                v00 v00Var = this.f38473b;
                org.telegram.messenger.qs.f(v00Var.f38806r.f39762a).j(v00Var.f38804f);
                v00Var.requestLayout();
                return;
            default:
                v00 v00Var2 = this.f38473b;
                v00Var2.d = null;
                v00Var2.f38800a = null;
                v00Var2.f38801b = false;
                return;
        }
    }
}
