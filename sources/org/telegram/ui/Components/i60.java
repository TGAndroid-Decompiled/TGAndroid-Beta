package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i60 extends AnimatorListenerAdapter {
    public final int f29355a;
    public final j60 f29356b;

    public i60(j60 j60Var, int i9) {
        this.f29355a = i9;
        this.f29356b = j60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29355a) {
            case 0:
                j60 j60Var = this.f29356b;
                j60Var.f29655e.Z = null;
                j60Var.requestLayout();
                return;
            default:
                j60 j60Var2 = this.f29356b;
                j60Var2.f29655e.Z = null;
                j60Var2.f29652a = false;
                return;
        }
    }
}
