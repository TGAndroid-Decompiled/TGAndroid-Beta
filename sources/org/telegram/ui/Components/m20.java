package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class m20 extends AnimatorListenerAdapter {
    public final int f28356a;
    public final n20 f28357b;

    public m20(n20 n20Var, int i10) {
        this.f28356a = i10;
        this.f28357b = n20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28356a) {
            case 0:
                n20 n20Var = this.f28357b;
                NotificationCenter.getInstance(n20Var.f28664r.f28923a).onAnimationFinish(n20Var.f28662f);
                n20Var.requestLayout();
                return;
            default:
                n20 n20Var2 = this.f28357b;
                n20Var2.d = null;
                n20Var2.f28659a = null;
                n20Var2.f28660b = false;
                return;
        }
    }
}
