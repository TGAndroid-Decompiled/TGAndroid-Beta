package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class k8 extends AnimatorListenerAdapter {

    public final int f30035a;

    public final v8 f30036b;

    public k8(v8 v8Var, int i10) {
        this.f30035a = i10;
        this.f30036b = v8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30035a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f30036b.f33299f = false;
                break;
            default:
                v8 v8Var = this.f30036b;
                v8Var.i0(v8Var.B ? 1.0f : 0.0f, false);
                v8Var.B = false;
                break;
        }
    }
}
