package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class if0 extends AnimatorListenerAdapter {
    public final int f27310a;
    public final mf0 f27311b;

    public if0(mf0 mf0Var, int i10) {
        this.f27310a = i10;
        this.f27311b = mf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27310a) {
            case 0:
                this.f27311b.f28650x = null;
                return;
            default:
                this.f27311b.f28651y = null;
                return;
        }
    }
}
