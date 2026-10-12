package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class m41 extends AnimatorListenerAdapter {
    public final int f39908a;
    public final n41 f39909b;

    public m41(n41 n41Var, int i10) {
        this.f39908a = i10;
        this.f39909b = n41Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39908a) {
            case 0:
                n41 n41Var = this.f39909b;
                if (n41Var.h != null) {
                    n41Var.h = null;
                    n41Var.f40204e = 0.0f;
                    n41Var.g();
                    n41Var.f40206n.unlock();
                    wx wxVar = n41Var.f40201a;
                    if (wxVar != null) {
                        wxVar.onPause();
                        n41Var.f40201a.onFragmentDestroy();
                        n41Var.removeAllViews();
                        n41Var.f40201a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    n41Var.d(false);
                    return;
                }
                return;
            default:
                n41 n41Var2 = this.f39909b;
                if (n41Var2.h != null) {
                    n41Var2.h = null;
                    n41Var2.d(true);
                    return;
                }
                return;
        }
    }
}
