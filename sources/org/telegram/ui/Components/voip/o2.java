package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o2 extends AnimatorListenerAdapter {
    public final int f29523a;
    public final p2 f29524b;

    public o2(p2 p2Var, int i10) {
        this.f29523a = i10;
        this.f29524b = p2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29523a) {
            case 0:
                this.f29524b.f29565b.setVisibility(8);
                return;
            default:
                this.f29524b.f29566c.setVisibility(8);
                return;
        }
    }
}
