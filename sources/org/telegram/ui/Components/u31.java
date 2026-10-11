package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class u31 extends AnimatorListenerAdapter {
    public final boolean f31428a;
    public final d41 f31429b;

    public u31(d41 d41Var, boolean z10) {
        this.f31429b = d41Var;
        this.f31428a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        d41 d41Var = this.f31429b;
        long j3 = d41Var.f25612c;
        if (d41Var.U == animator) {
            boolean z10 = this.f31428a;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            d41Var.R = f7;
            d41Var.o();
            d41Var.S = false;
            ImageView imageView = d41Var.E;
            if (d41Var.P) {
                i10 = R.drawable.menu_sidebar_top;
            } else {
                i10 = R.drawable.menu_sidebar_bottom;
            }
            imageView.setImageResource(i10);
            d41Var.U = null;
            MessagesController.getInstance(d41Var.f25610b).getMainSettings().edit().putBoolean(a1.g.p(j3, "topicssidetabs"), d41Var.Q).putBoolean(a1.g.p(j3, "topicssidetabsb"), d41Var.P).apply();
            Boolean bool = d41Var.T;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = d41Var.T.booleanValue();
                d41Var.T = null;
                d41Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new pr0(this, 20));
        }
    }
}
