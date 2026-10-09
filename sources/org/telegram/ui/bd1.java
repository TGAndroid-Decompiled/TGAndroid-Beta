package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class bd1 extends AnimatorListenerAdapter {
    public final int f36286a;
    public final xd1 f36287b;

    public bd1(xd1 xd1Var, int i10) {
        this.f36286a = i10;
        this.f36287b = xd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36286a) {
            case 0:
                super.onAnimationEnd(animator);
                xd1 xd1Var = this.f36287b;
                xd1Var.f43998x0.invalidate();
                xd1Var.f43995w0[1].setVisibility(8);
                xd1Var.f43945c2 = null;
                return;
            case 1:
                this.f36287b.B0 = null;
                return;
            case 2:
                xd1 xd1Var2 = this.f36287b;
                if (xd1Var2.D0.getTag() == null) {
                    xd1Var2.D0.setVisibility(4);
                }
                xd1Var2.H0 = null;
                return;
            case 3:
                xd1 xd1Var3 = this.f36287b;
                if (xd1Var3.E0.getTag() == null) {
                    xd1Var3.E0.setVisibility(4);
                }
                xd1Var3.I0 = null;
                return;
            case 4:
                xd1 xd1Var4 = this.f36287b;
                lc lcVar = xd1Var4.f43962h2;
                if (lcVar != null) {
                    if (lcVar.getParent() != null) {
                        ((ViewGroup) xd1Var4.f43962h2.getParent()).removeView(xd1Var4.f43962h2);
                    }
                    xd1Var4.f43962h2 = null;
                }
                xd1Var4.f43968j2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                xd1 xd1Var5 = this.f36287b;
                if (!xd1Var5.f43979p1.a()) {
                    xd1Var5.R1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
