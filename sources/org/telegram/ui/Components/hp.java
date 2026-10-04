package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.id1;
public final class hp implements id1 {
    public final pp f27206a;

    public hp(pp ppVar) {
        this.f27206a = ppVar;
    }

    @Override
    public final boolean a() {
        return this.f27206a.N;
    }

    @Override
    public final boolean a1() {
        return true;
    }

    @Override
    public final void q1(boolean z10) {
        TLRPC.WallPaper wallPaper;
        pp ppVar = this.f27206a;
        org.telegram.ui.yn ynVar = ppVar.v;
        ppVar.N = !ppVar.N;
        if (ppVar.M != null) {
            ppVar.P = true;
            ynVar.f43297c7 = true;
            if (ppVar.v()) {
                wallPaper = null;
            } else {
                wallPaper = ppVar.f29694n.h;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.c4 c4Var = ppVar.M.f29423a;
            if (c4Var.f20500a) {
                ppVar.f29694n.i(null, wallPaper2, z10, Boolean.valueOf(ppVar.N), false);
            } else {
                ppVar.f29694n.i(c4Var, wallPaper2, z10, Boolean.valueOf(ppVar.N), false);
            }
            ynVar.f43297c7 = false;
        }
    }
}
