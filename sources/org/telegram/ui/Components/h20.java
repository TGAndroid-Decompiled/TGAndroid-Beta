package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class h20 extends AnimatorListenerAdapter {
    public final int f26976a;
    public final i20 f26977b;

    public h20(i20 i20Var, int i10) {
        this.f26976a = i10;
        this.f26977b = i20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26976a) {
            case 0:
                i20 i20Var = this.f26977b;
                NotificationCenter.getInstance(i20Var.f27290r.f27557a).onAnimationFinish(i20Var.f27288f);
                i20Var.requestLayout();
                return;
            default:
                i20 i20Var2 = this.f26977b;
                i20Var2.d = null;
                i20Var2.f27284a = null;
                i20Var2.f27285b = false;
                return;
        }
    }
}
