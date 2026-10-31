package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
public final class p20 implements Runnable {
    public final b50 f40432a;

    public p20(b50 b50Var) {
        this.f40432a = b50Var;
    }

    @Override
    public final void run() {
        int i10;
        b50 b50Var = this.f40432a;
        org.telegram.ui.ActionBar.u5 u5Var = b50Var.L1;
        h40 h40Var = b50Var.M1;
        if (h40Var != null && !b50Var.I) {
            org.telegram.messenger.u3 u3Var = b50Var.R2;
            if (u3Var != null) {
                i10 = u3Var.f18228b.schedule_date;
            } else {
                i10 = b50Var.f36000b4;
            }
            if (i10 != 0) {
                int currentTime = i10 - ConnectionsManager.getInstance(b50Var.f36036k1.f14863a).getCurrentTime();
                if (currentTime >= 86400) {
                    h40Var.l(org.telegram.messenger.cd.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]), false);
                } else {
                    h40Var.l(org.telegram.messenger.i0.j0(Math.abs(currentTime)), false);
                    if (currentTime < 0 && u5Var.getTag() == null) {
                        u5Var.setTag(1);
                        u5Var.l(org.telegram.messenger.cd.L0(2131743467, null), false);
                    }
                }
                b50Var.N1.l(org.telegram.messenger.cd.W(3, i10, true), false);
                org.telegram.messenger.i0.h3(b50Var.f36052n4, 1000L);
            }
        }
    }
}
