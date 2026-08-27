package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

public final class u11 extends AnimatorListenerAdapter {

    public final boolean f32947a;

    public final d21 f32948b;

    public u11(d21 d21Var, boolean z10) {
        this.f32948b = d21Var;
        this.f32947a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        d21 d21Var = this.f32948b;
        long j10 = d21Var.f27626c;
        if (d21Var.Q == animator) {
            boolean z10 = this.f32947a;
            d21Var.N = z10 ? 1.0f : 0.0f;
            d21Var.n();
            d21Var.O = false;
            d21Var.A.setImageResource(d21Var.L ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
            d21Var.Q = null;
            MessagesController.getInstance(d21Var.f27625b).getMainSettings().edit().putBoolean(a9.p.l(j10, "topicssidetabs"), d21Var.M).putBoolean(a9.p.l(j10, "topicssidetabsb"), d21Var.L).apply();
            Boolean bool = d21Var.P;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean zBooleanValue = d21Var.P.booleanValue();
                d21Var.P = null;
                d21Var.d(zBooleanValue);
            }
            AndroidUtilities.runOnUIThread(new up0(this, 19));
        }
    }
}
