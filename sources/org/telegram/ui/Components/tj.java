package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class tj implements ViewTreeObserver.OnPreDrawListener {
    public final int f38362a;
    public final org.telegram.messenger.ij f38363b;
    public final boolean f38364c;
    public final ViewGroup d;
    public final oj0 f38365e;

    public tj(oj0 oj0Var, ViewGroup viewGroup, org.telegram.messenger.ij ijVar, boolean z9, int i7) {
        this.f38362a = i7;
        this.f38365e = oj0Var;
        this.d = viewGroup;
        this.f38363b = ijVar;
        this.f38364c = z9;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f38362a) {
            case 0:
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) this.d;
                h7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                uj ujVar = (uj) this.f38365e;
                org.telegram.ui.rz rzVar = ujVar.H;
                vj vjVar = ujVar.X;
                boolean v = vjVar.f39004b.R2.v();
                boolean z9 = this.f38364c;
                if (v) {
                    org.telegram.messenger.ij ijVar = this.f38363b;
                    int f12 = ijVar.f1();
                    rzVar.f49568a = org.telegram.messenger.ij.B0(ijVar.f23262k);
                    rzVar.f49569b = f12;
                    h7Var.b(vjVar.T.containsKey(rzVar), z9);
                    return true;
                }
                h7Var.b(false, z9);
                return true;
            case 1:
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) this.d;
                t2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.yz yzVar = ((org.telegram.ui.sz) this.f38365e).f49859c;
                boolean i7 = yzVar.f52377o0.i();
                boolean z10 = this.f38364c;
                if (i7) {
                    org.telegram.ui.rz rzVar2 = yzVar.S;
                    org.telegram.messenger.ij ijVar2 = this.f38363b;
                    int f13 = ijVar2.f1();
                    rzVar2.f49568a = org.telegram.messenger.ij.B0(ijVar2.f23262k);
                    rzVar2.f49569b = f13;
                    t2Var.c0(yzVar.f52377o0.f(yzVar.S), z10);
                    return true;
                }
                t2Var.c0(false, z10);
                return true;
            case 2:
                org.telegram.ui.Cells.h7 h7Var2 = (org.telegram.ui.Cells.h7) this.d;
                h7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.yz yzVar2 = ((org.telegram.ui.tz) this.f38365e).f50174w;
                boolean i10 = yzVar2.f52377o0.i();
                boolean z11 = this.f38364c;
                if (i10) {
                    org.telegram.ui.rz rzVar3 = yzVar2.S;
                    org.telegram.messenger.ij ijVar3 = this.f38363b;
                    int f14 = ijVar3.f1();
                    rzVar3.f49568a = org.telegram.messenger.ij.B0(ijVar3.f23262k);
                    rzVar3.f49569b = f14;
                    h7Var2.b(yzVar2.f52377o0.f(yzVar2.S), z11);
                    return true;
                }
                h7Var2.b(false, z11);
                return true;
            case 3:
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) this.d;
                g7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.yz yzVar3 = ((org.telegram.ui.tz) this.f38365e).f50174w;
                boolean i11 = yzVar3.f52377o0.i();
                boolean z12 = this.f38364c;
                if (i11) {
                    org.telegram.ui.rz rzVar4 = yzVar3.S;
                    org.telegram.messenger.ij ijVar4 = this.f38363b;
                    int f15 = ijVar4.f1();
                    rzVar4.f49568a = org.telegram.messenger.ij.B0(ijVar4.f23262k);
                    rzVar4.f49569b = f15;
                    g7Var.e(yzVar3.f52377o0.f(yzVar3.S), z12);
                    return true;
                }
                g7Var.e(false, z12);
                return true;
            default:
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) this.d;
                k7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.yz yzVar4 = ((org.telegram.ui.vz) this.f38365e).f50801w;
                boolean i12 = yzVar4.f52377o0.i();
                boolean z13 = this.f38364c;
                if (i12) {
                    org.telegram.ui.rz rzVar5 = yzVar4.S;
                    org.telegram.messenger.ij ijVar5 = this.f38363b;
                    int f16 = ijVar5.f1();
                    rzVar5.f49568a = org.telegram.messenger.ij.B0(ijVar5.f23262k);
                    rzVar5.f49569b = f16;
                    k7Var.f(yzVar4.f52377o0.f(yzVar4.S), z13);
                    return true;
                }
                k7Var.f(false, z13);
                return true;
        }
    }
}
