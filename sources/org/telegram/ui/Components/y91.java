package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y91 extends AnimatorListenerAdapter {
    public final int f32865a;
    public final z91 f32866b;

    public y91(z91 z91Var, int i10) {
        this.f32865a = i10;
        this.f32866b = z91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32865a) {
            case 0:
                this.f32866b.f33208y = null;
                return;
            default:
                this.f32866b.f33208y = null;
                return;
        }
    }
}
