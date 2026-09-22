package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o2 extends AnimatorListenerAdapter {
    public final int f29117a;
    public final p2 f29118b;

    public o2(p2 p2Var, int i10) {
        this.f29117a = i10;
        this.f29118b = p2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29117a) {
            case 0:
                this.f29118b.f29159b.setVisibility(8);
                return;
            default:
                this.f29118b.f29160c.setVisibility(8);
                return;
        }
    }
}
