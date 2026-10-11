package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ay0 extends AnimatorListenerAdapter {
    public final int f24702a;
    public final by0 f24703b;

    public ay0(by0 by0Var, int i10) {
        this.f24702a = i10;
        this.f24703b = by0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24702a) {
            case 0:
                this.f24703b.f25127s.setVisibility(8);
                return;
            case 1:
                this.f24703b.f25127s.setVisibility(8);
                return;
            default:
                this.f24703b.f25127s.setVisibility(8);
                return;
        }
    }
}
