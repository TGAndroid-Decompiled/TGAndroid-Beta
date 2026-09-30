package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.fd1;
public final class hp implements fd1 {
    public final pp f24924a;

    public hp(pp ppVar) {
        this.f24924a = ppVar;
    }

    @Override
    public final boolean Y0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f24924a.N;
    }

    @Override
    public final void o1(boolean z10) {
        TLRPC.WallPaper wallPaper;
        pp ppVar = this.f24924a;
        org.telegram.ui.wn wnVar = ppVar.v;
        ppVar.N = !ppVar.N;
        if (ppVar.M != null) {
            ppVar.P = true;
            wnVar.e7 = true;
            if (ppVar.v()) {
                wallPaper = null;
            } else {
                wallPaper = ppVar.f27434n.h;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.b4 b4Var = ppVar.M.f27160a;
            if (b4Var.f18773a) {
                ppVar.f27434n.i(null, wallPaper2, z10, Boolean.valueOf(ppVar.N), false);
            } else {
                ppVar.f27434n.i(b4Var, wallPaper2, z10, Boolean.valueOf(ppVar.N), false);
            }
            wnVar.e7 = false;
        }
    }
}
