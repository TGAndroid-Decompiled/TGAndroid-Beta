package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ad1;
public final class dp implements ad1 {
    public final mp f26345a;

    public dp(mp mpVar) {
        this.f26345a = mpVar;
    }

    @Override
    public final boolean T0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f26345a.K;
    }

    @Override
    public final void l1(boolean z4) {
        TLRPC.WallPaper wallPaper;
        mp mpVar = this.f26345a;
        org.telegram.ui.xn xnVar = mpVar.v;
        mpVar.K = !mpVar.K;
        if (mpVar.J != null) {
            mpVar.M = true;
            xnVar.f43111b7 = true;
            if (mpVar.v()) {
                wallPaper = null;
            } else {
                wallPaper = mpVar.f29218n.h;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.f4 f4Var = mpVar.J.f28819a;
            if (f4Var.f21360a) {
                mpVar.f29218n.i(null, wallPaper2, z4, Boolean.valueOf(mpVar.K), false);
            } else {
                mpVar.f29218n.i(f4Var, wallPaper2, z4, Boolean.valueOf(mpVar.K), false);
            }
            xnVar.f43111b7 = false;
        }
    }
}
