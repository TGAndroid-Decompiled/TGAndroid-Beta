package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class uf0 extends AnimatorListenerAdapter {
    public final int f29204a;
    public final vf0 f29205b;

    public uf0(vf0 vf0Var, int i10) {
        this.f29204a = i10;
        this.f29205b = vf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29204a) {
            case 0:
                this.f29205b.f29469a.f30241n.setVisibility(8);
                return;
            default:
                this.f29205b.f29469a.h.setVisibility(8);
                return;
        }
    }
}
