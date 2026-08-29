package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
public final class q4 extends AnimatorListenerAdapter {
    public final int f23760a;
    public final t4 f23761b;

    public q4(t4 t4Var, int i10) {
        this.f23760a = i10;
        this.f23761b = t4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23760a) {
            case 0:
                NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new q(this, 13));
                return;
            default:
                NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new q(this, 14));
                return;
        }
    }
}
