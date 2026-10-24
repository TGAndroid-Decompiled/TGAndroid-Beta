package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.gc1;
public final class np implements gc1 {
    public final up f28988a;

    public np(up upVar) {
        this.f28988a = upVar;
    }

    @Override
    public final boolean I0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f28988a.M;
    }

    @Override
    public final void c1(boolean z10) {
        TLRPC.WallPaper wallPaper;
        up upVar = this.f28988a;
        org.telegram.ui.sn snVar = upVar.v;
        upVar.M = !upVar.M;
        if (upVar.L != null) {
            upVar.O = true;
            snVar.f41648q7 = true;
            if (upVar.A()) {
                wallPaper = null;
            } else {
                wallPaper = upVar.f31188n.f40883g;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.f4 f4Var = upVar.L.f30871a;
            if (f4Var.f20885a) {
                upVar.f31188n.q(null, wallPaper2, z10, Boolean.valueOf(upVar.M), false);
            } else {
                upVar.f31188n.q(f4Var, wallPaper2, z10, Boolean.valueOf(upVar.M), false);
            }
            snVar.f41648q7 = false;
        }
    }
}
