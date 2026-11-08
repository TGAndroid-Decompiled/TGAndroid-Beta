package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class po implements org.telegram.ui.n71 {
    public final vo f37055a;

    public po(vo voVar) {
        this.f37055a = voVar;
    }

    @Override
    public final boolean a() {
        return this.f37055a.D1;
    }

    @Override
    public final boolean a1() {
        return true;
    }

    @Override
    public final void t1(boolean z9) {
        TLRPC.WallPaper wallPaper;
        vo voVar = this.f37055a;
        org.telegram.ui.an anVar = voVar.f39059r1;
        voVar.D1 = !voVar.D1;
        if (voVar.C1 != null) {
            voVar.F1 = true;
            anVar.f43985u7 = true;
            if (voVar.P0()) {
                wallPaper = null;
            } else {
                wallPaper = voVar.f39056o1.f52251g;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.r3 r3Var = voVar.C1.f38699a;
            if (r3Var.f28459a) {
                voVar.f39056o1.r(null, wallPaper2, z9, Boolean.valueOf(voVar.D1), false);
            } else {
                voVar.f39056o1.r(r3Var, wallPaper2, z9, Boolean.valueOf(voVar.D1), false);
            }
            anVar.f43985u7 = false;
        }
    }
}
