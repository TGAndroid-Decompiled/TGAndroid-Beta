package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
public final class s4 extends AnimatorListenerAdapter {
    public final int f21329a;
    public final v4 f21330b;

    public s4(v4 v4Var, int i10) {
        this.f21329a = i10;
        this.f21330b = v4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21329a) {
            case 0:
                NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new q(this, 13));
                return;
            default:
                NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new q(this, 14));
                return;
        }
    }
}
