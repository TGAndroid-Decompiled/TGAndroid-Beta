package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class q41 extends AnimatorListenerAdapter {
    public final int f35969a;
    public final r41 f35970b;

    public q41(r41 r41Var, int i10) {
        this.f35969a = i10;
        this.f35970b = r41Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35969a) {
            case 0:
                r41 r41Var = this.f35970b;
                if (r41Var.h != null) {
                    r41Var.h = null;
                    r41Var.e = 0.0f;
                    r41Var.g();
                    r41Var.f36224n.unlock();
                    xx xxVar = r41Var.f36220a;
                    if (xxVar != null) {
                        xxVar.onPause();
                        r41Var.f36220a.onFragmentDestroy();
                        r41Var.removeAllViews();
                        r41Var.f36220a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    r41Var.d(false);
                    return;
                }
                return;
            default:
                r41 r41Var2 = this.f35970b;
                if (r41Var2.h != null) {
                    r41Var2.h = null;
                    r41Var2.d(true);
                    return;
                }
                return;
        }
    }
}
