package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class kc0 extends AnimatorListenerAdapter {
    public final int f38003a;
    public final float f38004b;
    public final lc0 f38005c;

    public kc0(lc0 lc0Var, float f7, int i10) {
        this.f38003a = i10;
        this.f38005c = lc0Var;
        this.f38004b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38003a) {
            case 0:
                lc0 lc0Var = this.f38005c;
                TextView textView = lc0Var.f38294f;
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21042y6, false);
                int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20846n6, false);
                float f7 = this.f38004b;
                lc0Var.f38297s = f7;
                textView.setTextColor(i0.a.d(f7, w02, w03));
                return;
            default:
                lc0 lc0Var2 = this.f38005c;
                TextView textView2 = lc0Var2.d;
                int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21042y6, false);
                int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20846n6, false);
                float f10 = this.f38004b;
                lc0Var2.f38298w = f10;
                textView2.setTextColor(i0.a.d(f10, w04, w05));
                return;
        }
    }
}
