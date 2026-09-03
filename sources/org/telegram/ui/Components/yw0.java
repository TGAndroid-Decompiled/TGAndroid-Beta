package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yw0 extends AnimatorListenerAdapter {
    public final int f33680a;
    public final zw0 f33681b;

    public yw0(zw0 zw0Var, int i10) {
        this.f33680a = i10;
        this.f33681b = zw0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33680a) {
            case 0:
                this.f33681b.f34037s.setVisibility(8);
                return;
            case 1:
                this.f33681b.f34037s.setVisibility(8);
                return;
            default:
                this.f33681b.f34037s.setVisibility(8);
                return;
        }
    }
}
