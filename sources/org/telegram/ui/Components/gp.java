package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.fd1;
public final class gp implements fd1 {
    public final op f24610a;

    public gp(op opVar) {
        this.f24610a = opVar;
    }

    @Override
    public final boolean Y0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f24610a.N;
    }

    @Override
    public final void o1(boolean z10) {
        TLRPC.WallPaper wallPaper;
        op opVar = this.f24610a;
        org.telegram.ui.wn wnVar = opVar.v;
        opVar.N = !opVar.N;
        if (opVar.M != null) {
            opVar.P = true;
            wnVar.e7 = true;
            if (opVar.v()) {
                wallPaper = null;
            } else {
                wallPaper = opVar.f27147n.h;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.b4 b4Var = opVar.M.f26842a;
            if (b4Var.f18758a) {
                opVar.f27147n.i(null, wallPaper2, z10, Boolean.valueOf(opVar.N), false);
            } else {
                opVar.f27147n.i(b4Var, wallPaper2, z10, Boolean.valueOf(opVar.N), false);
            }
            wnVar.e7 = false;
        }
    }
}
