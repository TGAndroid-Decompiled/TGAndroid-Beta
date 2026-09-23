package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class n21 extends AnimatorListenerAdapter {
    public final boolean f26328a;
    public final w21 f26329b;

    public n21(w21 w21Var, boolean z10) {
        this.f26329b = w21Var;
        this.f26328a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        w21 w21Var = this.f26329b;
        long j3 = w21Var.f29481c;
        if (w21Var.U == animator) {
            boolean z10 = this.f26328a;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            w21Var.R = f7;
            w21Var.n();
            w21Var.S = false;
            ImageView imageView = w21Var.E;
            if (w21Var.P) {
                i10 = R.drawable.menu_sidebar_top;
            } else {
                i10 = R.drawable.menu_sidebar_bottom;
            }
            imageView.setImageResource(i10);
            w21Var.U = null;
            MessagesController.getInstance(w21Var.f29479b).getMainSettings().edit().putBoolean(a4.a.p(j3, "topicssidetabs"), w21Var.Q).putBoolean(a4.a.p(j3, "topicssidetabsb"), w21Var.P).apply();
            Boolean bool = w21Var.T;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = w21Var.T.booleanValue();
                w21Var.T = null;
                w21Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new jq0(this, 19));
        }
    }
}
