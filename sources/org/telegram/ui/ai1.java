package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class ai1 extends AnimatorListenerAdapter {
    public final int f34835a;
    public final mi1 f34836b;

    public ai1(mi1 mi1Var, int i10) {
        this.f34835a = i10;
        this.f34836b = mi1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.w9[] w9VarArr;
        ai.l4 l4Var;
        org.telegram.ui.Components.w9[] w9VarArr2;
        ai.l4 l4Var2;
        switch (this.f34835a) {
            case 0:
                mi1 mi1Var = this.f34836b;
                mi1Var.f38631i1 = null;
                mi1Var.f38625f1 = 1.0f;
                mi1Var.Y0 = 0.0f;
                mi1Var.Z0 = 0.0f;
                mi1Var.f38645s.invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.n2.k().f32027a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new hz0(this, 25), 200L);
                return;
            case 2:
                mi1 mi1Var2 = this.f34836b;
                mi1Var2.L0.unlock();
                mi1Var2.Y.setCornerRadius(-1.0f);
                mi1Var2.E0 = false;
                mi1Var2.Y.f32229b0 = false;
                mi1Var2.f38642q0 = mi1Var2.f38641p0;
                mi1Var2.H();
                return;
            case 3:
                for (org.telegram.ui.Components.w9 w9Var : this.f34836b.V) {
                    org.telegram.ui.Components.q5 q5Var = w9Var.f32496e;
                    if (q5Var != null && (l4Var = q5Var.f29914k) != null) {
                        l4Var.setAllowStartAnimation(true);
                        w9Var.f32496e.f29914k.startAnimation();
                    }
                }
                return;
            case 4:
                mi1 mi1Var3 = this.f34836b;
                mi1Var3.B();
                for (org.telegram.ui.Components.w9 w9Var2 : mi1Var3.V) {
                    org.telegram.ui.Components.q5 q5Var2 = w9Var2.f32496e;
                    if (q5Var2 != null && (l4Var2 = q5Var2.f29914k) != null) {
                        l4Var2.setAllowStartAnimation(false);
                        w9Var2.f32496e.f29914k.stopAnimation();
                    }
                }
                mi1Var3.R.setVisibility(8);
                return;
            case 5:
                mi1 mi1Var4 = this.f34836b;
                if (mi1Var4.Z.getTag() == null) {
                    mi1Var4.Z.setVisibility(8);
                    return;
                }
                return;
            case 6:
                mi1 mi1Var5 = this.f34836b;
                mi1Var5.Y.setTranslationX(0.0f);
                mi1Var5.Y.setTranslationY(0.0f);
                mi1Var5.Y.setScaleY(1.0f);
                mi1Var5.Y.setScaleX(1.0f);
                mi1Var5.Y.setVisibility(8);
                return;
            case 7:
                this.f34836b.f38654y.setVisibility(8);
                return;
            default:
                this.f34836b.f38621e0.setVisibility(8);
                return;
        }
    }
}
