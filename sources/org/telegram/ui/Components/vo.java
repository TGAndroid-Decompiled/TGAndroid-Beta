package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_stories;
public final class vo implements org.telegram.messenger.w10 {
    public final int f40755a;
    public final kp f40756b;

    public vo(kp kpVar, int i7) {
        this.f40755a = i7;
        this.f40756b = kpVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f40755a) {
            case 0:
                kp kpVar = this.f40756b;
                kpVar.Z1 = (TL_stories.TL_premium_boostsStatus) obj;
                kpVar.Y1 = true;
                kpVar.a1(true);
                kpVar.X1 = false;
                return;
            default:
                org.telegram.messenger.g3 g3Var = (org.telegram.messenger.g3) obj;
                kp kpVar2 = this.f40756b;
                if (kpVar2.getContext() != null) {
                    org.telegram.ui.bn bnVar = kpVar2.f36838v1;
                    ug.k0 k0Var = new ug.k0(22, kpVar2.f30223a, kpVar2.getContext(), bnVar, kpVar2.J0);
                    k0Var.B1(g3Var);
                    k0Var.A1(kpVar2.Z1, true);
                    k0Var.C1(kpVar2.f36838v1.a());
                    k0Var.M2 = new to(kpVar2, 2);
                    k0Var.show();
                    return;
                }
                return;
        }
    }
}
