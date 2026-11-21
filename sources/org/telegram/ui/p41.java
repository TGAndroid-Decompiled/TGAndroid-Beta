package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class p41 extends v4.o {
    public int f50724b;
    public final h41 f50725c;
    public final v4.c0 d;
    public final SparseIntArray f50726e = new SparseIntArray();
    public int f50727f = -1;
    public int f50728g = -1;
    public int h = -1;
    public int f50729i = -1;
    public int f50730j = -1;
    public int f50731k = -1;
    public int f50732l = -1;
    public int f50733m = -1;
    public int f50734n = -1;
    public int f50735o = -1;
    public int f50736p = -1;
    public int f50737q = -1;
    public int f50738r = -1;
    public int f50739s = -1;
    public int f50740t = -1;
    public int f50741u = -1;
    public int v = -1;
    public int f50742w = -1;
    public int f50743x = -1;
    public int f50744y = -1;

    public p41(h41 h41Var, v4.c0 c0Var) {
        this.f50725c = h41Var;
        this.d = c0Var;
    }

    @Override
    public final boolean a(int i7, int i10) {
        if (this.f50726e.get(i7) == this.f50725c.d(i10)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i7, int i10) {
        SparseIntArray sparseIntArray = this.f50726e;
        int i11 = sparseIntArray.get(i7);
        h41 h41Var = this.f50725c;
        if (i11 == 13 && h41Var.d(i10) == 13) {
            return true;
        }
        if (sparseIntArray.get(i7) == 10 && h41Var.d(i10) == 10) {
            return true;
        }
        int i12 = this.f50743x;
        if (i7 >= i12 && i7 <= this.f50744y) {
            if (i7 - i12 == i10 - h41Var.J) {
                return true;
            }
            return false;
        } else if (i7 == this.f50727f && i10 == h41Var.f48218e) {
            return true;
        } else {
            if (i7 == this.f50728g && i10 == h41Var.h) {
                return true;
            }
            if (i7 == this.h && i10 == h41Var.f48222r) {
                return true;
            }
            if (i7 == this.f50729i && i10 == h41Var.f48223s) {
                return true;
            }
            if (i7 == this.f50730j && i10 == h41Var.f48224w) {
                return true;
            }
            if (i7 == this.f50731k && i10 == h41Var.f48225x) {
                return true;
            }
            if (i7 == this.f50732l && i10 == h41Var.f48226y) {
                return true;
            }
            if (i7 == this.f50733m && i10 == h41Var.f48221n) {
                return true;
            }
            if (i7 == this.f50734n && i10 == h41Var.E) {
                return true;
            }
            if (i7 == this.f50738r && i10 == h41Var.L) {
                return true;
            }
            if (i7 == this.f50739s && i10 == h41Var.M) {
                return true;
            }
            if (i7 == this.f50740t && i10 == h41Var.N) {
                return true;
            }
            if (i7 == this.f50741u && i10 == h41Var.O) {
                return true;
            }
            if (i7 == this.v && i10 == h41Var.P) {
                return true;
            }
            if (i7 == this.f50742w && i10 == h41Var.Q) {
                return true;
            }
            if (i7 == this.f50735o && i10 == h41Var.F) {
                return true;
            }
            if (i7 == this.f50736p && i10 == h41Var.G) {
                return true;
            }
            if (i7 == this.f50737q && i10 == h41Var.H) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f50725c.f48217d0;
    }

    @Override
    public final int e() {
        return this.f50724b;
    }

    public final void f() {
        int i7;
        long j3;
        View m10;
        SparseIntArray sparseIntArray = this.f50726e;
        sparseIntArray.clear();
        h41 h41Var = this.f50725c;
        this.f50724b = h41Var.f48217d0;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f50724b; i11++) {
            sparseIntArray.put(i11, h41Var.d(i11));
        }
        this.f50727f = h41Var.f48218e;
        this.f50728g = h41Var.h;
        this.h = h41Var.f48222r;
        this.f50729i = h41Var.f48223s;
        this.f50730j = h41Var.f48224w;
        this.f50731k = h41Var.f48225x;
        this.f50732l = h41Var.f48226y;
        this.f50733m = h41Var.f48221n;
        this.f50734n = h41Var.E;
        this.f50743x = h41Var.J;
        this.f50744y = h41Var.K;
        this.f50735o = h41Var.F;
        this.f50736p = h41Var.G;
        this.f50737q = h41Var.H;
        this.f50738r = h41Var.L;
        this.f50739s = h41Var.M;
        this.f50740t = h41Var.N;
        this.f50741u = h41Var.O;
        this.v = h41Var.P;
        this.f50742w = h41Var.Q;
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
                if (i10 < h41Var.f48217d0) {
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
