package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.tc1;
public final class bp implements tc1 {
    public final kp f23733a;

    public bp(kp kpVar) {
        this.f23733a = kpVar;
    }

    @Override
    public final boolean V0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f23733a.K;
    }

    @Override
    public final void n1(boolean z4) {
        TLRPC.WallPaper wallPaper;
        kp kpVar = this.f23733a;
        org.telegram.ui.xn xnVar = kpVar.v;
        kpVar.K = !kpVar.K;
        if (kpVar.J != null) {
            kpVar.M = true;
            xnVar.f39965b7 = true;
            if (kpVar.v()) {
                wallPaper = null;
            } else {
                wallPaper = kpVar.f26344n.h;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.e4 e4Var = kpVar.J.f26015a;
            if (e4Var.f19663a) {
                kpVar.f26344n.i(null, wallPaper2, z4, Boolean.valueOf(kpVar.K), false);
            } else {
                kpVar.f26344n.i(e4Var, wallPaper2, z4, Boolean.valueOf(kpVar.K), false);
            }
            xnVar.f39965b7 = false;
        }
    }
}
