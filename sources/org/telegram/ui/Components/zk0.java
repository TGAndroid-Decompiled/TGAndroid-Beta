package org.telegram.ui.Components;

import java.util.ArrayList;
public final class zk0 extends v4.o {
    public final int f41045b;
    public final int f41046c;
    public final int d;
    public final int f41047e;
    public final int f41048f;
    public final ArrayList f41049g;
    public final int h;
    public final int f41050i;
    public final ArrayList f41051j;
    public final dl0 f41052k;

    public zk0(dl0 dl0Var, int i7, int i10, int i11, int i12, int i13, ArrayList arrayList, int i14, int i15, ArrayList arrayList2) {
        this.f41052k = dl0Var;
        this.f41045b = i7;
        this.f41046c = i10;
        this.d = i11;
        this.f41047e = i12;
        this.f41048f = i13;
        this.f41049g = arrayList;
        this.h = i14;
        this.f41050i = i15;
        this.f41051j = arrayList2;
    }

    @Override
    public final boolean a(int i7, int i10) {
        return b(i7, i10);
    }

    @Override
    public final boolean b(int i7, int i10) {
        org.telegram.messenger.ij ijVar;
        dl0 dl0Var = this.f41052k;
        if (i7 >= 0 && i10 >= 0) {
            if (i7 == this.f41046c && i10 == dl0Var.f33029s) {
                return true;
            }
            if (i7 == this.d && i10 == dl0Var.f33032y) {
                return true;
            }
        }
        org.telegram.messenger.ij ijVar2 = null;
        int i11 = this.f41047e;
        if (i7 >= i11 && i7 < this.f41048f) {
            ijVar = (org.telegram.messenger.ij) this.f41049g.get(i7 - i11);
        } else {
            int i12 = this.h;
            if (i7 >= i12 && i7 < this.f41050i) {
                ijVar = (org.telegram.messenger.ij) this.f41051j.get(i7 - i12);
            } else {
                ijVar = null;
            }
        }
        int i13 = dl0Var.f33030w;
        if (i10 >= i13 && i10 < dl0Var.f33031x) {
            ijVar2 = (org.telegram.messenger.ij) dl0Var.f33025e.get(i10 - i13);
        } else {
            int i14 = dl0Var.D;
            if (i10 >= i14 && i10 < dl0Var.E) {
                ijVar2 = (org.telegram.messenger.ij) dl0Var.f33026f.get(i10 - i14);
            }
        }
        if (ijVar2 != null && ijVar != null && ijVar2.F0() != null && ijVar.F0() != null && ijVar2.F0().f26966id == ijVar.F0().f26966id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f41052k.f33028r;
    }

    @Override
    public final int e() {
        return this.f41045b;
    }
}
