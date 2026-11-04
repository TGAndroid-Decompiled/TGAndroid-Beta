package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ly0 extends AnimatorListenerAdapter {
    public final int f47468a;
    public final my0 f47469b;

    public ly0(my0 my0Var, int i3) {
        this.f47468a = i3;
        this.f47469b = my0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47468a) {
            case 0:
                my0 my0Var = this.f47469b;
                if (my0Var.h != null) {
                    my0Var.h = null;
                    my0Var.f47828e = 0.0f;
                    my0Var.g();
                    my0Var.f47830n.e();
                    wv wvVar = my0Var.f47825a;
                    if (wvVar != null) {
                        wvVar.onPause();
                        my0Var.f47825a.onFragmentDestroy();
                        my0Var.removeAllViews();
                        my0Var.f47825a = null;
                        org.telegram.messenger.hs.e().k(268, new Object[0]);
                    }
                    my0Var.d(false);
                    return;
                }
                return;
            default:
                my0 my0Var2 = this.f47469b;
                if (my0Var2.h != null) {
                    my0Var2.h = null;
                    my0Var2.d(true);
                    return;
                }
                return;
        }
    }
}
