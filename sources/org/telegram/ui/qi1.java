package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class qi1 extends AnimatorListenerAdapter {
    public final int f39175a;
    public final cj1 f39176b;

    public qi1(cj1 cj1Var, int i10) {
        this.f39175a = i10;
        this.f39176b = cj1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.z9[] z9VarArr;
        bi.b4 b4Var;
        org.telegram.ui.Components.z9[] z9VarArr2;
        bi.b4 b4Var2;
        switch (this.f39175a) {
            case 0:
                cj1 cj1Var = this.f39176b;
                cj1Var.f34697i1 = null;
                cj1Var.f34691f1 = 1.0f;
                cj1Var.Y0 = 0.0f;
                cj1Var.Z0 = 0.0f;
                cj1Var.f34711s.invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.k2.k().f29934a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new tz0(this, 24), 200L);
                return;
            case 2:
                cj1 cj1Var2 = this.f39176b;
                cj1Var2.L0.unlock();
                cj1Var2.Y.setCornerRadius(-1.0f);
                cj1Var2.E0 = false;
                cj1Var2.Y.f30121b0 = false;
                cj1Var2.f34708q0 = cj1Var2.f34707p0;
                cj1Var2.G();
                return;
            case 3:
                for (org.telegram.ui.Components.z9 z9Var : this.f39176b.V) {
                    org.telegram.ui.Components.s5 s5Var = z9Var.e;
                    if (s5Var != null && (b4Var = s5Var.f28739k) != null) {
                        b4Var.setAllowStartAnimation(true);
                        z9Var.e.f28739k.startAnimation();
                    }
                }
                return;
            case 4:
                cj1 cj1Var3 = this.f39176b;
                cj1Var3.A();
                for (org.telegram.ui.Components.z9 z9Var2 : cj1Var3.V) {
                    org.telegram.ui.Components.s5 s5Var2 = z9Var2.e;
                    if (s5Var2 != null && (b4Var2 = s5Var2.f28739k) != null) {
                        b4Var2.setAllowStartAnimation(false);
                        z9Var2.e.f28739k.stopAnimation();
                    }
                }
                cj1Var3.R.setVisibility(8);
                return;
            case 5:
                cj1 cj1Var4 = this.f39176b;
                if (cj1Var4.Z.getTag() == null) {
                    cj1Var4.Z.setVisibility(8);
                    return;
                }
                return;
            case 6:
                cj1 cj1Var5 = this.f39176b;
                cj1Var5.Y.setTranslationX(0.0f);
                cj1Var5.Y.setTranslationY(0.0f);
                cj1Var5.Y.setScaleY(1.0f);
                cj1Var5.Y.setScaleX(1.0f);
                cj1Var5.Y.setVisibility(8);
                return;
            case 7:
                this.f39176b.f34720y.setVisibility(8);
                return;
            default:
                this.f39176b.f34687e0.setVisibility(8);
                return;
        }
    }
}
