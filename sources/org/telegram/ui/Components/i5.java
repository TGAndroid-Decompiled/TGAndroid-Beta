package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i5 extends AnimatorListenerAdapter {
    public final int f26883a;
    public final o5 f26884b;

    public i5(o5 o5Var, int i10) {
        this.f26883a = i10;
        this.f26884b = o5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26883a) {
            case 0:
                o5.access$002(this.f26884b, null);
                o5.access$102(false);
                return;
            case 1:
                o5 o5Var = this.f26884b;
                o5.access$002(o5Var, null);
                if (o5.access$200(o5Var) != null) {
                    o5.access$200(o5Var).run();
                    o5.access$202(o5Var, null);
                    return;
                }
                return;
            default:
                o5.access$302(this.f26884b, null);
                return;
        }
    }
}
