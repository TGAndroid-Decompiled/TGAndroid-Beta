package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class q41 extends AnimatorListenerAdapter {
    public final int f39339a;
    public final r41 f39340b;

    public q41(r41 r41Var, int i10) {
        this.f39339a = i10;
        this.f39340b = r41Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39339a) {
            case 0:
                r41 r41Var = this.f39340b;
                if (r41Var.h != null) {
                    r41Var.h = null;
                    r41Var.e = 0.0f;
                    r41Var.g();
                    r41Var.f39585n.unlock();
                    zx zxVar = r41Var.f39581a;
                    if (zxVar != null) {
                        zxVar.onPause();
                        r41Var.f39581a.onFragmentDestroy();
                        r41Var.removeAllViews();
                        r41Var.f39581a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    r41Var.d(false);
                    return;
                }
                return;
            default:
                r41 r41Var2 = this.f39340b;
                if (r41Var2.h != null) {
                    r41Var2.h = null;
                    r41Var2.d(true);
                    return;
                }
                return;
        }
    }
}
