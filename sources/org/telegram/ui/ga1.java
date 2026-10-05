package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class ga1 extends s4.o {
    public int f36562b;
    public final y91 f36563c;
    public final s4.c0 d;
    public final SparseIntArray f36564e = new SparseIntArray();
    public int f36565f = -1;
    public int f36566g = -1;
    public int h = -1;
    public int f36567i = -1;
    public int f36568j = -1;
    public int f36569k = -1;
    public int f36570l = -1;
    public int f36571m = -1;
    public int f36572n = -1;
    public int f36573o = -1;
    public int f36574p = -1;
    public int f36575q = -1;
    public int f36576r = -1;
    public int f36577s = -1;
    public int f36578t = -1;
    public int f36579u = -1;
    public int v = -1;
    public int f36580w = -1;
    public int f36581x = -1;
    public int f36582y = -1;

    public ga1(y91 y91Var, s4.c0 c0Var) {
        this.f36563c = y91Var;
        this.d = c0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.f36564e.get(i10) == this.f36563c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.f36564e;
        int i12 = sparseIntArray.get(i10);
        y91 y91Var = this.f36563c;
        if (i12 == 13 && y91Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && y91Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f36581x;
        if (i10 >= i13 && i10 <= this.f36582y) {
            if (i10 - i13 == i11 - y91Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f36565f && i11 == y91Var.f43163e) {
            return true;
        } else {
            if (i10 == this.f36566g && i11 == y91Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == y91Var.f43166r) {
                return true;
            }
            if (i10 == this.f36567i && i11 == y91Var.f43167s) {
                return true;
            }
            if (i10 == this.f36568j && i11 == y91Var.v) {
                return true;
            }
            if (i10 == this.f36569k && i11 == y91Var.f43168w) {
                return true;
            }
            if (i10 == this.f36570l && i11 == y91Var.f43169x) {
                return true;
            }
            if (i10 == this.f36571m && i11 == y91Var.f43165n) {
                return true;
            }
            if (i10 == this.f36572n && i11 == y91Var.f43170y) {
                return true;
            }
            if (i10 == this.f36576r && i11 == y91Var.K) {
                return true;
            }
            if (i10 == this.f36577s && i11 == y91Var.L) {
                return true;
            }
            if (i10 == this.f36578t && i11 == y91Var.M) {
                return true;
            }
            if (i10 == this.f36579u && i11 == y91Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == y91Var.O) {
                return true;
            }
            if (i10 == this.f36580w && i11 == y91Var.P) {
                return true;
            }
            if (i10 == this.f36573o && i11 == y91Var.E) {
                return true;
            }
            if (i10 == this.f36574p && i11 == y91Var.F) {
                return true;
            }
            if (i10 == this.f36575q && i11 == y91Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f36563c.f43161c0;
    }

    @Override
    public final int e() {
        return this.f36562b;
    }

    public final void f() {
        long j3;
        int i10;
        View m10;
        SparseIntArray sparseIntArray = this.f36564e;
        sparseIntArray.clear();
        y91 y91Var = this.f36563c;
        this.f36562b = y91Var.f43161c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f36562b; i12++) {
            sparseIntArray.put(i12, y91Var.j(i12));
        }
        this.f36565f = y91Var.f43163e;
        this.f36566g = y91Var.h;
        this.h = y91Var.f43166r;
        this.f36567i = y91Var.f43167s;
        this.f36568j = y91Var.v;
        this.f36569k = y91Var.f43168w;
        this.f36570l = y91Var.f43169x;
        this.f36571m = y91Var.f43165n;
        this.f36572n = y91Var.f43170y;
        this.f36581x = y91Var.I;
        this.f36582y = y91Var.J;
        this.f36573o = y91Var.E;
        this.f36574p = y91Var.F;
        this.f36575q = y91Var.G;
        this.f36576r = y91Var.K;
        this.f36577s = y91Var.L;
        this.f36578t = y91Var.M;
        this.f36579u = y91Var.N;
        this.v = y91Var.O;
        this.f36580w = y91Var.P;
        y91Var.E();
        s4.c0 c0Var = this.d;
        int L0 = c0Var.L0();
        int N0 = c0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (y91Var.i(L0) != -1 && (m10 = c0Var.m(L0)) != null) {
                    j3 = y91Var.i(L0);
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
        s4.o.c(this, true).b(y91Var);
        if (j3 != -1) {
            while (true) {
                if (i11 < y91Var.f43161c0) {
                    if (y91Var.i(i11) == j3) {
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
