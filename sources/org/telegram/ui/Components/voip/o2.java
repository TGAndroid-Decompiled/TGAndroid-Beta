package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o2 extends AnimatorListenerAdapter {
    public final int f29485a;
    public final p2 f29486b;

    public o2(p2 p2Var, int i10) {
        this.f29485a = i10;
        this.f29486b = p2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29485a) {
            case 0:
                this.f29486b.f29527b.setVisibility(8);
                return;
            default:
                this.f29486b.f29528c.setVisibility(8);
                return;
        }
    }
}
