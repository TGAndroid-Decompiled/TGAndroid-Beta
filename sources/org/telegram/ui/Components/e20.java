package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class e20 extends AnimatorListenerAdapter {
    public final int f23815a;
    public final f20 f23816b;

    public e20(f20 f20Var, int i10) {
        this.f23815a = i10;
        this.f23816b = f20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23815a) {
            case 0:
                f20 f20Var = this.f23816b;
                NotificationCenter.getInstance(f20Var.f24048r.f24334a).onAnimationFinish(f20Var.f24046f);
                f20Var.requestLayout();
                return;
            default:
                f20 f20Var2 = this.f23816b;
                f20Var2.d = null;
                f20Var2.f24043a = null;
                f20Var2.f24044b = false;
                return;
        }
    }
}
