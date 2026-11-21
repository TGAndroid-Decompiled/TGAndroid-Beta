package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j81 extends AnimatorListenerAdapter {
    public final int f48927a;
    public final k81 f48928b;

    public j81(k81 k81Var, int i7) {
        this.f48927a = i7;
        this.f48928b = k81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48927a) {
            case 0:
                this.f48928b.f49243b.f50812s.setVisibility(8);
                return;
            default:
                this.f48928b.f49243b.f50805a.setVisibility(8);
                return;
        }
    }
}
