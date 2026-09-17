package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class oa1 extends s4.o {
    public int f39186b;
    public final ga1 f39187c;
    public final s4.c0 d;
    public final SparseIntArray f39188e = new SparseIntArray();
    public int f39189f = -1;
    public int f39190g = -1;
    public int h = -1;
    public int f39191i = -1;
    public int f39192j = -1;
    public int f39193k = -1;
    public int f39194l = -1;
    public int f39195m = -1;
    public int f39196n = -1;
    public int f39197o = -1;
    public int f39198p = -1;
    public int f39199q = -1;
    public int f39200r = -1;
    public int f39201s = -1;
    public int f39202t = -1;
    public int f39203u = -1;
    public int v = -1;
    public int f39204w = -1;
    public int f39205x = -1;
    public int f39206y = -1;

    public oa1(ga1 ga1Var, s4.c0 c0Var) {
        this.f39187c = ga1Var;
        this.d = c0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.f39188e.get(i10) == this.f39187c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.f39188e;
        int i12 = sparseIntArray.get(i10);
        ga1 ga1Var = this.f39187c;
        if (i12 == 13 && ga1Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && ga1Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f39205x;
        if (i10 >= i13 && i10 <= this.f39206y) {
            if (i10 - i13 == i11 - ga1Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f39189f && i11 == ga1Var.f36614e) {
            return true;
        } else {
            if (i10 == this.f39190g && i11 == ga1Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == ga1Var.f36617r) {
                return true;
            }
            if (i10 == this.f39191i && i11 == ga1Var.f36618s) {
                return true;
            }
            if (i10 == this.f39192j && i11 == ga1Var.v) {
                return true;
            }
            if (i10 == this.f39193k && i11 == ga1Var.f36619w) {
                return true;
            }
            if (i10 == this.f39194l && i11 == ga1Var.f36620x) {
                return true;
            }
            if (i10 == this.f39195m && i11 == ga1Var.f36616n) {
                return true;
            }
            if (i10 == this.f39196n && i11 == ga1Var.f36621y) {
                return true;
            }
            if (i10 == this.f39200r && i11 == ga1Var.K) {
                return true;
            }
            if (i10 == this.f39201s && i11 == ga1Var.L) {
                return true;
            }
            if (i10 == this.f39202t && i11 == ga1Var.M) {
                return true;
            }
            if (i10 == this.f39203u && i11 == ga1Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == ga1Var.O) {
                return true;
            }
            if (i10 == this.f39204w && i11 == ga1Var.P) {
                return true;
            }
            if (i10 == this.f39197o && i11 == ga1Var.E) {
                return true;
            }
            if (i10 == this.f39198p && i11 == ga1Var.F) {
                return true;
            }
            if (i10 == this.f39199q && i11 == ga1Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f39187c.f36612c0;
    }

    @Override
    public final int e() {
        return this.f39186b;
    }

    public final void f() {
        long j3;
        int i10;
        View m10;
        SparseIntArray sparseIntArray = this.f39188e;
        sparseIntArray.clear();
        ga1 ga1Var = this.f39187c;
        this.f39186b = ga1Var.f36612c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f39186b; i12++) {
            sparseIntArray.put(i12, ga1Var.j(i12));
        }
        this.f39189f = ga1Var.f36614e;
        this.f39190g = ga1Var.h;
        this.h = ga1Var.f36617r;
        this.f39191i = ga1Var.f36618s;
        this.f39192j = ga1Var.v;
        this.f39193k = ga1Var.f36619w;
        this.f39194l = ga1Var.f36620x;
        this.f39195m = ga1Var.f36616n;
        this.f39196n = ga1Var.f36621y;
        this.f39205x = ga1Var.I;
        this.f39206y = ga1Var.J;
        this.f39197o = ga1Var.E;
        this.f39198p = ga1Var.F;
        this.f39199q = ga1Var.G;
        this.f39200r = ga1Var.K;
        this.f39201s = ga1Var.L;
        this.f39202t = ga1Var.M;
        this.f39203u = ga1Var.N;
        this.v = ga1Var.O;
        this.f39204w = ga1Var.P;
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
                if (i11 < ga1Var.f36612c0) {
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
