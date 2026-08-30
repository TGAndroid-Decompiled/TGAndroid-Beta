package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class n21 extends AnimatorListenerAdapter {
    public final boolean f27168a;
    public final w21 f27169b;

    public n21(w21 w21Var, boolean z4) {
        this.f27169b = w21Var;
        this.f27168a = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        int i10;
        w21 w21Var = this.f27169b;
        long j10 = w21Var.f30176c;
        if (w21Var.R == animator) {
            boolean z4 = this.f27168a;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            w21Var.O = f10;
            w21Var.n();
            w21Var.P = false;
            ImageView imageView = w21Var.B;
            if (w21Var.M) {
                i10 = R.drawable.menu_sidebar_top;
            } else {
                i10 = R.drawable.menu_sidebar_bottom;
            }
            imageView.setImageResource(i10);
            w21Var.R = null;
            MessagesController.getInstance(w21Var.f30174b).getMainSettings().edit().putBoolean(android.support.v4.media.a.n(j10, "topicssidetabs"), w21Var.N).putBoolean(android.support.v4.media.a.n(j10, "topicssidetabsb"), w21Var.M).apply();
            Boolean bool = w21Var.Q;
            if (bool != null && z4 != bool.booleanValue()) {
                boolean booleanValue = w21Var.Q.booleanValue();
                w21Var.Q = null;
                w21Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new nq0(this, 19));
        }
    }
}
