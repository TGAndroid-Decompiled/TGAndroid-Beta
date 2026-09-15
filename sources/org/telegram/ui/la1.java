package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class la1 extends s4.o {
    public int f35387b;
    public final da1 f35388c;
    public final s4.c0 d;
    public final SparseIntArray e = new SparseIntArray();
    public int f35389f = -1;
    public int f35390g = -1;
    public int h = -1;
    public int f35391i = -1;
    public int f35392j = -1;
    public int f35393k = -1;
    public int f35394l = -1;
    public int f35395m = -1;
    public int f35396n = -1;
    public int f35397o = -1;
    public int f35398p = -1;
    public int f35399q = -1;
    public int f35400r = -1;
    public int f35401s = -1;
    public int f35402t = -1;
    public int f35403u = -1;
    public int v = -1;
    public int f35404w = -1;
    public int f35405x = -1;
    public int f35406y = -1;

    public la1(da1 da1Var, s4.c0 c0Var) {
        this.f35388c = da1Var;
        this.d = c0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.e.get(i10) == this.f35388c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        int i12 = sparseIntArray.get(i10);
        da1 da1Var = this.f35388c;
        if (i12 == 13 && da1Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && da1Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f35405x;
        if (i10 >= i13 && i10 <= this.f35406y) {
            if (i10 - i13 == i11 - da1Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f35389f && i11 == da1Var.e) {
            return true;
        } else {
            if (i10 == this.f35390g && i11 == da1Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == da1Var.f32982r) {
                return true;
            }
            if (i10 == this.f35391i && i11 == da1Var.f32983s) {
                return true;
            }
            if (i10 == this.f35392j && i11 == da1Var.v) {
                return true;
            }
            if (i10 == this.f35393k && i11 == da1Var.f32984w) {
                return true;
            }
            if (i10 == this.f35394l && i11 == da1Var.f32985x) {
                return true;
            }
            if (i10 == this.f35395m && i11 == da1Var.f32981n) {
                return true;
            }
            if (i10 == this.f35396n && i11 == da1Var.f32986y) {
                return true;
            }
            if (i10 == this.f35400r && i11 == da1Var.K) {
                return true;
            }
            if (i10 == this.f35401s && i11 == da1Var.L) {
                return true;
            }
            if (i10 == this.f35402t && i11 == da1Var.M) {
                return true;
            }
            if (i10 == this.f35403u && i11 == da1Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == da1Var.O) {
                return true;
            }
            if (i10 == this.f35404w && i11 == da1Var.P) {
                return true;
            }
            if (i10 == this.f35397o && i11 == da1Var.E) {
                return true;
            }
            if (i10 == this.f35398p && i11 == da1Var.F) {
                return true;
            }
            if (i10 == this.f35399q && i11 == da1Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f35388c.f32978c0;
    }

    @Override
    public final int e() {
        return this.f35387b;
    }

    public final void f() {
        long j3;
        int i10;
        View m10;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        da1 da1Var = this.f35388c;
        this.f35387b = da1Var.f32978c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f35387b; i12++) {
            sparseIntArray.put(i12, da1Var.j(i12));
        }
        this.f35389f = da1Var.e;
        this.f35390g = da1Var.h;
        this.h = da1Var.f32982r;
        this.f35391i = da1Var.f32983s;
        this.f35392j = da1Var.v;
        this.f35393k = da1Var.f32984w;
        this.f35394l = da1Var.f32985x;
        this.f35395m = da1Var.f32981n;
        this.f35396n = da1Var.f32986y;
        this.f35405x = da1Var.I;
        this.f35406y = da1Var.J;
        this.f35397o = da1Var.E;
        this.f35398p = da1Var.F;
        this.f35399q = da1Var.G;
        this.f35400r = da1Var.K;
        this.f35401s = da1Var.L;
        this.f35402t = da1Var.M;
        this.f35403u = da1Var.N;
        this.v = da1Var.O;
        this.f35404w = da1Var.P;
        da1Var.E();
        s4.c0 c0Var = this.d;
        int L0 = c0Var.L0();
        int N0 = c0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (da1Var.i(L0) != -1 && (m10 = c0Var.m(L0)) != null) {
                    j3 = da1Var.i(L0);
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
        s4.o.c(this, true).b(da1Var);
        if (j3 != -1) {
            while (true) {
                if (i11 < da1Var.f32978c0) {
                    if (da1Var.i(i11) == j3) {
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
