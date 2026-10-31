package org.telegram.ui.Components;

import java.util.ArrayList;
public final class cm0 extends s4.n {
    public final int f25099b;
    public final int f25100c;
    public final int d;
    public final int e;
    public final int f25101f;
    public final ArrayList f25102g;
    public final int h;
    public final int f25103i;
    public final ArrayList f25104j;
    public final gm0 f25105k;

    public cm0(gm0 gm0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.f25105k = gm0Var;
        this.f25099b = i10;
        this.f25100c = i11;
        this.d = i12;
        this.e = i13;
        this.f25101f = i14;
        this.f25102g = arrayList;
        this.h = i15;
        this.f25103i = i16;
        this.f25104j = arrayList2;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        org.telegram.messenger.jj jjVar;
        gm0 gm0Var = this.f25105k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.f25100c && i11 == gm0Var.f26443s) {
                return true;
            }
            if (i10 == this.d && i11 == gm0Var.f26446y) {
                return true;
            }
        }
        org.telegram.messenger.jj jjVar2 = null;
        int i12 = this.e;
        if (i10 >= i12 && i10 < this.f25101f) {
            jjVar = (org.telegram.messenger.jj) this.f25102g.get(i10 - i12);
        } else {
            int i13 = this.h;
            if (i10 >= i13 && i10 < this.f25103i) {
                jjVar = (org.telegram.messenger.jj) this.f25104j.get(i10 - i13);
            } else {
                jjVar = null;
            }
        }
        int i14 = gm0Var.f26444w;
        if (i11 >= i14 && i11 < gm0Var.f26445x) {
            jjVar2 = (org.telegram.messenger.jj) gm0Var.e.get(i11 - i14);
        } else {
            int i15 = gm0Var.D;
            if (i11 >= i15 && i11 < gm0Var.E) {
                jjVar2 = (org.telegram.messenger.jj) gm0Var.f26440f.get(i11 - i15);
            }
        }
        if (jjVar2 != null && jjVar != null && jjVar2.F0() != null && jjVar.F0() != null && jjVar2.F0().f19799id == jjVar.F0().f19799id) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f25105k.f26442r;
    }

    @Override
    public final int e() {
        return this.f25099b;
    }
}
