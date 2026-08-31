package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class o21 extends AnimatorListenerAdapter {
    public final boolean f29658a;
    public final x21 f29659b;

    public o21(x21 x21Var, boolean z4) {
        this.f29659b = x21Var;
        this.f29658a = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        int i10;
        x21 x21Var = this.f29659b;
        long j10 = x21Var.f32930c;
        if (x21Var.R == animator) {
            boolean z4 = this.f29658a;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            x21Var.O = f10;
            x21Var.n();
            x21Var.P = false;
            ImageView imageView = x21Var.B;
            if (x21Var.M) {
                i10 = R.drawable.menu_sidebar_top;
            } else {
                i10 = R.drawable.menu_sidebar_bottom;
            }
            imageView.setImageResource(i10);
            x21Var.R = null;
            MessagesController.getInstance(x21Var.f32928b).getMainSettings().edit().putBoolean(android.support.v4.media.a.n(j10, "topicssidetabs"), x21Var.N).putBoolean(android.support.v4.media.a.n(j10, "topicssidetabsb"), x21Var.M).apply();
            Boolean bool = x21Var.Q;
            if (bool != null && z4 != bool.booleanValue()) {
                boolean booleanValue = x21Var.Q.booleanValue();
                x21Var.Q = null;
                x21Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new oq0(this, 19));
        }
    }
}
