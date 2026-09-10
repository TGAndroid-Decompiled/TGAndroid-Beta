package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.rd1;
public final class kp implements rd1 {
    public final sp f24789a;

    public kp(sp spVar) {
        this.f24789a = spVar;
    }

    @Override
    public final boolean Y0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f24789a.N;
    }

    @Override
    public final void n1(boolean z10) {
        TLRPC.WallPaper wallPaper;
        sp spVar = this.f24789a;
        org.telegram.ui.eo eoVar = spVar.v;
        spVar.N = !spVar.N;
        if (spVar.M != null) {
            spVar.P = true;
            eoVar.e7 = true;
            if (spVar.v()) {
                wallPaper = null;
            } else {
                wallPaper = spVar.f27142n.h;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.f4 f4Var = spVar.M.f26733a;
            if (f4Var.f17714a) {
                spVar.f27142n.i(null, wallPaper2, z10, Boolean.valueOf(spVar.N), false);
            } else {
                spVar.f27142n.i(f4Var, wallPaper2, z10, Boolean.valueOf(spVar.N), false);
            }
            eoVar.e7 = false;
        }
    }
}
