package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class na1 extends s4.o {
    public int f35993b;
    public final fa1 f35994c;
    public final s4.c0 d;
    public final SparseIntArray e = new SparseIntArray();
    public int f35995f = -1;
    public int f35996g = -1;
    public int h = -1;
    public int f35997i = -1;
    public int f35998j = -1;
    public int f35999k = -1;
    public int f36000l = -1;
    public int f36001m = -1;
    public int f36002n = -1;
    public int f36003o = -1;
    public int f36004p = -1;
    public int f36005q = -1;
    public int f36006r = -1;
    public int f36007s = -1;
    public int f36008t = -1;
    public int f36009u = -1;
    public int v = -1;
    public int f36010w = -1;
    public int f36011x = -1;
    public int f36012y = -1;

    public na1(fa1 fa1Var, s4.c0 c0Var) {
        this.f35994c = fa1Var;
        this.d = c0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.e.get(i10) == this.f35994c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        int i12 = sparseIntArray.get(i10);
        fa1 fa1Var = this.f35994c;
        if (i12 == 13 && fa1Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && fa1Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f36011x;
        if (i10 >= i13 && i10 <= this.f36012y) {
            if (i10 - i13 == i11 - fa1Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f35995f && i11 == fa1Var.e) {
            return true;
        } else {
            if (i10 == this.f35996g && i11 == fa1Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == fa1Var.f33610r) {
                return true;
            }
            if (i10 == this.f35997i && i11 == fa1Var.f33611s) {
                return true;
            }
            if (i10 == this.f35998j && i11 == fa1Var.v) {
                return true;
            }
            if (i10 == this.f35999k && i11 == fa1Var.f33612w) {
                return true;
            }
            if (i10 == this.f36000l && i11 == fa1Var.f33613x) {
                return true;
            }
            if (i10 == this.f36001m && i11 == fa1Var.f33609n) {
                return true;
            }
            if (i10 == this.f36002n && i11 == fa1Var.f33614y) {
                return true;
            }
            if (i10 == this.f36006r && i11 == fa1Var.K) {
                return true;
            }
            if (i10 == this.f36007s && i11 == fa1Var.L) {
                return true;
            }
            if (i10 == this.f36008t && i11 == fa1Var.M) {
                return true;
            }
            if (i10 == this.f36009u && i11 == fa1Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == fa1Var.O) {
                return true;
            }
            if (i10 == this.f36010w && i11 == fa1Var.P) {
                return true;
            }
            if (i10 == this.f36003o && i11 == fa1Var.E) {
                return true;
            }
            if (i10 == this.f36004p && i11 == fa1Var.F) {
                return true;
            }
            if (i10 == this.f36005q && i11 == fa1Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f35994c.f33606c0;
    }

    @Override
    public final int e() {
        return this.f35993b;
    }

    public final void f() {
        long j3;
        int i10;
        View m10;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        fa1 fa1Var = this.f35994c;
        this.f35993b = fa1Var.f33606c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f35993b; i12++) {
            sparseIntArray.put(i12, fa1Var.j(i12));
        }
        this.f35995f = fa1Var.e;
        this.f35996g = fa1Var.h;
        this.h = fa1Var.f33610r;
        this.f35997i = fa1Var.f33611s;
        this.f35998j = fa1Var.v;
        this.f35999k = fa1Var.f33612w;
        this.f36000l = fa1Var.f33613x;
        this.f36001m = fa1Var.f33609n;
        this.f36002n = fa1Var.f33614y;
        this.f36011x = fa1Var.I;
        this.f36012y = fa1Var.J;
        this.f36003o = fa1Var.E;
        this.f36004p = fa1Var.F;
        this.f36005q = fa1Var.G;
        this.f36006r = fa1Var.K;
        this.f36007s = fa1Var.L;
        this.f36008t = fa1Var.M;
        this.f36009u = fa1Var.N;
        this.v = fa1Var.O;
        this.f36010w = fa1Var.P;
        fa1Var.E();
        s4.c0 c0Var = this.d;
        int L0 = c0Var.L0();
        int N0 = c0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (fa1Var.i(L0) != -1 && (m10 = c0Var.m(L0)) != null) {
                    j3 = fa1Var.i(L0);
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
        s4.o.c(this, true).b(fa1Var);
        if (j3 != -1) {
            while (true) {
                if (i11 < fa1Var.f33606c0) {
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
                c0Var.h1(i11, i10);
            }
        }
    }
}
