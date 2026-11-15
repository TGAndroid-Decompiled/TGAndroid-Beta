package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l01 extends AnimatorListenerAdapter {
    public final int f36687a;
    public final v01 f36688b;

    public l01(v01 v01Var, int i7) {
        this.f36687a = i7;
        this.f36688b = v01Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36687a) {
            case 0:
                v01 v01Var = this.f36688b;
                if (v01Var.U == animator) {
                    v01Var.U = null;
                    return;
                }
                return;
            case 1:
                v01 v01Var2 = this.f36688b;
                if (v01Var2.f40219g0 == animator) {
                    v01Var2.f40219g0 = null;
                }
                v01Var2.b(1.0f);
                return;
            default:
                v01 v01Var3 = this.f36688b;
                if (v01Var3.K == animator) {
                    v01Var3.K = null;
                    return;
                }
                return;
        }
    }
}
