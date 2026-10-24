package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class g91 extends s4.o {
    public int f37492b;
    public final y81 f37493c;
    public final s4.b0 d;
    public final SparseIntArray e = new SparseIntArray();
    public int f37494f = -1;
    public int f37495g = -1;
    public int h = -1;
    public int f37496i = -1;
    public int f37497j = -1;
    public int f37498k = -1;
    public int f37499l = -1;
    public int f37500m = -1;
    public int f37501n = -1;
    public int f37502o = -1;
    public int f37503p = -1;
    public int f37504q = -1;
    public int f37505r = -1;
    public int f37506s = -1;
    public int f37507t = -1;
    public int f37508u = -1;
    public int v = -1;
    public int f37509w = -1;
    public int f37510x = -1;
    public int f37511y = -1;

    public g91(y81 y81Var, s4.b0 b0Var) {
        this.f37493c = y81Var;
        this.d = b0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.e.get(i10) == this.f37493c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        int i12 = sparseIntArray.get(i10);
        y81 y81Var = this.f37493c;
        if (i12 == 13 && y81Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && y81Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f37510x;
        if (i10 >= i13 && i10 <= this.f37511y) {
            if (i10 - i13 == i11 - y81Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f37494f && i11 == y81Var.e) {
            return true;
        } else {
            if (i10 == this.f37495g && i11 == y81Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == y81Var.f43798r) {
                return true;
            }
            if (i10 == this.f37496i && i11 == y81Var.f43799s) {
                return true;
            }
            if (i10 == this.f37497j && i11 == y81Var.v) {
                return true;
            }
            if (i10 == this.f37498k && i11 == y81Var.f43800w) {
                return true;
            }
            if (i10 == this.f37499l && i11 == y81Var.f43801x) {
                return true;
            }
            if (i10 == this.f37500m && i11 == y81Var.f43797n) {
                return true;
            }
            if (i10 == this.f37501n && i11 == y81Var.f43802y) {
                return true;
            }
            if (i10 == this.f37505r && i11 == y81Var.K) {
                return true;
            }
            if (i10 == this.f37506s && i11 == y81Var.L) {
                return true;
            }
            if (i10 == this.f37507t && i11 == y81Var.M) {
                return true;
            }
            if (i10 == this.f37508u && i11 == y81Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == y81Var.O) {
                return true;
            }
            if (i10 == this.f37509w && i11 == y81Var.P) {
                return true;
            }
            if (i10 == this.f37502o && i11 == y81Var.E) {
                return true;
            }
            if (i10 == this.f37503p && i11 == y81Var.F) {
                return true;
            }
            if (i10 == this.f37504q && i11 == y81Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f37493c.f43794c0;
    }

    @Override
    public final int e() {
        return this.f37492b;
    }

    public final void f() {
        int i10;
        long j10;
        View m10;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        y81 y81Var = this.f37493c;
        this.f37492b = y81Var.f43794c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f37492b; i12++) {
            sparseIntArray.put(i12, y81Var.j(i12));
        }
        this.f37494f = y81Var.e;
        this.f37495g = y81Var.h;
        this.h = y81Var.f43798r;
        this.f37496i = y81Var.f43799s;
        this.f37497j = y81Var.v;
        this.f37498k = y81Var.f43800w;
        this.f37499l = y81Var.f43801x;
        this.f37500m = y81Var.f43797n;
        this.f37501n = y81Var.f43802y;
        this.f37510x = y81Var.I;
        this.f37511y = y81Var.J;
        this.f37502o = y81Var.E;
        this.f37503p = y81Var.F;
        this.f37504q = y81Var.G;
        this.f37505r = y81Var.K;
        this.f37506s = y81Var.L;
        this.f37507t = y81Var.M;
        this.f37508u = y81Var.N;
        this.v = y81Var.O;
        this.f37509w = y81Var.P;
        y81Var.E();
        s4.b0 b0Var = this.d;
        int L0 = b0Var.L0();
        int N0 = b0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (y81Var.i(L0) != -1 && (m10 = b0Var.m(L0)) != null) {
                    j10 = y81Var.i(L0);
                    i10 = m10.getTop();
                    break;
                }
                L0++;
            } else {
                i10 = 0;
                j10 = -1;
                break;
            }
        }
        s4.o.c(this, true).c(y81Var);
        if (j10 != -1) {
            while (true) {
                if (i11 < y81Var.f43794c0) {
                    if (y81Var.i(i11) == j10) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 > 0) {
                b0Var.h1(i11, i10);
            }
        }
    }
}
