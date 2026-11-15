package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class bk implements ViewTreeObserver.OnPreDrawListener {
    public final int f33292a;
    public final org.telegram.messenger.gj f33293b;
    public final boolean f33294c;
    public final ViewGroup d;
    public final tj0 f33295e;

    public bk(tj0 tj0Var, ViewGroup viewGroup, org.telegram.messenger.gj gjVar, boolean z10, int i7) {
        this.f33292a = i7;
        this.f33295e = tj0Var;
        this.d = viewGroup;
        this.f33293b = gjVar;
        this.f33294c = z10;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f33292a) {
            case 0:
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) this.d;
                g7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ck ckVar = (ck) this.f33295e;
                org.telegram.ui.sz szVar = ckVar.I;
                dk dkVar = ckVar.Y;
                boolean x10 = dkVar.f33609b.V2.x();
                boolean z10 = this.f33294c;
                if (x10) {
                    org.telegram.messenger.gj gjVar = this.f33293b;
                    int e12 = gjVar.e1();
                    szVar.f51306a = org.telegram.messenger.gj.B0(gjVar.f23819k);
                    szVar.f51307b = e12;
                    g7Var.b(dkVar.U.containsKey(szVar), z10);
                    return true;
                }
                g7Var.b(false, z10);
                return true;
            case 1:
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) this.d;
                t2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.zz zzVar = ((org.telegram.ui.tz) this.f33295e).f51701c;
                boolean g02 = zzVar.f54093p0.g0();
                boolean z11 = this.f33294c;
                if (g02) {
                    org.telegram.ui.sz szVar2 = zzVar.T;
                    org.telegram.messenger.gj gjVar2 = this.f33293b;
                    int e13 = gjVar2.e1();
                    szVar2.f51306a = org.telegram.messenger.gj.B0(gjVar2.f23819k);
                    szVar2.f51307b = e13;
                    t2Var.e0(zzVar.f54093p0.l(zzVar.T), z11);
                    return true;
                }
                t2Var.e0(false, z11);
                return true;
            case 2:
                org.telegram.ui.Cells.g7 g7Var2 = (org.telegram.ui.Cells.g7) this.d;
                g7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.zz zzVar2 = ((org.telegram.ui.uz) this.f33295e).f52068w;
                boolean g03 = zzVar2.f54093p0.g0();
                boolean z12 = this.f33294c;
                if (g03) {
                    org.telegram.ui.sz szVar3 = zzVar2.T;
                    org.telegram.messenger.gj gjVar3 = this.f33293b;
                    int e14 = gjVar3.e1();
                    szVar3.f51306a = org.telegram.messenger.gj.B0(gjVar3.f23819k);
                    szVar3.f51307b = e14;
                    g7Var2.b(zzVar2.f54093p0.l(zzVar2.T), z12);
                    return true;
                }
                g7Var2.b(false, z12);
                return true;
            case 3:
                org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) this.d;
                f7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.zz zzVar3 = ((org.telegram.ui.uz) this.f33295e).f52068w;
                boolean g04 = zzVar3.f54093p0.g0();
                boolean z13 = this.f33294c;
                if (g04) {
                    org.telegram.ui.sz szVar4 = zzVar3.T;
                    org.telegram.messenger.gj gjVar4 = this.f33293b;
                    int e15 = gjVar4.e1();
                    szVar4.f51306a = org.telegram.messenger.gj.B0(gjVar4.f23819k);
                    szVar4.f51307b = e15;
                    f7Var.e(zzVar3.f54093p0.l(zzVar3.T), z13);
                    return true;
                }
                f7Var.e(false, z13);
                return true;
            default:
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) this.d;
                j7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.zz zzVar4 = ((org.telegram.ui.wz) this.f33295e).f53031w;
                boolean g05 = zzVar4.f54093p0.g0();
                boolean z14 = this.f33294c;
                if (g05) {
                    org.telegram.ui.sz szVar5 = zzVar4.T;
                    org.telegram.messenger.gj gjVar5 = this.f33293b;
                    int e16 = gjVar5.e1();
                    szVar5.f51306a = org.telegram.messenger.gj.B0(gjVar5.f23819k);
                    szVar5.f51307b = e16;
                    j7Var.f(zzVar4.f54093p0.l(zzVar4.T), z14);
                    return true;
                }
                j7Var.f(false, z14);
                return true;
        }
    }
}
