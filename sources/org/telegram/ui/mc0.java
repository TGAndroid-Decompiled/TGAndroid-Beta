package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class mc0 extends AnimatorListenerAdapter {
    public final int f35764a;
    public final float f35765b;
    public final nc0 f35766c;

    public mc0(nc0 nc0Var, float f7, int i10) {
        this.f35764a = i10;
        this.f35766c = nc0Var;
        this.f35765b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35764a) {
            case 0:
                nc0 nc0Var = this.f35766c;
                TextView textView = nc0Var.f36032f;
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19245y6, false);
                int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19048n6, false);
                float f7 = this.f35765b;
                nc0Var.f36035s = f7;
                textView.setTextColor(i0.a.d(f7, w02, w03));
                return;
            default:
                nc0 nc0Var2 = this.f35766c;
                TextView textView2 = nc0Var2.d;
                int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19245y6, false);
                int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19048n6, false);
                float f10 = this.f35765b;
                nc0Var2.f36036w = f10;
                textView2.setTextColor(i0.a.d(f10, w04, w05));
                return;
        }
    }
}
