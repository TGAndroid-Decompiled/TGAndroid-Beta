package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class df0 extends AnimatorListenerAdapter {
    public final int f23693a;
    public final ff0 f23694b;

    public df0(ff0 ff0Var, int i10) {
        this.f23693a = i10;
        this.f23694b = ff0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23693a) {
            case 0:
                this.f23694b.f24267s = null;
                return;
            default:
                this.f23694b.v = null;
                return;
        }
    }
}
