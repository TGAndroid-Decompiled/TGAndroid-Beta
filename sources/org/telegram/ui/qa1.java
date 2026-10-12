package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class qa1 extends s4.o {
    public int f41237b;
    public final ia1 f41238c;
    public final s4.d0 d;
    public final SparseIntArray f41239e = new SparseIntArray();
    public int f41240f = -1;
    public int f41241g = -1;
    public int h = -1;
    public int f41242i = -1;
    public int f41243j = -1;
    public int f41244k = -1;
    public int f41245l = -1;
    public int f41246m = -1;
    public int f41247n = -1;
    public int f41248o = -1;
    public int f41249p = -1;
    public int f41250q = -1;
    public int f41251r = -1;
    public int f41252s = -1;
    public int f41253t = -1;
    public int f41254u = -1;
    public int v = -1;
    public int f41255w = -1;
    public int f41256x = -1;
    public int f41257y = -1;

    public qa1(ia1 ia1Var, s4.d0 d0Var) {
        this.f41238c = ia1Var;
        this.d = d0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.f41239e.get(i10) == this.f41238c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.f41239e;
        int i12 = sparseIntArray.get(i10);
        ia1 ia1Var = this.f41238c;
        if (i12 == 13 && ia1Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && ia1Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f41256x;
        if (i10 >= i13 && i10 <= this.f41257y) {
            if (i10 - i13 == i11 - ia1Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f41240f && i11 == ia1Var.f38825e) {
            return true;
        } else {
            if (i10 == this.f41241g && i11 == ia1Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == ia1Var.f38828r) {
                return true;
            }
            if (i10 == this.f41242i && i11 == ia1Var.f38829s) {
                return true;
            }
            if (i10 == this.f41243j && i11 == ia1Var.v) {
                return true;
            }
            if (i10 == this.f41244k && i11 == ia1Var.f38830w) {
                return true;
            }
            if (i10 == this.f41245l && i11 == ia1Var.f38831x) {
                return true;
            }
            if (i10 == this.f41246m && i11 == ia1Var.f38827n) {
                return true;
            }
            if (i10 == this.f41247n && i11 == ia1Var.f38832y) {
                return true;
            }
            if (i10 == this.f41251r && i11 == ia1Var.K) {
                return true;
            }
            if (i10 == this.f41252s && i11 == ia1Var.L) {
                return true;
            }
            if (i10 == this.f41253t && i11 == ia1Var.M) {
                return true;
            }
            if (i10 == this.f41254u && i11 == ia1Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == ia1Var.O) {
                return true;
            }
            if (i10 == this.f41255w && i11 == ia1Var.P) {
                return true;
            }
            if (i10 == this.f41248o && i11 == ia1Var.E) {
                return true;
            }
            if (i10 == this.f41249p && i11 == ia1Var.F) {
                return true;
            }
            if (i10 == this.f41250q && i11 == ia1Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f41238c.f38823c0;
    }

    @Override
    public final int e() {
        return this.f41237b;
    }

    public final void f() {
        int i10;
        long j3;
        View m10;
        SparseIntArray sparseIntArray = this.f41239e;
        sparseIntArray.clear();
        ia1 ia1Var = this.f41238c;
        this.f41237b = ia1Var.f38823c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f41237b; i12++) {
            sparseIntArray.put(i12, ia1Var.j(i12));
        }
        this.f41240f = ia1Var.f38825e;
        this.f41241g = ia1Var.h;
        this.h = ia1Var.f38828r;
        this.f41242i = ia1Var.f38829s;
        this.f41243j = ia1Var.v;
        this.f41244k = ia1Var.f38830w;
        this.f41245l = ia1Var.f38831x;
        this.f41246m = ia1Var.f38827n;
        this.f41247n = ia1Var.f38832y;
        this.f41256x = ia1Var.I;
        this.f41257y = ia1Var.J;
        this.f41248o = ia1Var.E;
        this.f41249p = ia1Var.F;
        this.f41250q = ia1Var.G;
        this.f41251r = ia1Var.K;
        this.f41252s = ia1Var.L;
        this.f41253t = ia1Var.M;
        this.f41254u = ia1Var.N;
        this.v = ia1Var.O;
        this.f41255w = ia1Var.P;
        ia1Var.E();
        s4.d0 d0Var = this.d;
        int L0 = d0Var.L0();
        int N0 = d0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (ia1Var.i(L0) != -1 && (m10 = d0Var.m(L0)) != null) {
                    j3 = ia1Var.i(L0);
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
        s4.o.c(this, true).b(ia1Var);
        if (j3 != -1) {
            while (true) {
                if (i11 < ia1Var.f38823c0) {
                    if (ia1Var.i(i11) == j3) {
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
