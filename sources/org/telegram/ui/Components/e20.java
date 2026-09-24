package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class e20 extends AnimatorListenerAdapter {
    public final int f23788a;
    public final f20 f23789b;

    public e20(f20 f20Var, int i10) {
        this.f23788a = i10;
        this.f23789b = f20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23788a) {
            case 0:
                f20 f20Var = this.f23789b;
                NotificationCenter.getInstance(f20Var.f24042r.f24317a).onAnimationFinish(f20Var.f24040f);
                f20Var.requestLayout();
                return;
            default:
                f20 f20Var2 = this.f23789b;
                f20Var2.d = null;
                f20Var2.f24037a = null;
                f20Var2.f24038b = false;
                return;
        }
    }
}
