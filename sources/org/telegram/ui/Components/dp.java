package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nd1;
public final class dp implements nd1 {
    public final lp f25460a;

    public dp(lp lpVar) {
        this.f25460a = lpVar;
    }

    @Override
    public final boolean Z0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f25460a.N;
    }

    @Override
    public final void p1(boolean z10) {
        TLRPC.WallPaper wallPaper;
        lp lpVar = this.f25460a;
        org.telegram.ui.co coVar = lpVar.v;
        lpVar.N = !lpVar.N;
        if (lpVar.M != null) {
            lpVar.P = true;
            coVar.e7 = true;
            if (lpVar.v()) {
                wallPaper = null;
            } else {
                wallPaper = lpVar.f28294n.h;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.d4 d4Var = lpVar.M.f27909a;
            if (d4Var.f20388a) {
                lpVar.f28294n.i(null, wallPaper2, z10, Boolean.valueOf(lpVar.N), false);
            } else {
                lpVar.f28294n.i(d4Var, wallPaper2, z10, Boolean.valueOf(lpVar.N), false);
            }
            coVar.e7 = false;
        }
    }
}
