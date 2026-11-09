package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class po implements org.telegram.ui.o71 {
    public final vo f37060a;

    public po(vo voVar) {
        this.f37060a = voVar;
    }

    @Override
    public final boolean a() {
        return this.f37060a.D1;
    }

    @Override
    public final boolean a1() {
        return true;
    }

    @Override
    public final void t1(boolean z9) {
        TLRPC.WallPaper wallPaper;
        vo voVar = this.f37060a;
        org.telegram.ui.cn cnVar = voVar.f39150r1;
        voVar.D1 = !voVar.D1;
        if (voVar.C1 != null) {
            voVar.F1 = true;
            cnVar.f44642u7 = true;
            if (voVar.P0()) {
                wallPaper = null;
            } else {
                wallPaper = voVar.f39147o1.f43730g;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.r3 r3Var = voVar.C1.f38760a;
            if (r3Var.f28460a) {
                voVar.f39147o1.r(null, wallPaper2, z9, Boolean.valueOf(voVar.D1), false);
            } else {
                voVar.f39147o1.r(r3Var, wallPaper2, z9, Boolean.valueOf(voVar.D1), false);
            }
            cnVar.f44642u7 = false;
        }
    }
}
