package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class t31 extends AnimatorListenerAdapter {
    public final boolean f30983a;
    public final c41 f30984b;

    public t31(c41 c41Var, boolean z10) {
        this.f30984b = c41Var;
        this.f30983a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        c41 c41Var = this.f30984b;
        long j3 = c41Var.f25239c;
        if (c41Var.U == animator) {
            boolean z10 = this.f30983a;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            c41Var.R = f7;
            c41Var.o();
            c41Var.S = false;
            ImageView imageView = c41Var.E;
            if (c41Var.P) {
                i10 = R.drawable.menu_sidebar_top;
            } else {
                i10 = R.drawable.menu_sidebar_bottom;
            }
            imageView.setImageResource(i10);
            c41Var.U = null;
            MessagesController.getInstance(c41Var.f25237b).getMainSettings().edit().putBoolean(a1.g.p(j3, "topicssidetabs"), c41Var.Q).putBoolean(a1.g.p(j3, "topicssidetabsb"), c41Var.P).apply();
            Boolean bool = c41Var.T;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = c41Var.T.booleanValue();
                c41Var.T = null;
                c41Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new or0(this, 19));
        }
    }
}
