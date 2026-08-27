package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class m0 extends AnimatorListenerAdapter {

    public final int f23655a;

    public final v0 f23656b;

    public m0(v0 v0Var, int i10) {
        this.f23655a = i10;
        this.f23656b = v0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23655a) {
            case 0:
                v0 v0Var = this.f23656b;
                v0Var.f23875s.setVisibility(4);
                v0Var.v = null;
                break;
            default:
                this.f23656b.v = null;
                break;
        }
    }
}
