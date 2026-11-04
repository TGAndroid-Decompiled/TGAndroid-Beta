package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n7 extends AnimatorListenerAdapter {
    public final int f36394a;
    public final z7 f36395b;

    public n7(z7 z7Var, int i3) {
        this.f36394a = i3;
        this.f36395b = z7Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f36394a) {
            case 2:
                this.f36395b.f40967t2 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36394a) {
            case 0:
                this.f36395b.f40942d2 = false;
                return;
            case 1:
                z7 z7Var = this.f36395b;
                z7Var.Z1.setVisibility(4);
                z7Var.f40940a2.setImageBitmap(null);
                z7Var.f40942d2 = false;
                return;
            default:
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
