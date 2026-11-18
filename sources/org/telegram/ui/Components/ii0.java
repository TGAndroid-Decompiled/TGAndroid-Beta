package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ii0 extends AnimatorListenerAdapter {
    public final int f36135a;
    public final vi0 f36136b;

    public ii0(vi0 vi0Var, int i7) {
        this.f36135a = i7;
        this.f36136b = vi0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36135a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f36136b.M0.e();
                return;
            default:
                super.onAnimationEnd(animator);
                vi0 vi0Var = this.f36136b;
                vi0Var.R = null;
                vi0Var.f40668o0 = 0.0f;
                vi0Var.m0 = null;
                vi0Var.invalidate();
                return;
        }
    }
}
