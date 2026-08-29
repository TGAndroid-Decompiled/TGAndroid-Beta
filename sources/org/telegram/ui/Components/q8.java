package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q8 extends AnimatorListenerAdapter {
    public final int f31868a;
    public final b9 f31869b;

    public q8(b9 b9Var, int i10) {
        this.f31868a = i10;
        this.f31869b = b9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f9;
        switch (this.f31868a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f31869b.f27007f = false;
                return;
            default:
                b9 b9Var = this.f31869b;
                if (b9Var.B) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                b9Var.i0(f9, false);
                b9Var.B = false;
                return;
        }
    }
}
