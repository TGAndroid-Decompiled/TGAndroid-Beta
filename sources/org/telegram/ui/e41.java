package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class e41 extends AnimatorListenerAdapter {
    public final int f35900a;
    public final f41 f35901b;

    public e41(f41 f41Var, int i10) {
        this.f35900a = i10;
        this.f35901b = f41Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35900a) {
            case 0:
                f41 f41Var = this.f35901b;
                if (f41Var.h != null) {
                    f41Var.h = null;
                    f41Var.f36180e = 0.0f;
                    f41Var.g();
                    f41Var.f36182n.unlock();
                    tx txVar = f41Var.f36177a;
                    if (txVar != null) {
                        txVar.onPause();
                        f41Var.f36177a.onFragmentDestroy();
                        f41Var.removeAllViews();
                        f41Var.f36177a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    f41Var.d(false);
                    return;
                }
                return;
            default:
                f41 f41Var2 = this.f35901b;
                if (f41Var2.h != null) {
                    f41Var2.h = null;
                    f41Var2.d(true);
                    return;
                }
                return;
        }
    }
}
