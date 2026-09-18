package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o2 extends AnimatorListenerAdapter {
    public final int f29416a;
    public final p2 f29417b;

    public o2(p2 p2Var, int i10) {
        this.f29416a = i10;
        this.f29417b = p2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29416a) {
            case 0:
                this.f29417b.f29458b.setVisibility(8);
                return;
            default:
                this.f29417b.f29459c.setVisibility(8);
                return;
        }
    }
}
