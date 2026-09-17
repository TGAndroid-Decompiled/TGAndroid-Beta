package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class n41 extends AnimatorListenerAdapter {
    public final int f38828a;
    public final o41 f38829b;

    public n41(o41 o41Var, int i10) {
        this.f38828a = i10;
        this.f38829b = o41Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38828a) {
            case 0:
                o41 o41Var = this.f38829b;
                if (o41Var.h != null) {
                    o41Var.h = null;
                    o41Var.f39104e = 0.0f;
                    o41Var.g();
                    o41Var.f39106n.unlock();
                    vx vxVar = o41Var.f39101a;
                    if (vxVar != null) {
                        vxVar.onPause();
                        o41Var.f39101a.onFragmentDestroy();
                        o41Var.removeAllViews();
                        o41Var.f39101a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    o41Var.d(false);
                    return;
                }
                return;
            default:
                o41 o41Var2 = this.f38829b;
                if (o41Var2.h != null) {
                    o41Var2.h = null;
                    o41Var2.d(true);
                    return;
                }
                return;
        }
    }
}
