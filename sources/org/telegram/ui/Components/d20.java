package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class d20 extends AnimatorListenerAdapter {
    public final int f23539a;
    public final e20 f23540b;

    public d20(e20 e20Var, int i10) {
        this.f23539a = i10;
        this.f23540b = e20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23539a) {
            case 0:
                e20 e20Var = this.f23540b;
                NotificationCenter.getInstance(e20Var.f23841r.f24081a).onAnimationFinish(e20Var.f23839f);
                e20Var.requestLayout();
                return;
            default:
                e20 e20Var2 = this.f23540b;
                e20Var2.d = null;
                e20Var2.f23836a = null;
                e20Var2.f23837b = false;
                return;
        }
    }
}
