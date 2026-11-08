package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
public final class p10 implements Runnable {
    public final c40 f48579a;

    public p10(c40 c40Var) {
        this.f48579a = c40Var;
    }

    @Override
    public final void run() {
        int i7;
        c40 c40Var = this.f48579a;
        org.telegram.ui.ActionBar.k5 k5Var = c40Var.L1;
        j30 j30Var = c40Var.M1;
        if (j30Var != null && !c40Var.I) {
            org.telegram.messenger.r3 r3Var = c40Var.R2;
            if (r3Var != null) {
                i7 = r3Var.f25222b.schedule_date;
            } else {
                i7 = c40Var.f44554b4;
            }
            if (i7 != 0) {
                int currentTime = i7 - ConnectionsManager.getInstance(c40Var.f44588k1.f21765a).getCurrentTime();
                if (currentTime >= 86400) {
                    j30Var.l(org.telegram.messenger.id.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]), false);
                } else {
                    j30Var.l(org.telegram.messenger.g0.j0(Math.abs(currentTime)), false);
                    if (currentTime < 0 && k5Var.getTag() == null) {
                        k5Var.setTag(1);
                        k5Var.l(org.telegram.messenger.id.M0(2131743444, null), false);
                    }
                }
                c40Var.N1.l(org.telegram.messenger.id.W(3, i7, true), false);
                org.telegram.messenger.g0.i3(c40Var.f44604n4, 1000L);
            }
        }
    }
}
