package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class e20 extends AnimatorListenerAdapter {
    public final int f23535a;
    public final f20 f23536b;

    public e20(f20 f20Var, int i10) {
        this.f23535a = i10;
        this.f23536b = f20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23535a) {
            case 0:
                f20 f20Var = this.f23536b;
                NotificationCenter.getInstance(f20Var.f23817r.f24134a).onAnimationFinish(f20Var.f23815f);
                f20Var.requestLayout();
                return;
            default:
                f20 f20Var2 = this.f23536b;
                f20Var2.d = null;
                f20Var2.f23812a = null;
                f20Var2.f23813b = false;
                return;
        }
    }
}
