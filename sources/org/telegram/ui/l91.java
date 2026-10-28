package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class l91 extends s4.p {
    public int f41040b;
    public final d91 f41041c;
    public final s4.c0 d;
    public final SparseIntArray e = new SparseIntArray();
    public int f41042f = -1;
    public int f41043g = -1;
    public int h = -1;
    public int f41044i = -1;
    public int f41045j = -1;
    public int f41046k = -1;
    public int f41047l = -1;
    public int f41048m = -1;
    public int f41049n = -1;
    public int f41050o = -1;
    public int f41051p = -1;
    public int f41052q = -1;
    public int f41053r = -1;
    public int f41054s = -1;
    public int f41055t = -1;
    public int f41056u = -1;
    public int v = -1;
    public int f41057w = -1;
    public int f41058x = -1;
    public int f41059y = -1;

    public l91(d91 d91Var, s4.c0 c0Var) {
        this.f41041c = d91Var;
        this.d = c0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.e.get(i10) == this.f41041c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        int i12 = sparseIntArray.get(i10);
        d91 d91Var = this.f41041c;
        if (i12 == 13 && d91Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && d91Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f41058x;
        if (i10 >= i13 && i10 <= this.f41059y) {
            if (i10 - i13 == i11 - d91Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f41042f && i11 == d91Var.e) {
            return true;
        } else {
            if (i10 == this.f41043g && i11 == d91Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == d91Var.f38556r) {
                return true;
            }
            if (i10 == this.f41044i && i11 == d91Var.f38557s) {
                return true;
            }
            if (i10 == this.f41045j && i11 == d91Var.v) {
                return true;
            }
            if (i10 == this.f41046k && i11 == d91Var.f38558w) {
                return true;
            }
            if (i10 == this.f41047l && i11 == d91Var.f38559x) {
                return true;
            }
            if (i10 == this.f41048m && i11 == d91Var.f38555n) {
                return true;
            }
            if (i10 == this.f41049n && i11 == d91Var.f38560y) {
                return true;
            }
            if (i10 == this.f41053r && i11 == d91Var.K) {
                return true;
            }
            if (i10 == this.f41054s && i11 == d91Var.L) {
                return true;
            }
            if (i10 == this.f41055t && i11 == d91Var.M) {
                return true;
            }
            if (i10 == this.f41056u && i11 == d91Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == d91Var.O) {
                return true;
            }
            if (i10 == this.f41057w && i11 == d91Var.P) {
                return true;
            }
            if (i10 == this.f41050o && i11 == d91Var.E) {
                return true;
            }
            if (i10 == this.f41051p && i11 == d91Var.F) {
                return true;
            }
            if (i10 == this.f41052q && i11 == d91Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f41041c.f38552c0;
    }

    @Override
    public final int e() {
        return this.f41040b;
    }

    public final void f() {
        int i10;
        long j10;
        View m10;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        d91 d91Var = this.f41041c;
        this.f41040b = d91Var.f38552c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f41040b; i12++) {
            sparseIntArray.put(i12, d91Var.j(i12));
        }
        this.f41042f = d91Var.e;
        this.f41043g = d91Var.h;
        this.h = d91Var.f38556r;
        this.f41044i = d91Var.f38557s;
        this.f41045j = d91Var.v;
        this.f41046k = d91Var.f38558w;
        this.f41047l = d91Var.f38559x;
        this.f41048m = d91Var.f38555n;
        this.f41049n = d91Var.f38560y;
        this.f41058x = d91Var.I;
        this.f41059y = d91Var.J;
        this.f41050o = d91Var.E;
        this.f41051p = d91Var.F;
        this.f41052q = d91Var.G;
        this.f41053r = d91Var.K;
        this.f41054s = d91Var.L;
        this.f41055t = d91Var.M;
        this.f41056u = d91Var.N;
        this.v = d91Var.O;
        this.f41057w = d91Var.P;
        d91Var.E();
        s4.c0 c0Var = this.d;
        int L0 = c0Var.L0();
        int N0 = c0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (d91Var.i(L0) != -1 && (m10 = c0Var.m(L0)) != null) {
                    j10 = d91Var.i(L0);
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
        s4.p.c(this, true).c(d91Var);
        if (j10 != -1) {
            while (true) {
                if (i11 < d91Var.f38552c0) {
                    if (d91Var.i(i11) == j10) {
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
