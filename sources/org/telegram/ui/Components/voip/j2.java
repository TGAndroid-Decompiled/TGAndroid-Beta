package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j2 extends AnimatorListenerAdapter {
    public final int f41095a;
    public final k2 f41096b;

    public j2(k2 k2Var, int i7) {
        this.f41095a = i7;
        this.f41096b = k2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41095a) {
            case 0:
                this.f41096b.f41147b.setVisibility(8);
                return;
            default:
                this.f41096b.f41148c.setVisibility(8);
                return;
        }
    }
}
