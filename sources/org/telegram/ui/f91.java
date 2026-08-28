package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class f91 extends f2.s {
    public int f38172b;
    public final x81 f38173c;
    public final f2.m0 d;
    public final SparseIntArray f38174e = new SparseIntArray();
    public int f38175f = -1;
    public int f38176g = -1;
    public int h = -1;
    public int f38177i = -1;
    public int f38178j = -1;
    public int f38179k = -1;
    public int f38180l = -1;
    public int f38181m = -1;
    public int f38182n = -1;
    public int f38183o = -1;
    public int f38184p = -1;
    public int f38185q = -1;
    public int f38186r = -1;
    public int f38187s = -1;
    public int f38188t = -1;
    public int f38189u = -1;
    public int v = -1;
    public int f38190w = -1;
    public int f38191x = -1;
    public int f38192y = -1;

    public f91(x81 x81Var, f2.m0 m0Var) {
        this.f38173c = x81Var;
        this.d = m0Var;
    }

    @Override
    public final boolean a(int i9, int i10) {
        if (this.f38174e.get(i9) == this.f38173c.j(i10)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i9, int i10) {
        SparseIntArray sparseIntArray = this.f38174e;
        int i11 = sparseIntArray.get(i9);
        x81 x81Var = this.f38173c;
        if (i11 == 13 && x81Var.j(i10) == 13) {
            return true;
        }
        if (sparseIntArray.get(i9) == 10 && x81Var.j(i10) == 10) {
            return true;
        }
        int i12 = this.f38191x;
        if (i9 >= i12 && i9 <= this.f38192y) {
            if (i9 - i12 == i10 - x81Var.E) {
                return true;
            }
            return false;
        } else if (i9 == this.f38175f && i10 == x81Var.f44398e) {
            return true;
        } else {
            if (i9 == this.f38176g && i10 == x81Var.h) {
                return true;
            }
            if (i9 == this.h && i10 == x81Var.f44401r) {
                return true;
            }
            if (i9 == this.f38177i && i10 == x81Var.f44402s) {
                return true;
            }
            if (i9 == this.f38178j && i10 == x81Var.v) {
                return true;
            }
            if (i9 == this.f38179k && i10 == x81Var.f44403w) {
                return true;
            }
            if (i9 == this.f38180l && i10 == x81Var.f44404x) {
                return true;
            }
            if (i9 == this.f38181m && i10 == x81Var.f44400n) {
                return true;
            }
            if (i9 == this.f38182n && i10 == x81Var.f44405y) {
                return true;
            }
            if (i9 == this.f38186r && i10 == x81Var.G) {
                return true;
            }
            if (i9 == this.f38187s && i10 == x81Var.H) {
                return true;
            }
            if (i9 == this.f38188t && i10 == x81Var.I) {
                return true;
            }
            if (i9 == this.f38189u && i10 == x81Var.J) {
                return true;
            }
            if (i9 == this.v && i10 == x81Var.K) {
                return true;
            }
            if (i9 == this.f38190w && i10 == x81Var.L) {
                return true;
            }
            if (i9 == this.f38183o && i10 == x81Var.A) {
                return true;
            }
            if (i9 == this.f38184p && i10 == x81Var.B) {
                return true;
            }
            if (i9 == this.f38185q && i10 == x81Var.C) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f38173c.Y;
    }

    @Override
    public final int e() {
        return this.f38172b;
    }

    public final void f() {
        long j10;
        int i9;
        View m10;
        SparseIntArray sparseIntArray = this.f38174e;
        sparseIntArray.clear();
        x81 x81Var = this.f38173c;
        this.f38172b = x81Var.Y;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f38172b; i11++) {
            sparseIntArray.put(i11, x81Var.j(i11));
        }
        this.f38175f = x81Var.f44398e;
        this.f38176g = x81Var.h;
        this.h = x81Var.f44401r;
        this.f38177i = x81Var.f44402s;
        this.f38178j = x81Var.v;
        this.f38179k = x81Var.f44403w;
        this.f38180l = x81Var.f44404x;
        this.f38181m = x81Var.f44400n;
        this.f38182n = x81Var.f44405y;
        this.f38191x = x81Var.E;
        this.f38192y = x81Var.F;
        this.f38183o = x81Var.A;
        this.f38184p = x81Var.B;
        this.f38185q = x81Var.C;
        this.f38186r = x81Var.G;
        this.f38187s = x81Var.H;
        this.f38188t = x81Var.I;
        this.f38189u = x81Var.J;
        this.v = x81Var.K;
        this.f38190w = x81Var.L;
        x81Var.E();
        f2.m0 m0Var = this.d;
        int L0 = m0Var.L0();
        int N0 = m0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (x81Var.i(L0) != -1 && (m10 = m0Var.m(L0)) != null) {
                    j10 = x81Var.i(L0);
                    i9 = m10.getTop();
                    break;
                }
                L0++;
            } else {
                j10 = -1;
                i9 = 0;
                break;
            }
        }
        f2.s.c(this, true).b(x81Var);
        if (j10 != -1) {
            while (true) {
                if (i10 < x81Var.Y) {
                    if (x81Var.i(i10) == j10) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 > 0) {
                m0Var.h1(i10, i9);
            }
        }
    }
}
