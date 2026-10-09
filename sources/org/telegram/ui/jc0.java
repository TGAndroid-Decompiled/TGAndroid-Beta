package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class jc0 extends AnimatorListenerAdapter {
    public final int f38908a;
    public final float f38909b;
    public final kc0 f38910c;

    public jc0(kc0 kc0Var, float f7, int i10) {
        this.f38908a = i10;
        this.f38910c = kc0Var;
        this.f38909b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38908a) {
            case 0:
                kc0 kc0Var = this.f38910c;
                TextView textView = kc0Var.f39215f;
                int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21181y6, false);
                int x03 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20982n6, false);
                float f7 = this.f38909b;
                kc0Var.f39218s = f7;
                textView.setTextColor(i0.a.d(f7, x02, x03));
                return;
            default:
                kc0 kc0Var2 = this.f38910c;
                TextView textView2 = kc0Var2.d;
                int x04 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21181y6, false);
                int x05 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20982n6, false);
                float f10 = this.f38909b;
                kc0Var2.f39219w = f10;
                textView2.setTextColor(i0.a.d(f10, x04, x05));
                return;
        }
    }
}
