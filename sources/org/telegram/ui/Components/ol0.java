package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ol0 extends v4.o {
    public final int f38246b;
    public final int f38247c;
    public final int d;
    public final int f38248e;
    public final int f38249f;
    public final ArrayList f38250g;
    public final int h;
    public final int f38251i;
    public final ArrayList f38252j;
    public final sl0 f38253k;

    public ol0(sl0 sl0Var, int i7, int i10, int i11, int i12, int i13, ArrayList arrayList, int i14, int i15, ArrayList arrayList2) {
        this.f38253k = sl0Var;
        this.f38246b = i7;
        this.f38247c = i10;
        this.d = i11;
        this.f38248e = i12;
        this.f38249f = i13;
        this.f38250g = arrayList;
        this.h = i14;
        this.f38251i = i15;
        this.f38252j = arrayList2;
    }

    @Override
    public final boolean a(int i7, int i10) {
        return b(i7, i10);
    }

    @Override
    public final boolean b(int i7, int i10) {
        org.telegram.messenger.gj gjVar;
        sl0 sl0Var = this.f38253k;
        if (i7 >= 0 && i10 >= 0) {
            if (i7 == this.f38247c && i10 == sl0Var.f39578s) {
                return true;
            }
            if (i7 == this.d && i10 == sl0Var.f39581y) {
                return true;
            }
        }
        org.telegram.messenger.gj gjVar2 = null;
        int i11 = this.f38248e;
        if (i7 >= i11 && i7 < this.f38249f) {
            gjVar = (org.telegram.messenger.gj) this.f38250g.get(i7 - i11);
        } else {
            int i12 = this.h;
            if (i7 >= i12 && i7 < this.f38251i) {
                gjVar = (org.telegram.messenger.gj) this.f38252j.get(i7 - i12);
            } else {
                gjVar = null;
            }
        }
        int i13 = sl0Var.f39579w;
        if (i10 >= i13 && i10 < sl0Var.f39580x) {
            gjVar2 = (org.telegram.messenger.gj) sl0Var.f39574e.get(i10 - i13);
        } else {
            int i14 = sl0Var.E;
            if (i10 >= i14 && i10 < sl0Var.F) {
                gjVar2 = (org.telegram.messenger.gj) sl0Var.f39575f.get(i10 - i14);
            }
        }
        if (gjVar2 != null && gjVar != null && gjVar2.F0() != null && gjVar.F0() != null && gjVar2.F0().f28404id == gjVar.F0().f28404id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f38253k.f39577r;
    }

    @Override
    public final int e() {
        return this.f38246b;
    }
}
