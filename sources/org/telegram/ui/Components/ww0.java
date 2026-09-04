package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ww0 extends AnimatorListenerAdapter {
    public final int f32356a;
    public final xw0 f32357b;

    public ww0(xw0 xw0Var, int i10) {
        this.f32356a = i10;
        this.f32357b = xw0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32356a) {
            case 0:
                this.f32357b.f32759s.setVisibility(8);
                return;
            case 1:
                this.f32357b.f32759s.setVisibility(8);
                return;
            default:
                this.f32357b.f32759s.setVisibility(8);
                return;
        }
    }
}
