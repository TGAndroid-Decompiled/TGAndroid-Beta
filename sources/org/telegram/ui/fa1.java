package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class fa1 extends s4.o {
    public int f33594b;
    public final x91 f33595c;
    public final s4.c0 d;
    public final SparseIntArray e = new SparseIntArray();
    public int f33596f = -1;
    public int f33597g = -1;
    public int h = -1;
    public int f33598i = -1;
    public int f33599j = -1;
    public int f33600k = -1;
    public int f33601l = -1;
    public int f33602m = -1;
    public int f33603n = -1;
    public int f33604o = -1;
    public int f33605p = -1;
    public int f33606q = -1;
    public int f33607r = -1;
    public int f33608s = -1;
    public int f33609t = -1;
    public int f33610u = -1;
    public int v = -1;
    public int f33611w = -1;
    public int f33612x = -1;
    public int f33613y = -1;

    public fa1(x91 x91Var, s4.c0 c0Var) {
        this.f33595c = x91Var;
        this.d = c0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.e.get(i10) == this.f33595c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        int i12 = sparseIntArray.get(i10);
        x91 x91Var = this.f33595c;
        if (i12 == 13 && x91Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && x91Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f33612x;
        if (i10 >= i13 && i10 <= this.f33613y) {
            if (i10 - i13 == i11 - x91Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f33596f && i11 == x91Var.e) {
            return true;
        } else {
            if (i10 == this.f33597g && i11 == x91Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == x91Var.f39888r) {
                return true;
            }
            if (i10 == this.f33598i && i11 == x91Var.f39889s) {
                return true;
            }
            if (i10 == this.f33599j && i11 == x91Var.v) {
                return true;
            }
            if (i10 == this.f33600k && i11 == x91Var.f39890w) {
                return true;
            }
            if (i10 == this.f33601l && i11 == x91Var.f39891x) {
                return true;
            }
            if (i10 == this.f33602m && i11 == x91Var.f39887n) {
                return true;
            }
            if (i10 == this.f33603n && i11 == x91Var.f39892y) {
                return true;
            }
            if (i10 == this.f33607r && i11 == x91Var.K) {
                return true;
            }
            if (i10 == this.f33608s && i11 == x91Var.L) {
                return true;
            }
            if (i10 == this.f33609t && i11 == x91Var.M) {
                return true;
            }
            if (i10 == this.f33610u && i11 == x91Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == x91Var.O) {
                return true;
            }
            if (i10 == this.f33611w && i11 == x91Var.P) {
                return true;
            }
            if (i10 == this.f33604o && i11 == x91Var.E) {
                return true;
            }
            if (i10 == this.f33605p && i11 == x91Var.F) {
                return true;
            }
            if (i10 == this.f33606q && i11 == x91Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f33595c.f39884c0;
    }

    @Override
    public final int e() {
        return this.f33594b;
    }

    public final void f() {
        long j3;
        int i10;
        View m10;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        x91 x91Var = this.f33595c;
        this.f33594b = x91Var.f39884c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f33594b; i12++) {
            sparseIntArray.put(i12, x91Var.j(i12));
        }
        this.f33596f = x91Var.e;
        this.f33597g = x91Var.h;
        this.h = x91Var.f39888r;
        this.f33598i = x91Var.f39889s;
        this.f33599j = x91Var.v;
        this.f33600k = x91Var.f39890w;
        this.f33601l = x91Var.f39891x;
        this.f33602m = x91Var.f39887n;
        this.f33603n = x91Var.f39892y;
        this.f33612x = x91Var.I;
        this.f33613y = x91Var.J;
        this.f33604o = x91Var.E;
        this.f33605p = x91Var.F;
        this.f33606q = x91Var.G;
        this.f33607r = x91Var.K;
        this.f33608s = x91Var.L;
        this.f33609t = x91Var.M;
        this.f33610u = x91Var.N;
        this.v = x91Var.O;
        this.f33611w = x91Var.P;
        x91Var.E();
        s4.c0 c0Var = this.d;
        int L0 = c0Var.L0();
        int N0 = c0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (x91Var.i(L0) != -1 && (m10 = c0Var.m(L0)) != null) {
                    j3 = x91Var.i(L0);
                    i10 = m10.getTop();
                    break;
                }
                L0++;
            } else {
                j3 = -1;
                i10 = 0;
                break;
            }
        }
        s4.o.c(this, true).b(x91Var);
        if (j3 != -1) {
            while (true) {
                if (i11 < x91Var.f39884c0) {
                    if (x91Var.i(i11) == j3) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 > 0) {
                c0Var.h1(i11, i10);
            }
        }
    }
}
