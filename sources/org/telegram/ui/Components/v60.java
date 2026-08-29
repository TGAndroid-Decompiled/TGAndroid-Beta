package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v60 extends AnimatorListenerAdapter {
    public final int f33470a;
    public final w60 f33471b;

    public v60(w60 w60Var, int i10) {
        this.f33470a = i10;
        this.f33471b = w60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33470a) {
            case 0:
                w60 w60Var = this.f33471b;
                w60Var.f34335e.Z = null;
                w60Var.requestLayout();
                return;
            default:
                w60 w60Var2 = this.f33471b;
                w60Var2.f34335e.Z = null;
                w60Var2.f34332a = false;
                return;
        }
    }
}
