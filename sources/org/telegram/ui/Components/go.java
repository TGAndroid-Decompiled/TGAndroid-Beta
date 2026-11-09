package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_stories;
public final class go implements org.telegram.messenger.c20 {
    public final int f34020a;
    public final vo f34021b;

    public go(vo voVar, int i7) {
        this.f34020a = i7;
        this.f34021b = voVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f34020a) {
            case 0:
                vo voVar = this.f34021b;
                voVar.V1 = (TL_stories.TL_premium_boostsStatus) obj;
                voVar.U1 = true;
                voVar.Z0(true);
                voVar.T1 = false;
                return;
            default:
                org.telegram.messenger.e3 e3Var = (org.telegram.messenger.e3) obj;
                vo voVar2 = this.f34021b;
                if (voVar2.getContext() != null) {
                    org.telegram.ui.cn cnVar = voVar2.f39150r1;
                    ug.i0 i0Var = new ug.i0(22, voVar2.f28621a, voVar2.getContext(), cnVar, voVar2.I0);
                    i0Var.A1(e3Var);
                    i0Var.z1(voVar2.V1, true);
                    i0Var.B1(voVar2.f39150r1.a());
                    i0Var.I2 = new eo(voVar2, 2);
                    i0Var.show();
                    return;
                }
                return;
        }
    }
}
