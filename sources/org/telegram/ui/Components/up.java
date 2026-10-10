package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.od1;
public final class up implements od1 {
    public final cq f31617a;

    public up(cq cqVar) {
        this.f31617a = cqVar;
    }

    @Override
    public final boolean T0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f31617a.N;
    }

    @Override
    public final void l1(boolean z10) {
        TLRPC.WallPaper wallPaper;
        cq cqVar = this.f31617a;
        org.telegram.ui.zn znVar = cqVar.v;
        cqVar.N = !cqVar.N;
        if (cqVar.M != null) {
            cqVar.P = true;
            znVar.e7 = true;
            if (cqVar.x()) {
                wallPaper = null;
            } else {
                wallPaper = cqVar.f25372n.h;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.c4 c4Var = cqVar.M.f25019a;
            if (c4Var.f20509a) {
                cqVar.f25372n.i(null, wallPaper2, z10, Boolean.valueOf(cqVar.N), false);
            } else {
                cqVar.f25372n.i(c4Var, wallPaper2, z10, Boolean.valueOf(cqVar.N), false);
            }
            znVar.e7 = false;
        }
    }
}
