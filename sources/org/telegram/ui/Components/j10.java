package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j10 extends AnimatorListenerAdapter {
    public final int f34845a;
    public final p10 f34846b;

    public j10(p10 p10Var, int i7) {
        this.f34845a = i7;
        this.f34846b = p10Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34845a) {
            case 0:
                p10 p10Var = this.f34846b;
                p10Var.f36740b.setVisibility(8);
                p10Var.E = false;
                p10Var.F = 0.0f;
                return;
            default:
                this.f34846b.f36745e.setVisibility(8);
                return;
        }
    }
}
