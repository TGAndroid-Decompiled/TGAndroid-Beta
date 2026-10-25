package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class j91 extends s4.p {
    public int f40518b;
    public final b91 f40519c;
    public final s4.c0 d;
    public final SparseIntArray e = new SparseIntArray();
    public int f40520f = -1;
    public int f40521g = -1;
    public int h = -1;
    public int f40522i = -1;
    public int f40523j = -1;
    public int f40524k = -1;
    public int f40525l = -1;
    public int f40526m = -1;
    public int f40527n = -1;
    public int f40528o = -1;
    public int f40529p = -1;
    public int f40530q = -1;
    public int f40531r = -1;
    public int f40532s = -1;
    public int f40533t = -1;
    public int f40534u = -1;
    public int v = -1;
    public int f40535w = -1;
    public int f40536x = -1;
    public int f40537y = -1;

    public j91(b91 b91Var, s4.c0 c0Var) {
        this.f40519c = b91Var;
        this.d = c0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.e.get(i10) == this.f40519c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        int i12 = sparseIntArray.get(i10);
        b91 b91Var = this.f40519c;
        if (i12 == 13 && b91Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && b91Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f40536x;
        if (i10 >= i13 && i10 <= this.f40537y) {
            if (i10 - i13 == i11 - b91Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f40520f && i11 == b91Var.e) {
            return true;
        } else {
            if (i10 == this.f40521g && i11 == b91Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == b91Var.f38013r) {
                return true;
            }
            if (i10 == this.f40522i && i11 == b91Var.f38014s) {
                return true;
            }
            if (i10 == this.f40523j && i11 == b91Var.v) {
                return true;
            }
            if (i10 == this.f40524k && i11 == b91Var.f38015w) {
                return true;
            }
            if (i10 == this.f40525l && i11 == b91Var.f38016x) {
                return true;
            }
            if (i10 == this.f40526m && i11 == b91Var.f38012n) {
                return true;
            }
            if (i10 == this.f40527n && i11 == b91Var.f38017y) {
                return true;
            }
            if (i10 == this.f40531r && i11 == b91Var.K) {
                return true;
            }
            if (i10 == this.f40532s && i11 == b91Var.L) {
                return true;
            }
            if (i10 == this.f40533t && i11 == b91Var.M) {
                return true;
            }
            if (i10 == this.f40534u && i11 == b91Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == b91Var.O) {
                return true;
            }
            if (i10 == this.f40535w && i11 == b91Var.P) {
                return true;
            }
            if (i10 == this.f40528o && i11 == b91Var.E) {
                return true;
            }
            if (i10 == this.f40529p && i11 == b91Var.F) {
                return true;
            }
            if (i10 == this.f40530q && i11 == b91Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f40519c.f38009c0;
    }

    @Override
    public final int e() {
        return this.f40518b;
    }

    public final void f() {
        int i10;
        long j10;
        View m10;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        b91 b91Var = this.f40519c;
        this.f40518b = b91Var.f38009c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f40518b; i12++) {
            sparseIntArray.put(i12, b91Var.j(i12));
        }
        this.f40520f = b91Var.e;
        this.f40521g = b91Var.h;
        this.h = b91Var.f38013r;
        this.f40522i = b91Var.f38014s;
        this.f40523j = b91Var.v;
        this.f40524k = b91Var.f38015w;
        this.f40525l = b91Var.f38016x;
        this.f40526m = b91Var.f38012n;
        this.f40527n = b91Var.f38017y;
        this.f40536x = b91Var.I;
        this.f40537y = b91Var.J;
        this.f40528o = b91Var.E;
        this.f40529p = b91Var.F;
        this.f40530q = b91Var.G;
        this.f40531r = b91Var.K;
        this.f40532s = b91Var.L;
        this.f40533t = b91Var.M;
        this.f40534u = b91Var.N;
        this.v = b91Var.O;
        this.f40535w = b91Var.P;
        b91Var.E();
        s4.c0 c0Var = this.d;
        int L0 = c0Var.L0();
        int N0 = c0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (b91Var.i(L0) != -1 && (m10 = c0Var.m(L0)) != null) {
                    j10 = b91Var.i(L0);
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
        s4.p.c(this, true).c(b91Var);
        if (j10 != -1) {
            while (true) {
                if (i11 < b91Var.f38009c0) {
                    if (b91Var.i(i11) == j10) {
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
