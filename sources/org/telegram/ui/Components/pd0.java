package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pd0 extends AnimatorListenerAdapter {
    public final int f38572a;
    public final rd0 f38573b;

    public pd0(rd0 rd0Var, int i7) {
        this.f38572a = i7;
        this.f38573b = rd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38572a) {
            case 0:
                this.f38573b.f39169s = null;
                return;
            default:
                this.f38573b.f39170w = null;
                return;
        }
    }
}
