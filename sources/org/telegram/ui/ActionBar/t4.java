package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
public final class t4 extends AnimatorListenerAdapter {
    public final int f20555a;
    public final w4 f20556b;

    public t4(w4 w4Var, int i10) {
        this.f20555a = i10;
        this.f20556b = w4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20555a) {
            case 0:
                NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new p(this, 13));
                return;
            default:
                NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new p(this, 14));
                return;
        }
    }
}
