package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class nb0 extends AnimatorListenerAdapter {
    public final int f39491a;
    public final float f39492b;
    public final ob0 f39493c;

    public nb0(ob0 ob0Var, float f7, int i10) {
        this.f39491a = i10;
        this.f39493c = ob0Var;
        this.f39492b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39491a) {
            case 0:
                ob0 ob0Var = this.f39493c;
                TextView textView = ob0Var.f39815f;
                int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21377y6, false);
                int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21172n6, false);
                float f7 = this.f39492b;
                ob0Var.f39818s = f7;
                textView.setTextColor(i0.a.f(f7, x02, x03));
                return;
            default:
                ob0 ob0Var2 = this.f39493c;
                TextView textView2 = ob0Var2.d;
                int x04 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21377y6, false);
                int x05 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21172n6, false);
                float f10 = this.f39492b;
                ob0Var2.f39819w = f10;
                textView2.setTextColor(i0.a.f(f10, x04, x05));
                return;
        }
    }
}
