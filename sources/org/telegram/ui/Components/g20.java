package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class g20 extends AnimatorListenerAdapter {
    public final int f24401a;
    public final h20 f24402b;

    public g20(h20 h20Var, int i10) {
        this.f24401a = i10;
        this.f24402b = h20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24401a) {
            case 0:
                h20 h20Var = this.f24402b;
                NotificationCenter.getInstance(h20Var.f24669r.f24978a).onAnimationFinish(h20Var.f24667f);
                h20Var.requestLayout();
                return;
            default:
                h20 h20Var2 = this.f24402b;
                h20Var2.d = null;
                h20Var2.f24664a = null;
                h20Var2.f24665b = false;
                return;
        }
    }
}
