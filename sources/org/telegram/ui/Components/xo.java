package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.c91;
public final class xo implements c91 {
    public final dp f32617a;

    public xo(dp dpVar) {
        this.f32617a = dpVar;
    }

    @Override
    public final void M1(boolean z10) {
        TLRPC.WallPaper wallPaper;
        dp dpVar = this.f32617a;
        org.telegram.ui.un unVar = dpVar.f25547r1;
        dpVar.D1 = !dpVar.D1;
        if (dpVar.C1 != null) {
            dpVar.F1 = true;
            unVar.f42247u7 = true;
            if (dpVar.P0()) {
                wallPaper = null;
            } else {
                wallPaper = dpVar.f25544o1.f41402g;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.y3 y3Var = dpVar.C1.f25197a;
            if (y3Var.f21559a) {
                dpVar.f25544o1.r(null, wallPaper2, z10, Boolean.valueOf(dpVar.D1), false);
            } else {
                dpVar.f25544o1.r(y3Var, wallPaper2, z10, Boolean.valueOf(dpVar.D1), false);
            }
            unVar.f42247u7 = false;
        }
    }

    @Override
    public final boolean a() {
        return this.f32617a.D1;
    }

    @Override
    public final boolean b1() {
        return true;
    }
}
