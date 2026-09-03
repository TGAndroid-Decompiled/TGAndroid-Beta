package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vf0 extends AnimatorListenerAdapter {
    public final int f31879a;
    public final wf0 f31880b;

    public vf0(wf0 wf0Var, int i10) {
        this.f31879a = i10;
        this.f31880b = wf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31879a) {
            case 0:
                this.f31880b.f32746a.f33058n.setVisibility(8);
                return;
            default:
                this.f31880b.f32746a.h.setVisibility(8);
                return;
        }
    }
}
