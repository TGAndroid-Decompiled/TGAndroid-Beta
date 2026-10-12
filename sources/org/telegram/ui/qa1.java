package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class qa1 extends s4.o {
    public int f41241b;
    public final ia1 f41242c;
    public final s4.d0 d;
    public final SparseIntArray f41243e = new SparseIntArray();
    public int f41244f = -1;
    public int f41245g = -1;
    public int h = -1;
    public int f41246i = -1;
    public int f41247j = -1;
    public int f41248k = -1;
    public int f41249l = -1;
    public int f41250m = -1;
    public int f41251n = -1;
    public int f41252o = -1;
    public int f41253p = -1;
    public int f41254q = -1;
    public int f41255r = -1;
    public int f41256s = -1;
    public int f41257t = -1;
    public int f41258u = -1;
    public int v = -1;
    public int f41259w = -1;
    public int f41260x = -1;
    public int f41261y = -1;

    public qa1(ia1 ia1Var, s4.d0 d0Var) {
        this.f41242c = ia1Var;
        this.d = d0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.f41243e.get(i10) == this.f41242c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.f41243e;
        int i12 = sparseIntArray.get(i10);
        ia1 ia1Var = this.f41242c;
        if (i12 == 13 && ia1Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && ia1Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f41260x;
        if (i10 >= i13 && i10 <= this.f41261y) {
            if (i10 - i13 == i11 - ia1Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f41244f && i11 == ia1Var.f38828e) {
            return true;
        } else {
            if (i10 == this.f41245g && i11 == ia1Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == ia1Var.f38831r) {
                return true;
            }
            if (i10 == this.f41246i && i11 == ia1Var.f38832s) {
                return true;
            }
            if (i10 == this.f41247j && i11 == ia1Var.v) {
                return true;
            }
            if (i10 == this.f41248k && i11 == ia1Var.f38833w) {
                return true;
            }
            if (i10 == this.f41249l && i11 == ia1Var.f38834x) {
                return true;
            }
            if (i10 == this.f41250m && i11 == ia1Var.f38830n) {
                return true;
            }
            if (i10 == this.f41251n && i11 == ia1Var.f38835y) {
                return true;
            }
            if (i10 == this.f41255r && i11 == ia1Var.K) {
                return true;
            }
            if (i10 == this.f41256s && i11 == ia1Var.L) {
                return true;
            }
            if (i10 == this.f41257t && i11 == ia1Var.M) {
                return true;
            }
            if (i10 == this.f41258u && i11 == ia1Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == ia1Var.O) {
                return true;
            }
            if (i10 == this.f41259w && i11 == ia1Var.P) {
                return true;
            }
            if (i10 == this.f41252o && i11 == ia1Var.E) {
                return true;
            }
            if (i10 == this.f41253p && i11 == ia1Var.F) {
                return true;
            }
            if (i10 == this.f41254q && i11 == ia1Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f41242c.f38826c0;
    }

    @Override
    public final int e() {
        return this.f41241b;
    }

    public final void f() {
        int i10;
        long j3;
        View m10;
        SparseIntArray sparseIntArray = this.f41243e;
        sparseIntArray.clear();
        ia1 ia1Var = this.f41242c;
        this.f41241b = ia1Var.f38826c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f41241b; i12++) {
            sparseIntArray.put(i12, ia1Var.j(i12));
        }
        this.f41244f = ia1Var.f38828e;
        this.f41245g = ia1Var.h;
        this.h = ia1Var.f38831r;
        this.f41246i = ia1Var.f38832s;
        this.f41247j = ia1Var.v;
        this.f41248k = ia1Var.f38833w;
        this.f41249l = ia1Var.f38834x;
        this.f41250m = ia1Var.f38830n;
        this.f41251n = ia1Var.f38835y;
        this.f41260x = ia1Var.I;
        this.f41261y = ia1Var.J;
        this.f41252o = ia1Var.E;
        this.f41253p = ia1Var.F;
        this.f41254q = ia1Var.G;
        this.f41255r = ia1Var.K;
        this.f41256s = ia1Var.L;
        this.f41257t = ia1Var.M;
        this.f41258u = ia1Var.N;
        this.v = ia1Var.O;
        this.f41259w = ia1Var.P;
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
                if (i11 < ia1Var.f38826c0) {
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
