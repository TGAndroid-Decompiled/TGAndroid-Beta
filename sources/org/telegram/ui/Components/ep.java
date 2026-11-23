package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class ep implements org.telegram.ui.n71 {
    public final kp f34831a;

    public ep(kp kpVar) {
        this.f34831a = kpVar;
    }

    @Override
    public final boolean O0() {
        return true;
    }

    @Override
    public final boolean b() {
        return this.f34831a.H1;
    }

    @Override
    public final void b1(boolean z10) {
        TLRPC.WallPaper wallPaper;
        kp kpVar = this.f34831a;
        org.telegram.ui.bn bnVar = kpVar.f36838v1;
        kpVar.H1 = !kpVar.H1;
        if (kpVar.G1 != null) {
            kpVar.J1 = true;
            bnVar.f46412w7 = true;
            if (kpVar.Q0()) {
                wallPaper = null;
            } else {
                wallPaper = kpVar.f36835s1.f54654g;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.s3 s3Var = kpVar.G1.f36472a;
            if (s3Var.f30045a) {
                kpVar.f36835s1.r(null, wallPaper2, z10, Boolean.valueOf(kpVar.H1), false);
            } else {
                kpVar.f36835s1.r(s3Var, wallPaper2, z10, Boolean.valueOf(kpVar.H1), false);
            }
            bnVar.f46412w7 = false;
        }
    }
}
