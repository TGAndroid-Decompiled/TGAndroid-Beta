package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r50 extends AnimatorListenerAdapter {
    public final int f37654a;
    public final s50 f37655b;

    public r50(s50 s50Var, int i3) {
        this.f37654a = i3;
        this.f37655b = s50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37654a) {
            case 0:
                s50 s50Var = this.f37655b;
                s50Var.f37912e.V1 = null;
                s50Var.requestLayout();
                return;
            default:
                s50 s50Var2 = this.f37655b;
                s50Var2.f37912e.V1 = null;
                s50Var2.f37909a = false;
                return;
        }
    }
}
