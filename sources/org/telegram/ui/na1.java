package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class na1 extends s4.o {
    public int f40181b;
    public final fa1 f40182c;
    public final s4.d0 d;
    public final SparseIntArray f40183e = new SparseIntArray();
    public int f40184f = -1;
    public int f40185g = -1;
    public int h = -1;
    public int f40186i = -1;
    public int f40187j = -1;
    public int f40188k = -1;
    public int f40189l = -1;
    public int f40190m = -1;
    public int f40191n = -1;
    public int f40192o = -1;
    public int f40193p = -1;
    public int f40194q = -1;
    public int f40195r = -1;
    public int f40196s = -1;
    public int f40197t = -1;
    public int f40198u = -1;
    public int v = -1;
    public int f40199w = -1;
    public int f40200x = -1;
    public int f40201y = -1;

    public na1(fa1 fa1Var, s4.d0 d0Var) {
        this.f40182c = fa1Var;
        this.d = d0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.f40183e.get(i10) == this.f40182c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.f40183e;
        int i12 = sparseIntArray.get(i10);
        fa1 fa1Var = this.f40182c;
        if (i12 == 13 && fa1Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && fa1Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f40200x;
        if (i10 >= i13 && i10 <= this.f40201y) {
            if (i10 - i13 == i11 - fa1Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f40184f && i11 == fa1Var.f37621e) {
            return true;
        } else {
            if (i10 == this.f40185g && i11 == fa1Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == fa1Var.f37624r) {
                return true;
            }
            if (i10 == this.f40186i && i11 == fa1Var.f37625s) {
                return true;
            }
            if (i10 == this.f40187j && i11 == fa1Var.v) {
                return true;
            }
            if (i10 == this.f40188k && i11 == fa1Var.f37626w) {
                return true;
            }
            if (i10 == this.f40189l && i11 == fa1Var.f37627x) {
                return true;
            }
            if (i10 == this.f40190m && i11 == fa1Var.f37623n) {
                return true;
            }
            if (i10 == this.f40191n && i11 == fa1Var.f37628y) {
                return true;
            }
            if (i10 == this.f40195r && i11 == fa1Var.K) {
                return true;
            }
            if (i10 == this.f40196s && i11 == fa1Var.L) {
                return true;
            }
            if (i10 == this.f40197t && i11 == fa1Var.M) {
                return true;
            }
            if (i10 == this.f40198u && i11 == fa1Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == fa1Var.O) {
                return true;
            }
            if (i10 == this.f40199w && i11 == fa1Var.P) {
                return true;
            }
            if (i10 == this.f40192o && i11 == fa1Var.E) {
                return true;
            }
            if (i10 == this.f40193p && i11 == fa1Var.F) {
                return true;
            }
            if (i10 == this.f40194q && i11 == fa1Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f40182c.f37619c0;
    }

    @Override
    public final int e() {
        return this.f40181b;
    }

    public final void f() {
        int i10;
        long j3;
        View m10;
        SparseIntArray sparseIntArray = this.f40183e;
        sparseIntArray.clear();
        fa1 fa1Var = this.f40182c;
        this.f40181b = fa1Var.f37619c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f40181b; i12++) {
            sparseIntArray.put(i12, fa1Var.j(i12));
        }
        this.f40184f = fa1Var.f37621e;
        this.f40185g = fa1Var.h;
        this.h = fa1Var.f37624r;
        this.f40186i = fa1Var.f37625s;
        this.f40187j = fa1Var.v;
        this.f40188k = fa1Var.f37626w;
        this.f40189l = fa1Var.f37627x;
        this.f40190m = fa1Var.f37623n;
        this.f40191n = fa1Var.f37628y;
        this.f40200x = fa1Var.I;
        this.f40201y = fa1Var.J;
        this.f40192o = fa1Var.E;
        this.f40193p = fa1Var.F;
        this.f40194q = fa1Var.G;
        this.f40195r = fa1Var.K;
        this.f40196s = fa1Var.L;
        this.f40197t = fa1Var.M;
        this.f40198u = fa1Var.N;
        this.v = fa1Var.O;
        this.f40199w = fa1Var.P;
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
                if (i11 < fa1Var.f37619c0) {
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
