package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class ah1 extends AnimatorListenerAdapter {
    public final int f36500a;
    public final mh1 f36501b;

    public ah1(mh1 mh1Var, int i9) {
        this.f36500a = i9;
        this.f36501b = mh1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.o9[] o9VarArr;
        ih.z2 z2Var;
        org.telegram.ui.Components.o9[] o9VarArr2;
        ih.z2 z2Var2;
        switch (this.f36500a) {
            case 0:
                mh1 mh1Var = this.f36501b;
                mh1Var.f40441e1 = null;
                mh1Var.f40433b1 = 1.0f;
                mh1Var.U0 = 0.0f;
                mh1Var.V0 = 0.0f;
                mh1Var.f40461s.invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.l2.k().f33652a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new ky0(this, 25), 200L);
                return;
            case 2:
                mh1 mh1Var2 = this.f36501b;
                mh1Var2.H0.unlock();
                mh1Var2.U.setCornerRadius(-1.0f);
                mh1Var2.A0 = false;
                mh1Var2.U.U = false;
                mh1Var2.m0 = mh1Var2.f40453l0;
                mh1Var2.H();
                return;
            case 3:
                for (org.telegram.ui.Components.o9 o9Var : this.f36501b.R) {
                    org.telegram.ui.Components.k5 k5Var = o9Var.f31331e;
                    if (k5Var != null && (z2Var = k5Var.f29951k) != null) {
                        z2Var.setAllowStartAnimation(true);
                        o9Var.f31331e.f29951k.startAnimation();
                    }
                }
                return;
            case 4:
                mh1 mh1Var3 = this.f36501b;
                mh1Var3.B();
                for (org.telegram.ui.Components.o9 o9Var2 : mh1Var3.R) {
                    org.telegram.ui.Components.k5 k5Var2 = o9Var2.f31331e;
                    if (k5Var2 != null && (z2Var2 = k5Var2.f29951k) != null) {
                        z2Var2.setAllowStartAnimation(false);
                        o9Var2.f31331e.f29951k.stopAnimation();
                    }
                }
                mh1Var3.N.setVisibility(8);
                return;
            case 5:
                mh1 mh1Var4 = this.f36501b;
                if (mh1Var4.V.getTag() == null) {
                    mh1Var4.V.setVisibility(8);
                    return;
                }
                return;
            case 6:
                mh1 mh1Var5 = this.f36501b;
                mh1Var5.U.setTranslationX(0.0f);
                mh1Var5.U.setTranslationY(0.0f);
                mh1Var5.U.setScaleY(1.0f);
                mh1Var5.U.setScaleX(1.0f);
                mh1Var5.U.setVisibility(8);
                return;
            case 7:
                this.f36501b.f40470y.setVisibility(8);
                return;
            default:
                this.f36501b.f40429a0.setVisibility(8);
                return;
        }
    }
}
