package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_stories;
public final class oo implements org.telegram.messenger.q20 {
    public final int f29108a;
    public final dp f29109b;

    public oo(dp dpVar, int i10) {
        this.f29108a = i10;
        this.f29109b = dpVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f29108a) {
            case 0:
                dp dpVar = this.f29109b;
                dpVar.V1 = (TL_stories.TL_premium_boostsStatus) obj;
                dpVar.U1 = true;
                dpVar.Z0(true);
                dpVar.T1 = false;
                return;
            default:
                org.telegram.messenger.h3 h3Var = (org.telegram.messenger.h3) obj;
                dp dpVar2 = this.f29109b;
                if (dpVar2.getContext() != null) {
                    org.telegram.ui.un unVar = dpVar2.f25491r1;
                    kg.q0 q0Var = new kg.q0(22, dpVar2.f21583a, dpVar2.getContext(), unVar, dpVar2.I0);
                    q0Var.A1(h3Var);
                    q0Var.z1(dpVar2.V1, true);
                    q0Var.B1(dpVar2.f25491r1.a());
                    q0Var.I2 = new mo(dpVar2, 2);
                    q0Var.show();
                    return;
                }
                return;
        }
    }
}
