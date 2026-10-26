package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class j91 extends s4.p {
    public int f40521b;
    public final b91 f40522c;
    public final s4.c0 d;
    public final SparseIntArray e = new SparseIntArray();
    public int f40523f = -1;
    public int f40524g = -1;
    public int h = -1;
    public int f40525i = -1;
    public int f40526j = -1;
    public int f40527k = -1;
    public int f40528l = -1;
    public int f40529m = -1;
    public int f40530n = -1;
    public int f40531o = -1;
    public int f40532p = -1;
    public int f40533q = -1;
    public int f40534r = -1;
    public int f40535s = -1;
    public int f40536t = -1;
    public int f40537u = -1;
    public int v = -1;
    public int f40538w = -1;
    public int f40539x = -1;
    public int f40540y = -1;

    public j91(b91 b91Var, s4.c0 c0Var) {
        this.f40522c = b91Var;
        this.d = c0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.e.get(i10) == this.f40522c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        int i12 = sparseIntArray.get(i10);
        b91 b91Var = this.f40522c;
        if (i12 == 13 && b91Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && b91Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f40539x;
        if (i10 >= i13 && i10 <= this.f40540y) {
            if (i10 - i13 == i11 - b91Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f40523f && i11 == b91Var.e) {
            return true;
        } else {
            if (i10 == this.f40524g && i11 == b91Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == b91Var.f38016r) {
                return true;
            }
            if (i10 == this.f40525i && i11 == b91Var.f38017s) {
                return true;
            }
            if (i10 == this.f40526j && i11 == b91Var.v) {
                return true;
            }
            if (i10 == this.f40527k && i11 == b91Var.f38018w) {
                return true;
            }
            if (i10 == this.f40528l && i11 == b91Var.f38019x) {
                return true;
            }
            if (i10 == this.f40529m && i11 == b91Var.f38015n) {
                return true;
            }
            if (i10 == this.f40530n && i11 == b91Var.f38020y) {
                return true;
            }
            if (i10 == this.f40534r && i11 == b91Var.K) {
                return true;
            }
            if (i10 == this.f40535s && i11 == b91Var.L) {
                return true;
            }
            if (i10 == this.f40536t && i11 == b91Var.M) {
                return true;
            }
            if (i10 == this.f40537u && i11 == b91Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == b91Var.O) {
                return true;
            }
            if (i10 == this.f40538w && i11 == b91Var.P) {
                return true;
            }
            if (i10 == this.f40531o && i11 == b91Var.E) {
                return true;
            }
            if (i10 == this.f40532p && i11 == b91Var.F) {
                return true;
            }
            if (i10 == this.f40533q && i11 == b91Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f40522c.f38012c0;
    }

    @Override
    public final int e() {
        return this.f40521b;
    }

    public final void f() {
        int i10;
        long j10;
        View m10;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        b91 b91Var = this.f40522c;
        this.f40521b = b91Var.f38012c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f40521b; i12++) {
            sparseIntArray.put(i12, b91Var.j(i12));
        }
        this.f40523f = b91Var.e;
        this.f40524g = b91Var.h;
        this.h = b91Var.f38016r;
        this.f40525i = b91Var.f38017s;
        this.f40526j = b91Var.v;
        this.f40527k = b91Var.f38018w;
        this.f40528l = b91Var.f38019x;
        this.f40529m = b91Var.f38015n;
        this.f40530n = b91Var.f38020y;
        this.f40539x = b91Var.I;
        this.f40540y = b91Var.J;
        this.f40531o = b91Var.E;
        this.f40532p = b91Var.F;
        this.f40533q = b91Var.G;
        this.f40534r = b91Var.K;
        this.f40535s = b91Var.L;
        this.f40536t = b91Var.M;
        this.f40537u = b91Var.N;
        this.v = b91Var.O;
        this.f40538w = b91Var.P;
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
                if (i11 < b91Var.f38012c0) {
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
