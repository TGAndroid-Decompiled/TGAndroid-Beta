package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class a31 extends AnimatorListenerAdapter {
    public final int f35564a;
    public final b31 f35565b;

    public a31(b31 b31Var, int i10) {
        this.f35564a = i10;
        this.f35565b = b31Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35564a) {
            case 0:
                b31 b31Var = this.f35565b;
                if (b31Var.h != null) {
                    b31Var.h = null;
                    b31Var.e = 0.0f;
                    b31Var.g();
                    b31Var.f35841n.unlock();
                    fx fxVar = b31Var.f35837a;
                    if (fxVar != null) {
                        fxVar.onPause();
                        b31Var.f35837a.onFragmentDestroy();
                        b31Var.removeAllViews();
                        b31Var.f35837a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    b31Var.d(false);
                    return;
                }
                return;
            default:
                b31 b31Var2 = this.f35565b;
                if (b31Var2.h != null) {
                    b31Var2.h = null;
                    b31Var2.d(true);
                    return;
                }
                return;
        }
    }
}
