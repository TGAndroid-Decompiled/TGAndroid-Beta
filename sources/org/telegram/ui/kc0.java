package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class kc0 extends AnimatorListenerAdapter {
    public final int f38030a;
    public final float f38031b;
    public final lc0 f38032c;

    public kc0(lc0 lc0Var, float f7, int i10) {
        this.f38030a = i10;
        this.f38032c = lc0Var;
        this.f38031b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38030a) {
            case 0:
                lc0 lc0Var = this.f38032c;
                TextView textView = lc0Var.f38321f;
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21069y6, false);
                int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20873n6, false);
                float f7 = this.f38031b;
                lc0Var.f38324s = f7;
                textView.setTextColor(i0.a.d(f7, w02, w03));
                return;
            default:
                lc0 lc0Var2 = this.f38032c;
                TextView textView2 = lc0Var2.d;
                int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21069y6, false);
                int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20873n6, false);
                float f10 = this.f38031b;
                lc0Var2.f38325w = f10;
                textView2.setTextColor(i0.a.d(f10, w04, w05));
                return;
        }
    }
}
