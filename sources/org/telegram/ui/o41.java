package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class o41 extends v4.p {
    public int f50522b;
    public final g41 f50523c;
    public final v4.c0 d;
    public final SparseIntArray f50524e = new SparseIntArray();
    public int f50525f = -1;
    public int f50526g = -1;
    public int h = -1;
    public int f50527i = -1;
    public int f50528j = -1;
    public int f50529k = -1;
    public int f50530l = -1;
    public int f50531m = -1;
    public int f50532n = -1;
    public int f50533o = -1;
    public int f50534p = -1;
    public int f50535q = -1;
    public int f50536r = -1;
    public int f50537s = -1;
    public int f50538t = -1;
    public int f50539u = -1;
    public int v = -1;
    public int f50540w = -1;
    public int f50541x = -1;
    public int f50542y = -1;

    public o41(g41 g41Var, v4.c0 c0Var) {
        this.f50523c = g41Var;
        this.d = c0Var;
    }

    @Override
    public final boolean a(int i7, int i10) {
        if (this.f50524e.get(i7) == this.f50523c.d(i10)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i7, int i10) {
        SparseIntArray sparseIntArray = this.f50524e;
        int i11 = sparseIntArray.get(i7);
        g41 g41Var = this.f50523c;
        if (i11 == 13 && g41Var.d(i10) == 13) {
            return true;
        }
        if (sparseIntArray.get(i7) == 10 && g41Var.d(i10) == 10) {
            return true;
        }
        int i12 = this.f50541x;
        if (i7 >= i12 && i7 <= this.f50542y) {
            if (i7 - i12 == i10 - g41Var.J) {
                return true;
            }
            return false;
        } else if (i7 == this.f50525f && i10 == g41Var.f48094e) {
            return true;
        } else {
            if (i7 == this.f50526g && i10 == g41Var.h) {
                return true;
            }
            if (i7 == this.h && i10 == g41Var.f48098r) {
                return true;
            }
            if (i7 == this.f50527i && i10 == g41Var.f48099s) {
                return true;
            }
            if (i7 == this.f50528j && i10 == g41Var.f48100w) {
                return true;
            }
            if (i7 == this.f50529k && i10 == g41Var.f48101x) {
                return true;
            }
            if (i7 == this.f50530l && i10 == g41Var.f48102y) {
                return true;
            }
            if (i7 == this.f50531m && i10 == g41Var.f48097n) {
                return true;
            }
            if (i7 == this.f50532n && i10 == g41Var.E) {
                return true;
            }
            if (i7 == this.f50536r && i10 == g41Var.L) {
                return true;
            }
            if (i7 == this.f50537s && i10 == g41Var.M) {
                return true;
            }
            if (i7 == this.f50538t && i10 == g41Var.N) {
                return true;
            }
            if (i7 == this.f50539u && i10 == g41Var.O) {
                return true;
            }
            if (i7 == this.v && i10 == g41Var.P) {
                return true;
            }
            if (i7 == this.f50540w && i10 == g41Var.Q) {
                return true;
            }
            if (i7 == this.f50533o && i10 == g41Var.F) {
                return true;
            }
            if (i7 == this.f50534p && i10 == g41Var.G) {
                return true;
            }
            if (i7 == this.f50535q && i10 == g41Var.H) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f50523c.f48093d0;
    }

    @Override
    public final int e() {
        return this.f50522b;
    }

    public final void f() {
        int i7;
        long j3;
        View m10;
        SparseIntArray sparseIntArray = this.f50524e;
        sparseIntArray.clear();
        g41 g41Var = this.f50523c;
        this.f50522b = g41Var.f48093d0;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f50522b; i11++) {
            sparseIntArray.put(i11, g41Var.d(i11));
        }
        this.f50525f = g41Var.f48094e;
        this.f50526g = g41Var.h;
        this.h = g41Var.f48098r;
        this.f50527i = g41Var.f48099s;
        this.f50528j = g41Var.f48100w;
        this.f50529k = g41Var.f48101x;
        this.f50530l = g41Var.f48102y;
        this.f50531m = g41Var.f48097n;
        this.f50532n = g41Var.E;
        this.f50541x = g41Var.J;
        this.f50542y = g41Var.K;
        this.f50533o = g41Var.F;
        this.f50534p = g41Var.G;
        this.f50535q = g41Var.H;
        this.f50536r = g41Var.L;
        this.f50537s = g41Var.M;
        this.f50538t = g41Var.N;
        this.f50539u = g41Var.O;
        this.v = g41Var.P;
        this.f50540w = g41Var.Q;
        g41Var.E();
        v4.c0 c0Var = this.d;
        int L0 = c0Var.L0();
        int N0 = c0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (g41Var.c(L0) != -1 && (m10 = c0Var.m(L0)) != null) {
                    j3 = g41Var.c(L0);
                    i7 = m10.getTop();
                    break;
                }
                L0++;
            } else {
                i7 = 0;
                j3 = -1;
                break;
            }
        }
        v4.p.c(this, true).c(g41Var);
        if (j3 != -1) {
            while (true) {
                if (i10 < g41Var.f48093d0) {
                    if (g41Var.c(i10) == j3) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 > 0) {
                c0Var.h1(i10, i7);
            }
        }
    }
}
