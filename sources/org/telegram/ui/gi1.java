package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class gi1 extends AnimatorListenerAdapter {
    public final int f33884a;
    public final si1 f33885b;

    public gi1(si1 si1Var, int i10) {
        this.f33884a = i10;
        this.f33885b = si1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.w9[] w9VarArr;
        ai.l4 l4Var;
        org.telegram.ui.Components.w9[] w9VarArr2;
        ai.l4 l4Var2;
        switch (this.f33884a) {
            case 0:
                si1 si1Var = this.f33885b;
                si1Var.f37316i1 = null;
                si1Var.f37310f1 = 1.0f;
                si1Var.Y0 = 0.0f;
                si1Var.Z0 = 0.0f;
                si1Var.f37330s.invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.m2.k().f29387a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new e01(this, 23), 200L);
                return;
            case 2:
                si1 si1Var2 = this.f33885b;
                si1Var2.L0.unlock();
                si1Var2.Y.setCornerRadius(-1.0f);
                si1Var2.E0 = false;
                si1Var2.Y.f29577b0 = false;
                si1Var2.f37327q0 = si1Var2.f37326p0;
                si1Var2.H();
                return;
            case 3:
                for (org.telegram.ui.Components.w9 w9Var : this.f33885b.V) {
                    org.telegram.ui.Components.q5 q5Var = w9Var.e;
                    if (q5Var != null && (l4Var = q5Var.f27461k) != null) {
                        l4Var.setAllowStartAnimation(true);
                        w9Var.e.f27461k.startAnimation();
                    }
                }
                return;
            case 4:
                si1 si1Var3 = this.f33885b;
                si1Var3.B();
                for (org.telegram.ui.Components.w9 w9Var2 : si1Var3.V) {
                    org.telegram.ui.Components.q5 q5Var2 = w9Var2.e;
                    if (q5Var2 != null && (l4Var2 = q5Var2.f27461k) != null) {
                        l4Var2.setAllowStartAnimation(false);
                        w9Var2.e.f27461k.stopAnimation();
                    }
                }
                si1Var3.R.setVisibility(8);
                return;
            case 5:
                si1 si1Var4 = this.f33885b;
                if (si1Var4.Z.getTag() == null) {
                    si1Var4.Z.setVisibility(8);
                    return;
                }
                return;
            case 6:
                si1 si1Var5 = this.f33885b;
                si1Var5.Y.setTranslationX(0.0f);
                si1Var5.Y.setTranslationY(0.0f);
                si1Var5.Y.setScaleY(1.0f);
                si1Var5.Y.setScaleX(1.0f);
                si1Var5.Y.setVisibility(8);
                return;
            case 7:
                this.f33885b.f37339y.setVisibility(8);
                return;
            default:
                this.f33885b.f37306e0.setVisibility(8);
                return;
        }
    }
}
