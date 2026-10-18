package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class m20 extends AnimatorListenerAdapter {
    public final int f28380a;
    public final n20 f28381b;

    public m20(n20 n20Var, int i10) {
        this.f28380a = i10;
        this.f28381b = n20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28380a) {
            case 0:
                n20 n20Var = this.f28381b;
                NotificationCenter.getInstance(n20Var.f28645r.f28871a).onAnimationFinish(n20Var.f28643f);
                n20Var.requestLayout();
                return;
            default:
                n20 n20Var2 = this.f28381b;
                n20Var2.d = null;
                n20Var2.f28640a = null;
                n20Var2.f28641b = false;
                return;
        }
    }
}
