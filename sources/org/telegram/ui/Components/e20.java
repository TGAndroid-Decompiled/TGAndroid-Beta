package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class e20 extends AnimatorListenerAdapter {
    public final int f24439a;
    public final f20 f24440b;

    public e20(f20 f20Var, int i10) {
        this.f24439a = i10;
        this.f24440b = f20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24439a) {
            case 0:
                f20 f20Var = this.f24440b;
                NotificationCenter.getInstance(f20Var.f24758r.f25017a).onAnimationFinish(f20Var.f24756f);
                f20Var.requestLayout();
                return;
            default:
                f20 f20Var2 = this.f24440b;
                f20Var2.d = null;
                f20Var2.f24753a = null;
                f20Var2.f24754b = false;
                return;
        }
    }
}
