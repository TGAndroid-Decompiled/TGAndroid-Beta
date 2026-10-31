package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qd1 extends AnimatorListenerAdapter {
    public final int f40963a;
    public final be1 f40964b;

    public qd1(be1 be1Var, int i10) {
        this.f40963a = i10;
        this.f40964b = be1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ag.c2 c2Var;
        ag.c2 c2Var2;
        int i10 = this.f40963a;
        be1 be1Var = this.f40964b;
        switch (i10) {
            case 0:
                be1Var.f36217i1 = null;
                be1Var.f36211f1 = 1.0f;
                be1Var.Y0 = 0.0f;
                be1Var.Z0 = 0.0f;
                be1Var.f36231s.invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.t1.d().f31666a.setAlpha(1.0f);
                org.telegram.messenger.i0.h3(new wv0(this, 28), 200L);
                return;
            case 2:
                be1Var.L0.e();
                be1Var.Y.setCornerRadius(-1.0f);
                be1Var.E0 = false;
                be1Var.Y.f31325b0 = false;
                be1Var.f36228q0 = be1Var.f36227p0;
                be1Var.G();
                return;
            case 3:
                for (org.telegram.ui.Components.g9 g9Var : be1Var.V) {
                    org.telegram.ui.Components.f5 f5Var = g9Var.e;
                    if (f5Var != null && (c2Var = f5Var.f25975k) != null) {
                        c2Var.f14408t0 = true;
                        c2Var.P0(false);
                    }
                }
                return;
            case 4:
                be1Var.A();
                for (org.telegram.ui.Components.g9 g9Var2 : be1Var.V) {
                    org.telegram.ui.Components.f5 f5Var2 = g9Var2.e;
                    if (f5Var2 != null && (c2Var2 = f5Var2.f25975k) != null) {
                        c2Var2.f14408t0 = false;
                        c2Var2.Q0();
                    }
                }
                be1Var.R.setVisibility(8);
                return;
            case 5:
                be1Var.E.setText(org.telegram.messenger.cd.L0(2131743516, null));
                be1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
                return;
            case 6:
                if (be1Var.Z.getTag() == null) {
                    be1Var.Z.setVisibility(8);
                    return;
                }
                return;
            case 7:
                be1Var.Y.setTranslationX(0.0f);
                be1Var.Y.setTranslationY(0.0f);
                be1Var.Y.setScaleY(1.0f);
                be1Var.Y.setScaleX(1.0f);
                be1Var.Y.setVisibility(8);
                return;
            case 8:
                be1Var.D.setVisibility(8);
                return;
            default:
                be1Var.f36207e0.setVisibility(8);
                return;
        }
    }
}
