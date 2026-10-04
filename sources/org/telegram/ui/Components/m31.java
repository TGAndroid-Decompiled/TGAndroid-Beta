package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class m31 extends AnimatorListenerAdapter {
    public final boolean f28518a;
    public final v31 f28519b;

    public m31(v31 v31Var, boolean z10) {
        this.f28519b = v31Var;
        this.f28518a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        v31 v31Var = this.f28519b;
        long j3 = v31Var.f31554c;
        if (v31Var.U == animator) {
            boolean z10 = this.f28518a;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            v31Var.R = f7;
            v31Var.n();
            v31Var.S = false;
            ImageView imageView = v31Var.E;
            if (v31Var.P) {
                i10 = R.drawable.menu_sidebar_top;
            } else {
                i10 = R.drawable.menu_sidebar_bottom;
            }
            imageView.setImageResource(i10);
            v31Var.U = null;
            MessagesController.getInstance(v31Var.f31552b).getMainSettings().edit().putBoolean(a4.a.p(j3, "topicssidetabs"), v31Var.Q).putBoolean(a4.a.p(j3, "topicssidetabsb"), v31Var.P).apply();
            Boolean bool = v31Var.T;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = v31Var.T.booleanValue();
                v31Var.T = null;
                v31Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new br0(this, 21));
        }
    }
}
