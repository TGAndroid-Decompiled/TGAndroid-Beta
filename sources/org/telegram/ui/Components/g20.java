package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class g20 extends AnimatorListenerAdapter {
    public final int f24434a;
    public final h20 f24435b;

    public g20(h20 h20Var, int i10) {
        this.f24434a = i10;
        this.f24435b = h20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24434a) {
            case 0:
                h20 h20Var = this.f24435b;
                NotificationCenter.getInstance(h20Var.f24698r.f24992a).onAnimationFinish(h20Var.f24696f);
                h20Var.requestLayout();
                return;
            default:
                h20 h20Var2 = this.f24435b;
                h20Var2.d = null;
                h20Var2.f24693a = null;
                h20Var2.f24694b = false;
                return;
        }
    }
}
