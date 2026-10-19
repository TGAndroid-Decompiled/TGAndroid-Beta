package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class nb0 extends AnimatorListenerAdapter {
    public final int f39487a;
    public final float f39488b;
    public final ob0 f39489c;

    public nb0(ob0 ob0Var, float f7, int i10) {
        this.f39487a = i10;
        this.f39489c = ob0Var;
        this.f39488b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39487a) {
            case 0:
                ob0 ob0Var = this.f39489c;
                TextView textView = ob0Var.f39814f;
                int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21375y6, false);
                int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21170n6, false);
                float f7 = this.f39488b;
                ob0Var.f39817s = f7;
                textView.setTextColor(i0.a.f(f7, x02, x03));
                return;
            default:
                ob0 ob0Var2 = this.f39489c;
                TextView textView2 = ob0Var2.d;
                int x04 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21375y6, false);
                int x05 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21170n6, false);
                float f10 = this.f39488b;
                ob0Var2.f39818w = f10;
                textView2.setTextColor(i0.a.f(f10, x04, x05));
                return;
        }
    }
}
