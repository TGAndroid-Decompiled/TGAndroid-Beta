package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class lc0 extends AnimatorListenerAdapter {
    public final int f35340a;
    public final float f35341b;
    public final mc0 f35342c;

    public lc0(mc0 mc0Var, float f7, int i10) {
        this.f35340a = i10;
        this.f35342c = mc0Var;
        this.f35341b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35340a) {
            case 0:
                mc0 mc0Var = this.f35342c;
                TextView textView = mc0Var.f35593f;
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19445y6, false);
                int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19247n6, false);
                float f7 = this.f35341b;
                mc0Var.f35596s = f7;
                textView.setTextColor(i0.a.d(f7, w02, w03));
                return;
            default:
                mc0 mc0Var2 = this.f35342c;
                TextView textView2 = mc0Var2.d;
                int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19445y6, false);
                int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19247n6, false);
                float f10 = this.f35341b;
                mc0Var2.f35597w = f10;
                textView2.setTextColor(i0.a.d(f10, w04, w05));
                return;
        }
    }
}
