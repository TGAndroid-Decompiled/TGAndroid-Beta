package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
public final class q4 extends AnimatorListenerAdapter {
    public final int f19716a;
    public final t4 f19717b;

    public q4(t4 t4Var, int i10) {
        this.f19716a = i10;
        this.f19717b = t4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f19716a) {
            case 0:
                NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new p(this, 13));
                return;
            default:
                NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new p(this, 14));
                return;
        }
    }
}
