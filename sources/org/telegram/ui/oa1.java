package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class oa1 extends s4.o {
    public int f40506b;
    public final ga1 f40507c;
    public final s4.d0 d;
    public final SparseIntArray f40508e = new SparseIntArray();
    public int f40509f = -1;
    public int f40510g = -1;
    public int h = -1;
    public int f40511i = -1;
    public int f40512j = -1;
    public int f40513k = -1;
    public int f40514l = -1;
    public int f40515m = -1;
    public int f40516n = -1;
    public int f40517o = -1;
    public int f40518p = -1;
    public int f40519q = -1;
    public int f40520r = -1;
    public int f40521s = -1;
    public int f40522t = -1;
    public int f40523u = -1;
    public int v = -1;
    public int f40524w = -1;
    public int f40525x = -1;
    public int f40526y = -1;

    public oa1(ga1 ga1Var, s4.d0 d0Var) {
        this.f40507c = ga1Var;
        this.d = d0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.f40508e.get(i10) == this.f40507c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.f40508e;
        int i12 = sparseIntArray.get(i10);
        ga1 ga1Var = this.f40507c;
        if (i12 == 13 && ga1Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && ga1Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f40525x;
        if (i10 >= i13 && i10 <= this.f40526y) {
            if (i10 - i13 == i11 - ga1Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f40509f && i11 == ga1Var.f38003e) {
            return true;
        } else {
            if (i10 == this.f40510g && i11 == ga1Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == ga1Var.f38006r) {
                return true;
            }
            if (i10 == this.f40511i && i11 == ga1Var.f38007s) {
                return true;
            }
            if (i10 == this.f40512j && i11 == ga1Var.v) {
                return true;
            }
            if (i10 == this.f40513k && i11 == ga1Var.f38008w) {
                return true;
            }
            if (i10 == this.f40514l && i11 == ga1Var.f38009x) {
                return true;
            }
            if (i10 == this.f40515m && i11 == ga1Var.f38005n) {
                return true;
            }
            if (i10 == this.f40516n && i11 == ga1Var.f38010y) {
                return true;
            }
            if (i10 == this.f40520r && i11 == ga1Var.K) {
                return true;
            }
            if (i10 == this.f40521s && i11 == ga1Var.L) {
                return true;
            }
            if (i10 == this.f40522t && i11 == ga1Var.M) {
                return true;
            }
            if (i10 == this.f40523u && i11 == ga1Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == ga1Var.O) {
                return true;
            }
            if (i10 == this.f40524w && i11 == ga1Var.P) {
                return true;
            }
            if (i10 == this.f40517o && i11 == ga1Var.E) {
                return true;
            }
            if (i10 == this.f40518p && i11 == ga1Var.F) {
                return true;
            }
            if (i10 == this.f40519q && i11 == ga1Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f40507c.f38001c0;
    }

    @Override
    public final int e() {
        return this.f40506b;
    }

    public final void f() {
        int i10;
        long j3;
        View m10;
        SparseIntArray sparseIntArray = this.f40508e;
        sparseIntArray.clear();
        ga1 ga1Var = this.f40507c;
        this.f40506b = ga1Var.f38001c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f40506b; i12++) {
            sparseIntArray.put(i12, ga1Var.j(i12));
        }
        this.f40509f = ga1Var.f38003e;
        this.f40510g = ga1Var.h;
        this.h = ga1Var.f38006r;
        this.f40511i = ga1Var.f38007s;
        this.f40512j = ga1Var.v;
        this.f40513k = ga1Var.f38008w;
        this.f40514l = ga1Var.f38009x;
        this.f40515m = ga1Var.f38005n;
        this.f40516n = ga1Var.f38010y;
        this.f40525x = ga1Var.I;
        this.f40526y = ga1Var.J;
        this.f40517o = ga1Var.E;
        this.f40518p = ga1Var.F;
        this.f40519q = ga1Var.G;
        this.f40520r = ga1Var.K;
        this.f40521s = ga1Var.L;
        this.f40522t = ga1Var.M;
        this.f40523u = ga1Var.N;
        this.v = ga1Var.O;
        this.f40524w = ga1Var.P;
        ga1Var.E();
        s4.d0 d0Var = this.d;
        int L0 = d0Var.L0();
        int N0 = d0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (ga1Var.i(L0) != -1 && (m10 = d0Var.m(L0)) != null) {
                    j3 = ga1Var.i(L0);
                    i10 = m10.getTop();
                    break;
                }
                L0++;
            } else {
                i10 = 0;
                j3 = -1;
                break;
            }
        }
        s4.o.c(this, true).b(ga1Var);
        if (j3 != -1) {
            while (true) {
                if (i11 < ga1Var.f38001c0) {
                    if (ga1Var.i(i11) == j3) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 > 0) {
                d0Var.h1(i11, i10);
            }
        }
    }
}
