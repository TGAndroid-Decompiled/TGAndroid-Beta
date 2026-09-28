package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class g20 extends AnimatorListenerAdapter {
    public final int f24400a;
    public final h20 f24401b;

    public g20(h20 h20Var, int i10) {
        this.f24400a = i10;
        this.f24401b = h20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24400a) {
            case 0:
                h20 h20Var = this.f24401b;
                NotificationCenter.getInstance(h20Var.f24668r.f24977a).onAnimationFinish(h20Var.f24666f);
                h20Var.requestLayout();
                return;
            default:
                h20 h20Var2 = this.f24401b;
                h20Var2.d = null;
                h20Var2.f24663a = null;
                h20Var2.f24664b = false;
                return;
        }
    }
}
