package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t5 extends AnimatorListenerAdapter {
    public final int f30556a;
    public final z5 f30557b;

    public t5(z5 z5Var, int i10) {
        this.f30556a = i10;
        this.f30557b = z5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30556a) {
            case 0:
                z5.access$002(this.f30557b, null);
                z5.access$102(false);
                return;
            case 1:
                z5 z5Var = this.f30557b;
                z5.access$002(z5Var, null);
                if (z5.access$200(z5Var) != null) {
                    z5.access$200(z5Var).run();
                    z5.access$202(z5Var, null);
                    return;
                }
                return;
            default:
                z5.access$302(this.f30557b, null);
                return;
        }
    }
}
