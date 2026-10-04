package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.id1;
public final class hp implements id1 {
    public final pp f27211a;

    public hp(pp ppVar) {
        this.f27211a = ppVar;
    }

    @Override
    public final boolean a() {
        return this.f27211a.N;
    }

    @Override
    public final boolean a1() {
        return true;
    }

    @Override
    public final void q1(boolean z10) {
        TLRPC.WallPaper wallPaper;
        pp ppVar = this.f27211a;
        org.telegram.ui.yn ynVar = ppVar.v;
        ppVar.N = !ppVar.N;
        if (ppVar.M != null) {
            ppVar.P = true;
            ynVar.f43304c7 = true;
            if (ppVar.v()) {
                wallPaper = null;
            } else {
                wallPaper = ppVar.f29699n.h;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.c4 c4Var = ppVar.M.f29428a;
            if (c4Var.f20504a) {
                ppVar.f29699n.i(null, wallPaper2, z10, Boolean.valueOf(ppVar.N), false);
            } else {
                ppVar.f29699n.i(c4Var, wallPaper2, z10, Boolean.valueOf(ppVar.N), false);
            }
            ynVar.f43304c7 = false;
        }
    }
}
