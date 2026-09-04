package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class oa1 extends s4.o {
    public int f39185b;
    public final ga1 f39186c;
    public final s4.c0 d;
    public final SparseIntArray f39187e = new SparseIntArray();
    public int f39188f = -1;
    public int f39189g = -1;
    public int h = -1;
    public int f39190i = -1;
    public int f39191j = -1;
    public int f39192k = -1;
    public int f39193l = -1;
    public int f39194m = -1;
    public int f39195n = -1;
    public int f39196o = -1;
    public int f39197p = -1;
    public int f39198q = -1;
    public int f39199r = -1;
    public int f39200s = -1;
    public int f39201t = -1;
    public int f39202u = -1;
    public int v = -1;
    public int f39203w = -1;
    public int f39204x = -1;
    public int f39205y = -1;

    public oa1(ga1 ga1Var, s4.c0 c0Var) {
        this.f39186c = ga1Var;
        this.d = c0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.f39187e.get(i10) == this.f39186c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.f39187e;
        int i12 = sparseIntArray.get(i10);
        ga1 ga1Var = this.f39186c;
        if (i12 == 13 && ga1Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && ga1Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f39204x;
        if (i10 >= i13 && i10 <= this.f39205y) {
            if (i10 - i13 == i11 - ga1Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f39188f && i11 == ga1Var.f36613e) {
            return true;
        } else {
            if (i10 == this.f39189g && i11 == ga1Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == ga1Var.f36616r) {
                return true;
            }
            if (i10 == this.f39190i && i11 == ga1Var.f36617s) {
                return true;
            }
            if (i10 == this.f39191j && i11 == ga1Var.v) {
                return true;
            }
            if (i10 == this.f39192k && i11 == ga1Var.f36618w) {
                return true;
            }
            if (i10 == this.f39193l && i11 == ga1Var.f36619x) {
                return true;
            }
            if (i10 == this.f39194m && i11 == ga1Var.f36615n) {
                return true;
            }
            if (i10 == this.f39195n && i11 == ga1Var.f36620y) {
                return true;
            }
            if (i10 == this.f39199r && i11 == ga1Var.K) {
                return true;
            }
            if (i10 == this.f39200s && i11 == ga1Var.L) {
                return true;
            }
            if (i10 == this.f39201t && i11 == ga1Var.M) {
                return true;
            }
            if (i10 == this.f39202u && i11 == ga1Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == ga1Var.O) {
                return true;
            }
            if (i10 == this.f39203w && i11 == ga1Var.P) {
                return true;
            }
            if (i10 == this.f39196o && i11 == ga1Var.E) {
                return true;
            }
            if (i10 == this.f39197p && i11 == ga1Var.F) {
                return true;
            }
            if (i10 == this.f39198q && i11 == ga1Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f39186c.f36611c0;
    }

    @Override
    public final int e() {
        return this.f39185b;
    }

    public final void f() {
        long j3;
        int i10;
        View m10;
        SparseIntArray sparseIntArray = this.f39187e;
        sparseIntArray.clear();
        ga1 ga1Var = this.f39186c;
        this.f39185b = ga1Var.f36611c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f39185b; i12++) {
            sparseIntArray.put(i12, ga1Var.j(i12));
        }
        this.f39188f = ga1Var.f36613e;
        this.f39189g = ga1Var.h;
        this.h = ga1Var.f36616r;
        this.f39190i = ga1Var.f36617s;
        this.f39191j = ga1Var.v;
        this.f39192k = ga1Var.f36618w;
        this.f39193l = ga1Var.f36619x;
        this.f39194m = ga1Var.f36615n;
        this.f39195n = ga1Var.f36620y;
        this.f39204x = ga1Var.I;
        this.f39205y = ga1Var.J;
        this.f39196o = ga1Var.E;
        this.f39197p = ga1Var.F;
        this.f39198q = ga1Var.G;
        this.f39199r = ga1Var.K;
        this.f39200s = ga1Var.L;
        this.f39201t = ga1Var.M;
        this.f39202u = ga1Var.N;
        this.v = ga1Var.O;
        this.f39203w = ga1Var.P;
        ga1Var.E();
        s4.c0 c0Var = this.d;
        int L0 = c0Var.L0();
        int N0 = c0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (ga1Var.i(L0) != -1 && (m10 = c0Var.m(L0)) != null) {
                    j3 = ga1Var.i(L0);
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
        s4.o.c(this, true).b(ga1Var);
        if (j3 != -1) {
            while (true) {
                if (i11 < ga1Var.f36611c0) {
                    if (ga1Var.i(i11) == j3) {
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
