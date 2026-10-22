package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c30 extends AnimatorListenerAdapter {
    public final int f25096a;
    public final i30 f25097b;

    public c30(i30 i30Var, int i10) {
        this.f25096a = i10;
        this.f25097b = i30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25096a) {
            case 0:
                i30 i30Var = this.f25097b;
                i30Var.f27106b.setVisibility(8);
                i30Var.f27116y = false;
                i30Var.E = 0.0f;
                return;
            default:
                this.f25097b.e.setVisibility(8);
                return;
        }
    }
}
