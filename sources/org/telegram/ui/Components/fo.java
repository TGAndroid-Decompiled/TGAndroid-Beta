package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_stories;
public final class fo implements org.telegram.messenger.c20 {
    public final int f33615a;
    public final vo f33616b;

    public fo(vo voVar, int i7) {
        this.f33615a = i7;
        this.f33616b = voVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f33615a) {
            case 0:
                vo voVar = this.f33616b;
                voVar.Y1 = (TL_stories.TL_premium_boostsStatus) obj;
                voVar.X1 = true;
                voVar.Z0(true);
                voVar.W1 = false;
                return;
            default:
                org.telegram.messenger.e3 e3Var = (org.telegram.messenger.e3) obj;
                vo voVar2 = this.f33616b;
                if (voVar2.getContext() != null) {
                    org.telegram.ui.cn cnVar = voVar2.f39071u1;
                    ug.i0 i0Var = new ug.i0(22, voVar2.f28669a, voVar2.getContext(), cnVar, voVar2.I0);
                    i0Var.A1(e3Var);
                    i0Var.z1(voVar2.Y1, true);
                    i0Var.B1(voVar2.f39071u1.a());
                    i0Var.L2 = new co(voVar2, 2);
                    i0Var.show();
                    return;
                }
                return;
        }
    }
}
