package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class oa1 extends s4.o {
    public int f36255b;
    public final ga1 f36256c;
    public final s4.c0 d;
    public final SparseIntArray e = new SparseIntArray();
    public int f36257f = -1;
    public int f36258g = -1;
    public int h = -1;
    public int f36259i = -1;
    public int f36260j = -1;
    public int f36261k = -1;
    public int f36262l = -1;
    public int f36263m = -1;
    public int f36264n = -1;
    public int f36265o = -1;
    public int f36266p = -1;
    public int f36267q = -1;
    public int f36268r = -1;
    public int f36269s = -1;
    public int f36270t = -1;
    public int f36271u = -1;
    public int v = -1;
    public int f36272w = -1;
    public int f36273x = -1;
    public int f36274y = -1;

    public oa1(ga1 ga1Var, s4.c0 c0Var) {
        this.f36256c = ga1Var;
        this.d = c0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.e.get(i10) == this.f36256c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        int i12 = sparseIntArray.get(i10);
        ga1 ga1Var = this.f36256c;
        if (i12 == 13 && ga1Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && ga1Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f36273x;
        if (i10 >= i13 && i10 <= this.f36274y) {
            if (i10 - i13 == i11 - ga1Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f36257f && i11 == ga1Var.e) {
            return true;
        } else {
            if (i10 == this.f36258g && i11 == ga1Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == ga1Var.f33878r) {
                return true;
            }
            if (i10 == this.f36259i && i11 == ga1Var.f33879s) {
                return true;
            }
            if (i10 == this.f36260j && i11 == ga1Var.v) {
                return true;
            }
            if (i10 == this.f36261k && i11 == ga1Var.f33880w) {
                return true;
            }
            if (i10 == this.f36262l && i11 == ga1Var.f33881x) {
                return true;
            }
            if (i10 == this.f36263m && i11 == ga1Var.f33877n) {
                return true;
            }
            if (i10 == this.f36264n && i11 == ga1Var.f33882y) {
                return true;
            }
            if (i10 == this.f36268r && i11 == ga1Var.K) {
                return true;
            }
            if (i10 == this.f36269s && i11 == ga1Var.L) {
                return true;
            }
            if (i10 == this.f36270t && i11 == ga1Var.M) {
                return true;
            }
            if (i10 == this.f36271u && i11 == ga1Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == ga1Var.O) {
                return true;
            }
            if (i10 == this.f36272w && i11 == ga1Var.P) {
                return true;
            }
            if (i10 == this.f36265o && i11 == ga1Var.E) {
                return true;
            }
            if (i10 == this.f36266p && i11 == ga1Var.F) {
                return true;
            }
            if (i10 == this.f36267q && i11 == ga1Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f36256c.f33874c0;
    }

    @Override
    public final int e() {
        return this.f36255b;
    }

    public final void f() {
        long j3;
        int i10;
        View m10;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        ga1 ga1Var = this.f36256c;
        this.f36255b = ga1Var.f33874c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f36255b; i12++) {
            sparseIntArray.put(i12, ga1Var.j(i12));
        }
        this.f36257f = ga1Var.e;
        this.f36258g = ga1Var.h;
        this.h = ga1Var.f33878r;
        this.f36259i = ga1Var.f33879s;
        this.f36260j = ga1Var.v;
        this.f36261k = ga1Var.f33880w;
        this.f36262l = ga1Var.f33881x;
        this.f36263m = ga1Var.f33877n;
        this.f36264n = ga1Var.f33882y;
        this.f36273x = ga1Var.I;
        this.f36274y = ga1Var.J;
        this.f36265o = ga1Var.E;
        this.f36266p = ga1Var.F;
        this.f36267q = ga1Var.G;
        this.f36268r = ga1Var.K;
        this.f36269s = ga1Var.L;
        this.f36270t = ga1Var.M;
        this.f36271u = ga1Var.N;
        this.v = ga1Var.O;
        this.f36272w = ga1Var.P;
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
                if (i11 < ga1Var.f33874c0) {
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
