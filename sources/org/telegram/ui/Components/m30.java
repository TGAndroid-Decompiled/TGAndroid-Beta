package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m30 extends AnimatorListenerAdapter {
    public final int f28520a;
    public final r30 f28521b;

    public m30(r30 r30Var, int i10) {
        this.f28520a = i10;
        this.f28521b = r30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28520a) {
            case 0:
                r30 r30Var = this.f28521b;
                r30Var.f30321b.setVisibility(8);
                r30Var.f30332y = false;
                r30Var.E = 0.0f;
                return;
            default:
                this.f28521b.f30325e.setVisibility(8);
                return;
        }
    }
}
