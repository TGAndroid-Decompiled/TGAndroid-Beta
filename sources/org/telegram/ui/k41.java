package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class k41 extends AnimatorListenerAdapter {
    public final int f39077a;
    public final l41 f39078b;

    public k41(l41 l41Var, int i10) {
        this.f39077a = i10;
        this.f39078b = l41Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39077a) {
            case 0:
                l41 l41Var = this.f39078b;
                if (l41Var.h != null) {
                    l41Var.h = null;
                    l41Var.f39428e = 0.0f;
                    l41Var.g();
                    l41Var.f39430n.unlock();
                    ux uxVar = l41Var.f39425a;
                    if (uxVar != null) {
                        uxVar.onPause();
                        l41Var.f39425a.onFragmentDestroy();
                        l41Var.removeAllViews();
                        l41Var.f39425a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    l41Var.d(false);
                    return;
                }
                return;
            default:
                l41 l41Var2 = this.f39078b;
                if (l41Var2.h != null) {
                    l41Var2.h = null;
                    l41Var2.d(true);
                    return;
                }
                return;
        }
    }
}
