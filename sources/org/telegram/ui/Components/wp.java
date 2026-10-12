package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.qd1;
public final class wp implements qd1 {
    public final eq f32528a;

    public wp(eq eqVar) {
        this.f32528a = eqVar;
    }

    @Override
    public final boolean T0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f32528a.N;
    }

    @Override
    public final void l1(boolean z10) {
        TLRPC.WallPaper wallPaper;
        eq eqVar = this.f32528a;
        org.telegram.ui.eo eoVar = eqVar.v;
        eqVar.N = !eqVar.N;
        if (eqVar.M != null) {
            eqVar.P = true;
            eoVar.e7 = true;
            if (eqVar.x()) {
                wallPaper = null;
            } else {
                wallPaper = eqVar.f25756n.h;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.b4 b4Var = eqVar.M.f25449a;
            if (b4Var.f20240a) {
                eqVar.f25756n.i(null, wallPaper2, z10, Boolean.valueOf(eqVar.N), false);
            } else {
                eqVar.f25756n.i(b4Var, wallPaper2, z10, Boolean.valueOf(eqVar.N), false);
            }
            eoVar.e7 = false;
        }
    }
}
