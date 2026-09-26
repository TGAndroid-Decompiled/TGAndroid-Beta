package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class c41 extends AnimatorListenerAdapter {
    public final int f32557a;
    public final d41 f32558b;

    public c41(d41 d41Var, int i10) {
        this.f32557a = i10;
        this.f32558b = d41Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32557a) {
            case 0:
                d41 d41Var = this.f32558b;
                if (d41Var.h != null) {
                    d41Var.h = null;
                    d41Var.e = 0.0f;
                    d41Var.g();
                    d41Var.f32913n.unlock();
                    rx rxVar = d41Var.f32909a;
                    if (rxVar != null) {
                        rxVar.onPause();
                        d41Var.f32909a.onFragmentDestroy();
                        d41Var.removeAllViews();
                        d41Var.f32909a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    d41Var.d(false);
                    return;
                }
                return;
            default:
                d41 d41Var2 = this.f32558b;
                if (d41Var2.h != null) {
                    d41Var2.h = null;
                    d41Var2.d(true);
                    return;
                }
                return;
        }
    }
}
