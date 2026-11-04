package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class sj implements ViewTreeObserver.OnPreDrawListener {
    public final int f38042a;
    public final org.telegram.messenger.zi f38043b;
    public final boolean f38044c;
    public final ViewGroup d;
    public final sj0 f38045e;

    public sj(sj0 sj0Var, ViewGroup viewGroup, org.telegram.messenger.zi ziVar, boolean z10, int i3) {
        this.f38042a = i3;
        this.f38045e = sj0Var;
        this.d = viewGroup;
        this.f38043b = ziVar;
        this.f38044c = z10;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f38042a) {
            case 0:
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) this.d;
                g7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                tj tjVar = (tj) this.f38045e;
                org.telegram.ui.pz pzVar = tjVar.I;
                uj ujVar = tjVar.Y;
                boolean v = ujVar.f38416b.S2.v();
                boolean z10 = this.f38044c;
                if (v) {
                    org.telegram.messenger.zi ziVar = this.f38043b;
                    int f12 = ziVar.f1();
                    pzVar.f48707a = org.telegram.messenger.zi.B0(ziVar.f26868k);
                    pzVar.f48708b = f12;
                    g7Var.b(ujVar.U.containsKey(pzVar), z10);
                    return true;
                }
                g7Var.b(false, z10);
                return true;
            case 1:
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) this.d;
                t2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.wz wzVar = ((org.telegram.ui.qz) this.f38045e).f48972c;
                boolean I = wzVar.f51656p0.I();
                boolean z11 = this.f38044c;
                if (I) {
                    org.telegram.ui.pz pzVar2 = wzVar.T;
                    org.telegram.messenger.zi ziVar2 = this.f38043b;
                    int f13 = ziVar2.f1();
                    pzVar2.f48707a = org.telegram.messenger.zi.B0(ziVar2.f26868k);
                    pzVar2.f48708b = f13;
                    t2Var.c0(wzVar.f51656p0.n(wzVar.T), z11);
                    return true;
                }
                t2Var.c0(false, z11);
                return true;
            case 2:
                org.telegram.ui.Cells.g7 g7Var2 = (org.telegram.ui.Cells.g7) this.d;
                g7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.wz wzVar2 = ((org.telegram.ui.rz) this.f38045e).f49309w;
                boolean I2 = wzVar2.f51656p0.I();
                boolean z12 = this.f38044c;
                if (I2) {
                    org.telegram.ui.pz pzVar3 = wzVar2.T;
                    org.telegram.messenger.zi ziVar3 = this.f38043b;
                    int f14 = ziVar3.f1();
                    pzVar3.f48707a = org.telegram.messenger.zi.B0(ziVar3.f26868k);
                    pzVar3.f48708b = f14;
                    g7Var2.b(wzVar2.f51656p0.n(wzVar2.T), z12);
                    return true;
                }
                g7Var2.b(false, z12);
                return true;
            case 3:
                org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) this.d;
                f7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.wz wzVar3 = ((org.telegram.ui.rz) this.f38045e).f49309w;
                boolean I3 = wzVar3.f51656p0.I();
                boolean z13 = this.f38044c;
                if (I3) {
                    org.telegram.ui.pz pzVar4 = wzVar3.T;
                    org.telegram.messenger.zi ziVar4 = this.f38043b;
                    int f15 = ziVar4.f1();
                    pzVar4.f48707a = org.telegram.messenger.zi.B0(ziVar4.f26868k);
                    pzVar4.f48708b = f15;
                    f7Var.e(wzVar3.f51656p0.n(wzVar3.T), z13);
                    return true;
                }
                f7Var.e(false, z13);
                return true;
            default:
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) this.d;
                j7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.wz wzVar4 = ((org.telegram.ui.tz) this.f38045e).f49926w;
                boolean I4 = wzVar4.f51656p0.I();
                boolean z14 = this.f38044c;
                if (I4) {
                    org.telegram.ui.pz pzVar5 = wzVar4.T;
                    org.telegram.messenger.zi ziVar5 = this.f38043b;
                    int f16 = ziVar5.f1();
                    pzVar5.f48707a = org.telegram.messenger.zi.B0(ziVar5.f26868k);
                    pzVar5.f48708b = f16;
                    j7Var.f(wzVar4.f51656p0.n(wzVar4.T), z14);
                    return true;
                }
                j7Var.f(false, z14);
                return true;
        }
    }
}
