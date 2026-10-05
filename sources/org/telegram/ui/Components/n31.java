package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class n31 extends AnimatorListenerAdapter {
    public final boolean f28958a;
    public final w31 f28959b;

    public n31(w31 w31Var, boolean z10) {
        this.f28959b = w31Var;
        this.f28958a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        w31 w31Var = this.f28959b;
        long j3 = w31Var.f32502c;
        if (w31Var.U == animator) {
            boolean z10 = this.f28958a;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            w31Var.R = f7;
            w31Var.n();
            w31Var.S = false;
            ImageView imageView = w31Var.E;
            if (w31Var.P) {
                i10 = R.drawable.menu_sidebar_top;
            } else {
                i10 = R.drawable.menu_sidebar_bottom;
            }
            imageView.setImageResource(i10);
            w31Var.U = null;
            MessagesController.getInstance(w31Var.f32500b).getMainSettings().edit().putBoolean(a4.a.p(j3, "topicssidetabs"), w31Var.Q).putBoolean(a4.a.p(j3, "topicssidetabsb"), w31Var.P).apply();
            Boolean bool = w31Var.T;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = w31Var.T.booleanValue();
                w31Var.T = null;
                w31Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new gq0(this, 22));
        }
    }
}
