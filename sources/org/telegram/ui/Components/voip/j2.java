package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j2 extends AnimatorListenerAdapter {
    public final int f41056a;
    public final k2 f41057b;

    public j2(k2 k2Var, int i7) {
        this.f41056a = i7;
        this.f41057b = k2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41056a) {
            case 0:
                this.f41057b.f41108b.setVisibility(8);
                return;
            default:
                this.f41057b.f41109c.setVisibility(8);
                return;
        }
    }
}
