package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ol0 extends v4.o {
    public final int f38284b;
    public final int f38285c;
    public final int d;
    public final int f38286e;
    public final int f38287f;
    public final ArrayList f38288g;
    public final int h;
    public final int f38289i;
    public final ArrayList f38290j;
    public final sl0 f38291k;

    public ol0(sl0 sl0Var, int i7, int i10, int i11, int i12, int i13, ArrayList arrayList, int i14, int i15, ArrayList arrayList2) {
        this.f38291k = sl0Var;
        this.f38284b = i7;
        this.f38285c = i10;
        this.d = i11;
        this.f38286e = i12;
        this.f38287f = i13;
        this.f38288g = arrayList;
        this.h = i14;
        this.f38289i = i15;
        this.f38290j = arrayList2;
    }

    @Override
    public final boolean a(int i7, int i10) {
        return b(i7, i10);
    }

    @Override
    public final boolean b(int i7, int i10) {
        org.telegram.messenger.fj fjVar;
        sl0 sl0Var = this.f38291k;
        if (i7 >= 0 && i10 >= 0) {
            if (i7 == this.f38285c && i10 == sl0Var.f39630s) {
                return true;
            }
            if (i7 == this.d && i10 == sl0Var.f39633y) {
                return true;
            }
        }
        org.telegram.messenger.fj fjVar2 = null;
        int i11 = this.f38286e;
        if (i7 >= i11 && i7 < this.f38287f) {
            fjVar = (org.telegram.messenger.fj) this.f38288g.get(i7 - i11);
        } else {
            int i12 = this.h;
            if (i7 >= i12 && i7 < this.f38289i) {
                fjVar = (org.telegram.messenger.fj) this.f38290j.get(i7 - i12);
            } else {
                fjVar = null;
            }
        }
        int i13 = sl0Var.f39631w;
        if (i10 >= i13 && i10 < sl0Var.f39632x) {
            fjVar2 = (org.telegram.messenger.fj) sl0Var.f39626e.get(i10 - i13);
        } else {
            int i14 = sl0Var.E;
            if (i10 >= i14 && i10 < sl0Var.F) {
                fjVar2 = (org.telegram.messenger.fj) sl0Var.f39627f.get(i10 - i14);
            }
        }
        if (fjVar2 != null && fjVar != null && fjVar2.F0() != null && fjVar.F0() != null && fjVar2.F0().f28437id == fjVar.F0().f28437id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f38291k.f39629r;
    }

    @Override
    public final int e() {
        return this.f38284b;
    }
}
