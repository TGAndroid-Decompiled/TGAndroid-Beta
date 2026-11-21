package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class kk implements ViewTreeObserver.OnPreDrawListener {
    public final int f36920a;
    public final org.telegram.messenger.fj f36921b;
    public final boolean f36922c;
    public final ViewGroup d;
    public final dk0 f36923e;

    public kk(dk0 dk0Var, ViewGroup viewGroup, org.telegram.messenger.fj fjVar, boolean z10, int i7) {
        this.f36920a = i7;
        this.f36923e = dk0Var;
        this.d = viewGroup;
        this.f36921b = fjVar;
        this.f36922c = z10;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f36920a) {
            case 0:
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) this.d;
                i7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                lk lkVar = (lk) this.f36923e;
                org.telegram.ui.vz vzVar = lkVar.I;
                mk mkVar = lkVar.Y;
                boolean x10 = mkVar.f37521b.V2.x();
                boolean z10 = this.f36922c;
                if (x10) {
                    org.telegram.messenger.fj fjVar = this.f36921b;
                    int e12 = fjVar.e1();
                    vzVar.f52917a = org.telegram.messenger.fj.B0(fjVar.f23993k);
                    vzVar.f52918b = e12;
                    i7Var.b(mkVar.U.containsKey(vzVar), z10);
                    return true;
                }
                i7Var.b(false, z10);
                return true;
            case 1:
                org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) this.d;
                u2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.c00 c00Var = ((org.telegram.ui.wz) this.f36923e).f53557c;
                boolean V1 = c00Var.f46363p0.V1();
                boolean z11 = this.f36922c;
                if (V1) {
                    org.telegram.ui.vz vzVar2 = c00Var.T;
                    org.telegram.messenger.fj fjVar2 = this.f36921b;
                    int e13 = fjVar2.e1();
                    vzVar2.f52917a = org.telegram.messenger.fj.B0(fjVar2.f23993k);
                    vzVar2.f52918b = e13;
                    u2Var.c0(c00Var.f46363p0.r0(c00Var.T), z11);
                    return true;
                }
                u2Var.c0(false, z11);
                return true;
            case 2:
                org.telegram.ui.Cells.i7 i7Var2 = (org.telegram.ui.Cells.i7) this.d;
                i7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.c00 c00Var2 = ((org.telegram.ui.xz) this.f36923e).f53986w;
                boolean V12 = c00Var2.f46363p0.V1();
                boolean z12 = this.f36922c;
                if (V12) {
                    org.telegram.ui.vz vzVar3 = c00Var2.T;
                    org.telegram.messenger.fj fjVar3 = this.f36921b;
                    int e14 = fjVar3.e1();
                    vzVar3.f52917a = org.telegram.messenger.fj.B0(fjVar3.f23993k);
                    vzVar3.f52918b = e14;
                    i7Var2.b(c00Var2.f46363p0.r0(c00Var2.T), z12);
                    return true;
                }
                i7Var2.b(false, z12);
                return true;
            case 3:
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) this.d;
                h7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.c00 c00Var3 = ((org.telegram.ui.xz) this.f36923e).f53986w;
                boolean V13 = c00Var3.f46363p0.V1();
                boolean z13 = this.f36922c;
                if (V13) {
                    org.telegram.ui.vz vzVar4 = c00Var3.T;
                    org.telegram.messenger.fj fjVar4 = this.f36921b;
                    int e15 = fjVar4.e1();
                    vzVar4.f52917a = org.telegram.messenger.fj.B0(fjVar4.f23993k);
                    vzVar4.f52918b = e15;
                    h7Var.e(c00Var3.f46363p0.r0(c00Var3.T), z13);
                    return true;
                }
                h7Var.e(false, z13);
                return true;
            default:
                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) this.d;
                l7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.c00 c00Var4 = ((org.telegram.ui.zz) this.f36923e).f54667w;
                boolean V14 = c00Var4.f46363p0.V1();
                boolean z14 = this.f36922c;
                if (V14) {
                    org.telegram.ui.vz vzVar5 = c00Var4.T;
                    org.telegram.messenger.fj fjVar5 = this.f36921b;
                    int e16 = fjVar5.e1();
                    vzVar5.f52917a = org.telegram.messenger.fj.B0(fjVar5.f23993k);
                    vzVar5.f52918b = e16;
                    l7Var.f(c00Var4.f46363p0.r0(c00Var4.T), z14);
                    return true;
                }
                l7Var.f(false, z14);
                return true;
        }
    }
}
