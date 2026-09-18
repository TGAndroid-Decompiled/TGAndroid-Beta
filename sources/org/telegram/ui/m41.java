package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class m41 extends AnimatorListenerAdapter {
    public final int f35686a;
    public final n41 f35687b;

    public m41(n41 n41Var, int i10) {
        this.f35686a = i10;
        this.f35687b = n41Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35686a) {
            case 0:
                n41 n41Var = this.f35687b;
                if (n41Var.h != null) {
                    n41Var.h = null;
                    n41Var.e = 0.0f;
                    n41Var.g();
                    n41Var.f35942n.unlock();
                    xx xxVar = n41Var.f35938a;
                    if (xxVar != null) {
                        xxVar.onPause();
                        n41Var.f35938a.onFragmentDestroy();
                        n41Var.removeAllViews();
                        n41Var.f35938a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    n41Var.d(false);
                    return;
                }
                return;
            default:
                n41 n41Var2 = this.f35687b;
                if (n41Var2.h != null) {
                    n41Var2.h = null;
                    n41Var2.d(true);
                    return;
                }
                return;
        }
    }
}
