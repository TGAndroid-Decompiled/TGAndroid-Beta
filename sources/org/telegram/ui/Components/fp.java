package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.fd1;
public final class fp implements fd1 {
    public final np f24234a;

    public fp(np npVar) {
        this.f24234a = npVar;
    }

    @Override
    public final boolean Y0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f24234a.N;
    }

    @Override
    public final void o1(boolean z10) {
        TLRPC.WallPaper wallPaper;
        np npVar = this.f24234a;
        org.telegram.ui.wn wnVar = npVar.v;
        npVar.N = !npVar.N;
        if (npVar.M != null) {
            npVar.P = true;
            wnVar.e7 = true;
            if (npVar.v()) {
                wallPaper = null;
            } else {
                wallPaper = npVar.f26756n.h;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.b4 b4Var = npVar.M.f26557a;
            if (b4Var.f18742a) {
                npVar.f26756n.i(null, wallPaper2, z10, Boolean.valueOf(npVar.N), false);
            } else {
                npVar.f26756n.i(b4Var, wallPaper2, z10, Boolean.valueOf(npVar.N), false);
            }
            wnVar.e7 = false;
        }
    }
}
