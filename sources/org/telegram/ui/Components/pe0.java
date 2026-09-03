package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pe0 extends AnimatorListenerAdapter {
    public final int f27842a;
    public final te0 f27843b;

    public pe0(te0 te0Var, int i10) {
        this.f27842a = i10;
        this.f27843b = te0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27842a) {
            case 0:
                this.f27843b.f28981x = null;
                return;
            default:
                this.f27843b.f28982y = null;
                return;
        }
    }
}
