package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q3 extends AnimatorListenerAdapter {
    public final r3 f22516a;

    public q3(r3 r3Var) {
        this.f22516a = r3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        r3 r3Var = this.f22516a;
        if (r3Var.f22698r) {
            r3Var.d.setVisibility(4);
        } else {
            r3Var.f22695e.setVisibility(4);
        }
    }
}
