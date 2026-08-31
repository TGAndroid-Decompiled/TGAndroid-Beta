package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.vc1;
public final class dp implements vc1 {
    public final mp f26304a;

    public dp(mp mpVar) {
        this.f26304a = mpVar;
    }

    @Override
    public final boolean T0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f26304a.K;
    }

    @Override
    public final void l1(boolean z4) {
        TLRPC.WallPaper wallPaper;
        mp mpVar = this.f26304a;
        org.telegram.ui.xn xnVar = mpVar.v;
        mpVar.K = !mpVar.K;
        if (mpVar.J != null) {
            mpVar.M = true;
            xnVar.f43133b7 = true;
            if (mpVar.v()) {
                wallPaper = null;
            } else {
                wallPaper = mpVar.f29175n.h;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.f4 f4Var = mpVar.J.f28796a;
            if (f4Var.f21358a) {
                mpVar.f29175n.i(null, wallPaper2, z4, Boolean.valueOf(mpVar.K), false);
            } else {
                mpVar.f29175n.i(f4Var, wallPaper2, z4, Boolean.valueOf(mpVar.K), false);
            }
            xnVar.f43133b7 = false;
        }
    }
}
