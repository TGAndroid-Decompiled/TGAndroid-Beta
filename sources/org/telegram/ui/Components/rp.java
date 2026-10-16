package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.td1;
public final class rp implements td1 {
    public final zp f28618a;

    public rp(zp zpVar) {
        this.f28618a = zpVar;
    }

    @Override
    public final boolean Y0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f28618a.N;
    }

    @Override
    public final void o1(boolean z10) {
        TLRPC.WallPaper wallPaper;
        zp zpVar = this.f28618a;
        org.telegram.ui.fo foVar = zpVar.v;
        zpVar.N = !zpVar.N;
        if (zpVar.M != null) {
            zpVar.P = true;
            foVar.e7 = true;
            if (zpVar.x()) {
                wallPaper = null;
            } else {
                wallPaper = zpVar.f31654n.h;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.b4 b4Var = zpVar.M.f31345a;
            if (b4Var.f19342a) {
                zpVar.f31654n.i(null, wallPaper2, z10, Boolean.valueOf(zpVar.N), false);
            } else {
                zpVar.f31654n.i(b4Var, wallPaper2, z10, Boolean.valueOf(zpVar.N), false);
            }
            foVar.e7 = false;
        }
    }
}
