package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class of0 extends AnimatorListenerAdapter {
    public final int f29044a;
    public final pf0 f29045b;

    public of0(pf0 pf0Var, int i10) {
        this.f29044a = i10;
        this.f29045b = pf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29044a) {
            case 0:
                this.f29045b.f29368a.f29713n.setVisibility(8);
                return;
            default:
                this.f29045b.f29368a.h.setVisibility(8);
                return;
        }
    }
}
