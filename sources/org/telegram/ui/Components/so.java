package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ec1;

public final class so implements ec1 {

    public final ap f32513a;

    public so(ap apVar) {
        this.f32513a = apVar;
    }

    @Override
    public final boolean X0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f32513a.J;
    }

    @Override
    public final void n1(boolean z10) {
        ap apVar = this.f32513a;
        org.telegram.ui.rn rnVar = apVar.v;
        apVar.J = !apVar.J;
        if (apVar.I != null) {
            apVar.L = true;
            rnVar.f41980a7 = true;
            TLRPC.WallPaper wallPaper = apVar.w() ? null : apVar.f26785n.h;
            org.telegram.ui.ActionBar.b4 b4Var = apVar.I.f35316a;
            if (b4Var.f22780a) {
                apVar.f26785n.i(null, wallPaper, z10, Boolean.valueOf(apVar.J), false);
            } else {
                apVar.f26785n.i(b4Var, wallPaper, z10, Boolean.valueOf(apVar.J), false);
            }
            rnVar.f41980a7 = false;
        }
    }
}
