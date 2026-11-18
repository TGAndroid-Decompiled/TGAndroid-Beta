package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j81 extends AnimatorListenerAdapter {
    public final int f48912a;
    public final k81 f48913b;

    public j81(k81 k81Var, int i7) {
        this.f48912a = i7;
        this.f48913b = k81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48912a) {
            case 0:
                this.f48913b.f49216b.f50822s.setVisibility(8);
                return;
            default:
                this.f48913b.f49216b.f50815a.setVisibility(8);
                return;
        }
    }
}
