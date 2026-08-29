package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n81 extends AnimatorListenerAdapter {
    public final int f30930a;
    public final o81 f30931b;

    public n81(o81 o81Var, int i10) {
        this.f30930a = i10;
        this.f30931b = o81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30930a) {
            case 0:
                this.f30931b.f31293y = null;
                return;
            default:
                this.f30931b.f31293y = null;
                return;
        }
    }
}
