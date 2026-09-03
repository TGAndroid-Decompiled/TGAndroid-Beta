package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ad1;
public final class ap implements ad1 {
    public final jp f23466a;

    public ap(jp jpVar) {
        this.f23466a = jpVar;
    }

    @Override
    public final boolean T0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f23466a.K;
    }

    @Override
    public final void l1(boolean z4) {
        TLRPC.WallPaper wallPaper;
        jp jpVar = this.f23466a;
        org.telegram.ui.zn znVar = jpVar.v;
        jpVar.K = !jpVar.K;
        if (jpVar.J != null) {
            jpVar.M = true;
            znVar.f40531b7 = true;
            if (jpVar.v()) {
                wallPaper = null;
            } else {
                wallPaper = jpVar.f26014n.h;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.e4 e4Var = jpVar.J.f25749a;
            if (e4Var.f19638a) {
                jpVar.f26014n.i(null, wallPaper2, z4, Boolean.valueOf(jpVar.K), false);
            } else {
                jpVar.f26014n.i(e4Var, wallPaper2, z4, Boolean.valueOf(jpVar.K), false);
            }
            znVar.f40531b7 = false;
        }
    }
}
