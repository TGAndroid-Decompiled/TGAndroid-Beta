package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w20 extends AnimatorListenerAdapter {
    public final int f29830a;
    public final b30 f29831b;

    public w20(b30 b30Var, int i10) {
        this.f29830a = i10;
        this.f29831b = b30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29830a) {
            case 0:
                b30 b30Var = this.f29831b;
                b30Var.f22878b.setVisibility(8);
                b30Var.f22888y = false;
                b30Var.E = 0.0f;
                return;
            default:
                this.f29831b.e.setVisibility(8);
                return;
        }
    }
}
