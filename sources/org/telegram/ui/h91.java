package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class h91 extends s4.o {
    public int f37788b;
    public final z81 f37789c;
    public final s4.b0 d;
    public final SparseIntArray e = new SparseIntArray();
    public int f37790f = -1;
    public int f37791g = -1;
    public int h = -1;
    public int f37792i = -1;
    public int f37793j = -1;
    public int f37794k = -1;
    public int f37795l = -1;
    public int f37796m = -1;
    public int f37797n = -1;
    public int f37798o = -1;
    public int f37799p = -1;
    public int f37800q = -1;
    public int f37801r = -1;
    public int f37802s = -1;
    public int f37803t = -1;
    public int f37804u = -1;
    public int v = -1;
    public int f37805w = -1;
    public int f37806x = -1;
    public int f37807y = -1;

    public h91(z81 z81Var, s4.b0 b0Var) {
        this.f37789c = z81Var;
        this.d = b0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.e.get(i10) == this.f37789c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        int i12 = sparseIntArray.get(i10);
        z81 z81Var = this.f37789c;
        if (i12 == 13 && z81Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && z81Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f37806x;
        if (i10 >= i13 && i10 <= this.f37807y) {
            if (i10 - i13 == i11 - z81Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f37790f && i11 == z81Var.e) {
            return true;
        } else {
            if (i10 == this.f37791g && i11 == z81Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == z81Var.f44084r) {
                return true;
            }
            if (i10 == this.f37792i && i11 == z81Var.f44085s) {
                return true;
            }
            if (i10 == this.f37793j && i11 == z81Var.v) {
                return true;
            }
            if (i10 == this.f37794k && i11 == z81Var.f44086w) {
                return true;
            }
            if (i10 == this.f37795l && i11 == z81Var.f44087x) {
                return true;
            }
            if (i10 == this.f37796m && i11 == z81Var.f44083n) {
                return true;
            }
            if (i10 == this.f37797n && i11 == z81Var.f44088y) {
                return true;
            }
            if (i10 == this.f37801r && i11 == z81Var.K) {
                return true;
            }
            if (i10 == this.f37802s && i11 == z81Var.L) {
                return true;
            }
            if (i10 == this.f37803t && i11 == z81Var.M) {
                return true;
            }
            if (i10 == this.f37804u && i11 == z81Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == z81Var.O) {
                return true;
            }
            if (i10 == this.f37805w && i11 == z81Var.P) {
                return true;
            }
            if (i10 == this.f37798o && i11 == z81Var.E) {
                return true;
            }
            if (i10 == this.f37799p && i11 == z81Var.F) {
                return true;
            }
            if (i10 == this.f37800q && i11 == z81Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f37789c.f44080c0;
    }

    @Override
    public final int e() {
        return this.f37788b;
    }

    public final void f() {
        int i10;
        long j10;
        View m10;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        z81 z81Var = this.f37789c;
        this.f37788b = z81Var.f44080c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f37788b; i12++) {
            sparseIntArray.put(i12, z81Var.j(i12));
        }
        this.f37790f = z81Var.e;
        this.f37791g = z81Var.h;
        this.h = z81Var.f44084r;
        this.f37792i = z81Var.f44085s;
        this.f37793j = z81Var.v;
        this.f37794k = z81Var.f44086w;
        this.f37795l = z81Var.f44087x;
        this.f37796m = z81Var.f44083n;
        this.f37797n = z81Var.f44088y;
        this.f37806x = z81Var.I;
        this.f37807y = z81Var.J;
        this.f37798o = z81Var.E;
        this.f37799p = z81Var.F;
        this.f37800q = z81Var.G;
        this.f37801r = z81Var.K;
        this.f37802s = z81Var.L;
        this.f37803t = z81Var.M;
        this.f37804u = z81Var.N;
        this.v = z81Var.O;
        this.f37805w = z81Var.P;
        z81Var.E();
        s4.b0 b0Var = this.d;
        int L0 = b0Var.L0();
        int N0 = b0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (z81Var.i(L0) != -1 && (m10 = b0Var.m(L0)) != null) {
                    j10 = z81Var.i(L0);
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
        s4.o.c(this, true).c(z81Var);
        if (j10 != -1) {
            while (true) {
                if (i11 < z81Var.f44080c0) {
                    if (z81Var.i(i11) == j10) {
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
