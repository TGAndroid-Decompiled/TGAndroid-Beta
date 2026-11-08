package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g71 extends AnimatorListenerAdapter {
    public final int f33874a;
    public final h71 f33875b;

    public g71(h71 h71Var, int i7) {
        this.f33874a = i7;
        this.f33875b = h71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33874a) {
            case 0:
                this.f33875b.D = null;
                return;
            default:
                this.f33875b.D = null;
                return;
        }
    }
}
