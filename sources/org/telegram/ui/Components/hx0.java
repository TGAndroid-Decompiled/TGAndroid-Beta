package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hx0 extends AnimatorListenerAdapter {
    public final int f24883a;
    public final ix0 f24884b;

    public hx0(ix0 ix0Var, int i10) {
        this.f24883a = i10;
        this.f24884b = ix0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24883a) {
            case 0:
                this.f24884b.f25195s.setVisibility(8);
                return;
            case 1:
                this.f24884b.f25195s.setVisibility(8);
                return;
            default:
                this.f24884b.f25195s.setVisibility(8);
                return;
        }
    }
}
