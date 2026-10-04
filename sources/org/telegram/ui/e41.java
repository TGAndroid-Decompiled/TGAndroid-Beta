package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class e41 extends AnimatorListenerAdapter {
    public final int f35901a;
    public final f41 f35902b;

    public e41(f41 f41Var, int i10) {
        this.f35901a = i10;
        this.f35902b = f41Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35901a) {
            case 0:
                f41 f41Var = this.f35902b;
                if (f41Var.h != null) {
                    f41Var.h = null;
                    f41Var.f36181e = 0.0f;
                    f41Var.g();
                    f41Var.f36183n.unlock();
                    tx txVar = f41Var.f36178a;
                    if (txVar != null) {
                        txVar.onPause();
                        f41Var.f36178a.onFragmentDestroy();
                        f41Var.removeAllViews();
                        f41Var.f36178a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    f41Var.d(false);
                    return;
                }
                return;
            default:
                f41 f41Var2 = this.f35902b;
                if (f41Var2.h != null) {
                    f41Var2.h = null;
                    f41Var2.d(true);
                    return;
                }
                return;
        }
    }
}
