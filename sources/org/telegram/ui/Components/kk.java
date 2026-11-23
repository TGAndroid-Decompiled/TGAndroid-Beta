package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class kk implements ViewTreeObserver.OnPreDrawListener {
    public final int f36889a;
    public final org.telegram.messenger.gj f36890b;
    public final boolean f36891c;
    public final ViewGroup d;
    public final dk0 f36892e;

    public kk(dk0 dk0Var, ViewGroup viewGroup, org.telegram.messenger.gj gjVar, boolean z10, int i7) {
        this.f36889a = i7;
        this.f36892e = dk0Var;
        this.d = viewGroup;
        this.f36890b = gjVar;
        this.f36891c = z10;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f36889a) {
            case 0:
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) this.d;
                i7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                lk lkVar = (lk) this.f36892e;
                org.telegram.ui.vz vzVar = lkVar.I;
                mk mkVar = lkVar.Y;
                boolean x10 = mkVar.f37477b.V2.x();
                boolean z10 = this.f36891c;
                if (x10) {
                    org.telegram.messenger.gj gjVar = this.f36890b;
                    int e12 = gjVar.e1();
                    vzVar.f52889a = org.telegram.messenger.gj.B0(gjVar.f24177k);
                    vzVar.f52890b = e12;
                    i7Var.b(mkVar.U.containsKey(vzVar), z10);
                    return true;
                }
                i7Var.b(false, z10);
                return true;
            case 1:
                org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) this.d;
                u2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.c00 c00Var = ((org.telegram.ui.wz) this.f36892e).f53478c;
                boolean V1 = c00Var.f46359p0.V1();
                boolean z11 = this.f36891c;
                if (V1) {
                    org.telegram.ui.vz vzVar2 = c00Var.T;
                    org.telegram.messenger.gj gjVar2 = this.f36890b;
                    int e13 = gjVar2.e1();
                    vzVar2.f52889a = org.telegram.messenger.gj.B0(gjVar2.f24177k);
                    vzVar2.f52890b = e13;
                    u2Var.c0(c00Var.f46359p0.r0(c00Var.T), z11);
                    return true;
                }
                u2Var.c0(false, z11);
                return true;
            case 2:
                org.telegram.ui.Cells.i7 i7Var2 = (org.telegram.ui.Cells.i7) this.d;
                i7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.c00 c00Var2 = ((org.telegram.ui.xz) this.f36892e).f53962w;
                boolean V12 = c00Var2.f46359p0.V1();
                boolean z12 = this.f36891c;
                if (V12) {
                    org.telegram.ui.vz vzVar3 = c00Var2.T;
                    org.telegram.messenger.gj gjVar3 = this.f36890b;
                    int e14 = gjVar3.e1();
                    vzVar3.f52889a = org.telegram.messenger.gj.B0(gjVar3.f24177k);
                    vzVar3.f52890b = e14;
                    i7Var2.b(c00Var2.f46359p0.r0(c00Var2.T), z12);
                    return true;
                }
                i7Var2.b(false, z12);
                return true;
            case 3:
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) this.d;
                h7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.c00 c00Var3 = ((org.telegram.ui.xz) this.f36892e).f53962w;
                boolean V13 = c00Var3.f46359p0.V1();
                boolean z13 = this.f36891c;
                if (V13) {
                    org.telegram.ui.vz vzVar4 = c00Var3.T;
                    org.telegram.messenger.gj gjVar4 = this.f36890b;
                    int e15 = gjVar4.e1();
                    vzVar4.f52889a = org.telegram.messenger.gj.B0(gjVar4.f24177k);
                    vzVar4.f52890b = e15;
                    h7Var.e(c00Var3.f46359p0.r0(c00Var3.T), z13);
                    return true;
                }
                h7Var.e(false, z13);
                return true;
            default:
                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) this.d;
                l7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.c00 c00Var4 = ((org.telegram.ui.zz) this.f36892e).f54630w;
                boolean V14 = c00Var4.f46359p0.V1();
                boolean z14 = this.f36891c;
                if (V14) {
                    org.telegram.ui.vz vzVar5 = c00Var4.T;
                    org.telegram.messenger.gj gjVar5 = this.f36890b;
                    int e16 = gjVar5.e1();
                    vzVar5.f52889a = org.telegram.messenger.gj.B0(gjVar5.f24177k);
                    vzVar5.f52890b = e16;
                    l7Var.f(c00Var4.f46359p0.r0(c00Var4.T), z14);
                    return true;
                }
                l7Var.f(false, z14);
                return true;
        }
    }
}
