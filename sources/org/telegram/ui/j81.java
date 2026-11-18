package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j81 extends AnimatorListenerAdapter {
    public final int f48911a;
    public final k81 f48912b;

    public j81(k81 k81Var, int i7) {
        this.f48911a = i7;
        this.f48912b = k81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48911a) {
            case 0:
                this.f48912b.f49203b.f50771s.setVisibility(8);
                return;
            default:
                this.f48912b.f49203b.f50764a.setVisibility(8);
                return;
        }
    }
}
