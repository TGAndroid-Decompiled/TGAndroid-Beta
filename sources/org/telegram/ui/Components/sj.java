package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class sj implements ViewTreeObserver.OnPreDrawListener {
    public final int f38010a;
    public final org.telegram.messenger.ij f38011b;
    public final boolean f38012c;
    public final ViewGroup d;
    public final oj0 f38013e;

    public sj(oj0 oj0Var, ViewGroup viewGroup, org.telegram.messenger.ij ijVar, boolean z9, int i7) {
        this.f38010a = i7;
        this.f38013e = oj0Var;
        this.d = viewGroup;
        this.f38011b = ijVar;
        this.f38012c = z9;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f38010a) {
            case 0:
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) this.d;
                h7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                tj tjVar = (tj) this.f38013e;
                org.telegram.ui.uz uzVar = tjVar.H;
                uj ujVar = tjVar.X;
                boolean x10 = ujVar.f38656b.U2.x();
                boolean z9 = this.f38012c;
                if (x10) {
                    org.telegram.messenger.ij ijVar = this.f38011b;
                    int e12 = ijVar.e1();
                    uzVar.f50595a = org.telegram.messenger.ij.B0(ijVar.f23266k);
                    uzVar.f50596b = e12;
                    h7Var.b(ujVar.T.containsKey(uzVar), z9);
                    return true;
                }
                h7Var.b(false, z9);
                return true;
            case 1:
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) this.d;
                t2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.b00 b00Var = ((org.telegram.ui.vz) this.f38013e).f50828c;
                boolean i7 = b00Var.f43879o0.i();
                boolean z10 = this.f38012c;
                if (i7) {
                    org.telegram.ui.uz uzVar2 = b00Var.S;
                    org.telegram.messenger.ij ijVar2 = this.f38011b;
                    int e13 = ijVar2.e1();
                    uzVar2.f50595a = org.telegram.messenger.ij.B0(ijVar2.f23266k);
                    uzVar2.f50596b = e13;
                    t2Var.c0(b00Var.f43879o0.f(b00Var.S), z10);
                    return true;
                }
                t2Var.c0(false, z10);
                return true;
            case 2:
                org.telegram.ui.Cells.h7 h7Var2 = (org.telegram.ui.Cells.h7) this.d;
                h7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.b00 b00Var2 = ((org.telegram.ui.wz) this.f38013e).f51467w;
                boolean i10 = b00Var2.f43879o0.i();
                boolean z11 = this.f38012c;
                if (i10) {
                    org.telegram.ui.uz uzVar3 = b00Var2.S;
                    org.telegram.messenger.ij ijVar3 = this.f38011b;
                    int e14 = ijVar3.e1();
                    uzVar3.f50595a = org.telegram.messenger.ij.B0(ijVar3.f23266k);
                    uzVar3.f50596b = e14;
                    h7Var2.b(b00Var2.f43879o0.f(b00Var2.S), z11);
                    return true;
                }
                h7Var2.b(false, z11);
                return true;
            case 3:
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) this.d;
                g7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.b00 b00Var3 = ((org.telegram.ui.wz) this.f38013e).f51467w;
                boolean i11 = b00Var3.f43879o0.i();
                boolean z12 = this.f38012c;
                if (i11) {
                    org.telegram.ui.uz uzVar4 = b00Var3.S;
                    org.telegram.messenger.ij ijVar4 = this.f38011b;
                    int e15 = ijVar4.e1();
                    uzVar4.f50595a = org.telegram.messenger.ij.B0(ijVar4.f23266k);
                    uzVar4.f50596b = e15;
                    g7Var.e(b00Var3.f43879o0.f(b00Var3.S), z12);
                    return true;
                }
                g7Var.e(false, z12);
                return true;
            default:
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) this.d;
                k7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.b00 b00Var4 = ((org.telegram.ui.yz) this.f38013e).f52152w;
                boolean i12 = b00Var4.f43879o0.i();
                boolean z13 = this.f38012c;
                if (i12) {
                    org.telegram.ui.uz uzVar5 = b00Var4.S;
                    org.telegram.messenger.ij ijVar5 = this.f38011b;
                    int e16 = ijVar5.e1();
                    uzVar5.f50595a = org.telegram.messenger.ij.B0(ijVar5.f23266k);
                    uzVar5.f50596b = e16;
                    k7Var.f(b00Var4.f43879o0.f(b00Var4.S), z13);
                    return true;
                }
                k7Var.f(false, z13);
                return true;
        }
    }
}
