package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
public final class t4 extends AnimatorListenerAdapter {
    public final int f19561a;
    public final w4 f19562b;

    public t4(w4 w4Var, int i10) {
        this.f19561a = i10;
        this.f19562b = w4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f19561a) {
            case 0:
                NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new r(this, 13));
                return;
            default:
                NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new r(this, 14));
                return;
        }
    }
}
