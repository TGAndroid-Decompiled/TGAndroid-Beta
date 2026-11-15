package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o3 extends AnimatorListenerAdapter {
    public final q3 f30797a;

    public o3(q3 q3Var) {
        this.f30797a = q3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        q3 q3Var = this.f30797a;
        if (q3Var.f31271x) {
            q3Var.f31266f.setVisibility(4);
            q3Var.h.setVisibility(4);
            q3Var.f31267n.setVisibility(0);
            return;
        }
        if (q3Var.f31270w) {
            q3Var.f31266f.setVisibility(4);
        } else {
            q3Var.h.setVisibility(4);
        }
        q3Var.f31267n.setVisibility(8);
    }
}
