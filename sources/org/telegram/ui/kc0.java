package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class kc0 extends AnimatorListenerAdapter {
    public final int f38802a;
    public final gf0 f38803b;

    public kc0(gf0 gf0Var, int i10) {
        this.f38802a = i10;
        this.f38803b = gf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38802a) {
            case 0:
                gf0 gf0Var = this.f38803b;
                if (gf0Var.d == animator) {
                    gf0Var.d = null;
                    return;
                }
                return;
            default:
                gf0 gf0Var2 = this.f38803b;
                gf0Var2.f37475c.setVisibility(8);
                if (gf0Var2.d == animator) {
                    gf0Var2.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f38802a) {
            case 0:
                this.f38803b.f37475c.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
