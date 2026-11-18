package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class fp implements org.telegram.ui.p71 {
    public final lp f35147a;

    public fp(lp lpVar) {
        this.f35147a = lpVar;
    }

    @Override
    public final boolean Y0() {
        return true;
    }

    @Override
    public final boolean d() {
        return this.f35147a.H1;
    }

    @Override
    public final void l1(boolean z10) {
        TLRPC.WallPaper wallPaper;
        lp lpVar = this.f35147a;
        org.telegram.ui.bn bnVar = lpVar.f37182v1;
        lpVar.H1 = !lpVar.H1;
        if (lpVar.G1 != null) {
            lpVar.J1 = true;
            bnVar.f46217w7 = true;
            if (lpVar.Q0()) {
                wallPaper = null;
            } else {
                wallPaper = lpVar.f37179s1.f54539g;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.t3 t3Var = lpVar.G1.f36837a;
            if (t3Var.f29997a) {
                lpVar.f37179s1.r(null, wallPaper2, z10, Boolean.valueOf(lpVar.H1), false);
            } else {
                lpVar.f37179s1.r(t3Var, wallPaper2, z10, Boolean.valueOf(lpVar.H1), false);
            }
            bnVar.f46217w7 = false;
        }
    }
}
