package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class m20 extends AnimatorListenerAdapter {
    public final int f28359a;
    public final n20 f28360b;

    public m20(n20 n20Var, int i10) {
        this.f28359a = i10;
        this.f28360b = n20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28359a) {
            case 0:
                n20 n20Var = this.f28360b;
                NotificationCenter.getInstance(n20Var.f28668r.f28927a).onAnimationFinish(n20Var.f28666f);
                n20Var.requestLayout();
                return;
            default:
                n20 n20Var2 = this.f28360b;
                n20Var2.d = null;
                n20Var2.f28663a = null;
                n20Var2.f28664b = false;
                return;
        }
    }
}
