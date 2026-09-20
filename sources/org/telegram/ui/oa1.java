package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class oa1 extends s4.o {
    public int f36237b;
    public final ga1 f36238c;
    public final s4.c0 d;
    public final SparseIntArray e = new SparseIntArray();
    public int f36239f = -1;
    public int f36240g = -1;
    public int h = -1;
    public int f36241i = -1;
    public int f36242j = -1;
    public int f36243k = -1;
    public int f36244l = -1;
    public int f36245m = -1;
    public int f36246n = -1;
    public int f36247o = -1;
    public int f36248p = -1;
    public int f36249q = -1;
    public int f36250r = -1;
    public int f36251s = -1;
    public int f36252t = -1;
    public int f36253u = -1;
    public int v = -1;
    public int f36254w = -1;
    public int f36255x = -1;
    public int f36256y = -1;

    public oa1(ga1 ga1Var, s4.c0 c0Var) {
        this.f36238c = ga1Var;
        this.d = c0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.e.get(i10) == this.f36238c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        int i12 = sparseIntArray.get(i10);
        ga1 ga1Var = this.f36238c;
        if (i12 == 13 && ga1Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && ga1Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f36255x;
        if (i10 >= i13 && i10 <= this.f36256y) {
            if (i10 - i13 == i11 - ga1Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f36239f && i11 == ga1Var.e) {
            return true;
        } else {
            if (i10 == this.f36240g && i11 == ga1Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == ga1Var.f33850r) {
                return true;
            }
            if (i10 == this.f36241i && i11 == ga1Var.f33851s) {
                return true;
            }
            if (i10 == this.f36242j && i11 == ga1Var.v) {
                return true;
            }
            if (i10 == this.f36243k && i11 == ga1Var.f33852w) {
                return true;
            }
            if (i10 == this.f36244l && i11 == ga1Var.f33853x) {
                return true;
            }
            if (i10 == this.f36245m && i11 == ga1Var.f33849n) {
                return true;
            }
            if (i10 == this.f36246n && i11 == ga1Var.f33854y) {
                return true;
            }
            if (i10 == this.f36250r && i11 == ga1Var.K) {
                return true;
            }
            if (i10 == this.f36251s && i11 == ga1Var.L) {
                return true;
            }
            if (i10 == this.f36252t && i11 == ga1Var.M) {
                return true;
            }
            if (i10 == this.f36253u && i11 == ga1Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == ga1Var.O) {
                return true;
            }
            if (i10 == this.f36254w && i11 == ga1Var.P) {
                return true;
            }
            if (i10 == this.f36247o && i11 == ga1Var.E) {
                return true;
            }
            if (i10 == this.f36248p && i11 == ga1Var.F) {
                return true;
            }
            if (i10 == this.f36249q && i11 == ga1Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f36238c.f33846c0;
    }

    @Override
    public final int e() {
        return this.f36237b;
    }

    public final void f() {
        long j3;
        int i10;
        View m10;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        ga1 ga1Var = this.f36238c;
        this.f36237b = ga1Var.f33846c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f36237b; i12++) {
            sparseIntArray.put(i12, ga1Var.j(i12));
        }
        this.f36239f = ga1Var.e;
        this.f36240g = ga1Var.h;
        this.h = ga1Var.f33850r;
        this.f36241i = ga1Var.f33851s;
        this.f36242j = ga1Var.v;
        this.f36243k = ga1Var.f33852w;
        this.f36244l = ga1Var.f33853x;
        this.f36245m = ga1Var.f33849n;
        this.f36246n = ga1Var.f33854y;
        this.f36255x = ga1Var.I;
        this.f36256y = ga1Var.J;
        this.f36247o = ga1Var.E;
        this.f36248p = ga1Var.F;
        this.f36249q = ga1Var.G;
        this.f36250r = ga1Var.K;
        this.f36251s = ga1Var.L;
        this.f36252t = ga1Var.M;
        this.f36253u = ga1Var.N;
        this.v = ga1Var.O;
        this.f36254w = ga1Var.P;
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
                if (i11 < ga1Var.f33846c0) {
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
