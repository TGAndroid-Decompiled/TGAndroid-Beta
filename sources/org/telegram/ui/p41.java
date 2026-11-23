package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class p41 extends v4.o {
    public int f50728b;
    public final h41 f50729c;
    public final v4.c0 d;
    public final SparseIntArray f50730e = new SparseIntArray();
    public int f50731f = -1;
    public int f50732g = -1;
    public int h = -1;
    public int f50733i = -1;
    public int f50734j = -1;
    public int f50735k = -1;
    public int f50736l = -1;
    public int f50737m = -1;
    public int f50738n = -1;
    public int f50739o = -1;
    public int f50740p = -1;
    public int f50741q = -1;
    public int f50742r = -1;
    public int f50743s = -1;
    public int f50744t = -1;
    public int f50745u = -1;
    public int v = -1;
    public int f50746w = -1;
    public int f50747x = -1;
    public int f50748y = -1;

    public p41(h41 h41Var, v4.c0 c0Var) {
        this.f50729c = h41Var;
        this.d = c0Var;
    }

    @Override
    public final boolean a(int i7, int i10) {
        if (this.f50730e.get(i7) == this.f50729c.d(i10)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i7, int i10) {
        SparseIntArray sparseIntArray = this.f50730e;
        int i11 = sparseIntArray.get(i7);
        h41 h41Var = this.f50729c;
        if (i11 == 13 && h41Var.d(i10) == 13) {
            return true;
        }
        if (sparseIntArray.get(i7) == 10 && h41Var.d(i10) == 10) {
            return true;
        }
        int i12 = this.f50747x;
        if (i7 >= i12 && i7 <= this.f50748y) {
            if (i7 - i12 == i10 - h41Var.J) {
                return true;
            }
            return false;
        } else if (i7 == this.f50731f && i10 == h41Var.f48222e) {
            return true;
        } else {
            if (i7 == this.f50732g && i10 == h41Var.h) {
                return true;
            }
            if (i7 == this.h && i10 == h41Var.f48226r) {
                return true;
            }
            if (i7 == this.f50733i && i10 == h41Var.f48227s) {
                return true;
            }
            if (i7 == this.f50734j && i10 == h41Var.f48228w) {
                return true;
            }
            if (i7 == this.f50735k && i10 == h41Var.f48229x) {
                return true;
            }
            if (i7 == this.f50736l && i10 == h41Var.f48230y) {
                return true;
            }
            if (i7 == this.f50737m && i10 == h41Var.f48225n) {
                return true;
            }
            if (i7 == this.f50738n && i10 == h41Var.E) {
                return true;
            }
            if (i7 == this.f50742r && i10 == h41Var.L) {
                return true;
            }
            if (i7 == this.f50743s && i10 == h41Var.M) {
                return true;
            }
            if (i7 == this.f50744t && i10 == h41Var.N) {
                return true;
            }
            if (i7 == this.f50745u && i10 == h41Var.O) {
                return true;
            }
            if (i7 == this.v && i10 == h41Var.P) {
                return true;
            }
            if (i7 == this.f50746w && i10 == h41Var.Q) {
                return true;
            }
            if (i7 == this.f50739o && i10 == h41Var.F) {
                return true;
            }
            if (i7 == this.f50740p && i10 == h41Var.G) {
                return true;
            }
            if (i7 == this.f50741q && i10 == h41Var.H) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f50729c.f48221d0;
    }

    @Override
    public final int e() {
        return this.f50728b;
    }

    public final void f() {
        int i7;
        long j3;
        View m10;
        SparseIntArray sparseIntArray = this.f50730e;
        sparseIntArray.clear();
        h41 h41Var = this.f50729c;
        this.f50728b = h41Var.f48221d0;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f50728b; i11++) {
            sparseIntArray.put(i11, h41Var.d(i11));
        }
        this.f50731f = h41Var.f48222e;
        this.f50732g = h41Var.h;
        this.h = h41Var.f48226r;
        this.f50733i = h41Var.f48227s;
        this.f50734j = h41Var.f48228w;
        this.f50735k = h41Var.f48229x;
        this.f50736l = h41Var.f48230y;
        this.f50737m = h41Var.f48225n;
        this.f50738n = h41Var.E;
        this.f50747x = h41Var.J;
        this.f50748y = h41Var.K;
        this.f50739o = h41Var.F;
        this.f50740p = h41Var.G;
        this.f50741q = h41Var.H;
        this.f50742r = h41Var.L;
        this.f50743s = h41Var.M;
        this.f50744t = h41Var.N;
        this.f50745u = h41Var.O;
        this.v = h41Var.P;
        this.f50746w = h41Var.Q;
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
                if (i10 < h41Var.f48221d0) {
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
