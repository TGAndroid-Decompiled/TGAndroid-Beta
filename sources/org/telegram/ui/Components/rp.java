package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.kc1;
public final class rp implements kc1 {
    public final yp f32280a;

    public rp(yp ypVar) {
        this.f32280a = ypVar;
    }

    @Override
    public final boolean X0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f32280a.M;
    }

    @Override
    public final void j1(boolean z10) {
        TLRPC.WallPaper wallPaper;
        yp ypVar = this.f32280a;
        org.telegram.ui.un unVar = ypVar.v;
        ypVar.M = !ypVar.M;
        if (ypVar.L != null) {
            ypVar.O = true;
            unVar.f44386q7 = true;
            if (ypVar.A()) {
                wallPaper = null;
            } else {
                wallPaper = ypVar.f35106n.f43546g;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.h4 h4Var = ypVar.L.f34793a;
            if (h4Var.f22682a) {
                ypVar.f35106n.q(null, wallPaper2, z10, Boolean.valueOf(ypVar.M), false);
            } else {
                ypVar.f35106n.q(h4Var, wallPaper2, z10, Boolean.valueOf(ypVar.M), false);
            }
            unVar.f44386q7 = false;
        }
    }
}
