package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j01 extends AnimatorListenerAdapter {
    public final int f34837a;
    public final s01 f34838b;

    public j01(s01 s01Var, int i7) {
        this.f34837a = i7;
        this.f34838b = s01Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34837a) {
            case 0:
                s01 s01Var = this.f34838b;
                if (s01Var.T == animator) {
                    s01Var.T = null;
                    return;
                }
                return;
            case 1:
                s01 s01Var2 = this.f34838b;
                if (s01Var2.f37823f0 == animator) {
                    s01Var2.f37823f0 = null;
                }
                s01Var2.b(1.0f);
                return;
            default:
                s01 s01Var3 = this.f34838b;
                if (s01Var3.J == animator) {
                    s01Var3.J = null;
                    return;
                }
                return;
        }
    }
}
