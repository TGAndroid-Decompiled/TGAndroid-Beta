package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yf0 extends AnimatorListenerAdapter {
    public final int f30598a;
    public final zf0 f30599b;

    public yf0(zf0 zf0Var, int i10) {
        this.f30598a = i10;
        this.f30599b = zf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30598a) {
            case 0:
                this.f30599b.f30865a.f22679n.setVisibility(8);
                return;
            default:
                this.f30599b.f30865a.h.setVisibility(8);
                return;
        }
    }
}
