package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class b71 extends AnimatorListenerAdapter {
    public final int f43927a;
    public final w71 f43928b;

    public b71(w71 w71Var, int i7) {
        this.f43927a = i7;
        this.f43928b = w71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43927a) {
            case 0:
                super.onAnimationEnd(animator);
                w71 w71Var = this.f43928b;
                w71Var.f50968y0.invalidate();
                w71Var.f50965x0[1].setVisibility(8);
                w71Var.d2 = null;
                return;
            case 1:
                this.f43928b.C0 = null;
                return;
            case 2:
                w71 w71Var2 = this.f43928b;
                if (w71Var2.E0.getTag() == null) {
                    w71Var2.E0.setVisibility(4);
                }
                w71Var2.I0 = null;
                return;
            case 3:
                w71 w71Var3 = this.f43928b;
                if (w71Var3.F0.getTag() == null) {
                    w71Var3.F0.setVisibility(4);
                }
                w71Var3.J0 = null;
                return;
            case 4:
                w71 w71Var4 = this.f43928b;
                cc ccVar = w71Var4.f50932i2;
                if (ccVar != null) {
                    if (ccVar.getParent() != null) {
                        ((ViewGroup) w71Var4.f50932i2.getParent()).removeView(w71Var4.f50932i2);
                    }
                    w71Var4.f50932i2 = null;
                }
                w71Var4.f50938k2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                w71 w71Var5 = this.f43928b;
                if (!w71Var5.f50948q1.a()) {
                    w71Var5.S1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
