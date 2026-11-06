package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g81 extends AnimatorListenerAdapter {
    public final int f45921a;
    public final h81 f45922b;

    public g81(h81 h81Var, int i7) {
        this.f45921a = i7;
        this.f45922b = h81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45921a) {
            case 0:
                this.f45922b.f46291b.f47732s.setVisibility(8);
                return;
            default:
                this.f45922b.f46291b.f47725a.setVisibility(8);
                return;
        }
    }
}
