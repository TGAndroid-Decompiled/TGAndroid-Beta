package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class oa1 extends s4.o {
    public int f40462b;
    public final ga1 f40463c;
    public final s4.d0 d;
    public final SparseIntArray f40464e = new SparseIntArray();
    public int f40465f = -1;
    public int f40466g = -1;
    public int h = -1;
    public int f40467i = -1;
    public int f40468j = -1;
    public int f40469k = -1;
    public int f40470l = -1;
    public int f40471m = -1;
    public int f40472n = -1;
    public int f40473o = -1;
    public int f40474p = -1;
    public int f40475q = -1;
    public int f40476r = -1;
    public int f40477s = -1;
    public int f40478t = -1;
    public int f40479u = -1;
    public int v = -1;
    public int f40480w = -1;
    public int f40481x = -1;
    public int f40482y = -1;

    public oa1(ga1 ga1Var, s4.d0 d0Var) {
        this.f40463c = ga1Var;
        this.d = d0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.f40464e.get(i10) == this.f40463c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.f40464e;
        int i12 = sparseIntArray.get(i10);
        ga1 ga1Var = this.f40463c;
        if (i12 == 13 && ga1Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && ga1Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f40481x;
        if (i10 >= i13 && i10 <= this.f40482y) {
            if (i10 - i13 == i11 - ga1Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f40465f && i11 == ga1Var.f37959e) {
            return true;
        } else {
            if (i10 == this.f40466g && i11 == ga1Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == ga1Var.f37962r) {
                return true;
            }
            if (i10 == this.f40467i && i11 == ga1Var.f37963s) {
                return true;
            }
            if (i10 == this.f40468j && i11 == ga1Var.v) {
                return true;
            }
            if (i10 == this.f40469k && i11 == ga1Var.f37964w) {
                return true;
            }
            if (i10 == this.f40470l && i11 == ga1Var.f37965x) {
                return true;
            }
            if (i10 == this.f40471m && i11 == ga1Var.f37961n) {
                return true;
            }
            if (i10 == this.f40472n && i11 == ga1Var.f37966y) {
                return true;
            }
            if (i10 == this.f40476r && i11 == ga1Var.K) {
                return true;
            }
            if (i10 == this.f40477s && i11 == ga1Var.L) {
                return true;
            }
            if (i10 == this.f40478t && i11 == ga1Var.M) {
                return true;
            }
            if (i10 == this.f40479u && i11 == ga1Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == ga1Var.O) {
                return true;
            }
            if (i10 == this.f40480w && i11 == ga1Var.P) {
                return true;
            }
            if (i10 == this.f40473o && i11 == ga1Var.E) {
                return true;
            }
            if (i10 == this.f40474p && i11 == ga1Var.F) {
                return true;
            }
            if (i10 == this.f40475q && i11 == ga1Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f40463c.f37957c0;
    }

    @Override
    public final int e() {
        return this.f40462b;
    }

    public final void f() {
        int i10;
        long j3;
        View m10;
        SparseIntArray sparseIntArray = this.f40464e;
        sparseIntArray.clear();
        ga1 ga1Var = this.f40463c;
        this.f40462b = ga1Var.f37957c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f40462b; i12++) {
            sparseIntArray.put(i12, ga1Var.j(i12));
        }
        this.f40465f = ga1Var.f37959e;
        this.f40466g = ga1Var.h;
        this.h = ga1Var.f37962r;
        this.f40467i = ga1Var.f37963s;
        this.f40468j = ga1Var.v;
        this.f40469k = ga1Var.f37964w;
        this.f40470l = ga1Var.f37965x;
        this.f40471m = ga1Var.f37961n;
        this.f40472n = ga1Var.f37966y;
        this.f40481x = ga1Var.I;
        this.f40482y = ga1Var.J;
        this.f40473o = ga1Var.E;
        this.f40474p = ga1Var.F;
        this.f40475q = ga1Var.G;
        this.f40476r = ga1Var.K;
        this.f40477s = ga1Var.L;
        this.f40478t = ga1Var.M;
        this.f40479u = ga1Var.N;
        this.v = ga1Var.O;
        this.f40480w = ga1Var.P;
        ga1Var.E();
        s4.d0 d0Var = this.d;
        int L0 = d0Var.L0();
        int N0 = d0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (ga1Var.i(L0) != -1 && (m10 = d0Var.m(L0)) != null) {
                    j3 = ga1Var.i(L0);
                    i10 = m10.getTop();
                    break;
                }
                L0++;
            } else {
                i10 = 0;
                j3 = -1;
                break;
            }
        }
        s4.o.c(this, true).b(ga1Var);
        if (j3 != -1) {
            while (true) {
                if (i11 < ga1Var.f37957c0) {
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
                d0Var.h1(i11, i10);
            }
        }
    }
}
