package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class kc0 extends AnimatorListenerAdapter {
    public final int f35121a;
    public final float f35122b;
    public final lc0 f35123c;

    public kc0(lc0 lc0Var, float f7, int i10) {
        this.f35121a = i10;
        this.f35123c = lc0Var;
        this.f35122b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35121a) {
            case 0:
                lc0 lc0Var = this.f35123c;
                TextView textView = lc0Var.f35398f;
                int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19215y6, false);
                int w03 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19018n6, false);
                float f7 = this.f35122b;
                lc0Var.f35401s = f7;
                textView.setTextColor(i0.a.d(f7, w02, w03));
                return;
            default:
                lc0 lc0Var2 = this.f35123c;
                TextView textView2 = lc0Var2.d;
                int w04 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19215y6, false);
                int w05 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19018n6, false);
                float f10 = this.f35122b;
                lc0Var2.f35402w = f10;
                textView2.setTextColor(i0.a.d(f10, w04, w05));
                return;
        }
    }
}
