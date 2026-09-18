package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class p21 extends AnimatorListenerAdapter {
    public final boolean f26921a;
    public final y21 f26922b;

    public p21(y21 y21Var, boolean z10) {
        this.f26922b = y21Var;
        this.f26921a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        y21 y21Var = this.f26922b;
        long j3 = y21Var.f30103c;
        if (y21Var.U == animator) {
            boolean z10 = this.f26921a;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            y21Var.R = f7;
            y21Var.n();
            y21Var.S = false;
            ImageView imageView = y21Var.E;
            if (y21Var.P) {
                i10 = R.drawable.menu_sidebar_top;
            } else {
                i10 = R.drawable.menu_sidebar_bottom;
            }
            imageView.setImageResource(i10);
            y21Var.U = null;
            MessagesController.getInstance(y21Var.f30101b).getMainSettings().edit().putBoolean(a4.a.o(j3, "topicssidetabs"), y21Var.Q).putBoolean(a4.a.o(j3, "topicssidetabsb"), y21Var.P).apply();
            Boolean bool = y21Var.T;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = y21Var.T.booleanValue();
                y21Var.T = null;
                y21Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new kq0(this, 19));
        }
    }
}
