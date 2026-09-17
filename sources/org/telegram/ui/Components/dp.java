package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nd1;
public final class dp implements nd1 {
    public final lp f25461a;

    public dp(lp lpVar) {
        this.f25461a = lpVar;
    }

    @Override
    public final boolean Z0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f25461a.N;
    }

    @Override
    public final void p1(boolean z10) {
        TLRPC.WallPaper wallPaper;
        lp lpVar = this.f25461a;
        org.telegram.ui.co coVar = lpVar.v;
        lpVar.N = !lpVar.N;
        if (lpVar.M != null) {
            lpVar.P = true;
            coVar.e7 = true;
            if (lpVar.v()) {
                wallPaper = null;
            } else {
                wallPaper = lpVar.f28295n.h;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.d4 d4Var = lpVar.M.f27910a;
            if (d4Var.f20389a) {
                lpVar.f28295n.i(null, wallPaper2, z10, Boolean.valueOf(lpVar.N), false);
            } else {
                lpVar.f28295n.i(d4Var, wallPaper2, z10, Boolean.valueOf(lpVar.N), false);
            }
            coVar.e7 = false;
        }
    }
}
