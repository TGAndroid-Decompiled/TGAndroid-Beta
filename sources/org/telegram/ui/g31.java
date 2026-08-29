package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class g31 extends AnimatorListenerAdapter {
    public final int f38447a;
    public final h31 f38448b;

    public g31(h31 h31Var, int i10) {
        this.f38447a = i10;
        this.f38448b = h31Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38447a) {
            case 0:
                h31 h31Var = this.f38448b;
                if (h31Var.h != null) {
                    h31Var.h = null;
                    h31Var.f38759e = 0.0f;
                    h31Var.g();
                    h31Var.f38761n.unlock();
                    hx hxVar = h31Var.f38756a;
                    if (hxVar != null) {
                        hxVar.onPause();
                        h31Var.f38756a.onFragmentDestroy();
                        h31Var.removeAllViews();
                        h31Var.f38756a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    h31Var.d(false);
                    return;
                }
                return;
            default:
                h31 h31Var2 = this.f38448b;
                if (h31Var2.h != null) {
                    h31Var2.h = null;
                    h31Var2.d(true);
                    return;
                }
                return;
        }
    }
}
