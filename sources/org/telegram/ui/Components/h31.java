package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class h31 extends AnimatorListenerAdapter {
    public final boolean f26763a;
    public final r31 f26764b;

    public h31(r31 r31Var, boolean z10) {
        this.f26764b = r31Var;
        this.f26763a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        r31 r31Var = this.f26764b;
        long j10 = r31Var.f29816c;
        if (r31Var.U == animator) {
            boolean z10 = this.f26763a;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            r31Var.R = f7;
            r31Var.n();
            r31Var.S = false;
            ImageView imageView = r31Var.E;
            if (r31Var.P) {
                i10 = R.drawable.menu_sidebar_top;
            } else {
                i10 = R.drawable.menu_sidebar_bottom;
            }
            imageView.setImageResource(i10);
            r31Var.U = null;
            MessagesController.getInstance(r31Var.f29814b).getMainSettings().edit().putBoolean(a1.g.o(j10, "topicssidetabs"), r31Var.Q).putBoolean(a1.g.o(j10, "topicssidetabsb"), r31Var.P).apply();
            Boolean bool = r31Var.T;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = r31Var.T.booleanValue();
                r31Var.T = null;
                r31Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new gr0(this, 19));
        }
    }
}
