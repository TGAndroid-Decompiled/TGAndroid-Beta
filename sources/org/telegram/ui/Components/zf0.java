package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zf0 extends AnimatorListenerAdapter {
    public final int f30883a;
    public final ag0 f30884b;

    public zf0(ag0 ag0Var, int i10) {
        this.f30883a = i10;
        this.f30884b = ag0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30883a) {
            case 0:
                this.f30884b.f22654a.f22987n.setVisibility(8);
                return;
            default:
                this.f30884b.f22654a.h.setVisibility(8);
                return;
        }
    }
}
