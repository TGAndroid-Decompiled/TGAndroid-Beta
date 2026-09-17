package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class mc0 extends AnimatorListenerAdapter {
    public final int f35759a;
    public final float f35760b;
    public final nc0 f35761c;

    public mc0(nc0 nc0Var, float f7, int i10) {
        this.f35759a = i10;
        this.f35761c = nc0Var;
        this.f35760b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35759a) {
            case 0:
                nc0 nc0Var = this.f35761c;
                TextView textView = nc0Var.f36027f;
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19244y6, false);
                int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19047n6, false);
                float f7 = this.f35760b;
                nc0Var.f36030s = f7;
                textView.setTextColor(i0.a.d(f7, w02, w03));
                return;
            default:
                nc0 nc0Var2 = this.f35761c;
                TextView textView2 = nc0Var2.d;
                int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19244y6, false);
                int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19047n6, false);
                float f10 = this.f35760b;
                nc0Var2.f36031w = f10;
                textView2.setTextColor(i0.a.d(f10, w04, w05));
                return;
        }
    }
}
