package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class i31 extends AnimatorListenerAdapter {
    public final boolean f27118a;
    public final s31 f27119b;

    public i31(s31 s31Var, boolean z10) {
        this.f27119b = s31Var;
        this.f27118a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        s31 s31Var = this.f27119b;
        long j10 = s31Var.f30186c;
        if (s31Var.U == animator) {
            boolean z10 = this.f27118a;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            s31Var.R = f7;
            s31Var.n();
            s31Var.S = false;
            ImageView imageView = s31Var.E;
            if (s31Var.P) {
                i10 = R.drawable.menu_sidebar_top;
            } else {
                i10 = R.drawable.menu_sidebar_bottom;
            }
            imageView.setImageResource(i10);
            s31Var.U = null;
            MessagesController.getInstance(s31Var.f30184b).getMainSettings().edit().putBoolean(a1.g.o(j10, "topicssidetabs"), s31Var.Q).putBoolean(a1.g.o(j10, "topicssidetabsb"), s31Var.P).apply();
            Boolean bool = s31Var.T;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = s31Var.T.booleanValue();
                s31Var.T = null;
                s31Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new hr0(this, 19));
        }
    }
}
