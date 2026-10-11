package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class v31 extends AnimatorListenerAdapter {
    public final boolean f31669a;
    public final e41 f31670b;

    public v31(e41 e41Var, boolean z10) {
        this.f31670b = e41Var;
        this.f31669a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        e41 e41Var = this.f31670b;
        long j3 = e41Var.f25844c;
        if (e41Var.U == animator) {
            boolean z10 = this.f31669a;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            e41Var.R = f7;
            e41Var.o();
            e41Var.S = false;
            ImageView imageView = e41Var.E;
            if (e41Var.P) {
                i10 = R.drawable.menu_sidebar_top;
            } else {
                i10 = R.drawable.menu_sidebar_bottom;
            }
            imageView.setImageResource(i10);
            e41Var.U = null;
            MessagesController.getInstance(e41Var.f25842b).getMainSettings().edit().putBoolean(a1.g.p(j3, "topicssidetabs"), e41Var.Q).putBoolean(a1.g.p(j3, "topicssidetabsb"), e41Var.P).apply();
            Boolean bool = e41Var.T;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = e41Var.T.booleanValue();
                e41Var.T = null;
                e41Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new qr0(this, 19));
        }
    }
}
