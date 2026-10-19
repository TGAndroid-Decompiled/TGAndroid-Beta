package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c30 extends AnimatorListenerAdapter {
    public final int f25068a;
    public final i30 f25069b;

    public c30(i30 i30Var, int i10) {
        this.f25068a = i10;
        this.f25069b = i30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25068a) {
            case 0:
                i30 i30Var = this.f25069b;
                i30Var.f27054b.setVisibility(8);
                i30Var.f27064y = false;
                i30Var.E = 0.0f;
                return;
            default:
                this.f25069b.e.setVisibility(8);
                return;
        }
    }
}
