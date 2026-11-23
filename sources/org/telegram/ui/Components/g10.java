package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g10 extends AnimatorListenerAdapter {
    public final int f35362a;
    public final i10 f35363b;

    public g10(i10 i10Var, int i7) {
        this.f35362a = i7;
        this.f35363b = i10Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35362a) {
            case 0:
                i10 i10Var = this.f35363b;
                org.telegram.messenger.ls.f(i10Var.f36111r.f36350a).j(i10Var.f36109f);
                i10Var.requestLayout();
                return;
            default:
                i10 i10Var2 = this.f35363b;
                i10Var2.d = null;
                i10Var2.f36105a = null;
                i10Var2.f36106b = false;
                return;
        }
    }
}
