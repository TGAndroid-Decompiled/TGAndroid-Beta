package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class ea1 extends s4.o {
    public int f32862b;
    public final w91 f32863c;
    public final s4.c0 d;
    public final SparseIntArray e = new SparseIntArray();
    public int f32864f = -1;
    public int f32865g = -1;
    public int h = -1;
    public int f32866i = -1;
    public int f32867j = -1;
    public int f32868k = -1;
    public int f32869l = -1;
    public int f32870m = -1;
    public int f32871n = -1;
    public int f32872o = -1;
    public int f32873p = -1;
    public int f32874q = -1;
    public int f32875r = -1;
    public int f32876s = -1;
    public int f32877t = -1;
    public int f32878u = -1;
    public int v = -1;
    public int f32879w = -1;
    public int f32880x = -1;
    public int f32881y = -1;

    public ea1(w91 w91Var, s4.c0 c0Var) {
        this.f32863c = w91Var;
        this.d = c0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.e.get(i10) == this.f32863c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        int i12 = sparseIntArray.get(i10);
        w91 w91Var = this.f32863c;
        if (i12 == 13 && w91Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && w91Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f32880x;
        if (i10 >= i13 && i10 <= this.f32881y) {
            if (i10 - i13 == i11 - w91Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f32864f && i11 == w91Var.e) {
            return true;
        } else {
            if (i10 == this.f32865g && i11 == w91Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == w91Var.f38574r) {
                return true;
            }
            if (i10 == this.f32866i && i11 == w91Var.f38575s) {
                return true;
            }
            if (i10 == this.f32867j && i11 == w91Var.v) {
                return true;
            }
            if (i10 == this.f32868k && i11 == w91Var.f38576w) {
                return true;
            }
            if (i10 == this.f32869l && i11 == w91Var.f38577x) {
                return true;
            }
            if (i10 == this.f32870m && i11 == w91Var.f38573n) {
                return true;
            }
            if (i10 == this.f32871n && i11 == w91Var.f38578y) {
                return true;
            }
            if (i10 == this.f32875r && i11 == w91Var.K) {
                return true;
            }
            if (i10 == this.f32876s && i11 == w91Var.L) {
                return true;
            }
            if (i10 == this.f32877t && i11 == w91Var.M) {
                return true;
            }
            if (i10 == this.f32878u && i11 == w91Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == w91Var.O) {
                return true;
            }
            if (i10 == this.f32879w && i11 == w91Var.P) {
                return true;
            }
            if (i10 == this.f32872o && i11 == w91Var.E) {
                return true;
            }
            if (i10 == this.f32873p && i11 == w91Var.F) {
                return true;
            }
            if (i10 == this.f32874q && i11 == w91Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f32863c.f38570c0;
    }

    @Override
    public final int e() {
        return this.f32862b;
    }

    public final void f() {
        long j3;
        int i10;
        View m10;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        w91 w91Var = this.f32863c;
        this.f32862b = w91Var.f38570c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f32862b; i12++) {
            sparseIntArray.put(i12, w91Var.j(i12));
        }
        this.f32864f = w91Var.e;
        this.f32865g = w91Var.h;
        this.h = w91Var.f38574r;
        this.f32866i = w91Var.f38575s;
        this.f32867j = w91Var.v;
        this.f32868k = w91Var.f38576w;
        this.f32869l = w91Var.f38577x;
        this.f32870m = w91Var.f38573n;
        this.f32871n = w91Var.f38578y;
        this.f32880x = w91Var.I;
        this.f32881y = w91Var.J;
        this.f32872o = w91Var.E;
        this.f32873p = w91Var.F;
        this.f32874q = w91Var.G;
        this.f32875r = w91Var.K;
        this.f32876s = w91Var.L;
        this.f32877t = w91Var.M;
        this.f32878u = w91Var.N;
        this.v = w91Var.O;
        this.f32879w = w91Var.P;
        w91Var.E();
        s4.c0 c0Var = this.d;
        int L0 = c0Var.L0();
        int N0 = c0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (w91Var.i(L0) != -1 && (m10 = c0Var.m(L0)) != null) {
                    j3 = w91Var.i(L0);
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
        s4.o.c(this, true).b(w91Var);
        if (j3 != -1) {
            while (true) {
                if (i11 < w91Var.f38570c0) {
                    if (w91Var.i(i11) == j3) {
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
