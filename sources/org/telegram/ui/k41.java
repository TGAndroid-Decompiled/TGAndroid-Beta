package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class k41 extends AnimatorListenerAdapter {
    public final int f35026a;
    public final l41 f35027b;

    public k41(l41 l41Var, int i10) {
        this.f35026a = i10;
        this.f35027b = l41Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35026a) {
            case 0:
                l41 l41Var = this.f35027b;
                if (l41Var.h != null) {
                    l41Var.h = null;
                    l41Var.e = 0.0f;
                    l41Var.g();
                    l41Var.f35332n.unlock();
                    vx vxVar = l41Var.f35328a;
                    if (vxVar != null) {
                        vxVar.onPause();
                        l41Var.f35328a.onFragmentDestroy();
                        l41Var.removeAllViews();
                        l41Var.f35328a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    l41Var.d(false);
                    return;
                }
                return;
            default:
                l41 l41Var2 = this.f35027b;
                if (l41Var2.h != null) {
                    l41Var2.h = null;
                    l41Var2.d(true);
                    return;
                }
                return;
        }
    }
}
