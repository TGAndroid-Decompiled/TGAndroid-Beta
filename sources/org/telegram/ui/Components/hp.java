package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class hp implements org.telegram.ui.p71 {
    public final np f35900a;

    public hp(np npVar) {
        this.f35900a = npVar;
    }

    @Override
    public final boolean Y0() {
        return true;
    }

    @Override
    public final boolean d() {
        return this.f35900a.H1;
    }

    @Override
    public final void l1(boolean z10) {
        TLRPC.WallPaper wallPaper;
        np npVar = this.f35900a;
        org.telegram.ui.bn bnVar = npVar.f37891v1;
        npVar.H1 = !npVar.H1;
        if (npVar.G1 != null) {
            npVar.J1 = true;
            bnVar.f46197w7 = true;
            if (npVar.Q0()) {
                wallPaper = null;
            } else {
                wallPaper = npVar.f37888s1.f54553g;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.s3 s3Var = npVar.G1.f37548a;
            if (s3Var.f29949a) {
                npVar.f37888s1.r(null, wallPaper2, z10, Boolean.valueOf(npVar.H1), false);
            } else {
                npVar.f37888s1.r(s3Var, wallPaper2, z10, Boolean.valueOf(npVar.H1), false);
            }
            bnVar.f46197w7 = false;
        }
    }
}
