package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class m31 extends AnimatorListenerAdapter {
    public final boolean f28497a;
    public final w31 f28498b;

    public m31(w31 w31Var, boolean z10) {
        this.f28498b = w31Var;
        this.f28497a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        w31 w31Var = this.f28498b;
        long j10 = w31Var.f32134c;
        if (w31Var.f32131a0 == animator) {
            boolean z10 = this.f28497a;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            w31Var.R = f7;
            w31Var.p();
            w31Var.S = false;
            ImageView imageView = w31Var.E;
            if (w31Var.P) {
                i10 = R.drawable.menu_sidebar_top;
            } else {
                i10 = R.drawable.menu_sidebar_bottom;
            }
            imageView.setImageResource(i10);
            w31Var.f32131a0 = null;
            MessagesController.getInstance(w31Var.f32132b).getMainSettings().edit().putBoolean(a1.g.o(j10, "topicssidetabs"), w31Var.Q).putBoolean(a1.g.o(j10, "topicssidetabsb"), w31Var.P).apply();
            Boolean bool = w31Var.W;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = w31Var.W.booleanValue();
                w31Var.W = null;
                w31Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new kr0(this, 20));
        }
    }
}
