package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class r11 extends AnimatorListenerAdapter {
    public final boolean f32057a;
    public final b21 f32058b;

    public r11(b21 b21Var, boolean z10) {
        this.f32058b = b21Var;
        this.f32057a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        int i9;
        b21 b21Var = this.f32058b;
        long j10 = b21Var.f27002c;
        if (b21Var.Q == animator) {
            boolean z10 = this.f32057a;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            b21Var.N = f10;
            b21Var.n();
            b21Var.O = false;
            ImageView imageView = b21Var.A;
            if (b21Var.L) {
                i9 = R.drawable.menu_sidebar_top;
            } else {
                i9 = R.drawable.menu_sidebar_bottom;
            }
            imageView.setImageResource(i9);
            b21Var.Q = null;
            MessagesController.getInstance(b21Var.f27001b).getMainSettings().edit().putBoolean(aa.d.m(j10, "topicssidetabs"), b21Var.M).putBoolean(aa.d.m(j10, "topicssidetabsb"), b21Var.L).apply();
            Boolean bool = b21Var.P;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = b21Var.P.booleanValue();
                b21Var.P = null;
                b21Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new tp0(this, 19));
        }
    }
}
