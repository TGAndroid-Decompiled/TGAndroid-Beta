package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zf0 extends AnimatorListenerAdapter {
    public final int f30913a;
    public final ag0 f30914b;

    public zf0(ag0 ag0Var, int i10) {
        this.f30913a = i10;
        this.f30914b = ag0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30913a) {
            case 0:
                this.f30914b.f22675a.f23014n.setVisibility(8);
                return;
            default:
                this.f30914b.f22675a.h.setVisibility(8);
                return;
        }
    }
}
