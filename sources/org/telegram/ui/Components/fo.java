package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_stories;
public final class fo implements org.telegram.messenger.u10 {
    public final int f33831a;
    public final vo f33832b;

    public fo(vo voVar, int i3) {
        this.f33831a = i3;
        this.f33832b = voVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f33831a) {
            case 0:
                vo voVar = this.f33832b;
                voVar.W1 = (TL_stories.TL_premium_boostsStatus) obj;
                voVar.V1 = true;
                voVar.Z0(true);
                voVar.U1 = false;
                return;
            default:
                org.telegram.messenger.e3 e3Var = (org.telegram.messenger.e3) obj;
                vo voVar2 = this.f33832b;
                if (voVar2.getContext() != null) {
                    org.telegram.ui.wm wmVar = voVar2.f39191s1;
                    vg.i0 i0Var = new vg.i0(22, voVar2.f28583a, voVar2.getContext(), wmVar, voVar2.J0);
                    i0Var.A1(e3Var);
                    i0Var.z1(voVar2.W1, true);
                    i0Var.B1(voVar2.f39191s1.a());
                    i0Var.J2 = new co(voVar2, 2);
                    i0Var.show();
                    return;
                }
                return;
        }
    }
}
