package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class q41 extends AnimatorListenerAdapter {
    public final int f39060a;
    public final r41 f39061b;

    public q41(r41 r41Var, int i10) {
        this.f39060a = i10;
        this.f39061b = r41Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39060a) {
            case 0:
                r41 r41Var = this.f39061b;
                if (r41Var.h != null) {
                    r41Var.h = null;
                    r41Var.e = 0.0f;
                    r41Var.g();
                    r41Var.f39278n.unlock();
                    zx zxVar = r41Var.f39274a;
                    if (zxVar != null) {
                        zxVar.onPause();
                        r41Var.f39274a.onFragmentDestroy();
                        r41Var.removeAllViews();
                        r41Var.f39274a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    r41Var.d(false);
                    return;
                }
                return;
            default:
                r41 r41Var2 = this.f39061b;
                if (r41Var2.h != null) {
                    r41Var2.h = null;
                    r41Var2.d(true);
                    return;
                }
                return;
        }
    }
}
