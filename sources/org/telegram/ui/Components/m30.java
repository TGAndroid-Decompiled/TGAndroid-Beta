package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m30 extends AnimatorListenerAdapter {
    public final int f28700a;
    public final r30 f28701b;

    public m30(r30 r30Var, int i10) {
        this.f28700a = i10;
        this.f28701b = r30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28700a) {
            case 0:
                r30 r30Var = this.f28701b;
                r30Var.f30390b.setVisibility(8);
                r30Var.f30401y = false;
                r30Var.E = 0.0f;
                return;
            default:
                this.f28701b.f30394e.setVisibility(8);
                return;
        }
    }
}
