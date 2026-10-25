package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z7 extends AnimatorListenerAdapter {
    public final int f35232a;
    public final m8 f35233b;

    public z7(m8 m8Var, int i10) {
        this.f35232a = i10;
        this.f35233b = m8Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f35232a) {
            case 2:
                this.f35233b.B0 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35232a) {
            case 0:
                this.f35233b.f30434l0 = false;
                return;
            case 1:
                m8 m8Var = this.f35233b;
                m8Var.f30430h0.setVisibility(4);
                m8Var.f30431i0.setImageBitmap(null);
                m8Var.f30434l0 = false;
                return;
            default:
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
