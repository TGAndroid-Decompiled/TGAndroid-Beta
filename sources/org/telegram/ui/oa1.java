package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class oa1 extends s4.o {
    public int f39212b;
    public final ga1 f39213c;
    public final s4.c0 d;
    public final SparseIntArray f39214e = new SparseIntArray();
    public int f39215f = -1;
    public int f39216g = -1;
    public int h = -1;
    public int f39217i = -1;
    public int f39218j = -1;
    public int f39219k = -1;
    public int f39220l = -1;
    public int f39221m = -1;
    public int f39222n = -1;
    public int f39223o = -1;
    public int f39224p = -1;
    public int f39225q = -1;
    public int f39226r = -1;
    public int f39227s = -1;
    public int f39228t = -1;
    public int f39229u = -1;
    public int v = -1;
    public int f39230w = -1;
    public int f39231x = -1;
    public int f39232y = -1;

    public oa1(ga1 ga1Var, s4.c0 c0Var) {
        this.f39213c = ga1Var;
        this.d = c0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.f39214e.get(i10) == this.f39213c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.f39214e;
        int i12 = sparseIntArray.get(i10);
        ga1 ga1Var = this.f39213c;
        if (i12 == 13 && ga1Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && ga1Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f39231x;
        if (i10 >= i13 && i10 <= this.f39232y) {
            if (i10 - i13 == i11 - ga1Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f39215f && i11 == ga1Var.f36640e) {
            return true;
        } else {
            if (i10 == this.f39216g && i11 == ga1Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == ga1Var.f36643r) {
                return true;
            }
            if (i10 == this.f39217i && i11 == ga1Var.f36644s) {
                return true;
            }
            if (i10 == this.f39218j && i11 == ga1Var.v) {
                return true;
            }
            if (i10 == this.f39219k && i11 == ga1Var.f36645w) {
                return true;
            }
            if (i10 == this.f39220l && i11 == ga1Var.f36646x) {
                return true;
            }
            if (i10 == this.f39221m && i11 == ga1Var.f36642n) {
                return true;
            }
            if (i10 == this.f39222n && i11 == ga1Var.f36647y) {
                return true;
            }
            if (i10 == this.f39226r && i11 == ga1Var.K) {
                return true;
            }
            if (i10 == this.f39227s && i11 == ga1Var.L) {
                return true;
            }
            if (i10 == this.f39228t && i11 == ga1Var.M) {
                return true;
            }
            if (i10 == this.f39229u && i11 == ga1Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == ga1Var.O) {
                return true;
            }
            if (i10 == this.f39230w && i11 == ga1Var.P) {
                return true;
            }
            if (i10 == this.f39223o && i11 == ga1Var.E) {
                return true;
            }
            if (i10 == this.f39224p && i11 == ga1Var.F) {
                return true;
            }
            if (i10 == this.f39225q && i11 == ga1Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f39213c.f36638c0;
    }

    @Override
    public final int e() {
        return this.f39212b;
    }

    public final void f() {
        long j3;
        int i10;
        View m10;
        SparseIntArray sparseIntArray = this.f39214e;
        sparseIntArray.clear();
        ga1 ga1Var = this.f39213c;
        this.f39212b = ga1Var.f36638c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f39212b; i12++) {
            sparseIntArray.put(i12, ga1Var.j(i12));
        }
        this.f39215f = ga1Var.f36640e;
        this.f39216g = ga1Var.h;
        this.h = ga1Var.f36643r;
        this.f39217i = ga1Var.f36644s;
        this.f39218j = ga1Var.v;
        this.f39219k = ga1Var.f36645w;
        this.f39220l = ga1Var.f36646x;
        this.f39221m = ga1Var.f36642n;
        this.f39222n = ga1Var.f36647y;
        this.f39231x = ga1Var.I;
        this.f39232y = ga1Var.J;
        this.f39223o = ga1Var.E;
        this.f39224p = ga1Var.F;
        this.f39225q = ga1Var.G;
        this.f39226r = ga1Var.K;
        this.f39227s = ga1Var.L;
        this.f39228t = ga1Var.M;
        this.f39229u = ga1Var.N;
        this.v = ga1Var.O;
        this.f39230w = ga1Var.P;
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
                if (i11 < ga1Var.f36638c0) {
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
