package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.kc1;
public final class rp implements kc1 {
    public final yp f32278a;

    public rp(yp ypVar) {
        this.f32278a = ypVar;
    }

    @Override
    public final boolean X0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f32278a.M;
    }

    @Override
    public final void j1(boolean z10) {
        TLRPC.WallPaper wallPaper;
        yp ypVar = this.f32278a;
        org.telegram.ui.un unVar = ypVar.v;
        ypVar.M = !ypVar.M;
        if (ypVar.L != null) {
            ypVar.O = true;
            unVar.f44383q7 = true;
            if (ypVar.A()) {
                wallPaper = null;
            } else {
                wallPaper = ypVar.f35103n.f43543g;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.h4 h4Var = ypVar.L.f34790a;
            if (h4Var.f22680a) {
                ypVar.f35103n.q(null, wallPaper2, z10, Boolean.valueOf(ypVar.M), false);
            } else {
                ypVar.f35103n.q(h4Var, wallPaper2, z10, Boolean.valueOf(ypVar.M), false);
            }
            unVar.f44383q7 = false;
        }
    }
}
