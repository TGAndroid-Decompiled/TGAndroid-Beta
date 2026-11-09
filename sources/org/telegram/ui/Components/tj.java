package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class tj implements ViewTreeObserver.OnPreDrawListener {
    public final int f38436a;
    public final org.telegram.messenger.ij f38437b;
    public final boolean f38438c;
    public final ViewGroup d;
    public final pj0 f38439e;

    public tj(pj0 pj0Var, ViewGroup viewGroup, org.telegram.messenger.ij ijVar, boolean z9, int i7) {
        this.f38436a = i7;
        this.f38439e = pj0Var;
        this.d = viewGroup;
        this.f38437b = ijVar;
        this.f38438c = z9;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f38436a) {
            case 0:
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) this.d;
                h7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                uj ujVar = (uj) this.f38439e;
                org.telegram.ui.tz tzVar = ujVar.H;
                vj vjVar = ujVar.X;
                boolean w10 = vjVar.f39071b.R2.w();
                boolean z9 = this.f38438c;
                if (w10) {
                    org.telegram.messenger.ij ijVar = this.f38437b;
                    int e12 = ijVar.e1();
                    tzVar.f50267a = org.telegram.messenger.ij.B0(ijVar.f23262k);
                    tzVar.f50268b = e12;
                    h7Var.b(vjVar.T.containsKey(tzVar), z9);
                    return true;
                }
                h7Var.b(false, z9);
                return true;
            case 1:
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) this.d;
                t2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.a00 a00Var = ((org.telegram.ui.uz) this.f38439e).f50499c;
                boolean i7 = a00Var.f43529o0.i();
                boolean z10 = this.f38438c;
                if (i7) {
                    org.telegram.ui.tz tzVar2 = a00Var.S;
                    org.telegram.messenger.ij ijVar2 = this.f38437b;
                    int e13 = ijVar2.e1();
                    tzVar2.f50267a = org.telegram.messenger.ij.B0(ijVar2.f23262k);
                    tzVar2.f50268b = e13;
                    t2Var.c0(a00Var.f43529o0.f(a00Var.S), z10);
                    return true;
                }
                t2Var.c0(false, z10);
                return true;
            case 2:
                org.telegram.ui.Cells.h7 h7Var2 = (org.telegram.ui.Cells.h7) this.d;
                h7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.a00 a00Var2 = ((org.telegram.ui.vz) this.f38439e).f50801w;
                boolean i10 = a00Var2.f43529o0.i();
                boolean z11 = this.f38438c;
                if (i10) {
                    org.telegram.ui.tz tzVar3 = a00Var2.S;
                    org.telegram.messenger.ij ijVar3 = this.f38437b;
                    int e14 = ijVar3.e1();
                    tzVar3.f50267a = org.telegram.messenger.ij.B0(ijVar3.f23262k);
                    tzVar3.f50268b = e14;
                    h7Var2.b(a00Var2.f43529o0.f(a00Var2.S), z11);
                    return true;
                }
                h7Var2.b(false, z11);
                return true;
            case 3:
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) this.d;
                g7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.a00 a00Var3 = ((org.telegram.ui.vz) this.f38439e).f50801w;
                boolean i11 = a00Var3.f43529o0.i();
                boolean z12 = this.f38438c;
                if (i11) {
                    org.telegram.ui.tz tzVar4 = a00Var3.S;
                    org.telegram.messenger.ij ijVar4 = this.f38437b;
                    int e15 = ijVar4.e1();
                    tzVar4.f50267a = org.telegram.messenger.ij.B0(ijVar4.f23262k);
                    tzVar4.f50268b = e15;
                    g7Var.e(a00Var3.f43529o0.f(a00Var3.S), z12);
                    return true;
                }
                g7Var.e(false, z12);
                return true;
            default:
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) this.d;
                k7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.a00 a00Var4 = ((org.telegram.ui.xz) this.f38439e).f51795w;
                boolean i12 = a00Var4.f43529o0.i();
                boolean z13 = this.f38438c;
                if (i12) {
                    org.telegram.ui.tz tzVar5 = a00Var4.S;
                    org.telegram.messenger.ij ijVar5 = this.f38437b;
                    int e16 = ijVar5.e1();
                    tzVar5.f50267a = org.telegram.messenger.ij.B0(ijVar5.f23262k);
                    tzVar5.f50268b = e16;
                    k7Var.f(a00Var4.f43529o0.f(a00Var4.S), z13);
                    return true;
                }
                k7Var.f(false, z13);
                return true;
        }
    }
}
