package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class p41 extends v4.o {
    public int f48622b;
    public final g41 f48623c;
    public final v4.b0 d;
    public final SparseIntArray f48624e = new SparseIntArray();
    public int f48625f = -1;
    public int f48626g = -1;
    public int h = -1;
    public int f48627i = -1;
    public int f48628j = -1;
    public int f48629k = -1;
    public int f48630l = -1;
    public int f48631m = -1;
    public int f48632n = -1;
    public int f48633o = -1;
    public int f48634p = -1;
    public int f48635q = -1;
    public int f48636r = -1;
    public int f48637s = -1;
    public int f48638t = -1;
    public int f48639u = -1;
    public int v = -1;
    public int f48640w = -1;
    public int f48641x = -1;
    public int f48642y = -1;

    public p41(g41 g41Var, v4.b0 b0Var) {
        this.f48623c = g41Var;
        this.d = b0Var;
    }

    @Override
    public final boolean a(int i7, int i10) {
        if (this.f48624e.get(i7) == this.f48623c.d(i10)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i7, int i10) {
        SparseIntArray sparseIntArray = this.f48624e;
        int i11 = sparseIntArray.get(i7);
        g41 g41Var = this.f48623c;
        if (i11 == 13 && g41Var.d(i10) == 13) {
            return true;
        }
        if (sparseIntArray.get(i7) == 10 && g41Var.d(i10) == 10) {
            return true;
        }
        int i12 = this.f48641x;
        if (i7 >= i12 && i7 <= this.f48642y) {
            if (i7 - i12 == i10 - g41Var.I) {
                return true;
            }
            return false;
        } else if (i7 == this.f48625f && i10 == g41Var.f45855e) {
            return true;
        } else {
            if (i7 == this.f48626g && i10 == g41Var.h) {
                return true;
            }
            if (i7 == this.h && i10 == g41Var.f45858r) {
                return true;
            }
            if (i7 == this.f48627i && i10 == g41Var.f45859s) {
                return true;
            }
            if (i7 == this.f48628j && i10 == g41Var.f45860w) {
                return true;
            }
            if (i7 == this.f48629k && i10 == g41Var.f45861x) {
                return true;
            }
            if (i7 == this.f48630l && i10 == g41Var.f45862y) {
                return true;
            }
            if (i7 == this.f48631m && i10 == g41Var.f45857n) {
                return true;
            }
            if (i7 == this.f48632n && i10 == g41Var.D) {
                return true;
            }
            if (i7 == this.f48636r && i10 == g41Var.K) {
                return true;
            }
            if (i7 == this.f48637s && i10 == g41Var.L) {
                return true;
            }
            if (i7 == this.f48638t && i10 == g41Var.M) {
                return true;
            }
            if (i7 == this.f48639u && i10 == g41Var.N) {
                return true;
            }
            if (i7 == this.v && i10 == g41Var.O) {
                return true;
            }
            if (i7 == this.f48640w && i10 == g41Var.P) {
                return true;
            }
            if (i7 == this.f48633o && i10 == g41Var.E) {
                return true;
            }
            if (i7 == this.f48634p && i10 == g41Var.F) {
                return true;
            }
            if (i7 == this.f48635q && i10 == g41Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f48623c.f45853c0;
    }

    @Override
    public final int e() {
        return this.f48622b;
    }

    public final void f() {
        int i7;
        long j3;
        View m10;
        SparseIntArray sparseIntArray = this.f48624e;
        sparseIntArray.clear();
        g41 g41Var = this.f48623c;
        this.f48622b = g41Var.f45853c0;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f48622b; i11++) {
            sparseIntArray.put(i11, g41Var.d(i11));
        }
        this.f48625f = g41Var.f45855e;
        this.f48626g = g41Var.h;
        this.h = g41Var.f45858r;
        this.f48627i = g41Var.f45859s;
        this.f48628j = g41Var.f45860w;
        this.f48629k = g41Var.f45861x;
        this.f48630l = g41Var.f45862y;
        this.f48631m = g41Var.f45857n;
        this.f48632n = g41Var.D;
        this.f48641x = g41Var.I;
        this.f48642y = g41Var.J;
        this.f48633o = g41Var.E;
        this.f48634p = g41Var.F;
        this.f48635q = g41Var.G;
        this.f48636r = g41Var.K;
        this.f48637s = g41Var.L;
        this.f48638t = g41Var.M;
        this.f48639u = g41Var.N;
        this.v = g41Var.O;
        this.f48640w = g41Var.P;
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
                if (i10 < g41Var.f45853c0) {
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
