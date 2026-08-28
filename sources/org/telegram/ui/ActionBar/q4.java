package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
public final class q4 extends AnimatorListenerAdapter {
    public final int f23738a;
    public final t4 f23739b;

    public q4(t4 t4Var, int i9) {
        this.f23738a = i9;
        this.f23739b = t4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23738a) {
            case 0:
                NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new p(this, 13));
                return;
            default:
                NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new p(this, 14));
                return;
        }
    }
}
