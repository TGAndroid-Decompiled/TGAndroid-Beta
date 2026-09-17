package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.od1;
public final class ep implements od1 {
    public final mp f23638a;

    public ep(mp mpVar) {
        this.f23638a = mpVar;
    }

    @Override
    public final boolean Y0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f23638a.N;
    }

    @Override
    public final void o1(boolean z10) {
        TLRPC.WallPaper wallPaper;
        mp mpVar = this.f23638a;
        org.telegram.ui.bo boVar = mpVar.v;
        mpVar.N = !mpVar.N;
        if (mpVar.M != null) {
            mpVar.P = true;
            boVar.e7 = true;
            if (mpVar.v()) {
                wallPaper = null;
            } else {
                wallPaper = mpVar.f26231n.h;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.e4 e4Var = mpVar.M.f25954a;
            if (e4Var.f18617a) {
                mpVar.f26231n.i(null, wallPaper2, z10, Boolean.valueOf(mpVar.N), false);
            } else {
                mpVar.f26231n.i(e4Var, wallPaper2, z10, Boolean.valueOf(mpVar.N), false);
            }
            boVar.e7 = false;
        }
    }
}
