package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ff0 extends AnimatorListenerAdapter {
    public final int f24290a;
    public final hf0 f24291b;

    public ff0(hf0 hf0Var, int i10) {
        this.f24290a = i10;
        this.f24291b = hf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24290a) {
            case 0:
                this.f24291b.f24861s = null;
                return;
            default:
                this.f24291b.v = null;
                return;
        }
    }
}
