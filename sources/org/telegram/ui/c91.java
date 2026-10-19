package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class c91 extends s4.o {
    public int f35884b;
    public final u81 f35885c;
    public final s4.b0 d;
    public final SparseIntArray e = new SparseIntArray();
    public int f35886f = -1;
    public int f35887g = -1;
    public int h = -1;
    public int f35888i = -1;
    public int f35889j = -1;
    public int f35890k = -1;
    public int f35891l = -1;
    public int f35892m = -1;
    public int f35893n = -1;
    public int f35894o = -1;
    public int f35895p = -1;
    public int f35896q = -1;
    public int f35897r = -1;
    public int f35898s = -1;
    public int f35899t = -1;
    public int f35900u = -1;
    public int v = -1;
    public int f35901w = -1;
    public int f35902x = -1;
    public int f35903y = -1;

    public c91(u81 u81Var, s4.b0 b0Var) {
        this.f35885c = u81Var;
        this.d = b0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.e.get(i10) == this.f35885c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        int i12 = sparseIntArray.get(i10);
        u81 u81Var = this.f35885c;
        if (i12 == 13 && u81Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && u81Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f35902x;
        if (i10 >= i13 && i10 <= this.f35903y) {
            if (i10 - i13 == i11 - u81Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f35886f && i11 == u81Var.e) {
            return true;
        } else {
            if (i10 == this.f35887g && i11 == u81Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == u81Var.f41870r) {
                return true;
            }
            if (i10 == this.f35888i && i11 == u81Var.f41871s) {
                return true;
            }
            if (i10 == this.f35889j && i11 == u81Var.v) {
                return true;
            }
            if (i10 == this.f35890k && i11 == u81Var.f41872w) {
                return true;
            }
            if (i10 == this.f35891l && i11 == u81Var.f41873x) {
                return true;
            }
            if (i10 == this.f35892m && i11 == u81Var.f41869n) {
                return true;
            }
            if (i10 == this.f35893n && i11 == u81Var.f41874y) {
                return true;
            }
            if (i10 == this.f35897r && i11 == u81Var.K) {
                return true;
            }
            if (i10 == this.f35898s && i11 == u81Var.L) {
                return true;
            }
            if (i10 == this.f35899t && i11 == u81Var.M) {
                return true;
            }
            if (i10 == this.f35900u && i11 == u81Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == u81Var.O) {
                return true;
            }
            if (i10 == this.f35901w && i11 == u81Var.P) {
                return true;
            }
            if (i10 == this.f35894o && i11 == u81Var.E) {
                return true;
            }
            if (i10 == this.f35895p && i11 == u81Var.F) {
                return true;
            }
            if (i10 == this.f35896q && i11 == u81Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f35885c.f41866c0;
    }

    @Override
    public final int e() {
        return this.f35884b;
    }

    public final void f() {
        int i10;
        long j10;
        View m10;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        u81 u81Var = this.f35885c;
        this.f35884b = u81Var.f41866c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f35884b; i12++) {
            sparseIntArray.put(i12, u81Var.j(i12));
        }
        this.f35886f = u81Var.e;
        this.f35887g = u81Var.h;
        this.h = u81Var.f41870r;
        this.f35888i = u81Var.f41871s;
        this.f35889j = u81Var.v;
        this.f35890k = u81Var.f41872w;
        this.f35891l = u81Var.f41873x;
        this.f35892m = u81Var.f41869n;
        this.f35893n = u81Var.f41874y;
        this.f35902x = u81Var.I;
        this.f35903y = u81Var.J;
        this.f35894o = u81Var.E;
        this.f35895p = u81Var.F;
        this.f35896q = u81Var.G;
        this.f35897r = u81Var.K;
        this.f35898s = u81Var.L;
        this.f35899t = u81Var.M;
        this.f35900u = u81Var.N;
        this.v = u81Var.O;
        this.f35901w = u81Var.P;
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
                if (i11 < u81Var.f41866c0) {
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
