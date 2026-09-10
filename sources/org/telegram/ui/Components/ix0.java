package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ix0 extends AnimatorListenerAdapter {
    public final int f24156a;
    public final jx0 f24157b;

    public ix0(jx0 jx0Var, int i10) {
        this.f24156a = i10;
        this.f24157b = jx0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24156a) {
            case 0:
                this.f24157b.f24515s.setVisibility(8);
                return;
            case 1:
                this.f24157b.f24515s.setVisibility(8);
                return;
            default:
                this.f24157b.f24515s.setVisibility(8);
                return;
        }
    }
}
