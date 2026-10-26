package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
public final class x4 extends AnimatorListenerAdapter {
    public final int f23245a;
    public final a5 f23246b;

    public x4(a5 a5Var, int i10) {
        this.f23245a = i10;
        this.f23246b = a5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23245a) {
            case 0:
                NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new q(this, 13));
                return;
            default:
                NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new q(this, 14));
                return;
        }
    }
}
