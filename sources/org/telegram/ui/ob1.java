package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ob1 extends AnimatorListenerAdapter {
    public final int f48254a;
    public final zb1 f48255b;

    public ob1(zb1 zb1Var, int i3) {
        this.f48254a = i3;
        this.f48255b = zb1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ei.c3 c3Var;
        ei.c3 c3Var2;
        int i3 = this.f48254a;
        zb1 zb1Var = this.f48255b;
        switch (i3) {
            case 0:
                zb1Var.f52628j1 = null;
                zb1Var.f52622g1 = 1.0f;
                zb1Var.Z0 = 0.0f;
                zb1Var.f52606a1 = 0.0f;
                zb1Var.f52640s.invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.u1.d().f39621a.setAlpha(1.0f);
                org.telegram.messenger.g0.i3(new pu0(this, 25), 200L);
                return;
            case 2:
                zb1Var.M0.e();
                zb1Var.Z.setCornerRadius(-1.0f);
                zb1Var.F0 = false;
                zb1Var.Z.f39255c0 = false;
                zb1Var.f52639r0 = zb1Var.f52637q0;
                zb1Var.G();
                return;
            case 3:
                for (org.telegram.ui.Components.k9 k9Var : zb1Var.W) {
                    org.telegram.ui.Components.g5 g5Var = k9Var.f35345e;
                    if (g5Var != null && (c3Var = g5Var.f33971k) != null) {
                        c3Var.f21272u0 = true;
                        c3Var.P0(false);
                    }
                }
                return;
            case 4:
                zb1Var.A();
                for (org.telegram.ui.Components.k9 k9Var2 : zb1Var.W) {
                    org.telegram.ui.Components.g5 g5Var2 = k9Var2.f35345e;
                    if (g5Var2 != null && (c3Var2 = g5Var2.f33971k) != null) {
                        c3Var2.f21272u0 = false;
                        c3Var2.Q0();
                    }
                }
                zb1Var.S.setVisibility(8);
                return;
            case 5:
                zb1Var.F.setText(org.telegram.messenger.bd.M0(2131743500, null));
                zb1Var.F.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
                return;
            case 6:
                if (zb1Var.f52605a0.getTag() == null) {
                    zb1Var.f52605a0.setVisibility(8);
                    return;
                }
                return;
            case 7:
                zb1Var.Z.setTranslationX(0.0f);
                zb1Var.Z.setTranslationY(0.0f);
                zb1Var.Z.setScaleY(1.0f);
                zb1Var.Z.setScaleX(1.0f);
                zb1Var.Z.setVisibility(8);
                return;
            case 8:
                zb1Var.E.setVisibility(8);
                return;
            default:
                zb1Var.f52619f0.setVisibility(8);
                return;
        }
    }
}
