package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g81 extends AnimatorListenerAdapter {
    public final int f45922a;
    public final h81 f45923b;

    public g81(h81 h81Var, int i7) {
        this.f45922a = i7;
        this.f45923b = h81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45922a) {
            case 0:
                this.f45923b.f46292b.f47733s.setVisibility(8);
                return;
            default:
                this.f45923b.f46292b.f47726a.setVisibility(8);
                return;
        }
    }
}
