package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ol0 extends v4.p {
    public final int f38199b;
    public final int f38200c;
    public final int d;
    public final int f38201e;
    public final int f38202f;
    public final ArrayList f38203g;
    public final int h;
    public final int f38204i;
    public final ArrayList f38205j;
    public final sl0 f38206k;

    public ol0(sl0 sl0Var, int i7, int i10, int i11, int i12, int i13, ArrayList arrayList, int i14, int i15, ArrayList arrayList2) {
        this.f38206k = sl0Var;
        this.f38199b = i7;
        this.f38200c = i10;
        this.d = i11;
        this.f38201e = i12;
        this.f38202f = i13;
        this.f38203g = arrayList;
        this.h = i14;
        this.f38204i = i15;
        this.f38205j = arrayList2;
    }

    @Override
    public final boolean a(int i7, int i10) {
        return b(i7, i10);
    }

    @Override
    public final boolean b(int i7, int i10) {
        org.telegram.messenger.fj fjVar;
        sl0 sl0Var = this.f38206k;
        if (i7 >= 0 && i10 >= 0) {
            if (i7 == this.f38200c && i10 == sl0Var.f39645s) {
                return true;
            }
            if (i7 == this.d && i10 == sl0Var.f39648y) {
                return true;
            }
        }
        org.telegram.messenger.fj fjVar2 = null;
        int i11 = this.f38201e;
        if (i7 >= i11 && i7 < this.f38202f) {
            fjVar = (org.telegram.messenger.fj) this.f38203g.get(i7 - i11);
        } else {
            int i12 = this.h;
            if (i7 >= i12 && i7 < this.f38204i) {
                fjVar = (org.telegram.messenger.fj) this.f38205j.get(i7 - i12);
            } else {
                fjVar = null;
            }
        }
        int i13 = sl0Var.f39646w;
        if (i10 >= i13 && i10 < sl0Var.f39647x) {
            fjVar2 = (org.telegram.messenger.fj) sl0Var.f39641e.get(i10 - i13);
        } else {
            int i14 = sl0Var.E;
            if (i10 >= i14 && i10 < sl0Var.F) {
                fjVar2 = (org.telegram.messenger.fj) sl0Var.f39642f.get(i10 - i14);
            }
        }
        if (fjVar2 != null && fjVar != null && fjVar2.F0() != null && fjVar.F0() != null && fjVar2.F0().f28498id == fjVar.F0().f28498id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f38206k.f39644r;
    }

    @Override
    public final int e() {
        return this.f38199b;
    }
}
