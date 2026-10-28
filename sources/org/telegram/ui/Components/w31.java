package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class w31 extends AnimatorListenerAdapter {
    public final boolean f34438a;
    public final f41 f34439b;

    public w31(f41 f41Var, boolean z10) {
        this.f34439b = f41Var;
        this.f34438a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        f41 f41Var = this.f34439b;
        long j10 = f41Var.f28015c;
        if (f41Var.f28012a0 == animator) {
            boolean z10 = this.f34438a;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            f41Var.R = f7;
            f41Var.o();
            f41Var.S = false;
            ImageView imageView = f41Var.E;
            if (f41Var.P) {
                i10 = R.drawable.menu_sidebar_top;
            } else {
                i10 = R.drawable.menu_sidebar_bottom;
            }
            imageView.setImageResource(i10);
            f41Var.f28012a0 = null;
            MessagesController.getInstance(f41Var.f28013b).getMainSettings().edit().putBoolean(a1.g.o(j10, "topicssidetabs"), f41Var.Q).putBoolean(a1.g.o(j10, "topicssidetabsb"), f41Var.P).apply();
            Boolean bool = f41Var.W;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = f41Var.W.booleanValue();
                f41Var.W = null;
                f41Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new np0(this, 25));
        }
    }
}
