package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
public final class r4 extends AnimatorListenerAdapter {
    public final int f21491a;
    public final u4 f21492b;

    public r4(u4 u4Var, int i10) {
        this.f21491a = i10;
        this.f21492b = u4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21491a) {
            case 0:
                NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new q(this, 13));
                return;
            default:
                NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new q(this, 14));
                return;
        }
    }
}
