package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class j41 extends AnimatorListenerAdapter {
    public final int f38867a;
    public final k41 f38868b;

    public j41(k41 k41Var, int i10) {
        this.f38867a = i10;
        this.f38868b = k41Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38867a) {
            case 0:
                k41 k41Var = this.f38868b;
                if (k41Var.h != null) {
                    k41Var.h = null;
                    k41Var.f39229e = 0.0f;
                    k41Var.g();
                    k41Var.f39231n.unlock();
                    tx txVar = k41Var.f39226a;
                    if (txVar != null) {
                        txVar.onPause();
                        k41Var.f39226a.onFragmentDestroy();
                        k41Var.removeAllViews();
                        k41Var.f39226a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    k41Var.d(false);
                    return;
                }
                return;
            default:
                k41 k41Var2 = this.f38868b;
                if (k41Var2.h != null) {
                    k41Var2.h = null;
                    k41Var2.d(true);
                    return;
                }
                return;
        }
    }
}
