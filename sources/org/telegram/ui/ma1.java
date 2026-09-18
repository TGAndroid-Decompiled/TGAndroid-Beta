package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class ma1 extends s4.o {
    public int f35554b;
    public final ea1 f35555c;
    public final s4.c0 d;
    public final SparseIntArray e = new SparseIntArray();
    public int f35556f = -1;
    public int f35557g = -1;
    public int h = -1;
    public int f35558i = -1;
    public int f35559j = -1;
    public int f35560k = -1;
    public int f35561l = -1;
    public int f35562m = -1;
    public int f35563n = -1;
    public int f35564o = -1;
    public int f35565p = -1;
    public int f35566q = -1;
    public int f35567r = -1;
    public int f35568s = -1;
    public int f35569t = -1;
    public int f35570u = -1;
    public int v = -1;
    public int f35571w = -1;
    public int f35572x = -1;
    public int f35573y = -1;

    public ma1(ea1 ea1Var, s4.c0 c0Var) {
        this.f35555c = ea1Var;
        this.d = c0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.e.get(i10) == this.f35555c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        int i12 = sparseIntArray.get(i10);
        ea1 ea1Var = this.f35555c;
        if (i12 == 13 && ea1Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && ea1Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f35572x;
        if (i10 >= i13 && i10 <= this.f35573y) {
            if (i10 - i13 == i11 - ea1Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f35556f && i11 == ea1Var.e) {
            return true;
        } else {
            if (i10 == this.f35557g && i11 == ea1Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == ea1Var.f33249r) {
                return true;
            }
            if (i10 == this.f35558i && i11 == ea1Var.f33250s) {
                return true;
            }
            if (i10 == this.f35559j && i11 == ea1Var.v) {
                return true;
            }
            if (i10 == this.f35560k && i11 == ea1Var.f33251w) {
                return true;
            }
            if (i10 == this.f35561l && i11 == ea1Var.f33252x) {
                return true;
            }
            if (i10 == this.f35562m && i11 == ea1Var.f33248n) {
                return true;
            }
            if (i10 == this.f35563n && i11 == ea1Var.f33253y) {
                return true;
            }
            if (i10 == this.f35567r && i11 == ea1Var.K) {
                return true;
            }
            if (i10 == this.f35568s && i11 == ea1Var.L) {
                return true;
            }
            if (i10 == this.f35569t && i11 == ea1Var.M) {
                return true;
            }
            if (i10 == this.f35570u && i11 == ea1Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == ea1Var.O) {
                return true;
            }
            if (i10 == this.f35571w && i11 == ea1Var.P) {
                return true;
            }
            if (i10 == this.f35564o && i11 == ea1Var.E) {
                return true;
            }
            if (i10 == this.f35565p && i11 == ea1Var.F) {
                return true;
            }
            if (i10 == this.f35566q && i11 == ea1Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f35555c.f33245c0;
    }

    @Override
    public final int e() {
        return this.f35554b;
    }

    public final void f() {
        long j3;
        int i10;
        View m10;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        ea1 ea1Var = this.f35555c;
        this.f35554b = ea1Var.f33245c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f35554b; i12++) {
            sparseIntArray.put(i12, ea1Var.j(i12));
        }
        this.f35556f = ea1Var.e;
        this.f35557g = ea1Var.h;
        this.h = ea1Var.f33249r;
        this.f35558i = ea1Var.f33250s;
        this.f35559j = ea1Var.v;
        this.f35560k = ea1Var.f33251w;
        this.f35561l = ea1Var.f33252x;
        this.f35562m = ea1Var.f33248n;
        this.f35563n = ea1Var.f33253y;
        this.f35572x = ea1Var.I;
        this.f35573y = ea1Var.J;
        this.f35564o = ea1Var.E;
        this.f35565p = ea1Var.F;
        this.f35566q = ea1Var.G;
        this.f35567r = ea1Var.K;
        this.f35568s = ea1Var.L;
        this.f35569t = ea1Var.M;
        this.f35570u = ea1Var.N;
        this.v = ea1Var.O;
        this.f35571w = ea1Var.P;
        ea1Var.E();
        s4.c0 c0Var = this.d;
        int L0 = c0Var.L0();
        int N0 = c0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (ea1Var.i(L0) != -1 && (m10 = c0Var.m(L0)) != null) {
                    j3 = ea1Var.i(L0);
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
        s4.o.c(this, true).b(ea1Var);
        if (j3 != -1) {
            while (true) {
                if (i11 < ea1Var.f33245c0) {
                    if (ea1Var.i(i11) == j3) {
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
