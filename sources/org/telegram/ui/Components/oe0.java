package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class oe0 extends AnimatorListenerAdapter {
    public final int f27551a;
    public final se0 f27552b;

    public oe0(se0 se0Var, int i10) {
        this.f27551a = i10;
        this.f27552b = se0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27551a) {
            case 0:
                this.f27552b.f28699x = null;
                return;
            default:
                this.f27552b.f28700y = null;
                return;
        }
    }
}
