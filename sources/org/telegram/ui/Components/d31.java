package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class d31 extends AnimatorListenerAdapter {
    public final boolean f23487a;
    public final m31 f23488b;

    public d31(m31 m31Var, boolean z10) {
        this.f23488b = m31Var;
        this.f23487a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        m31 m31Var = this.f23488b;
        long j3 = m31Var.f26274c;
        if (m31Var.U == animator) {
            boolean z10 = this.f23487a;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            m31Var.R = f7;
            m31Var.n();
            m31Var.S = false;
            ImageView imageView = m31Var.E;
            if (m31Var.P) {
                i10 = R.drawable.menu_sidebar_top;
            } else {
                i10 = R.drawable.menu_sidebar_bottom;
            }
            imageView.setImageResource(i10);
            m31Var.U = null;
            MessagesController.getInstance(m31Var.f26272b).getMainSettings().edit().putBoolean(a4.a.p(j3, "topicssidetabs"), m31Var.Q).putBoolean(a4.a.p(j3, "topicssidetabsb"), m31Var.P).apply();
            Boolean bool = m31Var.T;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = m31Var.T.booleanValue();
                m31Var.T = null;
                m31Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new yq0(this, 20));
        }
    }
}
