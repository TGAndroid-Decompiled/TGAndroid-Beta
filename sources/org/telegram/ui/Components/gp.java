package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.fd1;
public final class gp implements fd1 {
    public final op f24609a;

    public gp(op opVar) {
        this.f24609a = opVar;
    }

    @Override
    public final boolean Y0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f24609a.N;
    }

    @Override
    public final void o1(boolean z10) {
        TLRPC.WallPaper wallPaper;
        op opVar = this.f24609a;
        org.telegram.ui.wn wnVar = opVar.v;
        opVar.N = !opVar.N;
        if (opVar.M != null) {
            opVar.P = true;
            wnVar.e7 = true;
            if (opVar.v()) {
                wallPaper = null;
            } else {
                wallPaper = opVar.f27149n.h;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.b4 b4Var = opVar.M.f26844a;
            if (b4Var.f18757a) {
                opVar.f27149n.i(null, wallPaper2, z10, Boolean.valueOf(opVar.N), false);
            } else {
                opVar.f27149n.i(b4Var, wallPaper2, z10, Boolean.valueOf(opVar.N), false);
            }
            wnVar.e7 = false;
        }
    }
}
