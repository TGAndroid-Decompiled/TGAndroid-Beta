package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.mc1;
public final class sp implements mc1 {
    public final zp f32654a;

    public sp(zp zpVar) {
        this.f32654a = zpVar;
    }

    @Override
    public final boolean X0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f32654a.M;
    }

    @Override
    public final void j1(boolean z10) {
        TLRPC.WallPaper wallPaper;
        zp zpVar = this.f32654a;
        org.telegram.ui.wn wnVar = zpVar.v;
        zpVar.M = !zpVar.M;
        if (zpVar.L != null) {
            zpVar.O = true;
            wnVar.f45306u7 = true;
            if (zpVar.A()) {
                wallPaper = null;
            } else {
                wallPaper = zpVar.f35422n.f44060g;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.h4 h4Var = zpVar.L.f35124a;
            if (h4Var.f22683a) {
                zpVar.f35422n.q(null, wallPaper2, z10, Boolean.valueOf(zpVar.M), false);
            } else {
                zpVar.f35422n.q(h4Var, wallPaper2, z10, Boolean.valueOf(zpVar.M), false);
            }
            wnVar.f45306u7 = false;
        }
    }
}
