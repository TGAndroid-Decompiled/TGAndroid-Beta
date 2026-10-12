package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qf0 extends AnimatorListenerAdapter {
    public final int f29807a;
    public final uf0 f29808b;

    public qf0(uf0 uf0Var, int i10) {
        this.f29807a = i10;
        this.f29808b = uf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29807a) {
            case 0:
                this.f29808b.f31155x = null;
                return;
            default:
                this.f29808b.f31156y = null;
                return;
        }
    }
}
