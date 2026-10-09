package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zx0 extends AnimatorListenerAdapter {
    public final int f33672a;
    public final ay0 f33673b;

    public zx0(ay0 ay0Var, int i10) {
        this.f33672a = i10;
        this.f33673b = ay0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33672a) {
            case 0:
                this.f33673b.f24806s.setVisibility(8);
                return;
            case 1:
                this.f33673b.f24806s.setVisibility(8);
                return;
            default:
                this.f33673b.f24806s.setVisibility(8);
                return;
        }
    }
}
