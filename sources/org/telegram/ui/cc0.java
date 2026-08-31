package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class cc0 extends AnimatorListenerAdapter {
    public final int f35767a;
    public final float f35768b;
    public final dc0 f35769c;

    public cc0(dc0 dc0Var, float f10, int i10) {
        this.f35767a = i10;
        this.f35769c = dc0Var;
        this.f35768b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35767a) {
            case 0:
                dc0 dc0Var = this.f35769c;
                TextView textView = dc0Var.f36181f;
                int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22036y6, false);
                int w03 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21839n6, false);
                float f10 = this.f35768b;
                dc0Var.f36184s = f10;
                textView.setTextColor(i0.a.d(f10, w02, w03));
                return;
            default:
                dc0 dc0Var2 = this.f35769c;
                TextView textView2 = dc0Var2.d;
                int w04 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22036y6, false);
                int w05 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21839n6, false);
                float f11 = this.f35768b;
                dc0Var2.f36185w = f11;
                textView2.setTextColor(i0.a.d(f11, w04, w05));
                return;
        }
    }
}
