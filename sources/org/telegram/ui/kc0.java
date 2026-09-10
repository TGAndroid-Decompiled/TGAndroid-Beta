package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class kc0 extends AnimatorListenerAdapter {
    public final int f34330a;
    public final float f34331b;
    public final lc0 f34332c;

    public kc0(lc0 lc0Var, float f7, int i10) {
        this.f34330a = i10;
        this.f34332c = lc0Var;
        this.f34331b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34330a) {
            case 0:
                lc0 lc0Var = this.f34332c;
                TextView textView = lc0Var.f34645f;
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18306y6, false);
                int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18110n6, false);
                float f7 = this.f34331b;
                lc0Var.f34648s = f7;
                textView.setTextColor(i0.a.d(f7, w02, w03));
                return;
            default:
                lc0 lc0Var2 = this.f34332c;
                TextView textView2 = lc0Var2.d;
                int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18306y6, false);
                int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18110n6, false);
                float f10 = this.f34331b;
                lc0Var2.f34649w = f10;
                textView2.setTextColor(i0.a.d(f10, w04, w05));
                return;
        }
    }
}
