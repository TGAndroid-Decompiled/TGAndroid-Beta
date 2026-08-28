package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class g31 extends AnimatorListenerAdapter {
    public final int f38423a;
    public final h31 f38424b;

    public g31(h31 h31Var, int i9) {
        this.f38423a = i9;
        this.f38424b = h31Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38423a) {
            case 0:
                h31 h31Var = this.f38424b;
                if (h31Var.h != null) {
                    h31Var.h = null;
                    h31Var.f38664e = 0.0f;
                    h31Var.g();
                    h31Var.f38666n.unlock();
                    fx fxVar = h31Var.f38661a;
                    if (fxVar != null) {
                        fxVar.onPause();
                        h31Var.f38661a.onFragmentDestroy();
                        h31Var.removeAllViews();
                        h31Var.f38661a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    h31Var.d(false);
                    return;
                }
                return;
            default:
                h31 h31Var2 = this.f38424b;
                if (h31Var2.h != null) {
                    h31Var2.h = null;
                    h31Var2.d(true);
                    return;
                }
                return;
        }
    }
}
