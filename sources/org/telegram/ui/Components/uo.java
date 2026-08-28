package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.fc1;
public final class uo implements fc1 {
    public final cp f33098a;

    public uo(cp cpVar) {
        this.f33098a = cpVar;
    }

    @Override
    public final boolean X0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f33098a.J;
    }

    @Override
    public final void m1(boolean z10) {
        TLRPC.WallPaper wallPaper;
        cp cpVar = this.f33098a;
        org.telegram.ui.qn qnVar = cpVar.v;
        cpVar.J = !cpVar.J;
        if (cpVar.I != null) {
            cpVar.L = true;
            qnVar.f41845a7 = true;
            if (cpVar.v()) {
                wallPaper = null;
            } else {
                wallPaper = cpVar.f27528n.h;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.b4 b4Var = cpVar.I.f27261a;
            if (b4Var.f22748a) {
                cpVar.f27528n.i(null, wallPaper2, z10, Boolean.valueOf(cpVar.J), false);
            } else {
                cpVar.f27528n.i(b4Var, wallPaper2, z10, Boolean.valueOf(cpVar.J), false);
            }
            qnVar.f41845a7 = false;
        }
    }
}
