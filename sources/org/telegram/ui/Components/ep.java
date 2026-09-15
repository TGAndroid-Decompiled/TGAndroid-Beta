package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.md1;
public final class ep implements md1 {
    public final mp f23729a;

    public ep(mp mpVar) {
        this.f23729a = mpVar;
    }

    @Override
    public final boolean Y0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f23729a.N;
    }

    @Override
    public final void o1(boolean z10) {
        TLRPC.WallPaper wallPaper;
        mp mpVar = this.f23729a;
        org.telegram.ui.bo boVar = mpVar.v;
        mpVar.N = !mpVar.N;
        if (mpVar.M != null) {
            mpVar.P = true;
            boVar.e7 = true;
            if (mpVar.v()) {
                wallPaper = null;
            } else {
                wallPaper = mpVar.f26204n.h;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.d4 d4Var = mpVar.M.f25994a;
            if (d4Var.f18589a) {
                mpVar.f26204n.i(null, wallPaper2, z10, Boolean.valueOf(mpVar.N), false);
            } else {
                mpVar.f26204n.i(d4Var, wallPaper2, z10, Boolean.valueOf(mpVar.N), false);
            }
            boVar.e7 = false;
        }
    }
}
