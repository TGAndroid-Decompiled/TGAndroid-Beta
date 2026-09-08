package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class n41 extends AnimatorListenerAdapter {
    public final int f38854a;
    public final o41 f38855b;

    public n41(o41 o41Var, int i10) {
        this.f38854a = i10;
        this.f38855b = o41Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38854a) {
            case 0:
                o41 o41Var = this.f38855b;
                if (o41Var.h != null) {
                    o41Var.h = null;
                    o41Var.f39130e = 0.0f;
                    o41Var.g();
                    o41Var.f39132n.unlock();
                    vx vxVar = o41Var.f39127a;
                    if (vxVar != null) {
                        vxVar.onPause();
                        o41Var.f39127a.onFragmentDestroy();
                        o41Var.removeAllViews();
                        o41Var.f39127a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    o41Var.d(false);
                    return;
                }
                return;
            default:
                o41 o41Var2 = this.f38855b;
                if (o41Var2.h != null) {
                    o41Var2.h = null;
                    o41Var2.d(true);
                    return;
                }
                return;
        }
    }
}
