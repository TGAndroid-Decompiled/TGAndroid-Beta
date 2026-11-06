package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p7 extends AnimatorListenerAdapter {
    public final int f36786a;
    public final b8 f36787b;

    public p7(b8 b8Var, int i7) {
        this.f36786a = i7;
        this.f36787b = b8Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f36786a) {
            case 2:
                this.f36787b.f32088s2 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36786a) {
            case 0:
                this.f36787b.f32064c2 = false;
                return;
            case 1:
                b8 b8Var = this.f36787b;
                b8Var.Y1.setVisibility(4);
                b8Var.Z1.setImageBitmap(null);
                b8Var.f32064c2 = false;
                return;
            default:
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
