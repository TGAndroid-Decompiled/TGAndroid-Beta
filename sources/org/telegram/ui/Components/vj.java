package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class vj implements ViewTreeObserver.OnPreDrawListener {
    public final int f31269a;
    public final org.telegram.messenger.jj f31270b;
    public final boolean f31271c;
    public final ViewGroup d;
    public final sk0 e;

    public vj(sk0 sk0Var, ViewGroup viewGroup, org.telegram.messenger.jj jjVar, boolean z10, int i10) {
        this.f31269a = i10;
        this.e = sk0Var;
        this.d = viewGroup;
        this.f31270b = jjVar;
        this.f31271c = z10;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f31269a) {
            case 0:
                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) this.d;
                l7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                wj wjVar = (wj) this.e;
                org.telegram.ui.s00 s00Var = wjVar.H;
                xj xjVar = wjVar.X;
                boolean u10 = xjVar.f30947b.R2.u();
                boolean z10 = this.f31271c;
                if (u10) {
                    org.telegram.messenger.jj jjVar = this.f31270b;
                    int f12 = jjVar.f1();
                    s00Var.f41322a = org.telegram.messenger.jj.B0(jjVar.f16337k);
                    s00Var.f41323b = f12;
                    l7Var.b(xjVar.T.containsKey(s00Var), z10);
                    return true;
                }
                l7Var.b(false, z10);
                return true;
            case 1:
                org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) this.d;
                v2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.z00 z00Var = ((org.telegram.ui.t00) this.e).f41679c;
                boolean f7 = z00Var.f43957o0.f();
                boolean z11 = this.f31271c;
                if (f7) {
                    org.telegram.ui.s00 s00Var2 = z00Var.S;
                    org.telegram.messenger.jj jjVar2 = this.f31270b;
                    int f13 = jjVar2.f1();
                    s00Var2.f41322a = org.telegram.messenger.jj.B0(jjVar2.f16337k);
                    s00Var2.f41323b = f13;
                    v2Var.c0(z00Var.f43957o0.b(z00Var.S), z11);
                    return true;
                }
                v2Var.c0(false, z11);
                return true;
            case 2:
                org.telegram.ui.Cells.l7 l7Var2 = (org.telegram.ui.Cells.l7) this.d;
                l7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.z00 z00Var2 = ((org.telegram.ui.u00) this.e).f41981w;
                boolean f10 = z00Var2.f43957o0.f();
                boolean z12 = this.f31271c;
                if (f10) {
                    org.telegram.ui.s00 s00Var3 = z00Var2.S;
                    org.telegram.messenger.jj jjVar3 = this.f31270b;
                    int f14 = jjVar3.f1();
                    s00Var3.f41322a = org.telegram.messenger.jj.B0(jjVar3.f16337k);
                    s00Var3.f41323b = f14;
                    l7Var2.b(z00Var2.f43957o0.b(z00Var2.S), z12);
                    return true;
                }
                l7Var2.b(false, z12);
                return true;
            case 3:
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) this.d;
                k7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.z00 z00Var3 = ((org.telegram.ui.u00) this.e).f41981w;
                boolean f11 = z00Var3.f43957o0.f();
                boolean z13 = this.f31271c;
                if (f11) {
                    org.telegram.ui.s00 s00Var4 = z00Var3.S;
                    org.telegram.messenger.jj jjVar4 = this.f31270b;
                    int f15 = jjVar4.f1();
                    s00Var4.f41322a = org.telegram.messenger.jj.B0(jjVar4.f16337k);
                    s00Var4.f41323b = f15;
                    k7Var.e(z00Var3.f43957o0.b(z00Var3.S), z13);
                    return true;
                }
                k7Var.e(false, z13);
                return true;
            default:
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) this.d;
                o7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.z00 z00Var4 = ((org.telegram.ui.w00) this.e).f42846w;
                boolean f16 = z00Var4.f43957o0.f();
                boolean z14 = this.f31271c;
                if (f16) {
                    org.telegram.ui.s00 s00Var5 = z00Var4.S;
                    org.telegram.messenger.jj jjVar5 = this.f31270b;
                    int f17 = jjVar5.f1();
                    s00Var5.f41322a = org.telegram.messenger.jj.B0(jjVar5.f16337k);
                    s00Var5.f41323b = f17;
                    o7Var.f(z00Var4.f43957o0.b(z00Var4.S), z14);
                    return true;
                }
                o7Var.f(false, z14);
                return true;
        }
    }
}
