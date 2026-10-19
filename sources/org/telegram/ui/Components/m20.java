package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class m20 extends AnimatorListenerAdapter {
    public final int f28366a;
    public final n20 f28367b;

    public m20(n20 n20Var, int i10) {
        this.f28366a = i10;
        this.f28367b = n20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28366a) {
            case 0:
                n20 n20Var = this.f28367b;
                NotificationCenter.getInstance(n20Var.f28660r.f28883a).onAnimationFinish(n20Var.f28658f);
                n20Var.requestLayout();
                return;
            default:
                n20 n20Var2 = this.f28367b;
                n20Var2.d = null;
                n20Var2.f28655a = null;
                n20Var2.f28656b = false;
                return;
        }
    }
}
