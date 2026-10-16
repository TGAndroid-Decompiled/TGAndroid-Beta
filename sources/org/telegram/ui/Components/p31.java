package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class p31 extends AnimatorListenerAdapter {
    public final boolean f27832a;
    public final y31 f27833b;

    public p31(y31 y31Var, boolean z10) {
        this.f27833b = y31Var;
        this.f27832a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        y31 y31Var = this.f27833b;
        long j10 = y31Var.f31136c;
        if (y31Var.U == animator) {
            boolean z10 = this.f27832a;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            y31Var.R = f7;
            y31Var.n();
            y31Var.S = false;
            ImageView imageView = y31Var.E;
            if (y31Var.P) {
                i10 = R.drawable.menu_sidebar_top;
            } else {
                i10 = R.drawable.menu_sidebar_bottom;
            }
            imageView.setImageResource(i10);
            y31Var.U = null;
            MessagesController.getInstance(y31Var.f31134b).getMainSettings().edit().putBoolean(a1.g.o(j10, "topicssidetabs"), y31Var.Q).putBoolean(a1.g.o(j10, "topicssidetabsb"), y31Var.P).apply();
            Boolean bool = y31Var.T;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = y31Var.T.booleanValue();
                y31Var.T = null;
                y31Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new kr0(this, 20));
        }
    }
}
