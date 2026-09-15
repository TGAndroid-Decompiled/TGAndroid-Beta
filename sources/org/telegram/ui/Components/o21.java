package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class o21 extends AnimatorListenerAdapter {
    public final boolean f26668a;
    public final x21 f26669b;

    public o21(x21 x21Var, boolean z10) {
        this.f26669b = x21Var;
        this.f26668a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        x21 x21Var = this.f26669b;
        long j3 = x21Var.f29873c;
        if (x21Var.U == animator) {
            boolean z10 = this.f26668a;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            x21Var.R = f7;
            x21Var.n();
            x21Var.S = false;
            ImageView imageView = x21Var.E;
            if (x21Var.P) {
                i10 = R.drawable.menu_sidebar_top;
            } else {
                i10 = R.drawable.menu_sidebar_bottom;
            }
            imageView.setImageResource(i10);
            x21Var.U = null;
            MessagesController.getInstance(x21Var.f29871b).getMainSettings().edit().putBoolean(a4.a.o(j3, "topicssidetabs"), x21Var.Q).putBoolean(a4.a.o(j3, "topicssidetabsb"), x21Var.P).apply();
            Boolean bool = x21Var.T;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = x21Var.T.booleanValue();
                x21Var.T = null;
                x21Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new jq0(this, 19));
        }
    }
}
