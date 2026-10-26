package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class o20 extends AnimatorListenerAdapter {
    public final int f31133a;
    public final p20 f31134b;

    public o20(p20 p20Var, int i10) {
        this.f31133a = i10;
        this.f31134b = p20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31133a) {
            case 0:
                p20 p20Var = this.f31134b;
                NotificationCenter.getInstance(p20Var.f31427r.f31808a).onAnimationFinish(p20Var.f31425f);
                p20Var.requestLayout();
                return;
            default:
                p20 p20Var2 = this.f31134b;
                p20Var2.d = null;
                p20Var2.f31422a = null;
                p20Var2.f31423b = false;
                return;
        }
    }
}
