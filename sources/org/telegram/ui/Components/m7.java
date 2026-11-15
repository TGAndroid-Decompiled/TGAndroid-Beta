package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m7 extends AnimatorListenerAdapter {
    public final int f37121a;
    public final y7 f37122b;

    public m7(y7 y7Var, int i7) {
        this.f37121a = i7;
        this.f37122b = y7Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f37121a) {
            case 2:
                this.f37122b.f41925w2 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37121a) {
            case 0:
                this.f37122b.f41899g2 = false;
                return;
            case 1:
                y7 y7Var = this.f37122b;
                y7Var.f41896c2.setVisibility(4);
                y7Var.d2.setImageBitmap(null);
                y7Var.f41899g2 = false;
                return;
            default:
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
