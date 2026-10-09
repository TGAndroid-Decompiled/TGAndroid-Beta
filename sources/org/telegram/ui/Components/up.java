package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.od1;
public final class up implements od1 {
    public final cq f31586a;

    public up(cq cqVar) {
        this.f31586a = cqVar;
    }

    @Override
    public final boolean T0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f31586a.N;
    }

    @Override
    public final void l1(boolean z10) {
        TLRPC.WallPaper wallPaper;
        cq cqVar = this.f31586a;
        org.telegram.ui.zn znVar = cqVar.v;
        cqVar.N = !cqVar.N;
        if (cqVar.M != null) {
            cqVar.P = true;
            znVar.e7 = true;
            if (cqVar.x()) {
                wallPaper = null;
            } else {
                wallPaper = cqVar.f25473n.h;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.c4 c4Var = cqVar.M.f25082a;
            if (c4Var.f20505a) {
                cqVar.f25473n.i(null, wallPaper2, z10, Boolean.valueOf(cqVar.N), false);
            } else {
                cqVar.f25473n.i(c4Var, wallPaper2, z10, Boolean.valueOf(cqVar.N), false);
            }
            znVar.e7 = false;
        }
    }
}
