package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class p41 extends v4.o {
    public int f50727b;
    public final h41 f50728c;
    public final v4.c0 d;
    public final SparseIntArray f50729e = new SparseIntArray();
    public int f50730f = -1;
    public int f50731g = -1;
    public int h = -1;
    public int f50732i = -1;
    public int f50733j = -1;
    public int f50734k = -1;
    public int f50735l = -1;
    public int f50736m = -1;
    public int f50737n = -1;
    public int f50738o = -1;
    public int f50739p = -1;
    public int f50740q = -1;
    public int f50741r = -1;
    public int f50742s = -1;
    public int f50743t = -1;
    public int f50744u = -1;
    public int v = -1;
    public int f50745w = -1;
    public int f50746x = -1;
    public int f50747y = -1;

    public p41(h41 h41Var, v4.c0 c0Var) {
        this.f50728c = h41Var;
        this.d = c0Var;
    }

    @Override
    public final boolean a(int i7, int i10) {
        if (this.f50729e.get(i7) == this.f50728c.d(i10)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i7, int i10) {
        SparseIntArray sparseIntArray = this.f50729e;
        int i11 = sparseIntArray.get(i7);
        h41 h41Var = this.f50728c;
        if (i11 == 13 && h41Var.d(i10) == 13) {
            return true;
        }
        if (sparseIntArray.get(i7) == 10 && h41Var.d(i10) == 10) {
            return true;
        }
        int i12 = this.f50746x;
        if (i7 >= i12 && i7 <= this.f50747y) {
            if (i7 - i12 == i10 - h41Var.J) {
                return true;
            }
            return false;
        } else if (i7 == this.f50730f && i10 == h41Var.f48215e) {
            return true;
        } else {
            if (i7 == this.f50731g && i10 == h41Var.h) {
                return true;
            }
            if (i7 == this.h && i10 == h41Var.f48219r) {
                return true;
            }
            if (i7 == this.f50732i && i10 == h41Var.f48220s) {
                return true;
            }
            if (i7 == this.f50733j && i10 == h41Var.f48221w) {
                return true;
            }
            if (i7 == this.f50734k && i10 == h41Var.f48222x) {
                return true;
            }
            if (i7 == this.f50735l && i10 == h41Var.f48223y) {
                return true;
            }
            if (i7 == this.f50736m && i10 == h41Var.f48218n) {
                return true;
            }
            if (i7 == this.f50737n && i10 == h41Var.E) {
                return true;
            }
            if (i7 == this.f50741r && i10 == h41Var.L) {
                return true;
            }
            if (i7 == this.f50742s && i10 == h41Var.M) {
                return true;
            }
            if (i7 == this.f50743t && i10 == h41Var.N) {
                return true;
            }
            if (i7 == this.f50744u && i10 == h41Var.O) {
                return true;
            }
            if (i7 == this.v && i10 == h41Var.P) {
                return true;
            }
            if (i7 == this.f50745w && i10 == h41Var.Q) {
                return true;
            }
            if (i7 == this.f50738o && i10 == h41Var.F) {
                return true;
            }
            if (i7 == this.f50739p && i10 == h41Var.G) {
                return true;
            }
            if (i7 == this.f50740q && i10 == h41Var.H) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f50728c.f48214d0;
    }

    @Override
    public final int e() {
        return this.f50727b;
    }

    public final void f() {
        int i7;
        long j3;
        View m10;
        SparseIntArray sparseIntArray = this.f50729e;
        sparseIntArray.clear();
        h41 h41Var = this.f50728c;
        this.f50727b = h41Var.f48214d0;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f50727b; i11++) {
            sparseIntArray.put(i11, h41Var.d(i11));
        }
        this.f50730f = h41Var.f48215e;
        this.f50731g = h41Var.h;
        this.h = h41Var.f48219r;
        this.f50732i = h41Var.f48220s;
        this.f50733j = h41Var.f48221w;
        this.f50734k = h41Var.f48222x;
        this.f50735l = h41Var.f48223y;
        this.f50736m = h41Var.f48218n;
        this.f50737n = h41Var.E;
        this.f50746x = h41Var.J;
        this.f50747y = h41Var.K;
        this.f50738o = h41Var.F;
        this.f50739p = h41Var.G;
        this.f50740q = h41Var.H;
        this.f50741r = h41Var.L;
        this.f50742s = h41Var.M;
        this.f50743t = h41Var.N;
        this.f50744u = h41Var.O;
        this.v = h41Var.P;
        this.f50745w = h41Var.Q;
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
                if (i10 < h41Var.f48214d0) {
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
