package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_stories;
public final class oo implements org.telegram.messenger.r20 {
    public final int f29199a;
    public final dp f29200b;

    public oo(dp dpVar, int i10) {
        this.f29199a = i10;
        this.f29200b = dpVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f29199a) {
            case 0:
                dp dpVar = this.f29200b;
                dpVar.V1 = (TL_stories.TL_premium_boostsStatus) obj;
                dpVar.U1 = true;
                dpVar.Z0(true);
                dpVar.T1 = false;
                return;
            default:
                org.telegram.messenger.h3 h3Var = (org.telegram.messenger.h3) obj;
                dp dpVar2 = this.f29200b;
                if (dpVar2.getContext() != null) {
                    org.telegram.ui.un unVar = dpVar2.f25547r1;
                    kg.q0 q0Var = new kg.q0(22, dpVar2.f21584a, dpVar2.getContext(), unVar, dpVar2.I0);
                    q0Var.A1(h3Var);
                    q0Var.z1(dpVar2.V1, true);
                    q0Var.B1(dpVar2.f25547r1.a());
                    q0Var.I2 = new mo(dpVar2, 2);
                    q0Var.show();
                    return;
                }
                return;
        }
    }
}
