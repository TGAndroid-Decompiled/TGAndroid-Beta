package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class c91 extends s4.o {
    public int f35895b;
    public final u81 f35896c;
    public final s4.b0 d;
    public final SparseIntArray e = new SparseIntArray();
    public int f35897f = -1;
    public int f35898g = -1;
    public int h = -1;
    public int f35899i = -1;
    public int f35900j = -1;
    public int f35901k = -1;
    public int f35902l = -1;
    public int f35903m = -1;
    public int f35904n = -1;
    public int f35905o = -1;
    public int f35906p = -1;
    public int f35907q = -1;
    public int f35908r = -1;
    public int f35909s = -1;
    public int f35910t = -1;
    public int f35911u = -1;
    public int v = -1;
    public int f35912w = -1;
    public int f35913x = -1;
    public int f35914y = -1;

    public c91(u81 u81Var, s4.b0 b0Var) {
        this.f35896c = u81Var;
        this.d = b0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.e.get(i10) == this.f35896c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        int i12 = sparseIntArray.get(i10);
        u81 u81Var = this.f35896c;
        if (i12 == 13 && u81Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && u81Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f35913x;
        if (i10 >= i13 && i10 <= this.f35914y) {
            if (i10 - i13 == i11 - u81Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f35897f && i11 == u81Var.e) {
            return true;
        } else {
            if (i10 == this.f35898g && i11 == u81Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == u81Var.f41880r) {
                return true;
            }
            if (i10 == this.f35899i && i11 == u81Var.f41881s) {
                return true;
            }
            if (i10 == this.f35900j && i11 == u81Var.v) {
                return true;
            }
            if (i10 == this.f35901k && i11 == u81Var.f41882w) {
                return true;
            }
            if (i10 == this.f35902l && i11 == u81Var.f41883x) {
                return true;
            }
            if (i10 == this.f35903m && i11 == u81Var.f41879n) {
                return true;
            }
            if (i10 == this.f35904n && i11 == u81Var.f41884y) {
                return true;
            }
            if (i10 == this.f35908r && i11 == u81Var.K) {
                return true;
            }
            if (i10 == this.f35909s && i11 == u81Var.L) {
                return true;
            }
            if (i10 == this.f35910t && i11 == u81Var.M) {
                return true;
            }
            if (i10 == this.f35911u && i11 == u81Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == u81Var.O) {
                return true;
            }
            if (i10 == this.f35912w && i11 == u81Var.P) {
                return true;
            }
            if (i10 == this.f35905o && i11 == u81Var.E) {
                return true;
            }
            if (i10 == this.f35906p && i11 == u81Var.F) {
                return true;
            }
            if (i10 == this.f35907q && i11 == u81Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f35896c.f41876c0;
    }

    @Override
    public final int e() {
        return this.f35895b;
    }

    public final void f() {
        int i10;
        long j10;
        View m10;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        u81 u81Var = this.f35896c;
        this.f35895b = u81Var.f41876c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f35895b; i12++) {
            sparseIntArray.put(i12, u81Var.j(i12));
        }
        this.f35897f = u81Var.e;
        this.f35898g = u81Var.h;
        this.h = u81Var.f41880r;
        this.f35899i = u81Var.f41881s;
        this.f35900j = u81Var.v;
        this.f35901k = u81Var.f41882w;
        this.f35902l = u81Var.f41883x;
        this.f35903m = u81Var.f41879n;
        this.f35904n = u81Var.f41884y;
        this.f35913x = u81Var.I;
        this.f35914y = u81Var.J;
        this.f35905o = u81Var.E;
        this.f35906p = u81Var.F;
        this.f35907q = u81Var.G;
        this.f35908r = u81Var.K;
        this.f35909s = u81Var.L;
        this.f35910t = u81Var.M;
        this.f35911u = u81Var.N;
        this.v = u81Var.O;
        this.f35912w = u81Var.P;
        u81Var.E();
        s4.b0 b0Var = this.d;
        int L0 = b0Var.L0();
        int N0 = b0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (u81Var.i(L0) != -1 && (m10 = b0Var.m(L0)) != null) {
                    j10 = u81Var.i(L0);
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
        s4.o.c(this, true).c(u81Var);
        if (j10 != -1) {
            while (true) {
                if (i11 < u81Var.f41876c0) {
                    if (u81Var.i(i11) == j10) {
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
