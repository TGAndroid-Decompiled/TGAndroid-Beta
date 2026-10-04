package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class h20 extends AnimatorListenerAdapter {
    public final int f26981a;
    public final i20 f26982b;

    public h20(i20 i20Var, int i10) {
        this.f26981a = i10;
        this.f26982b = i20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26981a) {
            case 0:
                i20 i20Var = this.f26982b;
                NotificationCenter.getInstance(i20Var.f27295r.f27562a).onAnimationFinish(i20Var.f27293f);
                i20Var.requestLayout();
                return;
            default:
                i20 i20Var2 = this.f26982b;
                i20Var2.d = null;
                i20Var2.f27289a = null;
                i20Var2.f27290b = false;
                return;
        }
    }
}
