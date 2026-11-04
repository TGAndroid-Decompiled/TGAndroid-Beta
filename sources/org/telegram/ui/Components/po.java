package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class po implements org.telegram.ui.d71 {
    public final vo f37209a;

    public po(vo voVar) {
        this.f37209a = voVar;
    }

    @Override
    public final boolean Y0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f37209a.E1;
    }

    @Override
    public final void l1(boolean z10) {
        TLRPC.WallPaper wallPaper;
        vo voVar = this.f37209a;
        org.telegram.ui.wm wmVar = voVar.f39191s1;
        voVar.E1 = !voVar.E1;
        if (voVar.D1 != null) {
            voVar.G1 = true;
            wmVar.f51514v7 = true;
            if (voVar.P0()) {
                wallPaper = null;
            } else {
                wallPaper = voVar.f39188p1.f50125g;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.p3 p3Var = voVar.D1.f38832a;
            if (p3Var.f28419a) {
                voVar.f39188p1.r(null, wallPaper2, z10, Boolean.valueOf(voVar.E1), false);
            } else {
                voVar.f39188p1.r(p3Var, wallPaper2, z10, Boolean.valueOf(voVar.E1), false);
            }
            wmVar.f51514v7 = false;
        }
    }
}
