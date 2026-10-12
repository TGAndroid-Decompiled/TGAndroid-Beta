package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class dd1 extends AnimatorListenerAdapter {
    public final int f36775a;
    public final zd1 f36776b;

    public dd1(zd1 zd1Var, int i10) {
        this.f36775a = i10;
        this.f36776b = zd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36775a) {
            case 0:
                super.onAnimationEnd(animator);
                zd1 zd1Var = this.f36776b;
                zd1Var.f44797x0.invalidate();
                zd1Var.f44794w0[1].setVisibility(8);
                zd1Var.f44744c2 = null;
                return;
            case 1:
                this.f36776b.B0 = null;
                return;
            case 2:
                zd1 zd1Var2 = this.f36776b;
                if (zd1Var2.D0.getTag() == null) {
                    zd1Var2.D0.setVisibility(4);
                }
                zd1Var2.H0 = null;
                return;
            case 3:
                zd1 zd1Var3 = this.f36776b;
                if (zd1Var3.E0.getTag() == null) {
                    zd1Var3.E0.setVisibility(4);
                }
                zd1Var3.I0 = null;
                return;
            case 4:
                zd1 zd1Var4 = this.f36776b;
                pc pcVar = zd1Var4.f44761h2;
                if (pcVar != null) {
                    if (pcVar.getParent() != null) {
                        ((ViewGroup) zd1Var4.f44761h2.getParent()).removeView(zd1Var4.f44761h2);
                    }
                    zd1Var4.f44761h2 = null;
                }
                zd1Var4.f44767j2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                zd1 zd1Var5 = this.f36776b;
                if (!zd1Var5.f44778p1.a()) {
                    zd1Var5.R1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
