package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s20 extends AnimatorListenerAdapter {
    public final int f37889a;
    public final u20 f37890b;

    public s20(u20 u20Var, int i3) {
        this.f37889a = i3;
        this.f37890b = u20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37889a) {
            case 0:
                u20 u20Var = this.f37890b;
                u20Var.d = null;
                gp gpVar = new gp(this, 20);
                u20Var.f38620e = gpVar;
                org.telegram.messenger.g0.i3(gpVar, u20Var.f38625w);
                return;
            default:
                u20 u20Var2 = this.f37890b;
                u20Var2.setVisibility(4);
                u20Var2.f38619c = null;
                u20Var2.d = null;
                return;
        }
    }
}
