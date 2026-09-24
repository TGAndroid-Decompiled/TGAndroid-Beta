package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class fa1 extends s4.o {
    public int f33579b;
    public final x91 f33580c;
    public final s4.c0 d;
    public final SparseIntArray e = new SparseIntArray();
    public int f33581f = -1;
    public int f33582g = -1;
    public int h = -1;
    public int f33583i = -1;
    public int f33584j = -1;
    public int f33585k = -1;
    public int f33586l = -1;
    public int f33587m = -1;
    public int f33588n = -1;
    public int f33589o = -1;
    public int f33590p = -1;
    public int f33591q = -1;
    public int f33592r = -1;
    public int f33593s = -1;
    public int f33594t = -1;
    public int f33595u = -1;
    public int v = -1;
    public int f33596w = -1;
    public int f33597x = -1;
    public int f33598y = -1;

    public fa1(x91 x91Var, s4.c0 c0Var) {
        this.f33580c = x91Var;
        this.d = c0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.e.get(i10) == this.f33580c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        int i12 = sparseIntArray.get(i10);
        x91 x91Var = this.f33580c;
        if (i12 == 13 && x91Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && x91Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f33597x;
        if (i10 >= i13 && i10 <= this.f33598y) {
            if (i10 - i13 == i11 - x91Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f33581f && i11 == x91Var.e) {
            return true;
        } else {
            if (i10 == this.f33582g && i11 == x91Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == x91Var.f39872r) {
                return true;
            }
            if (i10 == this.f33583i && i11 == x91Var.f39873s) {
                return true;
            }
            if (i10 == this.f33584j && i11 == x91Var.v) {
                return true;
            }
            if (i10 == this.f33585k && i11 == x91Var.f39874w) {
                return true;
            }
            if (i10 == this.f33586l && i11 == x91Var.f39875x) {
                return true;
            }
            if (i10 == this.f33587m && i11 == x91Var.f39871n) {
                return true;
            }
            if (i10 == this.f33588n && i11 == x91Var.f39876y) {
                return true;
            }
            if (i10 == this.f33592r && i11 == x91Var.K) {
                return true;
            }
            if (i10 == this.f33593s && i11 == x91Var.L) {
                return true;
            }
            if (i10 == this.f33594t && i11 == x91Var.M) {
                return true;
            }
            if (i10 == this.f33595u && i11 == x91Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == x91Var.O) {
                return true;
            }
            if (i10 == this.f33596w && i11 == x91Var.P) {
                return true;
            }
            if (i10 == this.f33589o && i11 == x91Var.E) {
                return true;
            }
            if (i10 == this.f33590p && i11 == x91Var.F) {
                return true;
            }
            if (i10 == this.f33591q && i11 == x91Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f33580c.f39868c0;
    }

    @Override
    public final int e() {
        return this.f33579b;
    }

    public final void f() {
        long j3;
        int i10;
        View m10;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        x91 x91Var = this.f33580c;
        this.f33579b = x91Var.f39868c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f33579b; i12++) {
            sparseIntArray.put(i12, x91Var.j(i12));
        }
        this.f33581f = x91Var.e;
        this.f33582g = x91Var.h;
        this.h = x91Var.f39872r;
        this.f33583i = x91Var.f39873s;
        this.f33584j = x91Var.v;
        this.f33585k = x91Var.f39874w;
        this.f33586l = x91Var.f39875x;
        this.f33587m = x91Var.f39871n;
        this.f33588n = x91Var.f39876y;
        this.f33597x = x91Var.I;
        this.f33598y = x91Var.J;
        this.f33589o = x91Var.E;
        this.f33590p = x91Var.F;
        this.f33591q = x91Var.G;
        this.f33592r = x91Var.K;
        this.f33593s = x91Var.L;
        this.f33594t = x91Var.M;
        this.f33595u = x91Var.N;
        this.v = x91Var.O;
        this.f33596w = x91Var.P;
        x91Var.E();
        s4.c0 c0Var = this.d;
        int L0 = c0Var.L0();
        int N0 = c0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (x91Var.i(L0) != -1 && (m10 = c0Var.m(L0)) != null) {
                    j3 = x91Var.i(L0);
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
        s4.o.c(this, true).b(x91Var);
        if (j3 != -1) {
            while (true) {
                if (i11 < x91Var.f39868c0) {
                    if (x91Var.i(i11) == j3) {
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
