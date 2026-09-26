package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class fa1 extends s4.o {
    public int f33593b;
    public final x91 f33594c;
    public final s4.c0 d;
    public final SparseIntArray e = new SparseIntArray();
    public int f33595f = -1;
    public int f33596g = -1;
    public int h = -1;
    public int f33597i = -1;
    public int f33598j = -1;
    public int f33599k = -1;
    public int f33600l = -1;
    public int f33601m = -1;
    public int f33602n = -1;
    public int f33603o = -1;
    public int f33604p = -1;
    public int f33605q = -1;
    public int f33606r = -1;
    public int f33607s = -1;
    public int f33608t = -1;
    public int f33609u = -1;
    public int v = -1;
    public int f33610w = -1;
    public int f33611x = -1;
    public int f33612y = -1;

    public fa1(x91 x91Var, s4.c0 c0Var) {
        this.f33594c = x91Var;
        this.d = c0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.e.get(i10) == this.f33594c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        int i12 = sparseIntArray.get(i10);
        x91 x91Var = this.f33594c;
        if (i12 == 13 && x91Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && x91Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f33611x;
        if (i10 >= i13 && i10 <= this.f33612y) {
            if (i10 - i13 == i11 - x91Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f33595f && i11 == x91Var.e) {
            return true;
        } else {
            if (i10 == this.f33596g && i11 == x91Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == x91Var.f39887r) {
                return true;
            }
            if (i10 == this.f33597i && i11 == x91Var.f39888s) {
                return true;
            }
            if (i10 == this.f33598j && i11 == x91Var.v) {
                return true;
            }
            if (i10 == this.f33599k && i11 == x91Var.f39889w) {
                return true;
            }
            if (i10 == this.f33600l && i11 == x91Var.f39890x) {
                return true;
            }
            if (i10 == this.f33601m && i11 == x91Var.f39886n) {
                return true;
            }
            if (i10 == this.f33602n && i11 == x91Var.f39891y) {
                return true;
            }
            if (i10 == this.f33606r && i11 == x91Var.K) {
                return true;
            }
            if (i10 == this.f33607s && i11 == x91Var.L) {
                return true;
            }
            if (i10 == this.f33608t && i11 == x91Var.M) {
                return true;
            }
            if (i10 == this.f33609u && i11 == x91Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == x91Var.O) {
                return true;
            }
            if (i10 == this.f33610w && i11 == x91Var.P) {
                return true;
            }
            if (i10 == this.f33603o && i11 == x91Var.E) {
                return true;
            }
            if (i10 == this.f33604p && i11 == x91Var.F) {
                return true;
            }
            if (i10 == this.f33605q && i11 == x91Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f33594c.f39883c0;
    }

    @Override
    public final int e() {
        return this.f33593b;
    }

    public final void f() {
        long j3;
        int i10;
        View m10;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        x91 x91Var = this.f33594c;
        this.f33593b = x91Var.f39883c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f33593b; i12++) {
            sparseIntArray.put(i12, x91Var.j(i12));
        }
        this.f33595f = x91Var.e;
        this.f33596g = x91Var.h;
        this.h = x91Var.f39887r;
        this.f33597i = x91Var.f39888s;
        this.f33598j = x91Var.v;
        this.f33599k = x91Var.f39889w;
        this.f33600l = x91Var.f39890x;
        this.f33601m = x91Var.f39886n;
        this.f33602n = x91Var.f39891y;
        this.f33611x = x91Var.I;
        this.f33612y = x91Var.J;
        this.f33603o = x91Var.E;
        this.f33604p = x91Var.F;
        this.f33605q = x91Var.G;
        this.f33606r = x91Var.K;
        this.f33607s = x91Var.L;
        this.f33608t = x91Var.M;
        this.f33609u = x91Var.N;
        this.v = x91Var.O;
        this.f33610w = x91Var.P;
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
                if (i11 < x91Var.f39883c0) {
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
