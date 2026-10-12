package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class kc0 extends AnimatorListenerAdapter {
    public final int f39445a;
    public final float f39446b;
    public final lc0 f39447c;

    public kc0(lc0 lc0Var, float f7, int i10) {
        this.f39445a = i10;
        this.f39447c = lc0Var;
        this.f39446b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39445a) {
            case 0:
                lc0 lc0Var = this.f39447c;
                TextView textView = lc0Var.f39697f;
                int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20945y6, false);
                int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20744n6, false);
                float f7 = this.f39446b;
                lc0Var.f39700s = f7;
                textView.setTextColor(i0.a.d(f7, x02, x03));
                return;
            default:
                lc0 lc0Var2 = this.f39447c;
                TextView textView2 = lc0Var2.d;
                int x04 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20945y6, false);
                int x05 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20744n6, false);
                float f10 = this.f39446b;
                lc0Var2.f39701w = f10;
                textView2.setTextColor(i0.a.d(f10, x04, x05));
                return;
        }
    }
}
