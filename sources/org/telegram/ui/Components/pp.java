package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.hc1;
public final class pp implements hc1 {
    public final wp f29627a;

    public pp(wp wpVar) {
        this.f29627a = wpVar;
    }

    @Override
    public final boolean I0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f29627a.M;
    }

    @Override
    public final void c1(boolean z10) {
        TLRPC.WallPaper wallPaper;
        wp wpVar = this.f29627a;
        org.telegram.ui.sn snVar = wpVar.v;
        wpVar.M = !wpVar.M;
        if (wpVar.L != null) {
            wpVar.O = true;
            snVar.f41651q7 = true;
            if (wpVar.A()) {
                wallPaper = null;
            } else {
                wallPaper = wpVar.f32297n.f40872g;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.f4 f4Var = wpVar.L.f32035a;
            if (f4Var.f20884a) {
                wpVar.f32297n.q(null, wallPaper2, z10, Boolean.valueOf(wpVar.M), false);
            } else {
                wpVar.f32297n.q(f4Var, wallPaper2, z10, Boolean.valueOf(wpVar.M), false);
            }
            snVar.f41651q7 = false;
        }
    }
}
