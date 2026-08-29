package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class ch1 extends AnimatorListenerAdapter {
    public final int f37128a;
    public final oh1 f37129b;

    public ch1(oh1 oh1Var, int i10) {
        this.f37128a = i10;
        this.f37129b = oh1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.t9[] t9VarArr;
        lh.x2 x2Var;
        org.telegram.ui.Components.t9[] t9VarArr2;
        lh.x2 x2Var2;
        switch (this.f37128a) {
            case 0:
                oh1 oh1Var = this.f37129b;
                oh1Var.f41149e1 = null;
                oh1Var.f41141b1 = 1.0f;
                oh1Var.U0 = 0.0f;
                oh1Var.V0 = 0.0f;
                oh1Var.f41169s.invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.o2.k().f33894a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new ky0(this, 25), 200L);
                return;
            case 2:
                oh1 oh1Var2 = this.f37129b;
                oh1Var2.H0.unlock();
                oh1Var2.U.setCornerRadius(-1.0f);
                oh1Var2.A0 = false;
                oh1Var2.U.U = false;
                oh1Var2.m0 = oh1Var2.f41161l0;
                oh1Var2.H();
                return;
            case 3:
                for (org.telegram.ui.Components.t9 t9Var : this.f37129b.R) {
                    org.telegram.ui.Components.p5 p5Var = t9Var.f32906e;
                    if (p5Var != null && (x2Var = p5Var.f31593k) != null) {
                        x2Var.setAllowStartAnimation(true);
                        t9Var.f32906e.f31593k.startAnimation();
                    }
                }
                return;
            case 4:
                oh1 oh1Var3 = this.f37129b;
                oh1Var3.B();
                for (org.telegram.ui.Components.t9 t9Var2 : oh1Var3.R) {
                    org.telegram.ui.Components.p5 p5Var2 = t9Var2.f32906e;
                    if (p5Var2 != null && (x2Var2 = p5Var2.f31593k) != null) {
                        x2Var2.setAllowStartAnimation(false);
                        t9Var2.f32906e.f31593k.stopAnimation();
                    }
                }
                oh1Var3.N.setVisibility(8);
                return;
            case 5:
                oh1 oh1Var4 = this.f37129b;
                if (oh1Var4.V.getTag() == null) {
                    oh1Var4.V.setVisibility(8);
                    return;
                }
                return;
            case 6:
                oh1 oh1Var5 = this.f37129b;
                oh1Var5.U.setTranslationX(0.0f);
                oh1Var5.U.setTranslationY(0.0f);
                oh1Var5.U.setScaleY(1.0f);
                oh1Var5.U.setScaleX(1.0f);
                oh1Var5.U.setVisibility(8);
                return;
            case 7:
                this.f37129b.f41178y.setVisibility(8);
                return;
            default:
                this.f37129b.f41137a0.setVisibility(8);
                return;
        }
    }
}
