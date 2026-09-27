package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class ea1 extends s4.o {
    public int f33187b;
    public final w91 f33188c;
    public final s4.c0 d;
    public final SparseIntArray e = new SparseIntArray();
    public int f33189f = -1;
    public int f33190g = -1;
    public int h = -1;
    public int f33191i = -1;
    public int f33192j = -1;
    public int f33193k = -1;
    public int f33194l = -1;
    public int f33195m = -1;
    public int f33196n = -1;
    public int f33197o = -1;
    public int f33198p = -1;
    public int f33199q = -1;
    public int f33200r = -1;
    public int f33201s = -1;
    public int f33202t = -1;
    public int f33203u = -1;
    public int v = -1;
    public int f33204w = -1;
    public int f33205x = -1;
    public int f33206y = -1;

    public ea1(w91 w91Var, s4.c0 c0Var) {
        this.f33188c = w91Var;
        this.d = c0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.e.get(i10) == this.f33188c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        int i12 = sparseIntArray.get(i10);
        w91 w91Var = this.f33188c;
        if (i12 == 13 && w91Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && w91Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f33205x;
        if (i10 >= i13 && i10 <= this.f33206y) {
            if (i10 - i13 == i11 - w91Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f33189f && i11 == w91Var.e) {
            return true;
        } else {
            if (i10 == this.f33190g && i11 == w91Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == w91Var.f38857r) {
                return true;
            }
            if (i10 == this.f33191i && i11 == w91Var.f38858s) {
                return true;
            }
            if (i10 == this.f33192j && i11 == w91Var.v) {
                return true;
            }
            if (i10 == this.f33193k && i11 == w91Var.f38859w) {
                return true;
            }
            if (i10 == this.f33194l && i11 == w91Var.f38860x) {
                return true;
            }
            if (i10 == this.f33195m && i11 == w91Var.f38856n) {
                return true;
            }
            if (i10 == this.f33196n && i11 == w91Var.f38861y) {
                return true;
            }
            if (i10 == this.f33200r && i11 == w91Var.K) {
                return true;
            }
            if (i10 == this.f33201s && i11 == w91Var.L) {
                return true;
            }
            if (i10 == this.f33202t && i11 == w91Var.M) {
                return true;
            }
            if (i10 == this.f33203u && i11 == w91Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == w91Var.O) {
                return true;
            }
            if (i10 == this.f33204w && i11 == w91Var.P) {
                return true;
            }
            if (i10 == this.f33197o && i11 == w91Var.E) {
                return true;
            }
            if (i10 == this.f33198p && i11 == w91Var.F) {
                return true;
            }
            if (i10 == this.f33199q && i11 == w91Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f33188c.f38853c0;
    }

    @Override
    public final int e() {
        return this.f33187b;
    }

    public final void f() {
        long j3;
        int i10;
        View m10;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        w91 w91Var = this.f33188c;
        this.f33187b = w91Var.f38853c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f33187b; i12++) {
            sparseIntArray.put(i12, w91Var.j(i12));
        }
        this.f33189f = w91Var.e;
        this.f33190g = w91Var.h;
        this.h = w91Var.f38857r;
        this.f33191i = w91Var.f38858s;
        this.f33192j = w91Var.v;
        this.f33193k = w91Var.f38859w;
        this.f33194l = w91Var.f38860x;
        this.f33195m = w91Var.f38856n;
        this.f33196n = w91Var.f38861y;
        this.f33205x = w91Var.I;
        this.f33206y = w91Var.J;
        this.f33197o = w91Var.E;
        this.f33198p = w91Var.F;
        this.f33199q = w91Var.G;
        this.f33200r = w91Var.K;
        this.f33201s = w91Var.L;
        this.f33202t = w91Var.M;
        this.f33203u = w91Var.N;
        this.v = w91Var.O;
        this.f33204w = w91Var.P;
        w91Var.E();
        s4.c0 c0Var = this.d;
        int L0 = c0Var.L0();
        int N0 = c0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (w91Var.i(L0) != -1 && (m10 = c0Var.m(L0)) != null) {
                    j3 = w91Var.i(L0);
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
        s4.o.c(this, true).b(w91Var);
        if (j3 != -1) {
            while (true) {
                if (i11 < w91Var.f38853c0) {
                    if (w91Var.i(i11) == j3) {
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
