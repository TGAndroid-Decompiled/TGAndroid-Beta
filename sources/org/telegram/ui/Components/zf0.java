package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zf0 extends AnimatorListenerAdapter {
    public final int f30870a;
    public final ag0 f30871b;

    public zf0(ag0 ag0Var, int i10) {
        this.f30870a = i10;
        this.f30871b = ag0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30870a) {
            case 0:
                this.f30871b.f22640a.f23008n.setVisibility(8);
                return;
            default:
                this.f30871b.f22640a.h.setVisibility(8);
                return;
        }
    }
}
