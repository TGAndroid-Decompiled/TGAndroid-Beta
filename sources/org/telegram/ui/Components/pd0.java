package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pd0 extends AnimatorListenerAdapter {
    public final int f38574a;
    public final rd0 f38575b;

    public pd0(rd0 rd0Var, int i7) {
        this.f38574a = i7;
        this.f38575b = rd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38574a) {
            case 0:
                this.f38575b.f39160s = null;
                return;
            default:
                this.f38575b.f39161w = null;
                return;
        }
    }
}
