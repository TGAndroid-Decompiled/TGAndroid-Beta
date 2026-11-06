package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class po implements org.telegram.ui.m71 {
    public final vo f37013a;

    public po(vo voVar) {
        this.f37013a = voVar;
    }

    @Override
    public final boolean a() {
        return this.f37013a.D1;
    }

    @Override
    public final boolean a1() {
        return true;
    }

    @Override
    public final void t1(boolean z9) {
        TLRPC.WallPaper wallPaper;
        vo voVar = this.f37013a;
        org.telegram.ui.an anVar = voVar.f39003r1;
        voVar.D1 = !voVar.D1;
        if (voVar.C1 != null) {
            voVar.F1 = true;
            anVar.f43980u7 = true;
            if (voVar.P0()) {
                wallPaper = null;
            } else {
                wallPaper = voVar.f39000o1.f52273g;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.r3 r3Var = voVar.C1.f38688a;
            if (r3Var.f28455a) {
                voVar.f39000o1.r(null, wallPaper2, z9, Boolean.valueOf(voVar.D1), false);
            } else {
                voVar.f39000o1.r(r3Var, wallPaper2, z9, Boolean.valueOf(voVar.D1), false);
            }
            anVar.f43980u7 = false;
        }
    }
}
