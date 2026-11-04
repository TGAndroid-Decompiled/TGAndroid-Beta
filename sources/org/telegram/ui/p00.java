package org.telegram.ui;

import android.graphics.Typeface;
import android.provider.Settings;
import org.telegram.messenger.voip.VoIPService;
public final class p00 implements Runnable {
    public final int f48397a;
    public final x30 f48398b;

    public p00(x30 x30Var, int i3) {
        this.f48397a = i3;
        this.f48398b = x30Var;
    }

    @Override
    public final void run() {
        int i3 = this.f48397a;
        x30 x30Var = this.f48398b;
        switch (i3) {
            case 0:
                if (x30Var.t1()) {
                    LaunchActivity launchActivity = x30Var.f51716a2;
                    Typeface typeface = org.telegram.messenger.g0.f22580a;
                    if (Settings.canDrawOverlays(launchActivity) && !org.telegram.ui.Components.voip.s0.f39589e0.W) {
                        x30Var.dismiss();
                        org.telegram.messenger.g0.i3(new p00(x30Var, 4), 100L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (x30Var.S2 != null && x30Var.J3 && VoIPService.getSharedInstance() != null) {
                    try {
                        x30Var.f51796t1.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    x30Var.M1(1, true);
                    org.telegram.messenger.g0.i3(x30Var.f51780p4, 80L);
                    x30Var.J3 = false;
                    x30Var.K3 = true;
                    return;
                }
                return;
            case 2:
                int i10 = x30Var.L3;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    x30Var.Q1(true, false);
                    return;
                }
                return;
            case 3:
                x30Var.x1();
                return;
            case 4:
                org.telegram.ui.Components.voip.s0.h(x30Var.f51716a2);
                return;
            case 5:
                x30Var.dismiss();
                return;
            case 6:
                x30Var.N1();
                org.telegram.messenger.g0.i3(x30Var.f51808v3, 1000L);
                return;
            case 7:
                t20 t20Var = x30Var.f51751j2;
                if (t20Var != null) {
                    t20Var.show();
                    return;
                }
                return;
            case 8:
                x30Var.a1();
                x30Var.X0();
                x30Var.W0();
                x30Var.f51814x1.setTranslationY((-x30Var.f51803u3.d()) + x30Var.f28586b.getPaddingBottom());
                x30Var.f51818y1.invalidate();
                x30Var.b1();
                x30Var.f28586b.invalidate();
                return;
            case 9:
                org.telegram.messenger.hp.s1(x30Var.f51759l1.f21919a).l0(null);
                return;
            default:
                x30Var.f51781p5 = null;
                x30Var.K1(true);
                return;
        }
    }
}
