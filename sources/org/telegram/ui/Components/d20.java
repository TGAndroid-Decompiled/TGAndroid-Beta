package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class d20 extends AnimatorListenerAdapter {
    public final int f25181a;
    public final e20 f25182b;

    public d20(e20 e20Var, int i10) {
        this.f25181a = i10;
        this.f25182b = e20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25181a) {
            case 0:
                e20 e20Var = this.f25182b;
                NotificationCenter.getInstance(e20Var.f25526r.f25873a).onAnimationFinish(e20Var.f25524f);
                e20Var.requestLayout();
                return;
            default:
                e20 e20Var2 = this.f25182b;
                e20Var2.d = null;
                e20Var2.f25520a = null;
                e20Var2.f25521b = false;
                return;
        }
    }
}
