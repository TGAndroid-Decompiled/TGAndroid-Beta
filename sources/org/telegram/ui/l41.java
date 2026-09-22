package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class l41 extends AnimatorListenerAdapter {
    public final int f35321a;
    public final m41 f35322b;

    public l41(m41 m41Var, int i10) {
        this.f35321a = i10;
        this.f35322b = m41Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35321a) {
            case 0:
                m41 m41Var = this.f35322b;
                if (m41Var.h != null) {
                    m41Var.h = null;
                    m41Var.e = 0.0f;
                    m41Var.g();
                    m41Var.f35600n.unlock();
                    vx vxVar = m41Var.f35596a;
                    if (vxVar != null) {
                        vxVar.onPause();
                        m41Var.f35596a.onFragmentDestroy();
                        m41Var.removeAllViews();
                        m41Var.f35596a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    m41Var.d(false);
                    return;
                }
                return;
            default:
                m41 m41Var2 = this.f35322b;
                if (m41Var2.h != null) {
                    m41Var2.h = null;
                    m41Var2.d(true);
                    return;
                }
                return;
        }
    }
}
