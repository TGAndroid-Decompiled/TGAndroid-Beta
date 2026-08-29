package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.hc1;
public final class yo implements hc1 {
    public final gp f35110a;

    public yo(gp gpVar) {
        this.f35110a = gpVar;
    }

    @Override
    public final boolean U0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f35110a.J;
    }

    @Override
    public final void j1(boolean z10) {
        TLRPC.WallPaper wallPaper;
        gp gpVar = this.f35110a;
        org.telegram.ui.tn tnVar = gpVar.v;
        gpVar.J = !gpVar.J;
        if (gpVar.I != null) {
            gpVar.L = true;
            tnVar.f42743a7 = true;
            if (gpVar.v()) {
                wallPaper = null;
            } else {
                wallPaper = gpVar.f28939n.h;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.b4 b4Var = gpVar.I.f28512a;
            if (b4Var.f22762a) {
                gpVar.f28939n.i(null, wallPaper2, z10, Boolean.valueOf(gpVar.J), false);
            } else {
                gpVar.f28939n.i(b4Var, wallPaper2, z10, Boolean.valueOf(gpVar.J), false);
            }
            tnVar.f42743a7 = false;
        }
    }
}
