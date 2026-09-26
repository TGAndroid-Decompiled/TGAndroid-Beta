package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class f20 extends AnimatorListenerAdapter {
    public final int f24117a;
    public final g20 f24118b;

    public f20(g20 g20Var, int i10) {
        this.f24117a = i10;
        this.f24118b = g20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24117a) {
            case 0:
                g20 g20Var = this.f24118b;
                NotificationCenter.getInstance(g20Var.f24370r.f24643a).onAnimationFinish(g20Var.f24368f);
                g20Var.requestLayout();
                return;
            default:
                g20 g20Var2 = this.f24118b;
                g20Var2.d = null;
                g20Var2.f24365a = null;
                g20Var2.f24366b = false;
                return;
        }
    }
}
