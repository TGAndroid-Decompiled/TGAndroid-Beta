package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class hi1 extends AnimatorListenerAdapter {
    public final int f34297a;
    public final ti1 f34298b;

    public hi1(ti1 ti1Var, int i10) {
        this.f34297a = i10;
        this.f34298b = ti1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.u9[] u9VarArr;
        ai.l4 l4Var;
        org.telegram.ui.Components.u9[] u9VarArr2;
        ai.l4 l4Var2;
        switch (this.f34297a) {
            case 0:
                ti1 ti1Var = this.f34298b;
                ti1Var.f37714i1 = null;
                ti1Var.f37708f1 = 1.0f;
                ti1Var.Y0 = 0.0f;
                ti1Var.Z0 = 0.0f;
                ti1Var.f37728s.invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.m2.k().f29091a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new e01(this, 23), 200L);
                return;
            case 2:
                ti1 ti1Var2 = this.f34298b;
                ti1Var2.L0.unlock();
                ti1Var2.Y.setCornerRadius(-1.0f);
                ti1Var2.E0 = false;
                ti1Var2.Y.f29281b0 = false;
                ti1Var2.f37725q0 = ti1Var2.f37724p0;
                ti1Var2.H();
                return;
            case 3:
                for (org.telegram.ui.Components.u9 u9Var : this.f34298b.V) {
                    org.telegram.ui.Components.o5 o5Var = u9Var.e;
                    if (o5Var != null && (l4Var = o5Var.f26692k) != null) {
                        l4Var.setAllowStartAnimation(true);
                        u9Var.e.f26692k.startAnimation();
                    }
                }
                return;
            case 4:
                ti1 ti1Var3 = this.f34298b;
                ti1Var3.B();
                for (org.telegram.ui.Components.u9 u9Var2 : ti1Var3.V) {
                    org.telegram.ui.Components.o5 o5Var2 = u9Var2.e;
                    if (o5Var2 != null && (l4Var2 = o5Var2.f26692k) != null) {
                        l4Var2.setAllowStartAnimation(false);
                        u9Var2.e.f26692k.stopAnimation();
                    }
                }
                ti1Var3.R.setVisibility(8);
                return;
            case 5:
                ti1 ti1Var4 = this.f34298b;
                if (ti1Var4.Z.getTag() == null) {
                    ti1Var4.Z.setVisibility(8);
                    return;
                }
                return;
            case 6:
                ti1 ti1Var5 = this.f34298b;
                ti1Var5.Y.setTranslationX(0.0f);
                ti1Var5.Y.setTranslationY(0.0f);
                ti1Var5.Y.setScaleY(1.0f);
                ti1Var5.Y.setScaleX(1.0f);
                ti1Var5.Y.setVisibility(8);
                return;
            case 7:
                this.f34298b.f37737y.setVisibility(8);
                return;
            default:
                this.f34298b.f37704e0.setVisibility(8);
                return;
        }
    }
}
