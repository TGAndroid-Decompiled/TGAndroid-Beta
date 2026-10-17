package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ig0 extends AnimatorListenerAdapter {
    public final int f27229a;
    public final jg0 f27230b;

    public ig0(jg0 jg0Var, int i10) {
        this.f27229a = i10;
        this.f27230b = jg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27229a) {
            case 0:
                this.f27230b.f27523a.f27867n.setVisibility(8);
                return;
            default:
                this.f27230b.f27523a.h.setVisibility(8);
                return;
        }
    }
}
