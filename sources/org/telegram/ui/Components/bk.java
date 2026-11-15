package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class bk implements ViewTreeObserver.OnPreDrawListener {
    public final int f33289a;
    public final org.telegram.messenger.gj f33290b;
    public final boolean f33291c;
    public final ViewGroup d;
    public final tj0 f33292e;

    public bk(tj0 tj0Var, ViewGroup viewGroup, org.telegram.messenger.gj gjVar, boolean z10, int i7) {
        this.f33289a = i7;
        this.f33292e = tj0Var;
        this.d = viewGroup;
        this.f33290b = gjVar;
        this.f33291c = z10;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f33289a) {
            case 0:
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) this.d;
                g7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ck ckVar = (ck) this.f33292e;
                org.telegram.ui.sz szVar = ckVar.I;
                dk dkVar = ckVar.Y;
                boolean x10 = dkVar.f33607b.V2.x();
                boolean z10 = this.f33291c;
                if (x10) {
                    org.telegram.messenger.gj gjVar = this.f33290b;
                    int e12 = gjVar.e1();
                    szVar.f51305a = org.telegram.messenger.gj.B0(gjVar.f23817k);
                    szVar.f51306b = e12;
                    g7Var.b(dkVar.U.containsKey(szVar), z10);
                    return true;
                }
                g7Var.b(false, z10);
                return true;
            case 1:
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) this.d;
                t2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.zz zzVar = ((org.telegram.ui.tz) this.f33292e).f51700c;
                boolean g02 = zzVar.f54093p0.g0();
                boolean z11 = this.f33291c;
                if (g02) {
                    org.telegram.ui.sz szVar2 = zzVar.T;
                    org.telegram.messenger.gj gjVar2 = this.f33290b;
                    int e13 = gjVar2.e1();
                    szVar2.f51305a = org.telegram.messenger.gj.B0(gjVar2.f23817k);
                    szVar2.f51306b = e13;
                    t2Var.e0(zzVar.f54093p0.l(zzVar.T), z11);
                    return true;
                }
                t2Var.e0(false, z11);
                return true;
            case 2:
                org.telegram.ui.Cells.g7 g7Var2 = (org.telegram.ui.Cells.g7) this.d;
                g7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.zz zzVar2 = ((org.telegram.ui.uz) this.f33292e).f52070w;
                boolean g03 = zzVar2.f54093p0.g0();
                boolean z12 = this.f33291c;
                if (g03) {
                    org.telegram.ui.sz szVar3 = zzVar2.T;
                    org.telegram.messenger.gj gjVar3 = this.f33290b;
                    int e14 = gjVar3.e1();
                    szVar3.f51305a = org.telegram.messenger.gj.B0(gjVar3.f23817k);
                    szVar3.f51306b = e14;
                    g7Var2.b(zzVar2.f54093p0.l(zzVar2.T), z12);
                    return true;
                }
                g7Var2.b(false, z12);
                return true;
            case 3:
                org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) this.d;
                f7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.zz zzVar3 = ((org.telegram.ui.uz) this.f33292e).f52070w;
                boolean g04 = zzVar3.f54093p0.g0();
                boolean z13 = this.f33291c;
                if (g04) {
                    org.telegram.ui.sz szVar4 = zzVar3.T;
                    org.telegram.messenger.gj gjVar4 = this.f33290b;
                    int e15 = gjVar4.e1();
                    szVar4.f51305a = org.telegram.messenger.gj.B0(gjVar4.f23817k);
                    szVar4.f51306b = e15;
                    f7Var.e(zzVar3.f54093p0.l(zzVar3.T), z13);
                    return true;
                }
                f7Var.e(false, z13);
                return true;
            default:
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) this.d;
                j7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.zz zzVar4 = ((org.telegram.ui.wz) this.f33292e).f53032w;
                boolean g05 = zzVar4.f54093p0.g0();
                boolean z14 = this.f33291c;
                if (g05) {
                    org.telegram.ui.sz szVar5 = zzVar4.T;
                    org.telegram.messenger.gj gjVar5 = this.f33290b;
                    int e16 = gjVar5.e1();
                    szVar5.f51305a = org.telegram.messenger.gj.B0(gjVar5.f23817k);
                    szVar5.f51306b = e16;
                    j7Var.f(zzVar4.f54093p0.l(zzVar4.T), z14);
                    return true;
                }
                j7Var.f(false, z14);
                return true;
        }
    }
}
