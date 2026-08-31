package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vf0 extends AnimatorListenerAdapter {
    public final int f31901a;
    public final wf0 f31902b;

    public vf0(wf0 wf0Var, int i10) {
        this.f31901a = i10;
        this.f31902b = wf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31901a) {
            case 0:
                this.f31902b.f32741a.f33064n.setVisibility(8);
                return;
            default:
                this.f31902b.f32741a.h.setVisibility(8);
                return;
        }
    }
}
