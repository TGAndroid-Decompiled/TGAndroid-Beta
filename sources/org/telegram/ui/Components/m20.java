package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class m20 extends AnimatorListenerAdapter {
    public final int f25151a;
    public final n20 f25152b;

    public m20(n20 n20Var, int i10) {
        this.f25151a = i10;
        this.f25152b = n20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25151a) {
            case 0:
                n20 n20Var = this.f25152b;
                NotificationCenter.getInstance(n20Var.f25382r.f25642a).onAnimationFinish(n20Var.f25380f);
                n20Var.requestLayout();
                return;
            default:
                n20 n20Var2 = this.f25152b;
                n20Var2.d = null;
                n20Var2.f25377a = null;
                n20Var2.f25378b = false;
                return;
        }
    }
}
