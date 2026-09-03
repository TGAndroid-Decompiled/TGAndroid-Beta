package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hg0 extends AnimatorListenerAdapter {
    public final int f25400a;
    public final mg0 f25401b;

    public hg0(mg0 mg0Var, int i10) {
        this.f25400a = i10;
        this.f25401b = mg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25400a) {
            case 0:
                this.f25401b.C = null;
                return;
            default:
                this.f25401b.u();
                return;
        }
    }
}
