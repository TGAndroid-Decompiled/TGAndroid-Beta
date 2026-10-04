package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class h20 extends AnimatorListenerAdapter {
    public final int f26975a;
    public final i20 f26976b;

    public h20(i20 i20Var, int i10) {
        this.f26975a = i10;
        this.f26976b = i20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26975a) {
            case 0:
                i20 i20Var = this.f26976b;
                NotificationCenter.getInstance(i20Var.f27289r.f27556a).onAnimationFinish(i20Var.f27287f);
                i20Var.requestLayout();
                return;
            default:
                i20 i20Var2 = this.f26976b;
                i20Var2.d = null;
                i20Var2.f27283a = null;
                i20Var2.f27284b = false;
                return;
        }
    }
}
