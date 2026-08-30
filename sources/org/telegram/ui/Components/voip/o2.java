package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o2 extends AnimatorListenerAdapter {
    public final int f29827a;
    public final p2 f29828b;

    public o2(p2 p2Var, int i10) {
        this.f29827a = i10;
        this.f29828b = p2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29827a) {
            case 0:
                this.f29828b.f29857b.setVisibility(8);
                return;
            default:
                this.f29828b.f29858c.setVisibility(8);
                return;
        }
    }
}
