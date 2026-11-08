package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o3 extends AnimatorListenerAdapter {
    public final q3 f29645a;

    public o3(q3 q3Var) {
        this.f29645a = q3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        q3 q3Var = this.f29645a;
        if (q3Var.f30123x) {
            q3Var.f30118f.setVisibility(4);
            q3Var.h.setVisibility(4);
            q3Var.f30119n.setVisibility(0);
            return;
        }
        if (q3Var.f30122w) {
            q3Var.f30118f.setVisibility(4);
        } else {
            q3Var.h.setVisibility(4);
        }
        q3Var.f30119n.setVisibility(8);
    }
}
