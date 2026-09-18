package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bf0 extends AnimatorListenerAdapter {
    public final int f22995a;
    public final df0 f22996b;

    public bf0(df0 df0Var, int i10) {
        this.f22995a = i10;
        this.f22996b = df0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22995a) {
            case 0:
                this.f22996b.f23576s = null;
                return;
            default:
                this.f22996b.v = null;
                return;
        }
    }
}
