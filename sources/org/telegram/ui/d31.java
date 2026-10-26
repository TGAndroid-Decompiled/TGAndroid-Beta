package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class d31 extends AnimatorListenerAdapter {
    public final int f38728a;
    public final e31 f38729b;

    public d31(e31 e31Var, int i10) {
        this.f38728a = i10;
        this.f38729b = e31Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38728a) {
            case 0:
                e31 e31Var = this.f38729b;
                if (e31Var.h != null) {
                    e31Var.h = null;
                    e31Var.e = 0.0f;
                    e31Var.g();
                    e31Var.f38978n.unlock();
                    ax axVar = e31Var.f38974a;
                    if (axVar != null) {
                        axVar.onPause();
                        e31Var.f38974a.onFragmentDestroy();
                        e31Var.removeAllViews();
                        e31Var.f38974a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    e31Var.d(false);
                    return;
                }
                return;
            default:
                e31 e31Var2 = this.f38729b;
                if (e31Var2.h != null) {
                    e31Var2.h = null;
                    e31Var2.d(true);
                    return;
                }
                return;
        }
    }
}
