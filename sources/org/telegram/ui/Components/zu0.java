package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zu0 extends AnimatorListenerAdapter {
    public final int f41119a;
    public final av0 f41120b;

    public zu0(av0 av0Var, int i7) {
        this.f41119a = i7;
        this.f41120b = av0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41119a) {
            case 0:
                this.f41120b.f31933s.setVisibility(8);
                return;
            case 1:
                this.f41120b.f31933s.setVisibility(8);
                return;
            default:
                this.f41120b.f31933s.setVisibility(8);
                return;
        }
    }
}
