package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s7 extends AnimatorListenerAdapter {
    public final int f39516a;
    public final e8 f39517b;

    public s7(e8 e8Var, int i7) {
        this.f39516a = i7;
        this.f39517b = e8Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f39516a) {
            case 2:
                this.f39517b.f34623w2 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39516a) {
            case 0:
                this.f39517b.f34597g2 = false;
                return;
            case 1:
                e8 e8Var = this.f39517b;
                e8Var.f34594c2.setVisibility(4);
                e8Var.d2.setImageBitmap(null);
                e8Var.f34597g2 = false;
                return;
            default:
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
