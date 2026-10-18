package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class g31 extends AnimatorListenerAdapter {
    public final boolean f26468a;
    public final q31 f26469b;

    public g31(q31 q31Var, boolean z10) {
        this.f26469b = q31Var;
        this.f26468a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        q31 q31Var = this.f26469b;
        long j10 = q31Var.f29560c;
        if (q31Var.U == animator) {
            boolean z10 = this.f26468a;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            q31Var.R = f7;
            q31Var.n();
            q31Var.S = false;
            ImageView imageView = q31Var.E;
            if (q31Var.P) {
                i10 = R.drawable.menu_sidebar_top;
            } else {
                i10 = R.drawable.menu_sidebar_bottom;
            }
            imageView.setImageResource(i10);
            q31Var.U = null;
            MessagesController.getInstance(q31Var.f29558b).getMainSettings().edit().putBoolean(a1.g.o(j10, "topicssidetabs"), q31Var.Q).putBoolean(a1.g.o(j10, "topicssidetabsb"), q31Var.P).apply();
            Boolean bool = q31Var.T;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = q31Var.T.booleanValue();
                q31Var.T = null;
                q31Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new fr0(this, 19));
        }
    }
}
