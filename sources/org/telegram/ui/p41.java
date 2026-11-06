package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class p41 extends v4.o {
    public int f48623b;
    public final g41 f48624c;
    public final v4.b0 d;
    public final SparseIntArray f48625e = new SparseIntArray();
    public int f48626f = -1;
    public int f48627g = -1;
    public int h = -1;
    public int f48628i = -1;
    public int f48629j = -1;
    public int f48630k = -1;
    public int f48631l = -1;
    public int f48632m = -1;
    public int f48633n = -1;
    public int f48634o = -1;
    public int f48635p = -1;
    public int f48636q = -1;
    public int f48637r = -1;
    public int f48638s = -1;
    public int f48639t = -1;
    public int f48640u = -1;
    public int v = -1;
    public int f48641w = -1;
    public int f48642x = -1;
    public int f48643y = -1;

    public p41(g41 g41Var, v4.b0 b0Var) {
        this.f48624c = g41Var;
        this.d = b0Var;
    }

    @Override
    public final boolean a(int i7, int i10) {
        if (this.f48625e.get(i7) == this.f48624c.d(i10)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i7, int i10) {
        SparseIntArray sparseIntArray = this.f48625e;
        int i11 = sparseIntArray.get(i7);
        g41 g41Var = this.f48624c;
        if (i11 == 13 && g41Var.d(i10) == 13) {
            return true;
        }
        if (sparseIntArray.get(i7) == 10 && g41Var.d(i10) == 10) {
            return true;
        }
        int i12 = this.f48642x;
        if (i7 >= i12 && i7 <= this.f48643y) {
            if (i7 - i12 == i10 - g41Var.I) {
                return true;
            }
            return false;
        } else if (i7 == this.f48626f && i10 == g41Var.f45856e) {
            return true;
        } else {
            if (i7 == this.f48627g && i10 == g41Var.h) {
                return true;
            }
            if (i7 == this.h && i10 == g41Var.f45859r) {
                return true;
            }
            if (i7 == this.f48628i && i10 == g41Var.f45860s) {
                return true;
            }
            if (i7 == this.f48629j && i10 == g41Var.f45861w) {
                return true;
            }
            if (i7 == this.f48630k && i10 == g41Var.f45862x) {
                return true;
            }
            if (i7 == this.f48631l && i10 == g41Var.f45863y) {
                return true;
            }
            if (i7 == this.f48632m && i10 == g41Var.f45858n) {
                return true;
            }
            if (i7 == this.f48633n && i10 == g41Var.D) {
                return true;
            }
            if (i7 == this.f48637r && i10 == g41Var.K) {
                return true;
            }
            if (i7 == this.f48638s && i10 == g41Var.L) {
                return true;
            }
            if (i7 == this.f48639t && i10 == g41Var.M) {
                return true;
            }
            if (i7 == this.f48640u && i10 == g41Var.N) {
                return true;
            }
            if (i7 == this.v && i10 == g41Var.O) {
                return true;
            }
            if (i7 == this.f48641w && i10 == g41Var.P) {
                return true;
            }
            if (i7 == this.f48634o && i10 == g41Var.E) {
                return true;
            }
            if (i7 == this.f48635p && i10 == g41Var.F) {
                return true;
            }
            if (i7 == this.f48636q && i10 == g41Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f48624c.f45854c0;
    }

    @Override
    public final int e() {
        return this.f48623b;
    }

    public final void f() {
        int i7;
        long j3;
        View m10;
        SparseIntArray sparseIntArray = this.f48625e;
        sparseIntArray.clear();
        g41 g41Var = this.f48624c;
        this.f48623b = g41Var.f45854c0;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f48623b; i11++) {
            sparseIntArray.put(i11, g41Var.d(i11));
        }
        this.f48626f = g41Var.f45856e;
        this.f48627g = g41Var.h;
        this.h = g41Var.f45859r;
        this.f48628i = g41Var.f45860s;
        this.f48629j = g41Var.f45861w;
        this.f48630k = g41Var.f45862x;
        this.f48631l = g41Var.f45863y;
        this.f48632m = g41Var.f45858n;
        this.f48633n = g41Var.D;
        this.f48642x = g41Var.I;
        this.f48643y = g41Var.J;
        this.f48634o = g41Var.E;
        this.f48635p = g41Var.F;
        this.f48636q = g41Var.G;
        this.f48637r = g41Var.K;
        this.f48638s = g41Var.L;
        this.f48639t = g41Var.M;
        this.f48640u = g41Var.N;
        this.v = g41Var.O;
        this.f48641w = g41Var.P;
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
                if (i10 < g41Var.f45854c0) {
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
