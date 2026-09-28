package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class fa1 extends s4.o {
    public int f33595b;
    public final x91 f33596c;
    public final s4.c0 d;
    public final SparseIntArray e = new SparseIntArray();
    public int f33597f = -1;
    public int f33598g = -1;
    public int h = -1;
    public int f33599i = -1;
    public int f33600j = -1;
    public int f33601k = -1;
    public int f33602l = -1;
    public int f33603m = -1;
    public int f33604n = -1;
    public int f33605o = -1;
    public int f33606p = -1;
    public int f33607q = -1;
    public int f33608r = -1;
    public int f33609s = -1;
    public int f33610t = -1;
    public int f33611u = -1;
    public int v = -1;
    public int f33612w = -1;
    public int f33613x = -1;
    public int f33614y = -1;

    public fa1(x91 x91Var, s4.c0 c0Var) {
        this.f33596c = x91Var;
        this.d = c0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.e.get(i10) == this.f33596c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        int i12 = sparseIntArray.get(i10);
        x91 x91Var = this.f33596c;
        if (i12 == 13 && x91Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && x91Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f33613x;
        if (i10 >= i13 && i10 <= this.f33614y) {
            if (i10 - i13 == i11 - x91Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f33597f && i11 == x91Var.e) {
            return true;
        } else {
            if (i10 == this.f33598g && i11 == x91Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == x91Var.f39889r) {
                return true;
            }
            if (i10 == this.f33599i && i11 == x91Var.f39890s) {
                return true;
            }
            if (i10 == this.f33600j && i11 == x91Var.v) {
                return true;
            }
            if (i10 == this.f33601k && i11 == x91Var.f39891w) {
                return true;
            }
            if (i10 == this.f33602l && i11 == x91Var.f39892x) {
                return true;
            }
            if (i10 == this.f33603m && i11 == x91Var.f39888n) {
                return true;
            }
            if (i10 == this.f33604n && i11 == x91Var.f39893y) {
                return true;
            }
            if (i10 == this.f33608r && i11 == x91Var.K) {
                return true;
            }
            if (i10 == this.f33609s && i11 == x91Var.L) {
                return true;
            }
            if (i10 == this.f33610t && i11 == x91Var.M) {
                return true;
            }
            if (i10 == this.f33611u && i11 == x91Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == x91Var.O) {
                return true;
            }
            if (i10 == this.f33612w && i11 == x91Var.P) {
                return true;
            }
            if (i10 == this.f33605o && i11 == x91Var.E) {
                return true;
            }
            if (i10 == this.f33606p && i11 == x91Var.F) {
                return true;
            }
            if (i10 == this.f33607q && i11 == x91Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f33596c.f39885c0;
    }

    @Override
    public final int e() {
        return this.f33595b;
    }

    public final void f() {
        long j3;
        int i10;
        View m10;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        x91 x91Var = this.f33596c;
        this.f33595b = x91Var.f39885c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f33595b; i12++) {
            sparseIntArray.put(i12, x91Var.j(i12));
        }
        this.f33597f = x91Var.e;
        this.f33598g = x91Var.h;
        this.h = x91Var.f39889r;
        this.f33599i = x91Var.f39890s;
        this.f33600j = x91Var.v;
        this.f33601k = x91Var.f39891w;
        this.f33602l = x91Var.f39892x;
        this.f33603m = x91Var.f39888n;
        this.f33604n = x91Var.f39893y;
        this.f33613x = x91Var.I;
        this.f33614y = x91Var.J;
        this.f33605o = x91Var.E;
        this.f33606p = x91Var.F;
        this.f33607q = x91Var.G;
        this.f33608r = x91Var.K;
        this.f33609s = x91Var.L;
        this.f33610t = x91Var.M;
        this.f33611u = x91Var.N;
        this.v = x91Var.O;
        this.f33612w = x91Var.P;
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
                if (i11 < x91Var.f39885c0) {
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
