package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class vj implements ViewTreeObserver.OnPreDrawListener {
    public final int f31307a;
    public final org.telegram.messenger.kj f31308b;
    public final boolean f31309c;
    public final ViewGroup d;
    public final tk0 e;

    public vj(tk0 tk0Var, ViewGroup viewGroup, org.telegram.messenger.kj kjVar, boolean z10, int i10) {
        this.f31307a = i10;
        this.e = tk0Var;
        this.d = viewGroup;
        this.f31308b = kjVar;
        this.f31309c = z10;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f31307a) {
            case 0:
                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) this.d;
                l7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                wj wjVar = (wj) this.e;
                org.telegram.ui.r00 r00Var = wjVar.H;
                xj xjVar = wjVar.X;
                boolean u10 = xjVar.f30964b.R2.u();
                boolean z10 = this.f31309c;
                if (u10) {
                    org.telegram.messenger.kj kjVar = this.f31308b;
                    int f12 = kjVar.f1();
                    r00Var.f40933a = org.telegram.messenger.kj.B0(kjVar.f16690k);
                    r00Var.f40934b = f12;
                    l7Var.b(xjVar.T.containsKey(r00Var), z10);
                    return true;
                }
                l7Var.b(false, z10);
                return true;
            case 1:
                org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) this.d;
                v2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.y00 y00Var = ((org.telegram.ui.s00) this.e).f41182c;
                boolean f7 = y00Var.f43514o0.f();
                boolean z11 = this.f31309c;
                if (f7) {
                    org.telegram.ui.r00 r00Var2 = y00Var.S;
                    org.telegram.messenger.kj kjVar2 = this.f31308b;
                    int f13 = kjVar2.f1();
                    r00Var2.f40933a = org.telegram.messenger.kj.B0(kjVar2.f16690k);
                    r00Var2.f40934b = f13;
                    v2Var.c0(y00Var.f43514o0.b(y00Var.S), z11);
                    return true;
                }
                v2Var.c0(false, z11);
                return true;
            case 2:
                org.telegram.ui.Cells.l7 l7Var2 = (org.telegram.ui.Cells.l7) this.d;
                l7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.y00 y00Var2 = ((org.telegram.ui.t00) this.e).f41502w;
                boolean f10 = y00Var2.f43514o0.f();
                boolean z12 = this.f31309c;
                if (f10) {
                    org.telegram.ui.r00 r00Var3 = y00Var2.S;
                    org.telegram.messenger.kj kjVar3 = this.f31308b;
                    int f14 = kjVar3.f1();
                    r00Var3.f40933a = org.telegram.messenger.kj.B0(kjVar3.f16690k);
                    r00Var3.f40934b = f14;
                    l7Var2.b(y00Var2.f43514o0.b(y00Var2.S), z12);
                    return true;
                }
                l7Var2.b(false, z12);
                return true;
            case 3:
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) this.d;
                k7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.y00 y00Var3 = ((org.telegram.ui.t00) this.e).f41502w;
                boolean f11 = y00Var3.f43514o0.f();
                boolean z13 = this.f31309c;
                if (f11) {
                    org.telegram.ui.r00 r00Var4 = y00Var3.S;
                    org.telegram.messenger.kj kjVar4 = this.f31308b;
                    int f15 = kjVar4.f1();
                    r00Var4.f40933a = org.telegram.messenger.kj.B0(kjVar4.f16690k);
                    r00Var4.f40934b = f15;
                    k7Var.e(y00Var3.f43514o0.b(y00Var3.S), z13);
                    return true;
                }
                k7Var.e(false, z13);
                return true;
            default:
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) this.d;
                o7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.y00 y00Var4 = ((org.telegram.ui.v00) this.e).f42375w;
                boolean f16 = y00Var4.f43514o0.f();
                boolean z14 = this.f31309c;
                if (f16) {
                    org.telegram.ui.r00 r00Var5 = y00Var4.S;
                    org.telegram.messenger.kj kjVar5 = this.f31308b;
                    int f17 = kjVar5.f1();
                    r00Var5.f40933a = org.telegram.messenger.kj.B0(kjVar5.f16690k);
                    r00Var5.f40934b = f17;
                    o7Var.f(y00Var4.f43514o0.b(y00Var4.S), z14);
                    return true;
                }
                o7Var.f(false, z14);
                return true;
        }
    }
}
