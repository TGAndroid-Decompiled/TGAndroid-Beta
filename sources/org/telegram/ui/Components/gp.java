package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.gd1;
public final class gp implements gd1 {
    public final op f24635a;

    public gp(op opVar) {
        this.f24635a = opVar;
    }

    @Override
    public final boolean Y0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f24635a.N;
    }

    @Override
    public final void o1(boolean z10) {
        TLRPC.WallPaper wallPaper;
        op opVar = this.f24635a;
        org.telegram.ui.xn xnVar = opVar.v;
        opVar.N = !opVar.N;
        if (opVar.M != null) {
            opVar.P = true;
            xnVar.e7 = true;
            if (opVar.v()) {
                wallPaper = null;
            } else {
                wallPaper = opVar.f27171n.h;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.d4 d4Var = opVar.M.f26877a;
            if (d4Var.f18800a) {
                opVar.f27171n.i(null, wallPaper2, z10, Boolean.valueOf(opVar.N), false);
            } else {
                opVar.f27171n.i(d4Var, wallPaper2, z10, Boolean.valueOf(opVar.N), false);
            }
            xnVar.e7 = false;
        }
    }
}
