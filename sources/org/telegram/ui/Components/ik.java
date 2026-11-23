package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class ik implements ViewTreeObserver.OnPreDrawListener {
    public final int f36036a;
    public final org.telegram.messenger.fj f36037b;
    public final boolean f36038c;
    public final ViewGroup d;
    public final dk0 f36039e;

    public ik(dk0 dk0Var, ViewGroup viewGroup, org.telegram.messenger.fj fjVar, boolean z10, int i7) {
        this.f36036a = i7;
        this.f36039e = dk0Var;
        this.d = viewGroup;
        this.f36037b = fjVar;
        this.f36038c = z10;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f36036a) {
            case 0:
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) this.d;
                h7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                jk jkVar = (jk) this.f36039e;
                org.telegram.ui.uz uzVar = jkVar.I;
                kk kkVar = jkVar.Y;
                boolean x10 = kkVar.f37135b.V2.x();
                boolean z10 = this.f36038c;
                if (x10) {
                    org.telegram.messenger.fj fjVar = this.f36037b;
                    int e12 = fjVar.e1();
                    uzVar.f52761a = org.telegram.messenger.fj.B0(fjVar.f24073k);
                    uzVar.f52762b = e12;
                    h7Var.b(kkVar.U.containsKey(uzVar), z10);
                    return true;
                }
                h7Var.b(false, z10);
                return true;
            case 1:
                org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) this.d;
                u2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.b00 b00Var = ((org.telegram.ui.vz) this.f36039e).f53057c;
                boolean i02 = b00Var.f45863p0.i0();
                boolean z11 = this.f36038c;
                if (i02) {
                    org.telegram.ui.uz uzVar2 = b00Var.T;
                    org.telegram.messenger.fj fjVar2 = this.f36037b;
                    int e13 = fjVar2.e1();
                    uzVar2.f52761a = org.telegram.messenger.fj.B0(fjVar2.f24073k);
                    uzVar2.f52762b = e13;
                    u2Var.e0(b00Var.f45863p0.j(b00Var.T), z11);
                    return true;
                }
                u2Var.e0(false, z11);
                return true;
            case 2:
                org.telegram.ui.Cells.h7 h7Var2 = (org.telegram.ui.Cells.h7) this.d;
                h7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.b00 b00Var2 = ((org.telegram.ui.wz) this.f36039e).f53797w;
                boolean i03 = b00Var2.f45863p0.i0();
                boolean z12 = this.f36038c;
                if (i03) {
                    org.telegram.ui.uz uzVar3 = b00Var2.T;
                    org.telegram.messenger.fj fjVar3 = this.f36037b;
                    int e14 = fjVar3.e1();
                    uzVar3.f52761a = org.telegram.messenger.fj.B0(fjVar3.f24073k);
                    uzVar3.f52762b = e14;
                    h7Var2.b(b00Var2.f45863p0.j(b00Var2.T), z12);
                    return true;
                }
                h7Var2.b(false, z12);
                return true;
            case 3:
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) this.d;
                g7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.b00 b00Var3 = ((org.telegram.ui.wz) this.f36039e).f53797w;
                boolean i04 = b00Var3.f45863p0.i0();
                boolean z13 = this.f36038c;
                if (i04) {
                    org.telegram.ui.uz uzVar4 = b00Var3.T;
                    org.telegram.messenger.fj fjVar4 = this.f36037b;
                    int e15 = fjVar4.e1();
                    uzVar4.f52761a = org.telegram.messenger.fj.B0(fjVar4.f24073k);
                    uzVar4.f52762b = e15;
                    g7Var.e(b00Var3.f45863p0.j(b00Var3.T), z13);
                    return true;
                }
                g7Var.e(false, z13);
                return true;
            default:
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) this.d;
                k7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.b00 b00Var4 = ((org.telegram.ui.yz) this.f36039e).f54454w;
                boolean i05 = b00Var4.f45863p0.i0();
                boolean z14 = this.f36038c;
                if (i05) {
                    org.telegram.ui.uz uzVar5 = b00Var4.T;
                    org.telegram.messenger.fj fjVar5 = this.f36037b;
                    int e16 = fjVar5.e1();
                    uzVar5.f52761a = org.telegram.messenger.fj.B0(fjVar5.f24073k);
                    uzVar5.f52762b = e16;
                    k7Var.f(b00Var4.f45863p0.j(b00Var4.T), z14);
                    return true;
                }
                k7Var.f(false, z14);
                return true;
        }
    }
}
