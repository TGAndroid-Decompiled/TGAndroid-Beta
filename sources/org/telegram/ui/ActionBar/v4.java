package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
public final class v4 extends AnimatorListenerAdapter {
    public final int f21927a;
    public final y4 f21928b;

    public v4(y4 y4Var, int i10) {
        this.f21927a = i10;
        this.f21928b = y4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21927a) {
            case 0:
                NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new p(this, 13));
                return;
            default:
                NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new p(this, 14));
                return;
        }
    }
}
