package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class hi1 extends AnimatorListenerAdapter {
    public final int f34243a;
    public final ti1 f34244b;

    public hi1(ti1 ti1Var, int i10) {
        this.f34243a = i10;
        this.f34244b = ti1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.v9[] v9VarArr;
        ai.l4 l4Var;
        org.telegram.ui.Components.v9[] v9VarArr2;
        ai.l4 l4Var2;
        switch (this.f34243a) {
            case 0:
                ti1 ti1Var = this.f34244b;
                ti1Var.f37813i1 = null;
                ti1Var.f37807f1 = 1.0f;
                ti1Var.Y0 = 0.0f;
                ti1Var.Z0 = 0.0f;
                ti1Var.f37827s.invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.m2.k().f29456a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new e01(this, 23), 200L);
                return;
            case 2:
                ti1 ti1Var2 = this.f34244b;
                ti1Var2.L0.unlock();
                ti1Var2.Y.setCornerRadius(-1.0f);
                ti1Var2.E0 = false;
                ti1Var2.Y.f29646b0 = false;
                ti1Var2.f37824q0 = ti1Var2.f37823p0;
                ti1Var2.H();
                return;
            case 3:
                for (org.telegram.ui.Components.v9 v9Var : this.f34244b.V) {
                    org.telegram.ui.Components.p5 p5Var = v9Var.e;
                    if (p5Var != null && (l4Var = p5Var.f27256k) != null) {
                        l4Var.setAllowStartAnimation(true);
                        v9Var.e.f27256k.startAnimation();
                    }
                }
                return;
            case 4:
                ti1 ti1Var3 = this.f34244b;
                ti1Var3.B();
                for (org.telegram.ui.Components.v9 v9Var2 : ti1Var3.V) {
                    org.telegram.ui.Components.p5 p5Var2 = v9Var2.e;
                    if (p5Var2 != null && (l4Var2 = p5Var2.f27256k) != null) {
                        l4Var2.setAllowStartAnimation(false);
                        v9Var2.e.f27256k.stopAnimation();
                    }
                }
                ti1Var3.R.setVisibility(8);
                return;
            case 5:
                ti1 ti1Var4 = this.f34244b;
                if (ti1Var4.Z.getTag() == null) {
                    ti1Var4.Z.setVisibility(8);
                    return;
                }
                return;
            case 6:
                ti1 ti1Var5 = this.f34244b;
                ti1Var5.Y.setTranslationX(0.0f);
                ti1Var5.Y.setTranslationY(0.0f);
                ti1Var5.Y.setScaleY(1.0f);
                ti1Var5.Y.setScaleX(1.0f);
                ti1Var5.Y.setVisibility(8);
                return;
            case 7:
                this.f34244b.f37836y.setVisibility(8);
                return;
            default:
                this.f34244b.f37803e0.setVisibility(8);
                return;
        }
    }
}
