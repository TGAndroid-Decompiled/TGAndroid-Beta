package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class gd1 extends AnimatorListenerAdapter {
    public final int f36377a;
    public final ce1 f36378b;

    public gd1(ce1 ce1Var, int i10) {
        this.f36377a = i10;
        this.f36378b = ce1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36377a) {
            case 0:
                super.onAnimationEnd(animator);
                ce1 ce1Var = this.f36378b;
                ce1Var.f34915x0.invalidate();
                ce1Var.f34912w0[1].setVisibility(8);
                ce1Var.f34863c2 = null;
                return;
            case 1:
                this.f36378b.B0 = null;
                return;
            case 2:
                ce1 ce1Var2 = this.f36378b;
                if (ce1Var2.D0.getTag() == null) {
                    ce1Var2.D0.setVisibility(4);
                }
                ce1Var2.H0 = null;
                return;
            case 3:
                ce1 ce1Var3 = this.f36378b;
                if (ce1Var3.E0.getTag() == null) {
                    ce1Var3.E0.setVisibility(4);
                }
                ce1Var3.I0 = null;
                return;
            case 4:
                ce1 ce1Var4 = this.f36378b;
                rc rcVar = ce1Var4.f34879h2;
                if (rcVar != null) {
                    if (rcVar.getParent() != null) {
                        ((ViewGroup) ce1Var4.f34879h2.getParent()).removeView(ce1Var4.f34879h2);
                    }
                    ce1Var4.f34879h2 = null;
                }
                ce1Var4.f34885j2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                ce1 ce1Var5 = this.f36378b;
                if (!ce1Var5.f34896p1.a()) {
                    ce1Var5.R1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
