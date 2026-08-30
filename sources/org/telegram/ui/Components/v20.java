package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v20 extends AnimatorListenerAdapter {
    public final int f29338a;
    public final a30 f29339b;

    public v20(a30 a30Var, int i10) {
        this.f29338a = i10;
        this.f29339b = a30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29338a) {
            case 0:
                a30 a30Var = this.f29339b;
                a30Var.f23280b.setVisibility(8);
                a30Var.f23288y = false;
                a30Var.B = 0.0f;
                return;
            default:
                this.f29339b.e.setVisibility(8);
                return;
        }
    }
}
