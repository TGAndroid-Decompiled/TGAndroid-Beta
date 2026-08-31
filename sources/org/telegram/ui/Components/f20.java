package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class f20 extends AnimatorListenerAdapter {
    public final int f26726a;
    public final g20 f26727b;

    public f20(g20 g20Var, int i10) {
        this.f26726a = i10;
        this.f26727b = g20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26726a) {
            case 0:
                g20 g20Var = this.f26727b;
                NotificationCenter.getInstance(g20Var.f27082r.f27350a).onAnimationFinish(g20Var.f27080f);
                g20Var.requestLayout();
                return;
            default:
                g20 g20Var2 = this.f26727b;
                g20Var2.d = null;
                g20Var2.f27076a = null;
                g20Var2.f27077b = false;
                return;
        }
    }
}
