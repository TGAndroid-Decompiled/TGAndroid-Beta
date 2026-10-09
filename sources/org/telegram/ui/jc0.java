package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class jc0 extends AnimatorListenerAdapter {
    public final int f38906a;
    public final float f38907b;
    public final kc0 f38908c;

    public jc0(kc0 kc0Var, float f7, int i10) {
        this.f38906a = i10;
        this.f38908c = kc0Var;
        this.f38907b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38906a) {
            case 0:
                kc0 kc0Var = this.f38908c;
                TextView textView = kc0Var.f39213f;
                int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21181y6, false);
                int x03 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20982n6, false);
                float f7 = this.f38907b;
                kc0Var.f39216s = f7;
                textView.setTextColor(i0.a.d(f7, x02, x03));
                return;
            default:
                kc0 kc0Var2 = this.f38908c;
                TextView textView2 = kc0Var2.d;
                int x04 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21181y6, false);
                int x05 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20982n6, false);
                float f10 = this.f38907b;
                kc0Var2.f39217w = f10;
                textView2.setTextColor(i0.a.d(f10, x04, x05));
                return;
        }
    }
}
