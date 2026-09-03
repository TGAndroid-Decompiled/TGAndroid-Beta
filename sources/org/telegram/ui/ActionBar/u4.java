package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
public final class u4 extends AnimatorListenerAdapter {
    public final int f22312a;
    public final x4 f22313b;

    public u4(x4 x4Var, int i10) {
        this.f22312a = i10;
        this.f22313b = x4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22312a) {
            case 0:
                NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new p(this, 13));
                return;
            default:
                NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new p(this, 14));
                return;
        }
    }
}
