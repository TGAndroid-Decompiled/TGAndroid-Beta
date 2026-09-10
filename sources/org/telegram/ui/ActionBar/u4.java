package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
public final class u4 extends AnimatorListenerAdapter {
    public final int f18653a;
    public final x4 f18654b;

    public u4(x4 x4Var, int i10) {
        this.f18653a = i10;
        this.f18654b = x4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f18653a) {
            case 0:
                NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new q(this, 13));
                return;
            default:
                NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new q(this, 14));
                return;
        }
    }
}
