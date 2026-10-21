package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r91 extends AnimatorListenerAdapter {
    public final int f29906a;
    public final s91 f29907b;

    public r91(s91 s91Var, int i10) {
        this.f29906a = i10;
        this.f29907b = s91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29906a) {
            case 0:
                this.f29907b.f30232y = null;
                return;
            default:
                this.f29907b.f30232y = null;
                return;
        }
    }
}
