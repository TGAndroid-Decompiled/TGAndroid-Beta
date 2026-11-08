package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class a71 extends AnimatorListenerAdapter {
    public final int f43593a;
    public final v71 f43594b;

    public a71(v71 v71Var, int i7) {
        this.f43593a = i7;
        this.f43594b = v71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43593a) {
            case 0:
                super.onAnimationEnd(animator);
                v71 v71Var = this.f43594b;
                v71Var.f50586y0.invalidate();
                v71Var.f50583x0[1].setVisibility(8);
                v71Var.d2 = null;
                return;
            case 1:
                this.f43594b.C0 = null;
                return;
            case 2:
                v71 v71Var2 = this.f43594b;
                if (v71Var2.E0.getTag() == null) {
                    v71Var2.E0.setVisibility(4);
                }
                v71Var2.I0 = null;
                return;
            case 3:
                v71 v71Var3 = this.f43594b;
                if (v71Var3.F0.getTag() == null) {
                    v71Var3.F0.setVisibility(4);
                }
                v71Var3.J0 = null;
                return;
            case 4:
                v71 v71Var4 = this.f43594b;
                cc ccVar = v71Var4.f50550i2;
                if (ccVar != null) {
                    if (ccVar.getParent() != null) {
                        ((ViewGroup) v71Var4.f50550i2.getParent()).removeView(v71Var4.f50550i2);
                    }
                    v71Var4.f50550i2 = null;
                }
                v71Var4.f50556k2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                v71 v71Var5 = this.f43594b;
                if (!v71Var5.f50566q1.a()) {
                    v71Var5.S1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
