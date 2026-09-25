package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yf0 extends AnimatorListenerAdapter {
    public final int f30599a;
    public final zf0 f30600b;

    public yf0(zf0 zf0Var, int i10) {
        this.f30599a = i10;
        this.f30600b = zf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30599a) {
            case 0:
                this.f30600b.f30866a.f22680n.setVisibility(8);
                return;
            default:
                this.f30600b.f30866a.h.setVisibility(8);
                return;
        }
    }
}
