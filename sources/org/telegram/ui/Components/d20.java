package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class d20 extends AnimatorListenerAdapter {
    public final int f23402a;
    public final e20 f23403b;

    public d20(e20 e20Var, int i10) {
        this.f23402a = i10;
        this.f23403b = e20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23402a) {
            case 0:
                e20 e20Var = this.f23403b;
                NotificationCenter.getInstance(e20Var.f23765r.f23993a).onAnimationFinish(e20Var.f23763f);
                e20Var.requestLayout();
                return;
            default:
                e20 e20Var2 = this.f23403b;
                e20Var2.d = null;
                e20Var2.f23760a = null;
                e20Var2.f23761b = false;
                return;
        }
    }
}
