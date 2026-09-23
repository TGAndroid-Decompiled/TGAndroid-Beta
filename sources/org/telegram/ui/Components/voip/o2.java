package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o2 extends AnimatorListenerAdapter {
    public final int f29091a;
    public final p2 f29092b;

    public o2(p2 p2Var, int i10) {
        this.f29091a = i10;
        this.f29092b = p2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29091a) {
            case 0:
                this.f29092b.f29133b.setVisibility(8);
                return;
            default:
                this.f29092b.f29134c.setVisibility(8);
                return;
        }
    }
}
