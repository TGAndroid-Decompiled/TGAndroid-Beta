package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class k41 extends AnimatorListenerAdapter {
    public final int f34988a;
    public final l41 f34989b;

    public k41(l41 l41Var, int i10) {
        this.f34988a = i10;
        this.f34989b = l41Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34988a) {
            case 0:
                l41 l41Var = this.f34989b;
                if (l41Var.h != null) {
                    l41Var.h = null;
                    l41Var.e = 0.0f;
                    l41Var.g();
                    l41Var.f35245n.unlock();
                    vx vxVar = l41Var.f35241a;
                    if (vxVar != null) {
                        vxVar.onPause();
                        l41Var.f35241a.onFragmentDestroy();
                        l41Var.removeAllViews();
                        l41Var.f35241a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    l41Var.d(false);
                    return;
                }
                return;
            default:
                l41 l41Var2 = this.f34989b;
                if (l41Var2.h != null) {
                    l41Var2.h = null;
                    l41Var2.d(true);
                    return;
                }
                return;
        }
    }
}
