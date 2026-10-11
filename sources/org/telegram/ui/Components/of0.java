package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class of0 extends AnimatorListenerAdapter {
    public final int f29396a;
    public final sf0 f29397b;

    public of0(sf0 sf0Var, int i10) {
        this.f29396a = i10;
        this.f29397b = sf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29396a) {
            case 0:
                this.f29397b.f30742x = null;
                return;
            default:
                this.f29397b.f30743y = null;
                return;
        }
    }
}
