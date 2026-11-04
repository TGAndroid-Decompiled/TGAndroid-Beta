package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class q90 extends AnimatorListenerAdapter {
    public final int f48819a;
    public final float f48820b;
    public final r90 f48821c;

    public q90(r90 r90Var, float f10, int i3) {
        this.f48819a = i3;
        this.f48821c = r90Var;
        this.f48820b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48819a) {
            case 0:
                r90 r90Var = this.f48821c;
                TextView textView = r90Var.f49141f;
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28273y6, false);
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28062n6, false);
                float f10 = this.f48820b;
                r90Var.f49144s = f10;
                textView.setTextColor(i0.a.f(f10, x02, x03));
                return;
            default:
                r90 r90Var2 = this.f48821c;
                TextView textView2 = r90Var2.d;
                int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28273y6, false);
                int x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28062n6, false);
                float f11 = this.f48820b;
                r90Var2.f49146x = f11;
                textView2.setTextColor(i0.a.f(f11, x04, x05));
                return;
        }
    }
}
