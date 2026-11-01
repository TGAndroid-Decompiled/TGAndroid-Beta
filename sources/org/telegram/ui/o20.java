package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
public final class o20 implements Runnable {
    public final a50 f40028a;

    public o20(a50 a50Var) {
        this.f40028a = a50Var;
    }

    @Override
    public final void run() {
        int i10;
        a50 a50Var = this.f40028a;
        org.telegram.ui.ActionBar.u5 u5Var = a50Var.L1;
        g40 g40Var = a50Var.M1;
        if (g40Var != null && !a50Var.I) {
            org.telegram.messenger.u3 u3Var = a50Var.R2;
            if (u3Var != null) {
                i10 = u3Var.f18361b.schedule_date;
            } else {
                i10 = a50Var.f35584b4;
            }
            if (i10 != 0) {
                int currentTime = i10 - ConnectionsManager.getInstance(a50Var.f35620k1.f15043a).getCurrentTime();
                if (currentTime >= 86400) {
                    g40Var.l(org.telegram.messenger.dd.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]), false);
                } else {
                    g40Var.l(org.telegram.messenger.i0.j0(Math.abs(currentTime)), false);
                    if (currentTime < 0 && u5Var.getTag() == null) {
                        u5Var.setTag(1);
                        u5Var.l(org.telegram.messenger.dd.L0(2131743467, null), false);
                    }
                }
                a50Var.N1.l(org.telegram.messenger.dd.W(3, i10, true), false);
                org.telegram.messenger.i0.h3(a50Var.f35636n4, 1000L);
            }
        }
    }
}
