package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o30 extends AnimatorListenerAdapter {
    public final int f29039a;
    public final t30 f29040b;

    public o30(t30 t30Var, int i10) {
        this.f29039a = i10;
        this.f29040b = t30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29039a) {
            case 0:
                t30 t30Var = this.f29040b;
                t30Var.f30743b.setVisibility(8);
                t30Var.f30754y = false;
                t30Var.E = 0.0f;
                return;
            default:
                this.f29040b.f30747e.setVisibility(8);
                return;
        }
    }
}
