package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class e91 extends s4.o {
    public int f36416b;
    public final w81 f36417c;
    public final s4.b0 d;
    public final SparseIntArray e = new SparseIntArray();
    public int f36418f = -1;
    public int f36419g = -1;
    public int h = -1;
    public int f36420i = -1;
    public int f36421j = -1;
    public int f36422k = -1;
    public int f36423l = -1;
    public int f36424m = -1;
    public int f36425n = -1;
    public int f36426o = -1;
    public int f36427p = -1;
    public int f36428q = -1;
    public int f36429r = -1;
    public int f36430s = -1;
    public int f36431t = -1;
    public int f36432u = -1;
    public int v = -1;
    public int f36433w = -1;
    public int f36434x = -1;
    public int f36435y = -1;

    public e91(w81 w81Var, s4.b0 b0Var) {
        this.f36417c = w81Var;
        this.d = b0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.e.get(i10) == this.f36417c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        int i12 = sparseIntArray.get(i10);
        w81 w81Var = this.f36417c;
        if (i12 == 13 && w81Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && w81Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f36434x;
        if (i10 >= i13 && i10 <= this.f36435y) {
            if (i10 - i13 == i11 - w81Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f36418f && i11 == w81Var.e) {
            return true;
        } else {
            if (i10 == this.f36419g && i11 == w81Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == w81Var.f42431r) {
                return true;
            }
            if (i10 == this.f36420i && i11 == w81Var.f42432s) {
                return true;
            }
            if (i10 == this.f36421j && i11 == w81Var.v) {
                return true;
            }
            if (i10 == this.f36422k && i11 == w81Var.f42433w) {
                return true;
            }
            if (i10 == this.f36423l && i11 == w81Var.f42434x) {
                return true;
            }
            if (i10 == this.f36424m && i11 == w81Var.f42430n) {
                return true;
            }
            if (i10 == this.f36425n && i11 == w81Var.f42435y) {
                return true;
            }
            if (i10 == this.f36429r && i11 == w81Var.K) {
                return true;
            }
            if (i10 == this.f36430s && i11 == w81Var.L) {
                return true;
            }
            if (i10 == this.f36431t && i11 == w81Var.M) {
                return true;
            }
            if (i10 == this.f36432u && i11 == w81Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == w81Var.O) {
                return true;
            }
            if (i10 == this.f36433w && i11 == w81Var.P) {
                return true;
            }
            if (i10 == this.f36426o && i11 == w81Var.E) {
                return true;
            }
            if (i10 == this.f36427p && i11 == w81Var.F) {
                return true;
            }
            if (i10 == this.f36428q && i11 == w81Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f36417c.f42427c0;
    }

    @Override
    public final int e() {
        return this.f36416b;
    }

    public final void f() {
        int i10;
        long j10;
        View m10;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        w81 w81Var = this.f36417c;
        this.f36416b = w81Var.f42427c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f36416b; i12++) {
            sparseIntArray.put(i12, w81Var.j(i12));
        }
        this.f36418f = w81Var.e;
        this.f36419g = w81Var.h;
        this.h = w81Var.f42431r;
        this.f36420i = w81Var.f42432s;
        this.f36421j = w81Var.v;
        this.f36422k = w81Var.f42433w;
        this.f36423l = w81Var.f42434x;
        this.f36424m = w81Var.f42430n;
        this.f36425n = w81Var.f42435y;
        this.f36434x = w81Var.I;
        this.f36435y = w81Var.J;
        this.f36426o = w81Var.E;
        this.f36427p = w81Var.F;
        this.f36428q = w81Var.G;
        this.f36429r = w81Var.K;
        this.f36430s = w81Var.L;
        this.f36431t = w81Var.M;
        this.f36432u = w81Var.N;
        this.v = w81Var.O;
        this.f36433w = w81Var.P;
        w81Var.E();
        s4.b0 b0Var = this.d;
        int L0 = b0Var.L0();
        int N0 = b0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (w81Var.i(L0) != -1 && (m10 = b0Var.m(L0)) != null) {
                    j10 = w81Var.i(L0);
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
        s4.o.c(this, true).c(w81Var);
        if (j10 != -1) {
            while (true) {
                if (i11 < w81Var.f42427c0) {
                    if (w81Var.i(i11) == j10) {
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
