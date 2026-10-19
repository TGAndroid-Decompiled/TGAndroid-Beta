package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bc1;
public final class op implements bc1 {
    public final wp f29068a;

    public op(wp wpVar) {
        this.f29068a = wpVar;
    }

    @Override
    public final boolean I0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f29068a.N;
    }

    @Override
    public final void c1(boolean z10) {
        TLRPC.WallPaper wallPaper;
        wp wpVar = this.f29068a;
        org.telegram.ui.qn qnVar = wpVar.v;
        wpVar.N = !wpVar.N;
        if (wpVar.M != null) {
            wpVar.P = true;
            qnVar.e7 = true;
            if (wpVar.x()) {
                wallPaper = null;
            } else {
                wallPaper = wpVar.f32178n.h;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.c4 c4Var = wpVar.M.f31898a;
            if (c4Var.f20720a) {
                wpVar.f32178n.k(null, wallPaper2, z10, Boolean.valueOf(wpVar.N), false);
            } else {
                wpVar.f32178n.k(c4Var, wallPaper2, z10, Boolean.valueOf(wpVar.N), false);
            }
            qnVar.e7 = false;
        }
    }
}
