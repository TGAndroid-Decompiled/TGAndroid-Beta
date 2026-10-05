package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x30 extends AnimatorListenerAdapter {
    public final int f32812a;
    public final z30 f32813b;

    public x30(z30 z30Var, int i10) {
        this.f32812a = i10;
        this.f32813b = z30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32812a) {
            case 0:
                z30 z30Var = this.f32813b;
                if (z30Var.f33413b0 == animator) {
                    z30Var.f33413b0 = null;
                    z30Var.b();
                    return;
                }
                return;
            default:
                z30 z30Var2 = this.f32813b;
                if (z30Var2.f33411a0 == animator) {
                    z30Var2.f33411a0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f32812a) {
            case 1:
                y30 y30Var = this.f32813b.W;
                if (y30Var != null) {
                    ((org.telegram.ui.qs0) y30Var).f39880a.f33914e0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
