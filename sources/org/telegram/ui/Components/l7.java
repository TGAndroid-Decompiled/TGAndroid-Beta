package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l7 extends AnimatorListenerAdapter {
    public final int f28069a;
    public final w7 f28070b;

    public l7(w7 w7Var, int i10) {
        this.f28069a = i10;
        this.f28070b = w7Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f28069a) {
            case 2:
                this.f28070b.f32119s2 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28069a) {
            case 0:
                this.f28070b.f32093c2 = false;
                return;
            case 1:
                w7 w7Var = this.f28070b;
                w7Var.Y1.setVisibility(4);
                w7Var.Z1.setImageBitmap(null);
                w7Var.f32093c2 = false;
                return;
            default:
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
