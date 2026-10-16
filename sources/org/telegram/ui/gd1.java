package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class gd1 extends AnimatorListenerAdapter {
    public final int f36171a;
    public final ce1 f36172b;

    public gd1(ce1 ce1Var, int i10) {
        this.f36171a = i10;
        this.f36172b = ce1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36171a) {
            case 0:
                super.onAnimationEnd(animator);
                ce1 ce1Var = this.f36172b;
                ce1Var.f34639x0.invalidate();
                ce1Var.f34636w0[1].setVisibility(8);
                ce1Var.f34587c2 = null;
                return;
            case 1:
                this.f36172b.B0 = null;
                return;
            case 2:
                ce1 ce1Var2 = this.f36172b;
                if (ce1Var2.D0.getTag() == null) {
                    ce1Var2.D0.setVisibility(4);
                }
                ce1Var2.H0 = null;
                return;
            case 3:
                ce1 ce1Var3 = this.f36172b;
                if (ce1Var3.E0.getTag() == null) {
                    ce1Var3.E0.setVisibility(4);
                }
                ce1Var3.I0 = null;
                return;
            case 4:
                ce1 ce1Var4 = this.f36172b;
                qc qcVar = ce1Var4.f34603h2;
                if (qcVar != null) {
                    if (qcVar.getParent() != null) {
                        ((ViewGroup) ce1Var4.f34603h2.getParent()).removeView(ce1Var4.f34603h2);
                    }
                    ce1Var4.f34603h2 = null;
                }
                ce1Var4.f34609j2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                ce1 ce1Var5 = this.f36172b;
                if (!ce1Var5.f34620p1.a()) {
                    ce1Var5.R1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
