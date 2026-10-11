package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nd1;
public final class up implements nd1 {
    public final cq f31699a;

    public up(cq cqVar) {
        this.f31699a = cqVar;
    }

    @Override
    public final boolean T0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f31699a.N;
    }

    @Override
    public final void l1(boolean z10) {
        TLRPC.WallPaper wallPaper;
        cq cqVar = this.f31699a;
        org.telegram.ui.zn znVar = cqVar.v;
        cqVar.N = !cqVar.N;
        if (cqVar.M != null) {
            cqVar.P = true;
            znVar.e7 = true;
            if (cqVar.x()) {
                wallPaper = null;
            } else {
                wallPaper = cqVar.f25434n.h;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.b4 b4Var = cqVar.M.f25058a;
            if (b4Var.f20503a) {
                cqVar.f25434n.i(null, wallPaper2, z10, Boolean.valueOf(cqVar.N), false);
            } else {
                cqVar.f25434n.i(b4Var, wallPaper2, z10, Boolean.valueOf(cqVar.N), false);
            }
            znVar.e7 = false;
        }
    }
}
