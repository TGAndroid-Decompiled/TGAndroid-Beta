package org.telegram.ui.Components;

import java.util.ArrayList;
public final class dm0 extends s4.n {
    public final int f25517b;
    public final int f25518c;
    public final int d;
    public final int e;
    public final int f25519f;
    public final ArrayList f25520g;
    public final int h;
    public final int f25521i;
    public final ArrayList f25522j;
    public final hm0 f25523k;

    public dm0(hm0 hm0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.f25523k = hm0Var;
        this.f25517b = i10;
        this.f25518c = i11;
        this.d = i12;
        this.e = i13;
        this.f25519f = i14;
        this.f25520g = arrayList;
        this.h = i15;
        this.f25521i = i16;
        this.f25522j = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        org.telegram.messenger.kj kjVar;
        hm0 hm0Var = this.f25523k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.f25518c && i11 == hm0Var.f26864s) {
                return true;
            }
            if (i10 == this.d && i11 == hm0Var.f26867y) {
                return true;
            }
        }
        org.telegram.messenger.kj kjVar2 = null;
        int i12 = this.e;
        if (i10 >= i12 && i10 < this.f25519f) {
            kjVar = (org.telegram.messenger.kj) this.f25520g.get(i10 - i12);
        } else {
            int i13 = this.h;
            if (i10 >= i13 && i10 < this.f25521i) {
                kjVar = (org.telegram.messenger.kj) this.f25522j.get(i10 - i13);
            } else {
                kjVar = null;
            }
        }
        int i14 = hm0Var.f26865w;
        if (i11 >= i14 && i11 < hm0Var.f26866x) {
            kjVar2 = (org.telegram.messenger.kj) hm0Var.e.get(i11 - i14);
        } else {
            int i15 = hm0Var.D;
            if (i11 >= i15 && i11 < hm0Var.E) {
                kjVar2 = (org.telegram.messenger.kj) hm0Var.f26861f.get(i11 - i15);
            }
        }
        if (kjVar2 != null && kjVar != null && kjVar2.F0() != null && kjVar.F0() != null && kjVar2.F0().f19800id == kjVar.F0().f19800id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f25523k.f26863r;
    }

    @Override
    public final int e() {
        return this.f25517b;
    }
}
