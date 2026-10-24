package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class l31 extends AnimatorListenerAdapter {
    public final boolean f28159a;
    public final v31 f28160b;

    public l31(v31 v31Var, boolean z10) {
        this.f28160b = v31Var;
        this.f28159a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        v31 v31Var = this.f28160b;
        long j10 = v31Var.f31300c;
        if (v31Var.f31297a0 == animator) {
            boolean z10 = this.f28159a;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            v31Var.R = f7;
            v31Var.p();
            v31Var.S = false;
            ImageView imageView = v31Var.E;
            if (v31Var.P) {
                i10 = R.drawable.menu_sidebar_top;
            } else {
                i10 = R.drawable.menu_sidebar_bottom;
            }
            imageView.setImageResource(i10);
            v31Var.f31297a0 = null;
            MessagesController.getInstance(v31Var.f31298b).getMainSettings().edit().putBoolean(a1.g.o(j10, "topicssidetabs"), v31Var.Q).putBoolean(a1.g.o(j10, "topicssidetabsb"), v31Var.P).apply();
            Boolean bool = v31Var.W;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = v31Var.W.booleanValue();
                v31Var.W = null;
                v31Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new jr0(this, 20));
        }
    }
}
