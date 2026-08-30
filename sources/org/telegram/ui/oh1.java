package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class oh1 extends AnimatorListenerAdapter {
    public final int f36916a;
    public final ai1 f36917b;

    public oh1(ai1 ai1Var, int i10) {
        this.f36916a = i10;
        this.f36917b = ai1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.p9[] p9VarArr;
        nh.y2 y2Var;
        org.telegram.ui.Components.p9[] p9VarArr2;
        nh.y2 y2Var2;
        switch (this.f36916a) {
            case 0:
                ai1 ai1Var = this.f36917b;
                ai1Var.f32613f1 = null;
                ai1Var.f32606c1 = 1.0f;
                ai1Var.V0 = 0.0f;
                ai1Var.W0 = 0.0f;
                ai1Var.f32631s.invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.m2.k().f29772a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new vy0(this, 25), 200L);
                return;
            case 2:
                ai1 ai1Var2 = this.f36917b;
                ai1Var2.I0.unlock();
                ai1Var2.V.setCornerRadius(-1.0f);
                ai1Var2.B0 = false;
                ai1Var2.V.V = false;
                ai1Var2.f32625n0 = ai1Var2.m0;
                ai1Var2.H();
                return;
            case 3:
                for (org.telegram.ui.Components.p9 p9Var : this.f36917b.S) {
                    org.telegram.ui.Components.l5 l5Var = p9Var.e;
                    if (l5Var != null && (y2Var = l5Var.f26569k) != null) {
                        y2Var.setAllowStartAnimation(true);
                        p9Var.e.f26569k.startAnimation();
                    }
                }
                return;
            case 4:
                ai1 ai1Var3 = this.f36917b;
                ai1Var3.B();
                for (org.telegram.ui.Components.p9 p9Var2 : ai1Var3.S) {
                    org.telegram.ui.Components.l5 l5Var2 = p9Var2.e;
                    if (l5Var2 != null && (y2Var2 = l5Var2.f26569k) != null) {
                        y2Var2.setAllowStartAnimation(false);
                        p9Var2.e.f26569k.stopAnimation();
                    }
                }
                ai1Var3.O.setVisibility(8);
                return;
            case 5:
                ai1 ai1Var4 = this.f36917b;
                if (ai1Var4.W.getTag() == null) {
                    ai1Var4.W.setVisibility(8);
                    return;
                }
                return;
            case 6:
                ai1 ai1Var5 = this.f36917b;
                ai1Var5.V.setTranslationX(0.0f);
                ai1Var5.V.setTranslationY(0.0f);
                ai1Var5.V.setScaleY(1.0f);
                ai1Var5.V.setScaleX(1.0f);
                ai1Var5.V.setVisibility(8);
                return;
            case 7:
                this.f36917b.f32640y.setVisibility(8);
                return;
            default:
                this.f36917b.f32602b0.setVisibility(8);
                return;
        }
    }
}
