package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class p41 extends v4.o {
    public int f48616b;
    public final g41 f48617c;
    public final v4.b0 d;
    public final SparseIntArray f48618e = new SparseIntArray();
    public int f48619f = -1;
    public int f48620g = -1;
    public int h = -1;
    public int f48621i = -1;
    public int f48622j = -1;
    public int f48623k = -1;
    public int f48624l = -1;
    public int f48625m = -1;
    public int f48626n = -1;
    public int f48627o = -1;
    public int f48628p = -1;
    public int f48629q = -1;
    public int f48630r = -1;
    public int f48631s = -1;
    public int f48632t = -1;
    public int f48633u = -1;
    public int v = -1;
    public int f48634w = -1;
    public int f48635x = -1;
    public int f48636y = -1;

    public p41(g41 g41Var, v4.b0 b0Var) {
        this.f48617c = g41Var;
        this.d = b0Var;
    }

    @Override
    public final boolean a(int i7, int i10) {
        if (this.f48618e.get(i7) == this.f48617c.d(i10)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i7, int i10) {
        SparseIntArray sparseIntArray = this.f48618e;
        int i11 = sparseIntArray.get(i7);
        g41 g41Var = this.f48617c;
        if (i11 == 13 && g41Var.d(i10) == 13) {
            return true;
        }
        if (sparseIntArray.get(i7) == 10 && g41Var.d(i10) == 10) {
            return true;
        }
        int i12 = this.f48635x;
        if (i7 >= i12 && i7 <= this.f48636y) {
            if (i7 - i12 == i10 - g41Var.I) {
                return true;
            }
            return false;
        } else if (i7 == this.f48619f && i10 == g41Var.f45832e) {
            return true;
        } else {
            if (i7 == this.f48620g && i10 == g41Var.h) {
                return true;
            }
            if (i7 == this.h && i10 == g41Var.f45835r) {
                return true;
            }
            if (i7 == this.f48621i && i10 == g41Var.f45836s) {
                return true;
            }
            if (i7 == this.f48622j && i10 == g41Var.f45837w) {
                return true;
            }
            if (i7 == this.f48623k && i10 == g41Var.f45838x) {
                return true;
            }
            if (i7 == this.f48624l && i10 == g41Var.f45839y) {
                return true;
            }
            if (i7 == this.f48625m && i10 == g41Var.f45834n) {
                return true;
            }
            if (i7 == this.f48626n && i10 == g41Var.D) {
                return true;
            }
            if (i7 == this.f48630r && i10 == g41Var.K) {
                return true;
            }
            if (i7 == this.f48631s && i10 == g41Var.L) {
                return true;
            }
            if (i7 == this.f48632t && i10 == g41Var.M) {
                return true;
            }
            if (i7 == this.f48633u && i10 == g41Var.N) {
                return true;
            }
            if (i7 == this.v && i10 == g41Var.O) {
                return true;
            }
            if (i7 == this.f48634w && i10 == g41Var.P) {
                return true;
            }
            if (i7 == this.f48627o && i10 == g41Var.E) {
                return true;
            }
            if (i7 == this.f48628p && i10 == g41Var.F) {
                return true;
            }
            if (i7 == this.f48629q && i10 == g41Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f48617c.f45830c0;
    }

    @Override
    public final int e() {
        return this.f48616b;
    }

    public final void f() {
        int i7;
        long j3;
        View m10;
        SparseIntArray sparseIntArray = this.f48618e;
        sparseIntArray.clear();
        g41 g41Var = this.f48617c;
        this.f48616b = g41Var.f45830c0;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f48616b; i11++) {
            sparseIntArray.put(i11, g41Var.d(i11));
        }
        this.f48619f = g41Var.f45832e;
        this.f48620g = g41Var.h;
        this.h = g41Var.f45835r;
        this.f48621i = g41Var.f45836s;
        this.f48622j = g41Var.f45837w;
        this.f48623k = g41Var.f45838x;
        this.f48624l = g41Var.f45839y;
        this.f48625m = g41Var.f45834n;
        this.f48626n = g41Var.D;
        this.f48635x = g41Var.I;
        this.f48636y = g41Var.J;
        this.f48627o = g41Var.E;
        this.f48628p = g41Var.F;
        this.f48629q = g41Var.G;
        this.f48630r = g41Var.K;
        this.f48631s = g41Var.L;
        this.f48632t = g41Var.M;
        this.f48633u = g41Var.N;
        this.v = g41Var.O;
        this.f48634w = g41Var.P;
        g41Var.E();
        v4.b0 b0Var = this.d;
        int L0 = b0Var.L0();
        int N0 = b0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (g41Var.c(L0) != -1 && (m10 = b0Var.m(L0)) != null) {
                    j3 = g41Var.c(L0);
                    i7 = m10.getTop();
                    break;
                }
                L0++;
            } else {
                i7 = 0;
                j3 = -1;
                break;
            }
        }
        v4.o.c(this, true).c(g41Var);
        if (j3 != -1) {
            while (true) {
                if (i10 < g41Var.f45830c0) {
                    if (g41Var.c(i10) == j3) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 > 0) {
                b0Var.h1(i10, i7);
            }
        }
    }
}
