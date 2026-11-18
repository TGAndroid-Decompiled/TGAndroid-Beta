package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_stories;
public final class wo implements org.telegram.messenger.x10 {
    public final int f41743a;
    public final lp f41744b;

    public wo(lp lpVar, int i7) {
        this.f41743a = i7;
        this.f41744b = lpVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f41743a) {
            case 0:
                lp lpVar = this.f41744b;
                lpVar.Z1 = (TL_stories.TL_premium_boostsStatus) obj;
                lpVar.Y1 = true;
                lpVar.a1(true);
                lpVar.X1 = false;
                return;
            default:
                org.telegram.messenger.g3 g3Var = (org.telegram.messenger.g3) obj;
                lp lpVar2 = this.f41744b;
                if (lpVar2.getContext() != null) {
                    org.telegram.ui.bn bnVar = lpVar2.f37182v1;
                    ug.l0 l0Var = new ug.l0(22, lpVar2.f30187a, lpVar2.getContext(), bnVar, lpVar2.J0);
                    l0Var.B1(g3Var);
                    l0Var.A1(lpVar2.Z1, true);
                    l0Var.C1(lpVar2.f37182v1.a());
                    l0Var.M2 = new uo(lpVar2, 2);
                    l0Var.show();
                    return;
                }
                return;
        }
    }
}
