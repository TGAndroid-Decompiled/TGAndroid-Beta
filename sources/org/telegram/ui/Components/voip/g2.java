package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g2 extends AnimatorListenerAdapter {
    public final int f39235a;
    public final h2 f39236b;

    public g2(h2 h2Var, int i7) {
        this.f39235a = i7;
        this.f39236b = h2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39235a) {
            case 0:
                this.f39236b.f39254b.setVisibility(8);
                return;
            default:
                this.f39236b.f39255c.setVisibility(8);
                return;
        }
    }
}
