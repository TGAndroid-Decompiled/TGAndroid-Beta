package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class ic0 extends AnimatorListenerAdapter {
    public final int f37379a;
    public final float f37380b;
    public final jc0 f37381c;

    public ic0(jc0 jc0Var, float f7, int i10) {
        this.f37379a = i10;
        this.f37381c = jc0Var;
        this.f37380b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37379a) {
            case 0:
                jc0 jc0Var = this.f37381c;
                TextView textView = jc0Var.f37651f;
                int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21214y6, false);
                int w03 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21013n6, false);
                float f7 = this.f37380b;
                jc0Var.f37654s = f7;
                textView.setTextColor(i0.a.d(f7, w02, w03));
                return;
            default:
                jc0 jc0Var2 = this.f37381c;
                TextView textView2 = jc0Var2.d;
                int w04 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21214y6, false);
                int w05 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21013n6, false);
                float f10 = this.f37380b;
                jc0Var2.f37655w = f10;
                textView2.setTextColor(i0.a.d(f10, w04, w05));
                return;
        }
    }
}
