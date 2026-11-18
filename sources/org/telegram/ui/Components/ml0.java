package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ml0 extends v4.o {
    public final int f37553b;
    public final int f37554c;
    public final int d;
    public final int f37555e;
    public final int f37556f;
    public final ArrayList f37557g;
    public final int h;
    public final int f37558i;
    public final ArrayList f37559j;
    public final ql0 f37560k;

    public ml0(ql0 ql0Var, int i7, int i10, int i11, int i12, int i13, ArrayList arrayList, int i14, int i15, ArrayList arrayList2) {
        this.f37560k = ql0Var;
        this.f37553b = i7;
        this.f37554c = i10;
        this.d = i11;
        this.f37555e = i12;
        this.f37556f = i13;
        this.f37557g = arrayList;
        this.h = i14;
        this.f37558i = i15;
        this.f37559j = arrayList2;
    }

    @Override
    public final boolean a(int i7, int i10) {
        return b(i7, i10);
    }

    @Override
    public final boolean b(int i7, int i10) {
        org.telegram.messenger.fj fjVar;
        ql0 ql0Var = this.f37560k;
        if (i7 >= 0 && i10 >= 0) {
            if (i7 == this.f37554c && i10 == ql0Var.f38834s) {
                return true;
            }
            if (i7 == this.d && i10 == ql0Var.f38837y) {
                return true;
            }
        }
        org.telegram.messenger.fj fjVar2 = null;
        int i11 = this.f37555e;
        if (i7 >= i11 && i7 < this.f37556f) {
            fjVar = (org.telegram.messenger.fj) this.f37557g.get(i7 - i11);
        } else {
            int i12 = this.h;
            if (i7 >= i12 && i7 < this.f37558i) {
                fjVar = (org.telegram.messenger.fj) this.f37559j.get(i7 - i12);
            } else {
                fjVar = null;
            }
        }
        int i13 = ql0Var.f38835w;
        if (i10 >= i13 && i10 < ql0Var.f38836x) {
            fjVar2 = (org.telegram.messenger.fj) ql0Var.f38830e.get(i10 - i13);
        } else {
            int i14 = ql0Var.E;
            if (i10 >= i14 && i10 < ql0Var.F) {
                fjVar2 = (org.telegram.messenger.fj) ql0Var.f38831f.get(i10 - i14);
            }
        }
        if (fjVar2 != null && fjVar != null && fjVar2.F0() != null && fjVar.F0() != null && fjVar2.F0().f28409id == fjVar.F0().f28409id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f37560k.f38833r;
    }

    @Override
    public final int e() {
        return this.f37553b;
    }
}
