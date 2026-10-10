package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class jc0 extends AnimatorListenerAdapter {
    public final int f38952a;
    public final float f38953b;
    public final kc0 f38954c;

    public jc0(kc0 kc0Var, float f7, int i10) {
        this.f38952a = i10;
        this.f38954c = kc0Var;
        this.f38953b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38952a) {
            case 0:
                kc0 kc0Var = this.f38954c;
                TextView textView = kc0Var.f39259f;
                int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21185y6, false);
                int x03 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20986n6, false);
                float f7 = this.f38953b;
                kc0Var.f39262s = f7;
                textView.setTextColor(i0.a.d(f7, x02, x03));
                return;
            default:
                kc0 kc0Var2 = this.f38954c;
                TextView textView2 = kc0Var2.d;
                int x04 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21185y6, false);
                int x05 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20986n6, false);
                float f10 = this.f38953b;
                kc0Var2.f39263w = f10;
                textView2.setTextColor(i0.a.d(f10, x04, x05));
                return;
        }
    }
}
