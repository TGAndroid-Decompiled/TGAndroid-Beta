package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class v31 extends AnimatorListenerAdapter {
    public final boolean f33562a;
    public final e41 f33563b;

    public v31(e41 e41Var, boolean z10) {
        this.f33563b = e41Var;
        this.f33562a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        e41 e41Var = this.f33563b;
        long j10 = e41Var.f27729c;
        if (e41Var.f27726a0 == animator) {
            boolean z10 = this.f33562a;
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
            e41Var.f27726a0 = null;
            MessagesController.getInstance(e41Var.f27727b).getMainSettings().edit().putBoolean(a1.g.o(j10, "topicssidetabs"), e41Var.Q).putBoolean(a1.g.o(j10, "topicssidetabsb"), e41Var.P).apply();
            Boolean bool = e41Var.W;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = e41Var.W.booleanValue();
                e41Var.W = null;
                e41Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new mp0(this, 25));
        }
    }
}
