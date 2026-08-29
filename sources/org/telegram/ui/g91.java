package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class g91 extends f2.q {
    public int f38521b;
    public final y81 f38522c;
    public final f2.j0 d;
    public final SparseIntArray f38523e = new SparseIntArray();
    public int f38524f = -1;
    public int f38525g = -1;
    public int h = -1;
    public int f38526i = -1;
    public int f38527j = -1;
    public int f38528k = -1;
    public int f38529l = -1;
    public int f38530m = -1;
    public int f38531n = -1;
    public int f38532o = -1;
    public int f38533p = -1;
    public int f38534q = -1;
    public int f38535r = -1;
    public int f38536s = -1;
    public int f38537t = -1;
    public int f38538u = -1;
    public int v = -1;
    public int f38539w = -1;
    public int f38540x = -1;
    public int f38541y = -1;

    public g91(y81 y81Var, f2.j0 j0Var) {
        this.f38522c = y81Var;
        this.d = j0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.f38523e.get(i10) == this.f38522c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.f38523e;
        int i12 = sparseIntArray.get(i10);
        y81 y81Var = this.f38522c;
        if (i12 == 13 && y81Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && y81Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f38540x;
        if (i10 >= i13 && i10 <= this.f38541y) {
            if (i10 - i13 == i11 - y81Var.E) {
                return true;
            }
            return false;
        } else if (i10 == this.f38524f && i11 == y81Var.f44806e) {
            return true;
        } else {
            if (i10 == this.f38525g && i11 == y81Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == y81Var.f44809r) {
                return true;
            }
            if (i10 == this.f38526i && i11 == y81Var.f44810s) {
                return true;
            }
            if (i10 == this.f38527j && i11 == y81Var.v) {
                return true;
            }
            if (i10 == this.f38528k && i11 == y81Var.f44811w) {
                return true;
            }
            if (i10 == this.f38529l && i11 == y81Var.f44812x) {
                return true;
            }
            if (i10 == this.f38530m && i11 == y81Var.f44808n) {
                return true;
            }
            if (i10 == this.f38531n && i11 == y81Var.f44813y) {
                return true;
            }
            if (i10 == this.f38535r && i11 == y81Var.G) {
                return true;
            }
            if (i10 == this.f38536s && i11 == y81Var.H) {
                return true;
            }
            if (i10 == this.f38537t && i11 == y81Var.I) {
                return true;
            }
            if (i10 == this.f38538u && i11 == y81Var.J) {
                return true;
            }
            if (i10 == this.v && i11 == y81Var.K) {
                return true;
            }
            if (i10 == this.f38539w && i11 == y81Var.L) {
                return true;
            }
            if (i10 == this.f38532o && i11 == y81Var.A) {
                return true;
            }
            if (i10 == this.f38533p && i11 == y81Var.B) {
                return true;
            }
            if (i10 == this.f38534q && i11 == y81Var.C) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f38522c.Y;
    }

    @Override
    public final int e() {
        return this.f38521b;
    }

    public final void f() {
        long j10;
        int i10;
        View m10;
        SparseIntArray sparseIntArray = this.f38523e;
        sparseIntArray.clear();
        y81 y81Var = this.f38522c;
        this.f38521b = y81Var.Y;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f38521b; i12++) {
            sparseIntArray.put(i12, y81Var.j(i12));
        }
        this.f38524f = y81Var.f44806e;
        this.f38525g = y81Var.h;
        this.h = y81Var.f44809r;
        this.f38526i = y81Var.f44810s;
        this.f38527j = y81Var.v;
        this.f38528k = y81Var.f44811w;
        this.f38529l = y81Var.f44812x;
        this.f38530m = y81Var.f44808n;
        this.f38531n = y81Var.f44813y;
        this.f38540x = y81Var.E;
        this.f38541y = y81Var.F;
        this.f38532o = y81Var.A;
        this.f38533p = y81Var.B;
        this.f38534q = y81Var.C;
        this.f38535r = y81Var.G;
        this.f38536s = y81Var.H;
        this.f38537t = y81Var.I;
        this.f38538u = y81Var.J;
        this.v = y81Var.K;
        this.f38539w = y81Var.L;
        y81Var.E();
        f2.j0 j0Var = this.d;
        int L0 = j0Var.L0();
        int N0 = j0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (y81Var.i(L0) != -1 && (m10 = j0Var.m(L0)) != null) {
                    j10 = y81Var.i(L0);
                    i10 = m10.getTop();
                    break;
                }
                L0++;
            } else {
                j10 = -1;
                i10 = 0;
                break;
            }
        }
        f2.q.c(this, true).b(y81Var);
        if (j10 != -1) {
            while (true) {
                if (i11 < y81Var.Y) {
                    if (y81Var.i(i11) == j10) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 > 0) {
                j0Var.h1(i11, i10);
            }
        }
    }
}
