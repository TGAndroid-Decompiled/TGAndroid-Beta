package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class e41 extends AnimatorListenerAdapter {
    public final int f33121a;
    public final f41 f33122b;

    public e41(f41 f41Var, int i10) {
        this.f33121a = i10;
        this.f33122b = f41Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33121a) {
            case 0:
                f41 f41Var = this.f33122b;
                if (f41Var.h != null) {
                    f41Var.h = null;
                    f41Var.e = 0.0f;
                    f41Var.g();
                    f41Var.f33415n.unlock();
                    rx rxVar = f41Var.f33411a;
                    if (rxVar != null) {
                        rxVar.onPause();
                        f41Var.f33411a.onFragmentDestroy();
                        f41Var.removeAllViews();
                        f41Var.f33411a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    f41Var.d(false);
                    return;
                }
                return;
            default:
                f41 f41Var2 = this.f33122b;
                if (f41Var2.h != null) {
                    f41Var2.h = null;
                    f41Var2.d(true);
                    return;
                }
                return;
        }
    }
}
