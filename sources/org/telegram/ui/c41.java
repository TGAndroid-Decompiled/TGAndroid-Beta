package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class c41 extends AnimatorListenerAdapter {
    public final int f32558a;
    public final d41 f32559b;

    public c41(d41 d41Var, int i10) {
        this.f32558a = i10;
        this.f32559b = d41Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32558a) {
            case 0:
                d41 d41Var = this.f32559b;
                if (d41Var.h != null) {
                    d41Var.h = null;
                    d41Var.e = 0.0f;
                    d41Var.g();
                    d41Var.f32914n.unlock();
                    rx rxVar = d41Var.f32910a;
                    if (rxVar != null) {
                        rxVar.onPause();
                        d41Var.f32910a.onFragmentDestroy();
                        d41Var.removeAllViews();
                        d41Var.f32910a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    d41Var.d(false);
                    return;
                }
                return;
            default:
                d41 d41Var2 = this.f32559b;
                if (d41Var2.h != null) {
                    d41Var2.h = null;
                    d41Var2.d(true);
                    return;
                }
                return;
        }
    }
}
