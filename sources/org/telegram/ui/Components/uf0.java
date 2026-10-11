package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class uf0 extends AnimatorListenerAdapter {
    public final int f31573a;
    public final wf0 f31574b;

    public uf0(wf0 wf0Var, int i10) {
        this.f31573a = i10;
        this.f31574b = wf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31573a) {
            case 0:
                this.f31574b.f32688s = null;
                return;
            default:
                this.f31574b.v = null;
                return;
        }
    }
}
