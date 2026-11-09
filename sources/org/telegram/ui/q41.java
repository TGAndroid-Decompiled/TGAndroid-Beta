package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class q41 extends v4.o {
    public int f48894b;
    public final h41 f48895c;
    public final v4.b0 d;
    public final SparseIntArray f48896e = new SparseIntArray();
    public int f48897f = -1;
    public int f48898g = -1;
    public int h = -1;
    public int f48899i = -1;
    public int f48900j = -1;
    public int f48901k = -1;
    public int f48902l = -1;
    public int f48903m = -1;
    public int f48904n = -1;
    public int f48905o = -1;
    public int f48906p = -1;
    public int f48907q = -1;
    public int f48908r = -1;
    public int f48909s = -1;
    public int f48910t = -1;
    public int f48911u = -1;
    public int v = -1;
    public int f48912w = -1;
    public int f48913x = -1;
    public int f48914y = -1;

    public q41(h41 h41Var, v4.b0 b0Var) {
        this.f48895c = h41Var;
        this.d = b0Var;
    }

    @Override
    public final boolean a(int i7, int i10) {
        if (this.f48896e.get(i7) == this.f48895c.d(i10)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i7, int i10) {
        SparseIntArray sparseIntArray = this.f48896e;
        int i11 = sparseIntArray.get(i7);
        h41 h41Var = this.f48895c;
        if (i11 == 13 && h41Var.d(i10) == 13) {
            return true;
        }
        if (sparseIntArray.get(i7) == 10 && h41Var.d(i10) == 10) {
            return true;
        }
        int i12 = this.f48913x;
        if (i7 >= i12 && i7 <= this.f48914y) {
            if (i7 - i12 == i10 - h41Var.I) {
                return true;
            }
            return false;
        } else if (i7 == this.f48897f && i10 == h41Var.f46149e) {
            return true;
        } else {
            if (i7 == this.f48898g && i10 == h41Var.h) {
                return true;
            }
            if (i7 == this.h && i10 == h41Var.f46152r) {
                return true;
            }
            if (i7 == this.f48899i && i10 == h41Var.f46153s) {
                return true;
            }
            if (i7 == this.f48900j && i10 == h41Var.f46154w) {
                return true;
            }
            if (i7 == this.f48901k && i10 == h41Var.f46155x) {
                return true;
            }
            if (i7 == this.f48902l && i10 == h41Var.f46156y) {
                return true;
            }
            if (i7 == this.f48903m && i10 == h41Var.f46151n) {
                return true;
            }
            if (i7 == this.f48904n && i10 == h41Var.D) {
                return true;
            }
            if (i7 == this.f48908r && i10 == h41Var.K) {
                return true;
            }
            if (i7 == this.f48909s && i10 == h41Var.L) {
                return true;
            }
            if (i7 == this.f48910t && i10 == h41Var.M) {
                return true;
            }
            if (i7 == this.f48911u && i10 == h41Var.N) {
                return true;
            }
            if (i7 == this.v && i10 == h41Var.O) {
                return true;
            }
            if (i7 == this.f48912w && i10 == h41Var.P) {
                return true;
            }
            if (i7 == this.f48905o && i10 == h41Var.E) {
                return true;
            }
            if (i7 == this.f48906p && i10 == h41Var.F) {
                return true;
            }
            if (i7 == this.f48907q && i10 == h41Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f48895c.f46147c0;
    }

    @Override
    public final int e() {
        return this.f48894b;
    }

    public final void f() {
        int i7;
        long j3;
        View m10;
        SparseIntArray sparseIntArray = this.f48896e;
        sparseIntArray.clear();
        h41 h41Var = this.f48895c;
        this.f48894b = h41Var.f46147c0;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f48894b; i11++) {
            sparseIntArray.put(i11, h41Var.d(i11));
        }
        this.f48897f = h41Var.f46149e;
        this.f48898g = h41Var.h;
        this.h = h41Var.f46152r;
        this.f48899i = h41Var.f46153s;
        this.f48900j = h41Var.f46154w;
        this.f48901k = h41Var.f46155x;
        this.f48902l = h41Var.f46156y;
        this.f48903m = h41Var.f46151n;
        this.f48904n = h41Var.D;
        this.f48913x = h41Var.I;
        this.f48914y = h41Var.J;
        this.f48905o = h41Var.E;
        this.f48906p = h41Var.F;
        this.f48907q = h41Var.G;
        this.f48908r = h41Var.K;
        this.f48909s = h41Var.L;
        this.f48910t = h41Var.M;
        this.f48911u = h41Var.N;
        this.v = h41Var.O;
        this.f48912w = h41Var.P;
        h41Var.E();
        v4.b0 b0Var = this.d;
        int L0 = b0Var.L0();
        int N0 = b0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (h41Var.c(L0) != -1 && (m10 = b0Var.m(L0)) != null) {
                    j3 = h41Var.c(L0);
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
        v4.o.c(this, true).c(h41Var);
        if (j3 != -1) {
            while (true) {
                if (i10 < h41Var.f46147c0) {
                    if (h41Var.c(i10) == j3) {
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
