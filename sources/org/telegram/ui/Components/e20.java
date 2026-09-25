package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class e20 extends AnimatorListenerAdapter {
    public final int f23816a;
    public final f20 f23817b;

    public e20(f20 f20Var, int i10) {
        this.f23816a = i10;
        this.f23817b = f20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23816a) {
            case 0:
                f20 f20Var = this.f23817b;
                NotificationCenter.getInstance(f20Var.f24049r.f24335a).onAnimationFinish(f20Var.f24047f);
                f20Var.requestLayout();
                return;
            default:
                f20 f20Var2 = this.f23817b;
                f20Var2.d = null;
                f20Var2.f24044a = null;
                f20Var2.f24045b = false;
                return;
        }
    }
}
