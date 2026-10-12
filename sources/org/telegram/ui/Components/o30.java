package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o30 extends AnimatorListenerAdapter {
    public final int f29043a;
    public final t30 f29044b;

    public o30(t30 t30Var, int i10) {
        this.f29043a = i10;
        this.f29044b = t30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29043a) {
            case 0:
                t30 t30Var = this.f29044b;
                t30Var.f30746b.setVisibility(8);
                t30Var.f30757y = false;
                t30Var.E = 0.0f;
                return;
            default:
                this.f29044b.f30750e.setVisibility(8);
                return;
        }
    }
}
