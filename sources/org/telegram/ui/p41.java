package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class p41 extends v4.o {
    public int f48628b;
    public final g41 f48629c;
    public final v4.b0 d;
    public final SparseIntArray f48630e = new SparseIntArray();
    public int f48631f = -1;
    public int f48632g = -1;
    public int h = -1;
    public int f48633i = -1;
    public int f48634j = -1;
    public int f48635k = -1;
    public int f48636l = -1;
    public int f48637m = -1;
    public int f48638n = -1;
    public int f48639o = -1;
    public int f48640p = -1;
    public int f48641q = -1;
    public int f48642r = -1;
    public int f48643s = -1;
    public int f48644t = -1;
    public int f48645u = -1;
    public int v = -1;
    public int f48646w = -1;
    public int f48647x = -1;
    public int f48648y = -1;

    public p41(g41 g41Var, v4.b0 b0Var) {
        this.f48629c = g41Var;
        this.d = b0Var;
    }

    @Override
    public final boolean a(int i7, int i10) {
        if (this.f48630e.get(i7) == this.f48629c.d(i10)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i7, int i10) {
        SparseIntArray sparseIntArray = this.f48630e;
        int i11 = sparseIntArray.get(i7);
        g41 g41Var = this.f48629c;
        if (i11 == 13 && g41Var.d(i10) == 13) {
            return true;
        }
        if (sparseIntArray.get(i7) == 10 && g41Var.d(i10) == 10) {
            return true;
        }
        int i12 = this.f48647x;
        if (i7 >= i12 && i7 <= this.f48648y) {
            if (i7 - i12 == i10 - g41Var.I) {
                return true;
            }
            return false;
        } else if (i7 == this.f48631f && i10 == g41Var.f45829e) {
            return true;
        } else {
            if (i7 == this.f48632g && i10 == g41Var.h) {
                return true;
            }
            if (i7 == this.h && i10 == g41Var.f45832r) {
                return true;
            }
            if (i7 == this.f48633i && i10 == g41Var.f45833s) {
                return true;
            }
            if (i7 == this.f48634j && i10 == g41Var.f45834w) {
                return true;
            }
            if (i7 == this.f48635k && i10 == g41Var.f45835x) {
                return true;
            }
            if (i7 == this.f48636l && i10 == g41Var.f45836y) {
                return true;
            }
            if (i7 == this.f48637m && i10 == g41Var.f45831n) {
                return true;
            }
            if (i7 == this.f48638n && i10 == g41Var.D) {
                return true;
            }
            if (i7 == this.f48642r && i10 == g41Var.K) {
                return true;
            }
            if (i7 == this.f48643s && i10 == g41Var.L) {
                return true;
            }
            if (i7 == this.f48644t && i10 == g41Var.M) {
                return true;
            }
            if (i7 == this.f48645u && i10 == g41Var.N) {
                return true;
            }
            if (i7 == this.v && i10 == g41Var.O) {
                return true;
            }
            if (i7 == this.f48646w && i10 == g41Var.P) {
                return true;
            }
            if (i7 == this.f48639o && i10 == g41Var.E) {
                return true;
            }
            if (i7 == this.f48640p && i10 == g41Var.F) {
                return true;
            }
            if (i7 == this.f48641q && i10 == g41Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f48629c.f45827c0;
    }

    @Override
    public final int e() {
        return this.f48628b;
    }

    public final void f() {
        int i7;
        long j3;
        View m10;
        SparseIntArray sparseIntArray = this.f48630e;
        sparseIntArray.clear();
        g41 g41Var = this.f48629c;
        this.f48628b = g41Var.f45827c0;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f48628b; i11++) {
            sparseIntArray.put(i11, g41Var.d(i11));
        }
        this.f48631f = g41Var.f45829e;
        this.f48632g = g41Var.h;
        this.h = g41Var.f45832r;
        this.f48633i = g41Var.f45833s;
        this.f48634j = g41Var.f45834w;
        this.f48635k = g41Var.f45835x;
        this.f48636l = g41Var.f45836y;
        this.f48637m = g41Var.f45831n;
        this.f48638n = g41Var.D;
        this.f48647x = g41Var.I;
        this.f48648y = g41Var.J;
        this.f48639o = g41Var.E;
        this.f48640p = g41Var.F;
        this.f48641q = g41Var.G;
        this.f48642r = g41Var.K;
        this.f48643s = g41Var.L;
        this.f48644t = g41Var.M;
        this.f48645u = g41Var.N;
        this.v = g41Var.O;
        this.f48646w = g41Var.P;
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
                if (i10 < g41Var.f45827c0) {
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
