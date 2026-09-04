package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w81 extends AnimatorListenerAdapter {
    public final int f32210a;
    public final x81 f32211b;

    public w81(x81 x81Var, int i10) {
        this.f32210a = i10;
        this.f32211b = x81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32210a) {
            case 0:
                this.f32211b.f32475y = null;
                return;
            default:
                this.f32211b.f32475y = null;
                return;
        }
    }
}
