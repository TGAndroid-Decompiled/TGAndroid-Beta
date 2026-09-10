package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d40 extends AnimatorListenerAdapter {
    public final int f22285a;
    public final f40 f22286b;

    public d40(f40 f40Var, int i10) {
        this.f22285a = i10;
        this.f22286b = f40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22285a) {
            case 0:
                f40 f40Var = this.f22286b;
                if (f40Var.f22848b0 == animator) {
                    f40Var.f22848b0 = null;
                    f40Var.b();
                    return;
                }
                return;
            default:
                f40 f40Var2 = this.f22286b;
                if (f40Var2.f22846a0 == animator) {
                    f40Var2.f22846a0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f22285a) {
            case 1:
                e40 e40Var = this.f22286b.W;
                if (e40Var != null) {
                    ((org.telegram.ui.us0) e40Var).f37337a.f30049e0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
