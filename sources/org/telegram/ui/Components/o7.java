package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o7 extends AnimatorListenerAdapter {
    public final int f36530a;
    public final a8 f36531b;

    public o7(a8 a8Var, int i7) {
        this.f36530a = i7;
        this.f36531b = a8Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f36530a) {
            case 2:
                this.f36531b.f31763v2 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36530a) {
            case 0:
                this.f36531b.f31738f2 = false;
                return;
            case 1:
                a8 a8Var = this.f36531b;
                a8Var.f31735b2.setVisibility(4);
                a8Var.f31736c2.setImageBitmap(null);
                a8Var.f31738f2 = false;
                return;
            default:
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
