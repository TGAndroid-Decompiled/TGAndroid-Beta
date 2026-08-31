package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class av0 extends AnimatorListenerAdapter {
    public final int f35245a;
    public final hv0 f35246b;

    public av0(hv0 hv0Var, int i10) {
        this.f35245a = i10;
        this.f35246b = hv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35245a) {
            case 0:
                this.f35246b.O.setTranslationY(0.0f);
                return;
            case 1:
                this.f35246b.O.setTranslationY(0.0f);
                return;
            default:
                hv0 hv0Var = this.f35246b;
                hv0Var.getClass();
                hv0Var.O.setTranslationY(0.0f);
                hv0Var.l0();
                return;
        }
    }
}
