package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nd1;
public final class ep implements nd1 {
    public final mp f23728a;

    public ep(mp mpVar) {
        this.f23728a = mpVar;
    }

    @Override
    public final boolean Y0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f23728a.N;
    }

    @Override
    public final void o1(boolean z10) {
        TLRPC.WallPaper wallPaper;
        mp mpVar = this.f23728a;
        org.telegram.ui.bo boVar = mpVar.v;
        mpVar.N = !mpVar.N;
        if (mpVar.M != null) {
            mpVar.P = true;
            boVar.e7 = true;
            if (mpVar.v()) {
                wallPaper = null;
            } else {
                wallPaper = mpVar.f26203n.h;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.d4 d4Var = mpVar.M.f25997a;
            if (d4Var.f18587a) {
                mpVar.f26203n.i(null, wallPaper2, z10, Boolean.valueOf(mpVar.N), false);
            } else {
                mpVar.f26203n.i(d4Var, wallPaper2, z10, Boolean.valueOf(mpVar.N), false);
            }
            boVar.e7 = false;
        }
    }
}
