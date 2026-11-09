package org.telegram.ui.Components;

import java.util.ArrayList;
public final class al0 extends v4.o {
    public final int f31903b;
    public final int f31904c;
    public final int d;
    public final int f31905e;
    public final int f31906f;
    public final ArrayList f31907g;
    public final int h;
    public final int f31908i;
    public final ArrayList f31909j;
    public final el0 f31910k;

    public al0(el0 el0Var, int i7, int i10, int i11, int i12, int i13, ArrayList arrayList, int i14, int i15, ArrayList arrayList2) {
        this.f31910k = el0Var;
        this.f31903b = i7;
        this.f31904c = i10;
        this.d = i11;
        this.f31905e = i12;
        this.f31906f = i13;
        this.f31907g = arrayList;
        this.h = i14;
        this.f31908i = i15;
        this.f31909j = arrayList2;
    }

    @Override
    public final boolean a(int i7, int i10) {
        return b(i7, i10);
    }

    @Override
    public final boolean b(int i7, int i10) {
        org.telegram.messenger.ij ijVar;
        el0 el0Var = this.f31910k;
        if (i7 >= 0 && i10 >= 0) {
            if (i7 == this.f31904c && i10 == el0Var.f33444s) {
                return true;
            }
            if (i7 == this.d && i10 == el0Var.f33447y) {
                return true;
            }
        }
        org.telegram.messenger.ij ijVar2 = null;
        int i11 = this.f31905e;
        if (i7 >= i11 && i7 < this.f31906f) {
            ijVar = (org.telegram.messenger.ij) this.f31907g.get(i7 - i11);
        } else {
            int i12 = this.h;
            if (i7 >= i12 && i7 < this.f31908i) {
                ijVar = (org.telegram.messenger.ij) this.f31909j.get(i7 - i12);
            } else {
                ijVar = null;
            }
        }
        int i13 = el0Var.f33445w;
        if (i10 >= i13 && i10 < el0Var.f33446x) {
            ijVar2 = (org.telegram.messenger.ij) el0Var.f33440e.get(i10 - i13);
        } else {
            int i14 = el0Var.D;
            if (i10 >= i14 && i10 < el0Var.E) {
                ijVar2 = (org.telegram.messenger.ij) el0Var.f33441f.get(i10 - i14);
            }
        }
        if (ijVar2 != null && ijVar != null && ijVar2.F0() != null && ijVar.F0() != null && ijVar2.F0().f26962id == ijVar.F0().f26962id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f31910k.f33443r;
    }

    @Override
    public final int e() {
        return this.f31903b;
    }
}
