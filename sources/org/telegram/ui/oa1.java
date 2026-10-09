package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class oa1 extends s4.o {
    public int f40460b;
    public final ga1 f40461c;
    public final s4.d0 d;
    public final SparseIntArray f40462e = new SparseIntArray();
    public int f40463f = -1;
    public int f40464g = -1;
    public int h = -1;
    public int f40465i = -1;
    public int f40466j = -1;
    public int f40467k = -1;
    public int f40468l = -1;
    public int f40469m = -1;
    public int f40470n = -1;
    public int f40471o = -1;
    public int f40472p = -1;
    public int f40473q = -1;
    public int f40474r = -1;
    public int f40475s = -1;
    public int f40476t = -1;
    public int f40477u = -1;
    public int v = -1;
    public int f40478w = -1;
    public int f40479x = -1;
    public int f40480y = -1;

    public oa1(ga1 ga1Var, s4.d0 d0Var) {
        this.f40461c = ga1Var;
        this.d = d0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.f40462e.get(i10) == this.f40461c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.f40462e;
        int i12 = sparseIntArray.get(i10);
        ga1 ga1Var = this.f40461c;
        if (i12 == 13 && ga1Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && ga1Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f40479x;
        if (i10 >= i13 && i10 <= this.f40480y) {
            if (i10 - i13 == i11 - ga1Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f40463f && i11 == ga1Var.f37957e) {
            return true;
        } else {
            if (i10 == this.f40464g && i11 == ga1Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == ga1Var.f37960r) {
                return true;
            }
            if (i10 == this.f40465i && i11 == ga1Var.f37961s) {
                return true;
            }
            if (i10 == this.f40466j && i11 == ga1Var.v) {
                return true;
            }
            if (i10 == this.f40467k && i11 == ga1Var.f37962w) {
                return true;
            }
            if (i10 == this.f40468l && i11 == ga1Var.f37963x) {
                return true;
            }
            if (i10 == this.f40469m && i11 == ga1Var.f37959n) {
                return true;
            }
            if (i10 == this.f40470n && i11 == ga1Var.f37964y) {
                return true;
            }
            if (i10 == this.f40474r && i11 == ga1Var.K) {
                return true;
            }
            if (i10 == this.f40475s && i11 == ga1Var.L) {
                return true;
            }
            if (i10 == this.f40476t && i11 == ga1Var.M) {
                return true;
            }
            if (i10 == this.f40477u && i11 == ga1Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == ga1Var.O) {
                return true;
            }
            if (i10 == this.f40478w && i11 == ga1Var.P) {
                return true;
            }
            if (i10 == this.f40471o && i11 == ga1Var.E) {
                return true;
            }
            if (i10 == this.f40472p && i11 == ga1Var.F) {
                return true;
            }
            if (i10 == this.f40473q && i11 == ga1Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f40461c.f37955c0;
    }

    @Override
    public final int e() {
        return this.f40460b;
    }

    public final void f() {
        int i10;
        long j3;
        View m10;
        SparseIntArray sparseIntArray = this.f40462e;
        sparseIntArray.clear();
        ga1 ga1Var = this.f40461c;
        this.f40460b = ga1Var.f37955c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f40460b; i12++) {
            sparseIntArray.put(i12, ga1Var.j(i12));
        }
        this.f40463f = ga1Var.f37957e;
        this.f40464g = ga1Var.h;
        this.h = ga1Var.f37960r;
        this.f40465i = ga1Var.f37961s;
        this.f40466j = ga1Var.v;
        this.f40467k = ga1Var.f37962w;
        this.f40468l = ga1Var.f37963x;
        this.f40469m = ga1Var.f37959n;
        this.f40470n = ga1Var.f37964y;
        this.f40479x = ga1Var.I;
        this.f40480y = ga1Var.J;
        this.f40471o = ga1Var.E;
        this.f40472p = ga1Var.F;
        this.f40473q = ga1Var.G;
        this.f40474r = ga1Var.K;
        this.f40475s = ga1Var.L;
        this.f40476t = ga1Var.M;
        this.f40477u = ga1Var.N;
        this.v = ga1Var.O;
        this.f40478w = ga1Var.P;
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
                if (i11 < ga1Var.f37955c0) {
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
