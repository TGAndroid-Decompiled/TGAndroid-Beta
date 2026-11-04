package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y61 extends AnimatorListenerAdapter {
    public final int f40637a;
    public final z61 f40638b;

    public y61(z61 z61Var, int i3) {
        this.f40637a = i3;
        this.f40638b = z61Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40637a) {
            case 0:
                this.f40638b.E = null;
                return;
            default:
                this.f40638b.E = null;
                return;
        }
    }
}
