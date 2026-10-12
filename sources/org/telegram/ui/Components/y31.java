package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class y31 extends AnimatorListenerAdapter {
    public final boolean f32943a;
    public final h41 f32944b;

    public y31(h41 h41Var, boolean z10) {
        this.f32944b = h41Var;
        this.f32943a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        h41 h41Var = this.f32944b;
        long j3 = h41Var.f26642c;
        if (h41Var.U == animator) {
            boolean z10 = this.f32943a;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            h41Var.R = f7;
            h41Var.o();
            h41Var.S = false;
            ImageView imageView = h41Var.E;
            if (h41Var.P) {
                i10 = R.drawable.menu_sidebar_top;
            } else {
                i10 = R.drawable.menu_sidebar_bottom;
            }
            imageView.setImageResource(i10);
            h41Var.U = null;
            MessagesController.getInstance(h41Var.f26640b).getMainSettings().edit().putBoolean(a1.g.p(j3, "topicssidetabs"), h41Var.Q).putBoolean(a1.g.p(j3, "topicssidetabsb"), h41Var.P).apply();
            Boolean bool = h41Var.T;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = h41Var.T.booleanValue();
                h41Var.T = null;
                h41Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new ur0(this, 20));
        }
    }
}
