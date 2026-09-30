package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class h20 extends AnimatorListenerAdapter {
    public final int f24721a;
    public final i20 f24722b;

    public h20(i20 i20Var, int i10) {
        this.f24721a = i10;
        this.f24722b = i20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24721a) {
            case 0:
                i20 i20Var = this.f24722b;
                NotificationCenter.getInstance(i20Var.f24988r.f25266a).onAnimationFinish(i20Var.f24986f);
                i20Var.requestLayout();
                return;
            default:
                i20 i20Var2 = this.f24722b;
                i20Var2.d = null;
                i20Var2.f24983a = null;
                i20Var2.f24984b = false;
                return;
        }
    }
}
