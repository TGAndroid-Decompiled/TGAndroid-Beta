package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class q61 extends AnimatorListenerAdapter {
    public final int f48792a;
    public final l71 f48793b;

    public q61(l71 l71Var, int i3) {
        this.f48792a = i3;
        this.f48793b = l71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48792a) {
            case 0:
                super.onAnimationEnd(animator);
                l71 l71Var = this.f48793b;
                l71Var.f47210z0.invalidate();
                l71Var.f47208y0[1].setVisibility(8);
                l71Var.f47158e2 = null;
                return;
            case 1:
                this.f48793b.D0 = null;
                return;
            case 2:
                l71 l71Var2 = this.f48793b;
                if (l71Var2.F0.getTag() == null) {
                    l71Var2.F0.setVisibility(4);
                }
                l71Var2.J0 = null;
                return;
            case 3:
                l71 l71Var3 = this.f48793b;
                if (l71Var3.G0.getTag() == null) {
                    l71Var3.G0.setVisibility(4);
                }
                l71Var3.K0 = null;
                return;
            case 4:
                l71 l71Var4 = this.f48793b;
                ac acVar = l71Var4.f47174j2;
                if (acVar != null) {
                    if (acVar.getParent() != null) {
                        ((ViewGroup) l71Var4.f47174j2.getParent()).removeView(l71Var4.f47174j2);
                    }
                    l71Var4.f47174j2 = null;
                }
                l71Var4.f47179l2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                l71 l71Var5 = this.f48793b;
                if (!l71Var5.f47191r1.a()) {
                    l71Var5.T1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
