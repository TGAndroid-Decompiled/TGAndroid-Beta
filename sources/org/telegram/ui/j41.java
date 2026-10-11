package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class j41 extends AnimatorListenerAdapter {
    public final int f38833a;
    public final k41 f38834b;

    public j41(k41 k41Var, int i10) {
        this.f38833a = i10;
        this.f38834b = k41Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38833a) {
            case 0:
                k41 k41Var = this.f38834b;
                if (k41Var.h != null) {
                    k41Var.h = null;
                    k41Var.f39195e = 0.0f;
                    k41Var.g();
                    k41Var.f39197n.unlock();
                    tx txVar = k41Var.f39192a;
                    if (txVar != null) {
                        txVar.onPause();
                        k41Var.f39192a.onFragmentDestroy();
                        k41Var.removeAllViews();
                        k41Var.f39192a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    k41Var.d(false);
                    return;
                }
                return;
            default:
                k41 k41Var2 = this.f38834b;
                if (k41Var2.h != null) {
                    k41Var2.h = null;
                    k41Var2.d(true);
                    return;
                }
                return;
        }
    }
}
