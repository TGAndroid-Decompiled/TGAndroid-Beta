package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t7 extends AnimatorListenerAdapter {
    public final int f39790a;
    public final f8 f39791b;

    public t7(f8 f8Var, int i7) {
        this.f39790a = i7;
        this.f39791b = f8Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f39790a) {
            case 2:
                this.f39791b.f35142w2 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39790a) {
            case 0:
                this.f39791b.f35116g2 = false;
                return;
            case 1:
                f8 f8Var = this.f39791b;
                f8Var.f35113c2.setVisibility(4);
                f8Var.d2.setImageBitmap(null);
                f8Var.f35116g2 = false;
                return;
            default:
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
