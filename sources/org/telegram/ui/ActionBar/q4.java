package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
public final class q4 extends AnimatorListenerAdapter {
    public final int f20601a;
    public final t4 f20602b;

    public q4(t4 t4Var, int i10) {
        this.f20601a = i10;
        this.f20602b = t4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20601a) {
            case 0:
                NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new p(this, 13));
                return;
            default:
                NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new p(this, 14));
                return;
        }
    }
}
