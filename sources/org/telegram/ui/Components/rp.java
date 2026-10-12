package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.td1;
public final class rp implements td1 {
    public final zp f28917a;

    public rp(zp zpVar) {
        this.f28917a = zpVar;
    }

    @Override
    public final boolean Y0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f28917a.N;
    }

    @Override
    public final void o1(boolean z10) {
        TLRPC.WallPaper wallPaper;
        zp zpVar = this.f28917a;
        org.telegram.ui.fo foVar = zpVar.v;
        zpVar.N = !zpVar.N;
        if (zpVar.M != null) {
            zpVar.P = true;
            foVar.e7 = true;
            if (zpVar.x()) {
                wallPaper = null;
            } else {
                wallPaper = zpVar.f31951n.h;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.b4 b4Var = zpVar.M.f31668a;
            if (b4Var.f19642a) {
                zpVar.f31951n.i(null, wallPaper2, z10, Boolean.valueOf(zpVar.N), false);
            } else {
                zpVar.f31951n.i(b4Var, wallPaper2, z10, Boolean.valueOf(zpVar.N), false);
            }
            foVar.e7 = false;
        }
    }
}
