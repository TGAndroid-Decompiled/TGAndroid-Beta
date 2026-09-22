package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.od1;
public final class ep implements od1 {
    public final mp f24011a;

    public ep(mp mpVar) {
        this.f24011a = mpVar;
    }

    @Override
    public final boolean V0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f24011a.N;
    }

    @Override
    public final void o1(boolean z10) {
        TLRPC.WallPaper wallPaper;
        mp mpVar = this.f24011a;
        org.telegram.ui.zn znVar = mpVar.v;
        mpVar.N = !mpVar.N;
        if (mpVar.M != null) {
            mpVar.P = true;
            znVar.e7 = true;
            if (mpVar.v()) {
                wallPaper = null;
            } else {
                wallPaper = mpVar.f26506n.h;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.d4 d4Var = mpVar.M.f26155a;
            if (d4Var.f18822a) {
                mpVar.f26506n.i(null, wallPaper2, z10, Boolean.valueOf(mpVar.N), false);
            } else {
                mpVar.f26506n.i(d4Var, wallPaper2, z10, Boolean.valueOf(mpVar.N), false);
            }
            znVar.e7 = false;
        }
    }
}
