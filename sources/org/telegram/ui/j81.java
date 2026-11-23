package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j81 extends AnimatorListenerAdapter {
    public final int f48931a;
    public final k81 f48932b;

    public j81(k81 k81Var, int i7) {
        this.f48931a = i7;
        this.f48932b = k81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48931a) {
            case 0:
                this.f48932b.f49247b.f50816s.setVisibility(8);
                return;
            default:
                this.f48932b.f49247b.f50809a.setVisibility(8);
                return;
        }
    }
}
