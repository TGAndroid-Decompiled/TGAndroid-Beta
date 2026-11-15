package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class yo implements org.telegram.ui.l71 {
    public final ep f42051a;

    public yo(ep epVar) {
        this.f42051a = epVar;
    }

    @Override
    public final boolean Y0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f42051a.H1;
    }

    @Override
    public final void m1(boolean z10) {
        TLRPC.WallPaper wallPaper;
        ep epVar = this.f42051a;
        org.telegram.ui.an anVar = epVar.f34401v1;
        epVar.H1 = !epVar.H1;
        if (epVar.G1 != null) {
            epVar.J1 = true;
            anVar.f45397v7 = true;
            if (epVar.P0()) {
                wallPaper = null;
            } else {
                wallPaper = epVar.f34398s1.f53546g;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.p3 p3Var = epVar.G1.f34022a;
            if (p3Var.f29470a) {
                epVar.f34398s1.r(null, wallPaper2, z10, Boolean.valueOf(epVar.H1), false);
            } else {
                epVar.f34398s1.r(p3Var, wallPaper2, z10, Boolean.valueOf(epVar.H1), false);
            }
            anVar.f45397v7 = false;
        }
    }
}
