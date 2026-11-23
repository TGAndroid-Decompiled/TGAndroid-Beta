package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class p41 extends v4.o {
    public int f50701b;
    public final h41 f50702c;
    public final v4.b0 d;
    public final SparseIntArray f50703e = new SparseIntArray();
    public int f50704f = -1;
    public int f50705g = -1;
    public int h = -1;
    public int f50706i = -1;
    public int f50707j = -1;
    public int f50708k = -1;
    public int f50709l = -1;
    public int f50710m = -1;
    public int f50711n = -1;
    public int f50712o = -1;
    public int f50713p = -1;
    public int f50714q = -1;
    public int f50715r = -1;
    public int f50716s = -1;
    public int f50717t = -1;
    public int f50718u = -1;
    public int v = -1;
    public int f50719w = -1;
    public int f50720x = -1;
    public int f50721y = -1;

    public p41(h41 h41Var, v4.b0 b0Var) {
        this.f50702c = h41Var;
        this.d = b0Var;
    }

    @Override
    public final boolean a(int i7, int i10) {
        if (this.f50703e.get(i7) == this.f50702c.d(i10)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i7, int i10) {
        SparseIntArray sparseIntArray = this.f50703e;
        int i11 = sparseIntArray.get(i7);
        h41 h41Var = this.f50702c;
        if (i11 == 13 && h41Var.d(i10) == 13) {
            return true;
        }
        if (sparseIntArray.get(i7) == 10 && h41Var.d(i10) == 10) {
            return true;
        }
        int i12 = this.f50720x;
        if (i7 >= i12 && i7 <= this.f50721y) {
            if (i7 - i12 == i10 - h41Var.J) {
                return true;
            }
            return false;
        } else if (i7 == this.f50704f && i10 == h41Var.f48186e) {
            return true;
        } else {
            if (i7 == this.f50705g && i10 == h41Var.h) {
                return true;
            }
            if (i7 == this.h && i10 == h41Var.f48190r) {
                return true;
            }
            if (i7 == this.f50706i && i10 == h41Var.f48191s) {
                return true;
            }
            if (i7 == this.f50707j && i10 == h41Var.f48192w) {
                return true;
            }
            if (i7 == this.f50708k && i10 == h41Var.f48193x) {
                return true;
            }
            if (i7 == this.f50709l && i10 == h41Var.f48194y) {
                return true;
            }
            if (i7 == this.f50710m && i10 == h41Var.f48189n) {
                return true;
            }
            if (i7 == this.f50711n && i10 == h41Var.E) {
                return true;
            }
            if (i7 == this.f50715r && i10 == h41Var.L) {
                return true;
            }
            if (i7 == this.f50716s && i10 == h41Var.M) {
                return true;
            }
            if (i7 == this.f50717t && i10 == h41Var.N) {
                return true;
            }
            if (i7 == this.f50718u && i10 == h41Var.O) {
                return true;
            }
            if (i7 == this.v && i10 == h41Var.P) {
                return true;
            }
            if (i7 == this.f50719w && i10 == h41Var.Q) {
                return true;
            }
            if (i7 == this.f50712o && i10 == h41Var.F) {
                return true;
            }
            if (i7 == this.f50713p && i10 == h41Var.G) {
                return true;
            }
            if (i7 == this.f50714q && i10 == h41Var.H) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f50702c.f48185d0;
    }

    @Override
    public final int e() {
        return this.f50701b;
    }

    public final void f() {
        int i7;
        long j3;
        View m10;
        SparseIntArray sparseIntArray = this.f50703e;
        sparseIntArray.clear();
        h41 h41Var = this.f50702c;
        this.f50701b = h41Var.f48185d0;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f50701b; i11++) {
            sparseIntArray.put(i11, h41Var.d(i11));
        }
        this.f50704f = h41Var.f48186e;
        this.f50705g = h41Var.h;
        this.h = h41Var.f48190r;
        this.f50706i = h41Var.f48191s;
        this.f50707j = h41Var.f48192w;
        this.f50708k = h41Var.f48193x;
        this.f50709l = h41Var.f48194y;
        this.f50710m = h41Var.f48189n;
        this.f50711n = h41Var.E;
        this.f50720x = h41Var.J;
        this.f50721y = h41Var.K;
        this.f50712o = h41Var.F;
        this.f50713p = h41Var.G;
        this.f50714q = h41Var.H;
        this.f50715r = h41Var.L;
        this.f50716s = h41Var.M;
        this.f50717t = h41Var.N;
        this.f50718u = h41Var.O;
        this.v = h41Var.P;
        this.f50719w = h41Var.Q;
        h41Var.E();
        v4.b0 b0Var = this.d;
        int L0 = b0Var.L0();
        int N0 = b0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (h41Var.c(L0) != -1 && (m10 = b0Var.m(L0)) != null) {
                    j3 = h41Var.c(L0);
                    i7 = m10.getTop();
                    break;
                }
                L0++;
            } else {
                i7 = 0;
                j3 = -1;
                break;
            }
        }
        v4.o.c(this, true).c(h41Var);
        if (j3 != -1) {
            while (true) {
                if (i10 < h41Var.f48185d0) {
                    if (h41Var.c(i10) == j3) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 > 0) {
                b0Var.h1(i10, i7);
            }
        }
    }
}
