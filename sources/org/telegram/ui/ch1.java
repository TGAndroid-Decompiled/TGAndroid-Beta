package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class ch1 extends AnimatorListenerAdapter {
    public final int f36366a;
    public final oh1 f36367b;

    public ch1(oh1 oh1Var, int i10) {
        this.f36366a = i10;
        this.f36367b = oh1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.w9[] w9VarArr;
        ci.f3 f3Var;
        org.telegram.ui.Components.w9[] w9VarArr2;
        ci.f3 f3Var2;
        switch (this.f36366a) {
            case 0:
                oh1 oh1Var = this.f36367b;
                oh1Var.f40184i1 = null;
                oh1Var.f40178f1 = 1.0f;
                oh1Var.Y0 = 0.0f;
                oh1Var.Z0 = 0.0f;
                oh1Var.f40198s.invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.k2.k().f31682a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new my0(this, 25), 200L);
                return;
            case 2:
                oh1 oh1Var2 = this.f36367b;
                oh1Var2.L0.unlock();
                oh1Var2.Y.setCornerRadius(-1.0f);
                oh1Var2.E0 = false;
                oh1Var2.Y.f31874b0 = false;
                oh1Var2.f40195q0 = oh1Var2.f40194p0;
                oh1Var2.G();
                return;
            case 3:
                for (org.telegram.ui.Components.w9 w9Var : this.f36367b.V) {
                    org.telegram.ui.Components.r5 r5Var = w9Var.e;
                    if (r5Var != null && (f3Var = r5Var.f30098k) != null) {
                        f3Var.setAllowStartAnimation(true);
                        w9Var.e.f30098k.startAnimation();
                    }
                }
                return;
            case 4:
                oh1 oh1Var3 = this.f36367b;
                oh1Var3.A();
                for (org.telegram.ui.Components.w9 w9Var2 : oh1Var3.V) {
                    org.telegram.ui.Components.r5 r5Var2 = w9Var2.e;
                    if (r5Var2 != null && (f3Var2 = r5Var2.f30098k) != null) {
                        f3Var2.setAllowStartAnimation(false);
                        w9Var2.e.f30098k.stopAnimation();
                    }
                }
                oh1Var3.R.setVisibility(8);
                return;
            case 5:
                oh1 oh1Var4 = this.f36367b;
                if (oh1Var4.Z.getTag() == null) {
                    oh1Var4.Z.setVisibility(8);
                    return;
                }
                return;
            case 6:
                oh1 oh1Var5 = this.f36367b;
                oh1Var5.Y.setTranslationX(0.0f);
                oh1Var5.Y.setTranslationY(0.0f);
                oh1Var5.Y.setScaleY(1.0f);
                oh1Var5.Y.setScaleX(1.0f);
                oh1Var5.Y.setVisibility(8);
                return;
            case 7:
                this.f36367b.f40207y.setVisibility(8);
                return;
            default:
                this.f36367b.f40174e0.setVisibility(8);
                return;
        }
    }
}
