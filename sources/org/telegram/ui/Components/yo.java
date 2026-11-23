package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_stories;
public final class yo implements org.telegram.messenger.y10 {
    public final int f42442a;
    public final np f42443b;

    public yo(np npVar, int i7) {
        this.f42442a = i7;
        this.f42443b = npVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f42442a) {
            case 0:
                np npVar = this.f42443b;
                npVar.Z1 = (TL_stories.TL_premium_boostsStatus) obj;
                npVar.Y1 = true;
                npVar.a1(true);
                npVar.X1 = false;
                return;
            default:
                org.telegram.messenger.g3 g3Var = (org.telegram.messenger.g3) obj;
                np npVar2 = this.f42443b;
                if (npVar2.getContext() != null) {
                    org.telegram.ui.bn bnVar = npVar2.f37891v1;
                    ug.k0 k0Var = new ug.k0(22, npVar2.f30139a, npVar2.getContext(), bnVar, npVar2.J0);
                    k0Var.B1(g3Var);
                    k0Var.A1(npVar2.Z1, true);
                    k0Var.C1(npVar2.f37891v1.a());
                    k0Var.M2 = new wo(npVar2, 2);
                    k0Var.show();
                    return;
                }
                return;
        }
    }
}
