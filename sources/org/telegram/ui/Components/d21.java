package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class d21 extends AnimatorListenerAdapter {
    public final boolean f27644a;
    public final m21 f27645b;

    public d21(m21 m21Var, boolean z10) {
        this.f27645b = m21Var;
        this.f27644a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f9;
        int i10;
        m21 m21Var = this.f27645b;
        long j10 = m21Var.f30553c;
        if (m21Var.Q == animator) {
            boolean z10 = this.f27644a;
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            m21Var.N = f9;
            m21Var.n();
            m21Var.O = false;
            ImageView imageView = m21Var.A;
            if (m21Var.L) {
                i10 = R.drawable.menu_sidebar_top;
            } else {
                i10 = R.drawable.menu_sidebar_bottom;
            }
            imageView.setImageResource(i10);
            m21Var.Q = null;
            MessagesController.getInstance(m21Var.f30552b).getMainSettings().edit().putBoolean(a4.w.m(j10, "topicssidetabs"), m21Var.M).putBoolean(a4.w.m(j10, "topicssidetabsb"), m21Var.L).apply();
            Boolean bool = m21Var.P;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = m21Var.P.booleanValue();
                m21Var.P = null;
                m21Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new fq0(this, 19));
        }
    }
}
