package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m0 extends AnimatorListenerAdapter {
    public final int f23651a;
    public final w0 f23652b;

    public m0(w0 w0Var, int i9) {
        this.f23651a = i9;
        this.f23652b = w0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23651a) {
            case 0:
                w0 w0Var = this.f23652b;
                w0Var.f23922s.setVisibility(4);
                w0Var.v = null;
                return;
            default:
                this.f23652b.v = null;
                return;
        }
    }
}
