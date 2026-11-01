package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class od1 extends AnimatorListenerAdapter {
    public final int f40139a;
    public final zd1 f40140b;

    public od1(zd1 zd1Var, int i10) {
        this.f40139a = i10;
        this.f40140b = zd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ag.c2 c2Var;
        ag.c2 c2Var2;
        int i10 = this.f40139a;
        zd1 zd1Var = this.f40140b;
        switch (i10) {
            case 0:
                zd1Var.f43956i1 = null;
                zd1Var.f43950f1 = 1.0f;
                zd1Var.Y0 = 0.0f;
                zd1Var.Z0 = 0.0f;
                zd1Var.f43970s.invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.u1.d().f31746a.setAlpha(1.0f);
                org.telegram.messenger.i0.h3(new vv0(this, 28), 200L);
                return;
            case 2:
                zd1Var.L0.e();
                zd1Var.Y.setCornerRadius(-1.0f);
                zd1Var.E0 = false;
                zd1Var.Y.f31405b0 = false;
                zd1Var.f43967q0 = zd1Var.f43966p0;
                zd1Var.G();
                return;
            case 3:
                for (org.telegram.ui.Components.g9 g9Var : zd1Var.V) {
                    org.telegram.ui.Components.f5 f5Var = g9Var.e;
                    if (f5Var != null && (c2Var = f5Var.f26070k) != null) {
                        c2Var.f14409t0 = true;
                        c2Var.P0(false);
                    }
                }
                return;
            case 4:
                zd1Var.A();
                for (org.telegram.ui.Components.g9 g9Var2 : zd1Var.V) {
                    org.telegram.ui.Components.f5 f5Var2 = g9Var2.e;
                    if (f5Var2 != null && (c2Var2 = f5Var2.f26070k) != null) {
                        c2Var2.f14409t0 = false;
                        c2Var2.Q0();
                    }
                }
                zd1Var.R.setVisibility(8);
                return;
            case 5:
                zd1Var.E.setText(org.telegram.messenger.dd.L0(2131743516, null));
                zd1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
                return;
            case 6:
                if (zd1Var.Z.getTag() == null) {
                    zd1Var.Z.setVisibility(8);
                    return;
                }
                return;
            case 7:
                zd1Var.Y.setTranslationX(0.0f);
                zd1Var.Y.setTranslationY(0.0f);
                zd1Var.Y.setScaleY(1.0f);
                zd1Var.Y.setScaleX(1.0f);
                zd1Var.Y.setVisibility(8);
                return;
            case 8:
                zd1Var.D.setVisibility(8);
                return;
            default:
                zd1Var.f43946e0.setVisibility(8);
                return;
        }
    }
}
