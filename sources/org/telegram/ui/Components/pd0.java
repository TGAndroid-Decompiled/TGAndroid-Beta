package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pd0 extends AnimatorListenerAdapter {
    public final int f38573a;
    public final rd0 f38574b;

    public pd0(rd0 rd0Var, int i7) {
        this.f38573a = i7;
        this.f38574b = rd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38573a) {
            case 0:
                this.f38574b.f39170s = null;
                return;
            default:
                this.f38574b.f39171w = null;
                return;
        }
    }
}
