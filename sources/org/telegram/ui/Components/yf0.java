package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yf0 extends AnimatorListenerAdapter {
    public final int f30588a;
    public final zf0 f30589b;

    public yf0(zf0 zf0Var, int i10) {
        this.f30588a = i10;
        this.f30589b = zf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30588a) {
            case 0:
                this.f30589b.f30861a.f22661n.setVisibility(8);
                return;
            default:
                this.f30589b.f30861a.h.setVisibility(8);
                return;
        }
    }
}
