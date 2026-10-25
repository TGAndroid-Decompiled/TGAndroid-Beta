package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class o20 extends AnimatorListenerAdapter {
    public final int f31131a;
    public final p20 f31132b;

    public o20(p20 p20Var, int i10) {
        this.f31131a = i10;
        this.f31132b = p20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31131a) {
            case 0:
                p20 p20Var = this.f31132b;
                NotificationCenter.getInstance(p20Var.f31425r.f31806a).onAnimationFinish(p20Var.f31423f);
                p20Var.requestLayout();
                return;
            default:
                p20 p20Var2 = this.f31132b;
                p20Var2.d = null;
                p20Var2.f31420a = null;
                p20Var2.f31421b = false;
                return;
        }
    }
}
