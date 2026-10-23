package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class m20 extends AnimatorListenerAdapter {
    public final int f28360a;
    public final n20 f28361b;

    public m20(n20 n20Var, int i10) {
        this.f28360a = i10;
        this.f28361b = n20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28360a) {
            case 0:
                n20 n20Var = this.f28361b;
                NotificationCenter.getInstance(n20Var.f28669r.f28928a).onAnimationFinish(n20Var.f28667f);
                n20Var.requestLayout();
                return;
            default:
                n20 n20Var2 = this.f28361b;
                n20Var2.d = null;
                n20Var2.f28664a = null;
                n20Var2.f28665b = false;
                return;
        }
    }
}
