package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class o10 extends AnimatorListenerAdapter {
    public final int f31252a;
    public final p10 f31253b;

    public o10(p10 p10Var, int i9) {
        this.f31252a = i9;
        this.f31253b = p10Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31252a) {
            case 0:
                p10 p10Var = this.f31253b;
                NotificationCenter.getInstance(p10Var.f31508r.f31804a).onAnimationFinish(p10Var.f31506f);
                p10Var.requestLayout();
                return;
            default:
                p10 p10Var2 = this.f31253b;
                p10Var2.d = null;
                p10Var2.f31502a = null;
                p10Var2.f31503b = false;
                return;
        }
    }
}
