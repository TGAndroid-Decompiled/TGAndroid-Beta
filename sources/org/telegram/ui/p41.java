package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class p41 extends v4.o {
    public int f50683b;
    public final h41 f50684c;
    public final v4.c0 d;
    public final SparseIntArray f50685e = new SparseIntArray();
    public int f50686f = -1;
    public int f50687g = -1;
    public int h = -1;
    public int f50688i = -1;
    public int f50689j = -1;
    public int f50690k = -1;
    public int f50691l = -1;
    public int f50692m = -1;
    public int f50693n = -1;
    public int f50694o = -1;
    public int f50695p = -1;
    public int f50696q = -1;
    public int f50697r = -1;
    public int f50698s = -1;
    public int f50699t = -1;
    public int f50700u = -1;
    public int v = -1;
    public int f50701w = -1;
    public int f50702x = -1;
    public int f50703y = -1;

    public p41(h41 h41Var, v4.c0 c0Var) {
        this.f50684c = h41Var;
        this.d = c0Var;
    }

    @Override
    public final boolean a(int i7, int i10) {
        if (this.f50685e.get(i7) == this.f50684c.d(i10)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i7, int i10) {
        SparseIntArray sparseIntArray = this.f50685e;
        int i11 = sparseIntArray.get(i7);
        h41 h41Var = this.f50684c;
        if (i11 == 13 && h41Var.d(i10) == 13) {
            return true;
        }
        if (sparseIntArray.get(i7) == 10 && h41Var.d(i10) == 10) {
            return true;
        }
        int i12 = this.f50702x;
        if (i7 >= i12 && i7 <= this.f50703y) {
            if (i7 - i12 == i10 - h41Var.J) {
                return true;
            }
            return false;
        } else if (i7 == this.f50686f && i10 == h41Var.f48143e) {
            return true;
        } else {
            if (i7 == this.f50687g && i10 == h41Var.h) {
                return true;
            }
            if (i7 == this.h && i10 == h41Var.f48147r) {
                return true;
            }
            if (i7 == this.f50688i && i10 == h41Var.f48148s) {
                return true;
            }
            if (i7 == this.f50689j && i10 == h41Var.f48149w) {
                return true;
            }
            if (i7 == this.f50690k && i10 == h41Var.f48150x) {
                return true;
            }
            if (i7 == this.f50691l && i10 == h41Var.f48151y) {
                return true;
            }
            if (i7 == this.f50692m && i10 == h41Var.f48146n) {
                return true;
            }
            if (i7 == this.f50693n && i10 == h41Var.E) {
                return true;
            }
            if (i7 == this.f50697r && i10 == h41Var.L) {
                return true;
            }
            if (i7 == this.f50698s && i10 == h41Var.M) {
                return true;
            }
            if (i7 == this.f50699t && i10 == h41Var.N) {
                return true;
            }
            if (i7 == this.f50700u && i10 == h41Var.O) {
                return true;
            }
            if (i7 == this.v && i10 == h41Var.P) {
                return true;
            }
            if (i7 == this.f50701w && i10 == h41Var.Q) {
                return true;
            }
            if (i7 == this.f50694o && i10 == h41Var.F) {
                return true;
            }
            if (i7 == this.f50695p && i10 == h41Var.G) {
                return true;
            }
            if (i7 == this.f50696q && i10 == h41Var.H) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f50684c.f48142d0;
    }

    @Override
    public final int e() {
        return this.f50683b;
    }

    public final void f() {
        int i7;
        long j3;
        View m10;
        SparseIntArray sparseIntArray = this.f50685e;
        sparseIntArray.clear();
        h41 h41Var = this.f50684c;
        this.f50683b = h41Var.f48142d0;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f50683b; i11++) {
            sparseIntArray.put(i11, h41Var.d(i11));
        }
        this.f50686f = h41Var.f48143e;
        this.f50687g = h41Var.h;
        this.h = h41Var.f48147r;
        this.f50688i = h41Var.f48148s;
        this.f50689j = h41Var.f48149w;
        this.f50690k = h41Var.f48150x;
        this.f50691l = h41Var.f48151y;
        this.f50692m = h41Var.f48146n;
        this.f50693n = h41Var.E;
        this.f50702x = h41Var.J;
        this.f50703y = h41Var.K;
        this.f50694o = h41Var.F;
        this.f50695p = h41Var.G;
        this.f50696q = h41Var.H;
        this.f50697r = h41Var.L;
        this.f50698s = h41Var.M;
        this.f50699t = h41Var.N;
        this.f50700u = h41Var.O;
        this.v = h41Var.P;
        this.f50701w = h41Var.Q;
        h41Var.E();
        v4.c0 c0Var = this.d;
        int L0 = c0Var.L0();
        int N0 = c0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (h41Var.c(L0) != -1 && (m10 = c0Var.m(L0)) != null) {
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
                if (i10 < h41Var.f48142d0) {
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
                c0Var.h1(i10, i7);
            }
        }
    }
}
