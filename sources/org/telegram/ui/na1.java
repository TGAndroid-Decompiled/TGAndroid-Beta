package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class na1 extends s4.o {
    public int f40215b;
    public final fa1 f40216c;
    public final s4.d0 d;
    public final SparseIntArray f40217e = new SparseIntArray();
    public int f40218f = -1;
    public int f40219g = -1;
    public int h = -1;
    public int f40220i = -1;
    public int f40221j = -1;
    public int f40222k = -1;
    public int f40223l = -1;
    public int f40224m = -1;
    public int f40225n = -1;
    public int f40226o = -1;
    public int f40227p = -1;
    public int f40228q = -1;
    public int f40229r = -1;
    public int f40230s = -1;
    public int f40231t = -1;
    public int f40232u = -1;
    public int v = -1;
    public int f40233w = -1;
    public int f40234x = -1;
    public int f40235y = -1;

    public na1(fa1 fa1Var, s4.d0 d0Var) {
        this.f40216c = fa1Var;
        this.d = d0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.f40217e.get(i10) == this.f40216c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.f40217e;
        int i12 = sparseIntArray.get(i10);
        fa1 fa1Var = this.f40216c;
        if (i12 == 13 && fa1Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && fa1Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f40234x;
        if (i10 >= i13 && i10 <= this.f40235y) {
            if (i10 - i13 == i11 - fa1Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f40218f && i11 == fa1Var.f37655e) {
            return true;
        } else {
            if (i10 == this.f40219g && i11 == fa1Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == fa1Var.f37658r) {
                return true;
            }
            if (i10 == this.f40220i && i11 == fa1Var.f37659s) {
                return true;
            }
            if (i10 == this.f40221j && i11 == fa1Var.v) {
                return true;
            }
            if (i10 == this.f40222k && i11 == fa1Var.f37660w) {
                return true;
            }
            if (i10 == this.f40223l && i11 == fa1Var.f37661x) {
                return true;
            }
            if (i10 == this.f40224m && i11 == fa1Var.f37657n) {
                return true;
            }
            if (i10 == this.f40225n && i11 == fa1Var.f37662y) {
                return true;
            }
            if (i10 == this.f40229r && i11 == fa1Var.K) {
                return true;
            }
            if (i10 == this.f40230s && i11 == fa1Var.L) {
                return true;
            }
            if (i10 == this.f40231t && i11 == fa1Var.M) {
                return true;
            }
            if (i10 == this.f40232u && i11 == fa1Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == fa1Var.O) {
                return true;
            }
            if (i10 == this.f40233w && i11 == fa1Var.P) {
                return true;
            }
            if (i10 == this.f40226o && i11 == fa1Var.E) {
                return true;
            }
            if (i10 == this.f40227p && i11 == fa1Var.F) {
                return true;
            }
            if (i10 == this.f40228q && i11 == fa1Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f40216c.f37653c0;
    }

    @Override
    public final int e() {
        return this.f40215b;
    }

    public final void f() {
        int i10;
        long j3;
        View m10;
        SparseIntArray sparseIntArray = this.f40217e;
        sparseIntArray.clear();
        fa1 fa1Var = this.f40216c;
        this.f40215b = fa1Var.f37653c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f40215b; i12++) {
            sparseIntArray.put(i12, fa1Var.j(i12));
        }
        this.f40218f = fa1Var.f37655e;
        this.f40219g = fa1Var.h;
        this.h = fa1Var.f37658r;
        this.f40220i = fa1Var.f37659s;
        this.f40221j = fa1Var.v;
        this.f40222k = fa1Var.f37660w;
        this.f40223l = fa1Var.f37661x;
        this.f40224m = fa1Var.f37657n;
        this.f40225n = fa1Var.f37662y;
        this.f40234x = fa1Var.I;
        this.f40235y = fa1Var.J;
        this.f40226o = fa1Var.E;
        this.f40227p = fa1Var.F;
        this.f40228q = fa1Var.G;
        this.f40229r = fa1Var.K;
        this.f40230s = fa1Var.L;
        this.f40231t = fa1Var.M;
        this.f40232u = fa1Var.N;
        this.v = fa1Var.O;
        this.f40233w = fa1Var.P;
        fa1Var.E();
        s4.d0 d0Var = this.d;
        int L0 = d0Var.L0();
        int N0 = d0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (fa1Var.i(L0) != -1 && (m10 = d0Var.m(L0)) != null) {
                    j3 = fa1Var.i(L0);
                    i10 = m10.getTop();
                    break;
                }
                L0++;
            } else {
                i10 = 0;
                j3 = -1;
                break;
            }
        }
        s4.o.c(this, true).b(fa1Var);
        if (j3 != -1) {
            while (true) {
                if (i11 < fa1Var.f37653c0) {
                    if (fa1Var.i(i11) == j3) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 > 0) {
                d0Var.h1(i11, i10);
            }
        }
    }
}
