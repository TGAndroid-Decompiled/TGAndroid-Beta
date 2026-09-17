package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class oa1 extends s4.o {
    public int f39213b;
    public final ga1 f39214c;
    public final s4.c0 d;
    public final SparseIntArray f39215e = new SparseIntArray();
    public int f39216f = -1;
    public int f39217g = -1;
    public int h = -1;
    public int f39218i = -1;
    public int f39219j = -1;
    public int f39220k = -1;
    public int f39221l = -1;
    public int f39222m = -1;
    public int f39223n = -1;
    public int f39224o = -1;
    public int f39225p = -1;
    public int f39226q = -1;
    public int f39227r = -1;
    public int f39228s = -1;
    public int f39229t = -1;
    public int f39230u = -1;
    public int v = -1;
    public int f39231w = -1;
    public int f39232x = -1;
    public int f39233y = -1;

    public oa1(ga1 ga1Var, s4.c0 c0Var) {
        this.f39214c = ga1Var;
        this.d = c0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.f39215e.get(i10) == this.f39214c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.f39215e;
        int i12 = sparseIntArray.get(i10);
        ga1 ga1Var = this.f39214c;
        if (i12 == 13 && ga1Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && ga1Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f39232x;
        if (i10 >= i13 && i10 <= this.f39233y) {
            if (i10 - i13 == i11 - ga1Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f39216f && i11 == ga1Var.f36641e) {
            return true;
        } else {
            if (i10 == this.f39217g && i11 == ga1Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == ga1Var.f36644r) {
                return true;
            }
            if (i10 == this.f39218i && i11 == ga1Var.f36645s) {
                return true;
            }
            if (i10 == this.f39219j && i11 == ga1Var.v) {
                return true;
            }
            if (i10 == this.f39220k && i11 == ga1Var.f36646w) {
                return true;
            }
            if (i10 == this.f39221l && i11 == ga1Var.f36647x) {
                return true;
            }
            if (i10 == this.f39222m && i11 == ga1Var.f36643n) {
                return true;
            }
            if (i10 == this.f39223n && i11 == ga1Var.f36648y) {
                return true;
            }
            if (i10 == this.f39227r && i11 == ga1Var.K) {
                return true;
            }
            if (i10 == this.f39228s && i11 == ga1Var.L) {
                return true;
            }
            if (i10 == this.f39229t && i11 == ga1Var.M) {
                return true;
            }
            if (i10 == this.f39230u && i11 == ga1Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == ga1Var.O) {
                return true;
            }
            if (i10 == this.f39231w && i11 == ga1Var.P) {
                return true;
            }
            if (i10 == this.f39224o && i11 == ga1Var.E) {
                return true;
            }
            if (i10 == this.f39225p && i11 == ga1Var.F) {
                return true;
            }
            if (i10 == this.f39226q && i11 == ga1Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f39214c.f36639c0;
    }

    @Override
    public final int e() {
        return this.f39213b;
    }

    public final void f() {
        long j3;
        int i10;
        View m10;
        SparseIntArray sparseIntArray = this.f39215e;
        sparseIntArray.clear();
        ga1 ga1Var = this.f39214c;
        this.f39213b = ga1Var.f36639c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f39213b; i12++) {
            sparseIntArray.put(i12, ga1Var.j(i12));
        }
        this.f39216f = ga1Var.f36641e;
        this.f39217g = ga1Var.h;
        this.h = ga1Var.f36644r;
        this.f39218i = ga1Var.f36645s;
        this.f39219j = ga1Var.v;
        this.f39220k = ga1Var.f36646w;
        this.f39221l = ga1Var.f36647x;
        this.f39222m = ga1Var.f36643n;
        this.f39223n = ga1Var.f36648y;
        this.f39232x = ga1Var.I;
        this.f39233y = ga1Var.J;
        this.f39224o = ga1Var.E;
        this.f39225p = ga1Var.F;
        this.f39226q = ga1Var.G;
        this.f39227r = ga1Var.K;
        this.f39228s = ga1Var.L;
        this.f39229t = ga1Var.M;
        this.f39230u = ga1Var.N;
        this.v = ga1Var.O;
        this.f39231w = ga1Var.P;
        ga1Var.E();
        s4.c0 c0Var = this.d;
        int L0 = c0Var.L0();
        int N0 = c0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (ga1Var.i(L0) != -1 && (m10 = c0Var.m(L0)) != null) {
                    j3 = ga1Var.i(L0);
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
        s4.o.c(this, true).b(ga1Var);
        if (j3 != -1) {
            while (true) {
                if (i11 < ga1Var.f36639c0) {
                    if (ga1Var.i(i11) == j3) {
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
