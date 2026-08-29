package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class z10 extends AnimatorListenerAdapter {
    public final int f35179a;
    public final a20 f35180b;

    public z10(a20 a20Var, int i10) {
        this.f35179a = i10;
        this.f35180b = a20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35179a) {
            case 0:
                a20 a20Var = this.f35180b;
                NotificationCenter.getInstance(a20Var.f26629r.f26947a).onAnimationFinish(a20Var.f26627f);
                a20Var.requestLayout();
                return;
            default:
                a20 a20Var2 = this.f35180b;
                a20Var2.d = null;
                a20Var2.f26623a = null;
                a20Var2.f26624b = false;
                return;
        }
    }
}
