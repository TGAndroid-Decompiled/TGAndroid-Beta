package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class c31 extends AnimatorListenerAdapter {
    public final boolean f23136a;
    public final l31 f23137b;

    public c31(l31 l31Var, boolean z10) {
        this.f23137b = l31Var;
        this.f23136a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        l31 l31Var = this.f23137b;
        long j3 = l31Var.f26014c;
        if (l31Var.U == animator) {
            boolean z10 = this.f23136a;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            l31Var.R = f7;
            l31Var.n();
            l31Var.S = false;
            ImageView imageView = l31Var.E;
            if (l31Var.P) {
                i10 = R.drawable.menu_sidebar_top;
            } else {
                i10 = R.drawable.menu_sidebar_bottom;
            }
            imageView.setImageResource(i10);
            l31Var.U = null;
            MessagesController.getInstance(l31Var.f26012b).getMainSettings().edit().putBoolean(a4.a.o(j3, "topicssidetabs"), l31Var.Q).putBoolean(a4.a.o(j3, "topicssidetabsb"), l31Var.P).apply();
            Boolean bool = l31Var.T;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = l31Var.T.booleanValue();
                l31Var.T = null;
                l31Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new wq0(this, 19));
        }
    }
}
