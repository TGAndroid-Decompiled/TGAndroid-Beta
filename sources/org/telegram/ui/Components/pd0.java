package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pd0 extends AnimatorListenerAdapter {
    public final int f38530a;
    public final rd0 f38531b;

    public pd0(rd0 rd0Var, int i7) {
        this.f38530a = i7;
        this.f38531b = rd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38530a) {
            case 0:
                this.f38531b.f39124s = null;
                return;
            default:
                this.f38531b.f39125w = null;
                return;
        }
    }
}
