package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;

public final class d91 extends f2.q {

    public int f37316b;

    public final v81 f37317c;
    public final f2.k0 d;

    public final SparseIntArray f37318e = new SparseIntArray();

    public int f37319f = -1;

    public int f37320g = -1;
    public int h = -1;

    public int f37321i = -1;

    public int f37322j = -1;

    public int f37323k = -1;

    public int f37324l = -1;

    public int f37325m = -1;

    public int f37326n = -1;

    public int f37327o = -1;

    public int f37328p = -1;

    public int f37329q = -1;

    public int f37330r = -1;

    public int f37331s = -1;

    public int f37332t = -1;

    public int f37333u = -1;
    public int v = -1;

    public int f37334w = -1;

    public int f37335x = -1;

    public int f37336y = -1;

    public d91(v81 v81Var, f2.k0 k0Var) {
        this.f37317c = v81Var;
        this.d = k0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return this.f37318e.get(i10) == this.f37317c.j(i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.f37318e;
        int i12 = sparseIntArray.get(i10);
        v81 v81Var = this.f37317c;
        if (i12 == 13 && v81Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && v81Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f37335x;
        if (i10 >= i13 && i10 <= this.f37336y) {
            return i10 - i13 == i11 - v81Var.E;
        }
        if (i10 == this.f37319f && i11 == v81Var.f43382e) {
            return true;
        }
        if (i10 == this.f37320g && i11 == v81Var.h) {
            return true;
        }
        if (i10 == this.h && i11 == v81Var.f43385r) {
            return true;
        }
        if (i10 == this.f37321i && i11 == v81Var.f43386s) {
            return true;
        }
        if (i10 == this.f37322j && i11 == v81Var.v) {
            return true;
        }
        if (i10 == this.f37323k && i11 == v81Var.f43387w) {
            return true;
        }
        if (i10 == this.f37324l && i11 == v81Var.f43388x) {
            return true;
        }
        if (i10 == this.f37325m && i11 == v81Var.f43384n) {
            return true;
        }
        if (i10 == this.f37326n && i11 == v81Var.f43389y) {
            return true;
        }
        if (i10 == this.f37330r && i11 == v81Var.G) {
            return true;
        }
        if (i10 == this.f37331s && i11 == v81Var.H) {
            return true;
        }
        if (i10 == this.f37332t && i11 == v81Var.I) {
            return true;
        }
        if (i10 == this.f37333u && i11 == v81Var.J) {
            return true;
        }
        if (i10 == this.v && i11 == v81Var.K) {
            return true;
        }
        if (i10 == this.f37334w && i11 == v81Var.L) {
            return true;
        }
        if (i10 == this.f37327o && i11 == v81Var.A) {
            return true;
        }
        if (i10 == this.f37328p && i11 == v81Var.B) {
            return true;
        }
        return i10 == this.f37329q && i11 == v81Var.C;
    }

    @Override
    public final int d() {
        return this.f37317c.Y;
    }

    @Override
    public final int e() {
        return this.f37316b;
    }

    public final void f() {
        long jI;
        int top;
        View viewM;
        SparseIntArray sparseIntArray = this.f37318e;
        sparseIntArray.clear();
        v81 v81Var = this.f37317c;
        this.f37316b = v81Var.Y;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f37316b; i11++) {
            sparseIntArray.put(i11, v81Var.j(i11));
        }
        this.f37319f = v81Var.f43382e;
        this.f37320g = v81Var.h;
        this.h = v81Var.f43385r;
        this.f37321i = v81Var.f43386s;
        this.f37322j = v81Var.v;
        this.f37323k = v81Var.f43387w;
        this.f37324l = v81Var.f43388x;
        this.f37325m = v81Var.f43384n;
        this.f37326n = v81Var.f43389y;
        this.f37335x = v81Var.E;
        this.f37336y = v81Var.F;
        this.f37327o = v81Var.A;
        this.f37328p = v81Var.B;
        this.f37329q = v81Var.C;
        this.f37330r = v81Var.G;
        this.f37331s = v81Var.H;
        this.f37332t = v81Var.I;
        this.f37333u = v81Var.J;
        this.v = v81Var.K;
        this.f37334w = v81Var.L;
        v81Var.E();
        f2.k0 k0Var = this.d;
        int iL0 = k0Var.L0();
        int iN0 = k0Var.N0();
        while (true) {
            if (iL0 > iN0) {
                jI = -1;
                top = 0;
                break;
            } else {
                if (v81Var.i(iL0) != -1 && (viewM = k0Var.m(iL0)) != null) {
                    jI = v81Var.i(iL0);
                    top = viewM.getTop();
                    break;
                }
                iL0++;
            }
        }
        f2.q.c(this, true).b(v81Var);
        if (jI != -1) {
            while (true) {
                if (i10 >= v81Var.Y) {
                    i10 = -1;
                    break;
                } else if (v81Var.i(i10) == jI) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 > 0) {
                k0Var.h1(i10, top);
            }
        }
    }
}
