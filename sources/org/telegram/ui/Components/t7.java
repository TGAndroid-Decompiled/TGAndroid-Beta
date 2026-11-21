package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t7 extends AnimatorListenerAdapter {
    public final int f39798a;
    public final f8 f39799b;

    public t7(f8 f8Var, int i7) {
        this.f39798a = i7;
        this.f39799b = f8Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f39798a) {
            case 2:
                this.f39799b.f35140w2 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39798a) {
            case 0:
                this.f39799b.f35114g2 = false;
                return;
            case 1:
                f8 f8Var = this.f39799b;
                f8Var.f35111c2.setVisibility(4);
                f8Var.d2.setImageBitmap(null);
                f8Var.f35114g2 = false;
                return;
            default:
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
