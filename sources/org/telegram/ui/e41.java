package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class e41 extends u4.o {
    public int f44868b;
    public final w31 f44869c;
    public final u4.b0 d;
    public final SparseIntArray f44870e = new SparseIntArray();
    public int f44871f = -1;
    public int f44872g = -1;
    public int h = -1;
    public int f44873i = -1;
    public int f44874j = -1;
    public int f44875k = -1;
    public int f44876l = -1;
    public int f44877m = -1;
    public int f44878n = -1;
    public int f44879o = -1;
    public int f44880p = -1;
    public int f44881q = -1;
    public int f44882r = -1;
    public int f44883s = -1;
    public int f44884t = -1;
    public int f44885u = -1;
    public int v = -1;
    public int f44886w = -1;
    public int f44887x = -1;
    public int f44888y = -1;

    public e41(w31 w31Var, u4.b0 b0Var) {
        this.f44869c = w31Var;
        this.d = b0Var;
    }

    @Override
    public final boolean a(int i3, int i10) {
        if (this.f44870e.get(i3) == this.f44869c.d(i10)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i3, int i10) {
        SparseIntArray sparseIntArray = this.f44870e;
        int i11 = sparseIntArray.get(i3);
        w31 w31Var = this.f44869c;
        if (i11 == 13 && w31Var.d(i10) == 13) {
            return true;
        }
        if (sparseIntArray.get(i3) == 10 && w31Var.d(i10) == 10) {
            return true;
        }
        int i12 = this.f44887x;
        if (i3 >= i12 && i3 <= this.f44888y) {
            if (i3 - i12 == i10 - w31Var.J) {
                return true;
            }
            return false;
        } else if (i3 == this.f44871f && i10 == w31Var.f50695e) {
            return true;
        } else {
            if (i3 == this.f44872g && i10 == w31Var.h) {
                return true;
            }
            if (i3 == this.h && i10 == w31Var.f50699r) {
                return true;
            }
            if (i3 == this.f44873i && i10 == w31Var.f50700s) {
                return true;
            }
            if (i3 == this.f44874j && i10 == w31Var.f50701w) {
                return true;
            }
            if (i3 == this.f44875k && i10 == w31Var.f50702x) {
                return true;
            }
            if (i3 == this.f44876l && i10 == w31Var.f50703y) {
                return true;
            }
            if (i3 == this.f44877m && i10 == w31Var.f50698n) {
                return true;
            }
            if (i3 == this.f44878n && i10 == w31Var.E) {
                return true;
            }
            if (i3 == this.f44882r && i10 == w31Var.L) {
                return true;
            }
            if (i3 == this.f44883s && i10 == w31Var.M) {
                return true;
            }
            if (i3 == this.f44884t && i10 == w31Var.N) {
                return true;
            }
            if (i3 == this.f44885u && i10 == w31Var.O) {
                return true;
            }
            if (i3 == this.v && i10 == w31Var.P) {
                return true;
            }
            if (i3 == this.f44886w && i10 == w31Var.Q) {
                return true;
            }
            if (i3 == this.f44879o && i10 == w31Var.F) {
                return true;
            }
            if (i3 == this.f44880p && i10 == w31Var.G) {
                return true;
            }
            if (i3 == this.f44881q && i10 == w31Var.H) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f44869c.f50694d0;
    }

    @Override
    public final int e() {
        return this.f44868b;
    }

    public final void f() {
        int i3;
        long j10;
        View m10;
        SparseIntArray sparseIntArray = this.f44870e;
        sparseIntArray.clear();
        w31 w31Var = this.f44869c;
        this.f44868b = w31Var.f50694d0;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f44868b; i11++) {
            sparseIntArray.put(i11, w31Var.d(i11));
        }
        this.f44871f = w31Var.f50695e;
        this.f44872g = w31Var.h;
        this.h = w31Var.f50699r;
        this.f44873i = w31Var.f50700s;
        this.f44874j = w31Var.f50701w;
        this.f44875k = w31Var.f50702x;
        this.f44876l = w31Var.f50703y;
        this.f44877m = w31Var.f50698n;
        this.f44878n = w31Var.E;
        this.f44887x = w31Var.J;
        this.f44888y = w31Var.K;
        this.f44879o = w31Var.F;
        this.f44880p = w31Var.G;
        this.f44881q = w31Var.H;
        this.f44882r = w31Var.L;
        this.f44883s = w31Var.M;
        this.f44884t = w31Var.N;
        this.f44885u = w31Var.O;
        this.v = w31Var.P;
        this.f44886w = w31Var.Q;
        w31Var.E();
        u4.b0 b0Var = this.d;
        int L0 = b0Var.L0();
        int N0 = b0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (w31Var.c(L0) != -1 && (m10 = b0Var.m(L0)) != null) {
                    j10 = w31Var.c(L0);
                    i3 = m10.getTop();
                    break;
                }
                L0++;
            } else {
                i3 = 0;
                j10 = -1;
                break;
            }
        }
        u4.o.c(this, true).c(w31Var);
        if (j10 != -1) {
            while (true) {
                if (i10 < w31Var.f50694d0) {
                    if (w31Var.c(i10) == j10) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 > 0) {
                b0Var.h1(i10, i3);
            }
        }
    }
}
