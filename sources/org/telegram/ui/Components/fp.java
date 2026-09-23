package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.fd1;
public final class fp implements fd1 {
    public final np f24067a;

    public fp(np npVar) {
        this.f24067a = npVar;
    }

    @Override
    public final boolean Y0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f24067a.N;
    }

    @Override
    public final void o1(boolean z10) {
        TLRPC.WallPaper wallPaper;
        np npVar = this.f24067a;
        org.telegram.ui.xn xnVar = npVar.v;
        npVar.N = !npVar.N;
        if (npVar.M != null) {
            npVar.P = true;
            xnVar.e7 = true;
            if (npVar.v()) {
                wallPaper = null;
            } else {
                wallPaper = npVar.f26470n.h;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.c4 c4Var = npVar.M.f26253a;
            if (c4Var.f18533a) {
                npVar.f26470n.i(null, wallPaper2, z10, Boolean.valueOf(npVar.N), false);
            } else {
                npVar.f26470n.i(c4Var, wallPaper2, z10, Boolean.valueOf(npVar.N), false);
            }
            xnVar.e7 = false;
        }
    }
}
