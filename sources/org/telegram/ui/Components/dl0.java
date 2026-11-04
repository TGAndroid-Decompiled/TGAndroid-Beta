package org.telegram.ui.Components;

import java.util.ArrayList;
public final class dl0 extends u4.o {
    public final int f33155b;
    public final int f33156c;
    public final int d;
    public final int f33157e;
    public final int f33158f;
    public final ArrayList f33159g;
    public final int h;
    public final int f33160i;
    public final ArrayList f33161j;
    public final hl0 f33162k;

    public dl0(hl0 hl0Var, int i3, int i10, int i11, int i12, int i13, ArrayList arrayList, int i14, int i15, ArrayList arrayList2) {
        this.f33162k = hl0Var;
        this.f33155b = i3;
        this.f33156c = i10;
        this.d = i11;
        this.f33157e = i12;
        this.f33158f = i13;
        this.f33159g = arrayList;
        this.h = i14;
        this.f33160i = i15;
        this.f33161j = arrayList2;
    }

    @Override
    public final boolean a(int i3, int i10) {
        return b(i3, i10);
    }

    @Override
    public final boolean b(int i3, int i10) {
        org.telegram.messenger.zi ziVar;
        hl0 hl0Var = this.f33162k;
        if (i3 >= 0 && i10 >= 0) {
            if (i3 == this.f33156c && i10 == hl0Var.f34449s) {
                return true;
            }
            if (i3 == this.d && i10 == hl0Var.f34452y) {
                return true;
            }
        }
        org.telegram.messenger.zi ziVar2 = null;
        int i11 = this.f33157e;
        if (i3 >= i11 && i3 < this.f33158f) {
            ziVar = (org.telegram.messenger.zi) this.f33159g.get(i3 - i11);
        } else {
            int i12 = this.h;
            if (i3 >= i12 && i3 < this.f33160i) {
                ziVar = (org.telegram.messenger.zi) this.f33161j.get(i3 - i12);
            } else {
                ziVar = null;
            }
        }
        int i13 = hl0Var.f34450w;
        if (i10 >= i13 && i10 < hl0Var.f34451x) {
            ziVar2 = (org.telegram.messenger.zi) hl0Var.f34445e.get(i10 - i13);
        } else {
            int i14 = hl0Var.E;
            if (i10 >= i14 && i10 < hl0Var.F) {
                ziVar2 = (org.telegram.messenger.zi) hl0Var.f34446f.get(i10 - i14);
            }
        }
        if (ziVar2 != null && ziVar != null && ziVar2.F0() != null && ziVar.F0() != null && ziVar2.F0().f27007id == ziVar.F0().f27007id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f33162k.f34448r;
    }

    @Override
    public final int e() {
        return this.f33155b;
    }
}
