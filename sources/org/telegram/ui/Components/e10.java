package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e10 extends AnimatorListenerAdapter {
    public final int f34560a;
    public final f10 f34561b;

    public e10(f10 f10Var, int i7) {
        this.f34560a = i7;
        this.f34561b = f10Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34560a) {
            case 0:
                f10 f10Var = this.f34561b;
                org.telegram.messenger.ks.f(f10Var.f34871r.f35286a).j(f10Var.f34869f);
                f10Var.requestLayout();
                return;
            default:
                f10 f10Var2 = this.f34561b;
                f10Var2.d = null;
                f10Var2.f34865a = null;
                f10Var2.f34866b = false;
                return;
        }
    }
}
