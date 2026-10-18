package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class e91 extends s4.o {
    public int f36453b;
    public final w81 f36454c;
    public final s4.b0 d;
    public final SparseIntArray e = new SparseIntArray();
    public int f36455f = -1;
    public int f36456g = -1;
    public int h = -1;
    public int f36457i = -1;
    public int f36458j = -1;
    public int f36459k = -1;
    public int f36460l = -1;
    public int f36461m = -1;
    public int f36462n = -1;
    public int f36463o = -1;
    public int f36464p = -1;
    public int f36465q = -1;
    public int f36466r = -1;
    public int f36467s = -1;
    public int f36468t = -1;
    public int f36469u = -1;
    public int v = -1;
    public int f36470w = -1;
    public int f36471x = -1;
    public int f36472y = -1;

    public e91(w81 w81Var, s4.b0 b0Var) {
        this.f36454c = w81Var;
        this.d = b0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.e.get(i10) == this.f36454c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        int i12 = sparseIntArray.get(i10);
        w81 w81Var = this.f36454c;
        if (i12 == 13 && w81Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && w81Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f36471x;
        if (i10 >= i13 && i10 <= this.f36472y) {
            if (i10 - i13 == i11 - w81Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f36455f && i11 == w81Var.e) {
            return true;
        } else {
            if (i10 == this.f36456g && i11 == w81Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == w81Var.f42458r) {
                return true;
            }
            if (i10 == this.f36457i && i11 == w81Var.f42459s) {
                return true;
            }
            if (i10 == this.f36458j && i11 == w81Var.v) {
                return true;
            }
            if (i10 == this.f36459k && i11 == w81Var.f42460w) {
                return true;
            }
            if (i10 == this.f36460l && i11 == w81Var.f42461x) {
                return true;
            }
            if (i10 == this.f36461m && i11 == w81Var.f42457n) {
                return true;
            }
            if (i10 == this.f36462n && i11 == w81Var.f42462y) {
                return true;
            }
            if (i10 == this.f36466r && i11 == w81Var.K) {
                return true;
            }
            if (i10 == this.f36467s && i11 == w81Var.L) {
                return true;
            }
            if (i10 == this.f36468t && i11 == w81Var.M) {
                return true;
            }
            if (i10 == this.f36469u && i11 == w81Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == w81Var.O) {
                return true;
            }
            if (i10 == this.f36470w && i11 == w81Var.P) {
                return true;
            }
            if (i10 == this.f36463o && i11 == w81Var.E) {
                return true;
            }
            if (i10 == this.f36464p && i11 == w81Var.F) {
                return true;
            }
            if (i10 == this.f36465q && i11 == w81Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f36454c.f42454c0;
    }

    @Override
    public final int e() {
        return this.f36453b;
    }

    public final void f() {
        int i10;
        long j10;
        View m10;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        w81 w81Var = this.f36454c;
        this.f36453b = w81Var.f42454c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f36453b; i12++) {
            sparseIntArray.put(i12, w81Var.j(i12));
        }
        this.f36455f = w81Var.e;
        this.f36456g = w81Var.h;
        this.h = w81Var.f42458r;
        this.f36457i = w81Var.f42459s;
        this.f36458j = w81Var.v;
        this.f36459k = w81Var.f42460w;
        this.f36460l = w81Var.f42461x;
        this.f36461m = w81Var.f42457n;
        this.f36462n = w81Var.f42462y;
        this.f36471x = w81Var.I;
        this.f36472y = w81Var.J;
        this.f36463o = w81Var.E;
        this.f36464p = w81Var.F;
        this.f36465q = w81Var.G;
        this.f36466r = w81Var.K;
        this.f36467s = w81Var.L;
        this.f36468t = w81Var.M;
        this.f36469u = w81Var.N;
        this.v = w81Var.O;
        this.f36470w = w81Var.P;
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
                if (i11 < w81Var.f42454c0) {
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
