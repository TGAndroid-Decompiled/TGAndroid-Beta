package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m20 extends AnimatorListenerAdapter {
    public final int f37038a;
    public final o20 f37039b;

    public m20(o20 o20Var, int i7) {
        this.f37038a = i7;
        this.f37039b = o20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37038a) {
            case 0:
                o20 o20Var = this.f37039b;
                if (o20Var.f37811c0 == animator) {
                    o20Var.f37811c0 = null;
                    o20Var.b();
                    return;
                }
                return;
            default:
                o20 o20Var2 = this.f37039b;
                if (o20Var2.f37809b0 == animator) {
                    o20Var2.f37809b0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37038a) {
            case 1:
                n20 n20Var = this.f37039b.f37807a0;
                if (n20Var != null) {
                    ((org.telegram.ui.ro0) n20Var).f50984a.f42763f0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
