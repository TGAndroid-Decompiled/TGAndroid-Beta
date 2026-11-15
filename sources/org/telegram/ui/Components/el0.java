package org.telegram.ui.Components;

import java.util.ArrayList;
public final class el0 extends v4.o {
    public final int f34363b;
    public final int f34364c;
    public final int d;
    public final int f34365e;
    public final int f34366f;
    public final ArrayList f34367g;
    public final int h;
    public final int f34368i;
    public final ArrayList f34369j;
    public final il0 f34370k;

    public el0(il0 il0Var, int i7, int i10, int i11, int i12, int i13, ArrayList arrayList, int i14, int i15, ArrayList arrayList2) {
        this.f34370k = il0Var;
        this.f34363b = i7;
        this.f34364c = i10;
        this.d = i11;
        this.f34365e = i12;
        this.f34366f = i13;
        this.f34367g = arrayList;
        this.h = i14;
        this.f34368i = i15;
        this.f34369j = arrayList2;
    }

    @Override
    public final boolean a(int i7, int i10) {
        return b(i7, i10);
    }

    @Override
    public final boolean b(int i7, int i10) {
        org.telegram.messenger.gj gjVar;
        il0 il0Var = this.f34370k;
        if (i7 >= 0 && i10 >= 0) {
            if (i7 == this.f34364c && i10 == il0Var.f35645s) {
                return true;
            }
            if (i7 == this.d && i10 == il0Var.f35648y) {
                return true;
            }
        }
        org.telegram.messenger.gj gjVar2 = null;
        int i11 = this.f34365e;
        if (i7 >= i11 && i7 < this.f34366f) {
            gjVar = (org.telegram.messenger.gj) this.f34367g.get(i7 - i11);
        } else {
            int i12 = this.h;
            if (i7 >= i12 && i7 < this.f34368i) {
                gjVar = (org.telegram.messenger.gj) this.f34369j.get(i7 - i12);
            } else {
                gjVar = null;
            }
        }
        int i13 = il0Var.f35646w;
        if (i10 >= i13 && i10 < il0Var.f35647x) {
            gjVar2 = (org.telegram.messenger.gj) il0Var.f35641e.get(i10 - i13);
        } else {
            int i14 = il0Var.E;
            if (i10 >= i14 && i10 < il0Var.F) {
                gjVar2 = (org.telegram.messenger.gj) il0Var.f35642f.get(i10 - i14);
            }
        }
        if (gjVar2 != null && gjVar != null && gjVar2.F0() != null && gjVar.F0() != null && gjVar2.F0().f28057id == gjVar.F0().f28057id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f34370k.f35644r;
    }

    @Override
    public final int e() {
        return this.f34363b;
    }
}
