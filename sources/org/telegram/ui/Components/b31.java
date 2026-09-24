package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class b31 extends AnimatorListenerAdapter {
    public final boolean f22853a;
    public final k31 f22854b;

    public b31(k31 k31Var, boolean z10) {
        this.f22854b = k31Var;
        this.f22853a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        k31 k31Var = this.f22854b;
        long j3 = k31Var.f25618c;
        if (k31Var.U == animator) {
            boolean z10 = this.f22853a;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            k31Var.R = f7;
            k31Var.n();
            k31Var.S = false;
            ImageView imageView = k31Var.E;
            if (k31Var.P) {
                i10 = R.drawable.menu_sidebar_top;
            } else {
                i10 = R.drawable.menu_sidebar_bottom;
            }
            imageView.setImageResource(i10);
            k31Var.U = null;
            MessagesController.getInstance(k31Var.f25616b).getMainSettings().edit().putBoolean(a4.a.p(j3, "topicssidetabs"), k31Var.Q).putBoolean(a4.a.p(j3, "topicssidetabsb"), k31Var.P).apply();
            Boolean bool = k31Var.T;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = k31Var.T.booleanValue();
                k31Var.T = null;
                k31Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new wq0(this, 20));
        }
    }
}
