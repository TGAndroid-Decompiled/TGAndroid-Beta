package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j81 extends AnimatorListenerAdapter {
    public final int f46875a;
    public final k81 f46876b;

    public j81(k81 k81Var, int i7) {
        this.f46875a = i7;
        this.f46876b = k81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46875a) {
            case 0:
                this.f46876b.f47221b.f48721s.setVisibility(8);
                return;
            default:
                this.f46876b.f47221b.f48714a.setVisibility(8);
                return;
        }
    }
}
