package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class m20 extends AnimatorListenerAdapter {
    public final int f28480a;
    public final n20 f28481b;

    public m20(n20 n20Var, int i10) {
        this.f28480a = i10;
        this.f28481b = n20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28480a) {
            case 0:
                n20 n20Var = this.f28481b;
                NotificationCenter.getInstance(n20Var.f28811r.f29071a).onAnimationFinish(n20Var.f28809f);
                n20Var.requestLayout();
                return;
            default:
                n20 n20Var2 = this.f28481b;
                n20Var2.d = null;
                n20Var2.f28806a = null;
                n20Var2.f28807b = false;
                return;
        }
    }
}
