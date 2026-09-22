package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class e31 extends AnimatorListenerAdapter {
    public final boolean f23856a;
    public final n31 f23857b;

    public e31(n31 n31Var, boolean z10) {
        this.f23857b = n31Var;
        this.f23856a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        n31 n31Var = this.f23857b;
        long j3 = n31Var.f26612c;
        if (n31Var.U == animator) {
            boolean z10 = this.f23856a;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            n31Var.R = f7;
            n31Var.n();
            n31Var.S = false;
            ImageView imageView = n31Var.E;
            if (n31Var.P) {
                i10 = R.drawable.menu_sidebar_top;
            } else {
                i10 = R.drawable.menu_sidebar_bottom;
            }
            imageView.setImageResource(i10);
            n31Var.U = null;
            MessagesController.getInstance(n31Var.f26610b).getMainSettings().edit().putBoolean(a4.a.o(j3, "topicssidetabs"), n31Var.Q).putBoolean(a4.a.o(j3, "topicssidetabsb"), n31Var.P).apply();
            Boolean bool = n31Var.T;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = n31Var.T.booleanValue();
                n31Var.T = null;
                n31Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new yq0(this, 20));
        }
    }
}
