package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p00 extends AnimatorListenerAdapter {
    public final int f37003a;
    public final q00 f37004b;

    public p00(q00 q00Var, int i3) {
        this.f37003a = i3;
        this.f37004b = q00Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37003a) {
            case 0:
                q00 q00Var = this.f37004b;
                org.telegram.messenger.hs.f(q00Var.f37306r.f37585a).j(q00Var.f37304f);
                q00Var.requestLayout();
                return;
            default:
                q00 q00Var2 = this.f37004b;
                q00Var2.d = null;
                q00Var2.f37300a = null;
                q00Var2.f37301b = false;
                return;
        }
    }
}
