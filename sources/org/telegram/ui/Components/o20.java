package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class o20 extends AnimatorListenerAdapter {
    public final int f31137a;
    public final p20 f31138b;

    public o20(p20 p20Var, int i10) {
        this.f31137a = i10;
        this.f31138b = p20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31137a) {
            case 0:
                p20 p20Var = this.f31138b;
                NotificationCenter.getInstance(p20Var.f31442r.f31773a).onAnimationFinish(p20Var.f31440f);
                p20Var.requestLayout();
                return;
            default:
                p20 p20Var2 = this.f31138b;
                p20Var2.d = null;
                p20Var2.f31437a = null;
                p20Var2.f31438b = false;
                return;
        }
    }
}
