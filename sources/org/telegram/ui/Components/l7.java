package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l7 extends AnimatorListenerAdapter {
    public final int f28023a;
    public final w7 f28024b;

    public l7(w7 w7Var, int i10) {
        this.f28023a = i10;
        this.f28024b = w7Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f28023a) {
            case 2:
                this.f28024b.f32071s2 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28023a) {
            case 0:
                this.f28024b.f32045c2 = false;
                return;
            case 1:
                w7 w7Var = this.f28024b;
                w7Var.Y1.setVisibility(4);
                w7Var.Z1.setImageBitmap(null);
                w7Var.f32045c2 = false;
                return;
            default:
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
