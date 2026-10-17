package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class e91 extends s4.o {
    public int f36449b;
    public final w81 f36450c;
    public final s4.b0 d;
    public final SparseIntArray e = new SparseIntArray();
    public int f36451f = -1;
    public int f36452g = -1;
    public int h = -1;
    public int f36453i = -1;
    public int f36454j = -1;
    public int f36455k = -1;
    public int f36456l = -1;
    public int f36457m = -1;
    public int f36458n = -1;
    public int f36459o = -1;
    public int f36460p = -1;
    public int f36461q = -1;
    public int f36462r = -1;
    public int f36463s = -1;
    public int f36464t = -1;
    public int f36465u = -1;
    public int v = -1;
    public int f36466w = -1;
    public int f36467x = -1;
    public int f36468y = -1;

    public e91(w81 w81Var, s4.b0 b0Var) {
        this.f36450c = w81Var;
        this.d = b0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.e.get(i10) == this.f36450c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        int i12 = sparseIntArray.get(i10);
        w81 w81Var = this.f36450c;
        if (i12 == 13 && w81Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && w81Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f36467x;
        if (i10 >= i13 && i10 <= this.f36468y) {
            if (i10 - i13 == i11 - w81Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f36451f && i11 == w81Var.e) {
            return true;
        } else {
            if (i10 == this.f36452g && i11 == w81Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == w81Var.f42434r) {
                return true;
            }
            if (i10 == this.f36453i && i11 == w81Var.f42435s) {
                return true;
            }
            if (i10 == this.f36454j && i11 == w81Var.v) {
                return true;
            }
            if (i10 == this.f36455k && i11 == w81Var.f42436w) {
                return true;
            }
            if (i10 == this.f36456l && i11 == w81Var.f42437x) {
                return true;
            }
            if (i10 == this.f36457m && i11 == w81Var.f42433n) {
                return true;
            }
            if (i10 == this.f36458n && i11 == w81Var.f42438y) {
                return true;
            }
            if (i10 == this.f36462r && i11 == w81Var.K) {
                return true;
            }
            if (i10 == this.f36463s && i11 == w81Var.L) {
                return true;
            }
            if (i10 == this.f36464t && i11 == w81Var.M) {
                return true;
            }
            if (i10 == this.f36465u && i11 == w81Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == w81Var.O) {
                return true;
            }
            if (i10 == this.f36466w && i11 == w81Var.P) {
                return true;
            }
            if (i10 == this.f36459o && i11 == w81Var.E) {
                return true;
            }
            if (i10 == this.f36460p && i11 == w81Var.F) {
                return true;
            }
            if (i10 == this.f36461q && i11 == w81Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f36450c.f42430c0;
    }

    @Override
    public final int e() {
        return this.f36449b;
    }

    public final void f() {
        int i10;
        long j10;
        View m10;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        w81 w81Var = this.f36450c;
        this.f36449b = w81Var.f42430c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f36449b; i12++) {
            sparseIntArray.put(i12, w81Var.j(i12));
        }
        this.f36451f = w81Var.e;
        this.f36452g = w81Var.h;
        this.h = w81Var.f42434r;
        this.f36453i = w81Var.f42435s;
        this.f36454j = w81Var.v;
        this.f36455k = w81Var.f42436w;
        this.f36456l = w81Var.f42437x;
        this.f36457m = w81Var.f42433n;
        this.f36458n = w81Var.f42438y;
        this.f36467x = w81Var.I;
        this.f36468y = w81Var.J;
        this.f36459o = w81Var.E;
        this.f36460p = w81Var.F;
        this.f36461q = w81Var.G;
        this.f36462r = w81Var.K;
        this.f36463s = w81Var.L;
        this.f36464t = w81Var.M;
        this.f36465u = w81Var.N;
        this.v = w81Var.O;
        this.f36466w = w81Var.P;
        w81Var.E();
        s4.b0 b0Var = this.d;
        int L0 = b0Var.L0();
        int N0 = b0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (w81Var.i(L0) != -1 && (m10 = b0Var.m(L0)) != null) {
                    j10 = w81Var.i(L0);
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
        s4.o.c(this, true).c(w81Var);
        if (j10 != -1) {
            while (true) {
                if (i11 < w81Var.f42430c0) {
                    if (w81Var.i(i11) == j10) {
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
