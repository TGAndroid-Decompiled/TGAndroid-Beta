package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nd1;
public final class up implements nd1 {
    public final cq f31541a;

    public up(cq cqVar) {
        this.f31541a = cqVar;
    }

    @Override
    public final boolean T0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f31541a.N;
    }

    @Override
    public final void l1(boolean z10) {
        TLRPC.WallPaper wallPaper;
        cq cqVar = this.f31541a;
        org.telegram.ui.zn znVar = cqVar.v;
        cqVar.N = !cqVar.N;
        if (cqVar.M != null) {
            cqVar.P = true;
            znVar.e7 = true;
            if (cqVar.x()) {
                wallPaper = null;
            } else {
                wallPaper = cqVar.f25273n.h;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.b4 b4Var = cqVar.M.f25002a;
            if (b4Var.f20467a) {
                cqVar.f25273n.i(null, wallPaper2, z10, Boolean.valueOf(cqVar.N), false);
            } else {
                cqVar.f25273n.i(b4Var, wallPaper2, z10, Boolean.valueOf(cqVar.N), false);
            }
            znVar.e7 = false;
        }
    }
}
