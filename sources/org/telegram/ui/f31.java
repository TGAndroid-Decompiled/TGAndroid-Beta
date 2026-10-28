package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class f31 extends AnimatorListenerAdapter {
    public final int f39146a;
    public final g31 f39147b;

    public f31(g31 g31Var, int i10) {
        this.f39146a = i10;
        this.f39147b = g31Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39146a) {
            case 0:
                g31 g31Var = this.f39147b;
                if (g31Var.h != null) {
                    g31Var.h = null;
                    g31Var.e = 0.0f;
                    g31Var.g();
                    g31Var.f39489n.unlock();
                    cx cxVar = g31Var.f39485a;
                    if (cxVar != null) {
                        cxVar.onPause();
                        g31Var.f39485a.onFragmentDestroy();
                        g31Var.removeAllViews();
                        g31Var.f39485a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    g31Var.d(false);
                    return;
                }
                return;
            default:
                g31 g31Var2 = this.f39147b;
                if (g31Var2.h != null) {
                    g31Var2.h = null;
                    g31Var2.d(true);
                    return;
                }
                return;
        }
    }
}
