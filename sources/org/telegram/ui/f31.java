package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

public final class f31 extends AnimatorListenerAdapter {

    public final int f37927a;

    public final g31 f37928b;

    public f31(g31 g31Var, int i10) {
        this.f37927a = i10;
        this.f37928b = g31Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37927a) {
            case 0:
                g31 g31Var = this.f37928b;
                if (g31Var.h != null) {
                    g31Var.h = null;
                    g31Var.f38299e = 0.0f;
                    g31Var.g();
                    g31Var.f38301n.unlock();
                    ix ixVar = g31Var.f38296a;
                    if (ixVar != null) {
                        ixVar.onPause();
                        g31Var.f38296a.onFragmentDestroy();
                        g31Var.removeAllViews();
                        g31Var.f38296a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    g31Var.d(false);
                    break;
                }
                break;
            default:
                g31 g31Var2 = this.f37928b;
                if (g31Var2.h != null) {
                    g31Var2.h = null;
                    g31Var2.d(true);
                    break;
                }
                break;
        }
    }
}
