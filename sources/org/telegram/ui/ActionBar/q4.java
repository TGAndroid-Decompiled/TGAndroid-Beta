package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
public final class q4 extends AnimatorListenerAdapter {
    public final int f19701a;
    public final t4 f19702b;

    public q4(t4 t4Var, int i10) {
        this.f19701a = i10;
        this.f19702b = t4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f19701a) {
            case 0:
                NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new p(this, 13));
                return;
            default:
                NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new p(this, 14));
                return;
        }
    }
}
