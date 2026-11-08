package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h81 extends AnimatorListenerAdapter {
    public final int f46292a;
    public final i81 f46293b;

    public h81(i81 i81Var, int i7) {
        this.f46292a = i7;
        this.f46293b = i81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46292a) {
            case 0:
                this.f46293b.f46597b.f48003s.setVisibility(8);
                return;
            default:
                this.f46293b.f46597b.f47996a.setVisibility(8);
                return;
        }
    }
}
