package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i5 extends AnimatorListenerAdapter {
    public final int f27003a;
    public final o5 f27004b;

    public i5(o5 o5Var, int i10) {
        this.f27003a = i10;
        this.f27004b = o5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27003a) {
            case 0:
                o5.access$002(this.f27004b, null);
                o5.access$102(false);
                return;
            case 1:
                o5 o5Var = this.f27004b;
                o5.access$002(o5Var, null);
                if (o5.access$200(o5Var) != null) {
                    o5.access$200(o5Var).run();
                    o5.access$202(o5Var, null);
                    return;
                }
                return;
            default:
                o5.access$302(this.f27004b, null);
                return;
        }
    }
}
