package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class ik implements ViewTreeObserver.OnPreDrawListener {
    public final int f36138a;
    public final org.telegram.messenger.fj f36139b;
    public final boolean f36140c;
    public final ViewGroup d;
    public final bk0 f36141e;

    public ik(bk0 bk0Var, ViewGroup viewGroup, org.telegram.messenger.fj fjVar, boolean z10, int i7) {
        this.f36138a = i7;
        this.f36141e = bk0Var;
        this.d = viewGroup;
        this.f36139b = fjVar;
        this.f36140c = z10;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f36138a) {
            case 0:
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) this.d;
                i7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                jk jkVar = (jk) this.f36141e;
                org.telegram.ui.vz vzVar = jkVar.I;
                kk kkVar = jkVar.Y;
                boolean y10 = kkVar.f36766b.V2.y();
                boolean z10 = this.f36140c;
                if (y10) {
                    org.telegram.messenger.fj fjVar = this.f36139b;
                    int e12 = fjVar.e1();
                    vzVar.f52876a = org.telegram.messenger.fj.B0(fjVar.f23965k);
                    vzVar.f52877b = e12;
                    i7Var.b(kkVar.U.containsKey(vzVar), z10);
                    return true;
                }
                i7Var.b(false, z10);
                return true;
            case 1:
                org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) this.d;
                u2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.c00 c00Var = ((org.telegram.ui.wz) this.f36141e).f53511c;
                boolean V1 = c00Var.f46340p0.V1();
                boolean z11 = this.f36140c;
                if (V1) {
                    org.telegram.ui.vz vzVar2 = c00Var.T;
                    org.telegram.messenger.fj fjVar2 = this.f36139b;
                    int e13 = fjVar2.e1();
                    vzVar2.f52876a = org.telegram.messenger.fj.B0(fjVar2.f23965k);
                    vzVar2.f52877b = e13;
                    u2Var.c0(c00Var.f46340p0.r0(c00Var.T), z11);
                    return true;
                }
                u2Var.c0(false, z11);
                return true;
            case 2:
                org.telegram.ui.Cells.i7 i7Var2 = (org.telegram.ui.Cells.i7) this.d;
                i7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.c00 c00Var2 = ((org.telegram.ui.xz) this.f36141e).f53937w;
                boolean V12 = c00Var2.f46340p0.V1();
                boolean z12 = this.f36140c;
                if (V12) {
                    org.telegram.ui.vz vzVar3 = c00Var2.T;
                    org.telegram.messenger.fj fjVar3 = this.f36139b;
                    int e14 = fjVar3.e1();
                    vzVar3.f52876a = org.telegram.messenger.fj.B0(fjVar3.f23965k);
                    vzVar3.f52877b = e14;
                    i7Var2.b(c00Var2.f46340p0.r0(c00Var2.T), z12);
                    return true;
                }
                i7Var2.b(false, z12);
                return true;
            case 3:
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) this.d;
                h7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.c00 c00Var3 = ((org.telegram.ui.xz) this.f36141e).f53937w;
                boolean V13 = c00Var3.f46340p0.V1();
                boolean z13 = this.f36140c;
                if (V13) {
                    org.telegram.ui.vz vzVar4 = c00Var3.T;
                    org.telegram.messenger.fj fjVar4 = this.f36139b;
                    int e15 = fjVar4.e1();
                    vzVar4.f52876a = org.telegram.messenger.fj.B0(fjVar4.f23965k);
                    vzVar4.f52877b = e15;
                    h7Var.e(c00Var3.f46340p0.r0(c00Var3.T), z13);
                    return true;
                }
                h7Var.e(false, z13);
                return true;
            default:
                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) this.d;
                l7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.c00 c00Var4 = ((org.telegram.ui.zz) this.f36141e).f54620w;
                boolean V14 = c00Var4.f46340p0.V1();
                boolean z14 = this.f36140c;
                if (V14) {
                    org.telegram.ui.vz vzVar5 = c00Var4.T;
                    org.telegram.messenger.fj fjVar5 = this.f36139b;
                    int e16 = fjVar5.e1();
                    vzVar5.f52876a = org.telegram.messenger.fj.B0(fjVar5.f23965k);
                    vzVar5.f52877b = e16;
                    l7Var.f(c00Var4.f46340p0.r0(c00Var4.T), z14);
                    return true;
                }
                l7Var.f(false, z14);
                return true;
        }
    }
}
