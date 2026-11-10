package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class oo implements org.telegram.ui.p71 {
    public final vo f36654a;

    public oo(vo voVar) {
        this.f36654a = voVar;
    }

    @Override
    public final boolean a() {
        return this.f36654a.G1;
    }

    @Override
    public final boolean a1() {
        return true;
    }

    @Override
    public final void t1(boolean z9) {
        TLRPC.WallPaper wallPaper;
        vo voVar = this.f36654a;
        org.telegram.ui.cn cnVar = voVar.f39071u1;
        voVar.G1 = !voVar.G1;
        if (voVar.F1 != null) {
            voVar.I1 = true;
            cnVar.f44683u7 = true;
            if (voVar.P0()) {
                wallPaper = null;
            } else {
                wallPaper = voVar.f39068r1.f43730g;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.s3 s3Var = voVar.F1.f38725a;
            if (s3Var.f28485a) {
                voVar.f39068r1.r(null, wallPaper2, z9, Boolean.valueOf(voVar.G1), false);
            } else {
                voVar.f39068r1.r(s3Var, wallPaper2, z9, Boolean.valueOf(voVar.G1), false);
            }
            cnVar.f44683u7 = false;
        }
    }
}
