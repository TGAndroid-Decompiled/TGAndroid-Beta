package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class ia1 extends s4.o {
    public int f37360b;
    public final aa1 f37361c;
    public final s4.c0 d;
    public final SparseIntArray f37362e = new SparseIntArray();
    public int f37363f = -1;
    public int f37364g = -1;
    public int h = -1;
    public int f37365i = -1;
    public int f37366j = -1;
    public int f37367k = -1;
    public int f37368l = -1;
    public int f37369m = -1;
    public int f37370n = -1;
    public int f37371o = -1;
    public int f37372p = -1;
    public int f37373q = -1;
    public int f37374r = -1;
    public int f37375s = -1;
    public int f37376t = -1;
    public int f37377u = -1;
    public int v = -1;
    public int f37378w = -1;
    public int f37379x = -1;
    public int f37380y = -1;

    public ia1(aa1 aa1Var, s4.c0 c0Var) {
        this.f37361c = aa1Var;
        this.d = c0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.f37362e.get(i10) == this.f37361c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.f37362e;
        int i12 = sparseIntArray.get(i10);
        aa1 aa1Var = this.f37361c;
        if (i12 == 13 && aa1Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && aa1Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f37379x;
        if (i10 >= i13 && i10 <= this.f37380y) {
            if (i10 - i13 == i11 - aa1Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f37363f && i11 == aa1Var.f34763e) {
            return true;
        } else {
            if (i10 == this.f37364g && i11 == aa1Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == aa1Var.f34766r) {
                return true;
            }
            if (i10 == this.f37365i && i11 == aa1Var.f34767s) {
                return true;
            }
            if (i10 == this.f37366j && i11 == aa1Var.v) {
                return true;
            }
            if (i10 == this.f37367k && i11 == aa1Var.f34768w) {
                return true;
            }
            if (i10 == this.f37368l && i11 == aa1Var.f34769x) {
                return true;
            }
            if (i10 == this.f37369m && i11 == aa1Var.f34765n) {
                return true;
            }
            if (i10 == this.f37370n && i11 == aa1Var.f34770y) {
                return true;
            }
            if (i10 == this.f37374r && i11 == aa1Var.K) {
                return true;
            }
            if (i10 == this.f37375s && i11 == aa1Var.L) {
                return true;
            }
            if (i10 == this.f37376t && i11 == aa1Var.M) {
                return true;
            }
            if (i10 == this.f37377u && i11 == aa1Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == aa1Var.O) {
                return true;
            }
            if (i10 == this.f37378w && i11 == aa1Var.P) {
                return true;
            }
            if (i10 == this.f37371o && i11 == aa1Var.E) {
                return true;
            }
            if (i10 == this.f37372p && i11 == aa1Var.F) {
                return true;
            }
            if (i10 == this.f37373q && i11 == aa1Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f37361c.f34761c0;
    }

    @Override
    public final int e() {
        return this.f37360b;
    }

    public final void f() {
        long j3;
        int i10;
        View m10;
        SparseIntArray sparseIntArray = this.f37362e;
        sparseIntArray.clear();
        aa1 aa1Var = this.f37361c;
        this.f37360b = aa1Var.f34761c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f37360b; i12++) {
            sparseIntArray.put(i12, aa1Var.j(i12));
        }
        this.f37363f = aa1Var.f34763e;
        this.f37364g = aa1Var.h;
        this.h = aa1Var.f34766r;
        this.f37365i = aa1Var.f34767s;
        this.f37366j = aa1Var.v;
        this.f37367k = aa1Var.f34768w;
        this.f37368l = aa1Var.f34769x;
        this.f37369m = aa1Var.f34765n;
        this.f37370n = aa1Var.f34770y;
        this.f37379x = aa1Var.I;
        this.f37380y = aa1Var.J;
        this.f37371o = aa1Var.E;
        this.f37372p = aa1Var.F;
        this.f37373q = aa1Var.G;
        this.f37374r = aa1Var.K;
        this.f37375s = aa1Var.L;
        this.f37376t = aa1Var.M;
        this.f37377u = aa1Var.N;
        this.v = aa1Var.O;
        this.f37378w = aa1Var.P;
        aa1Var.E();
        s4.c0 c0Var = this.d;
        int L0 = c0Var.L0();
        int N0 = c0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (aa1Var.i(L0) != -1 && (m10 = c0Var.m(L0)) != null) {
                    j3 = aa1Var.i(L0);
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
        s4.o.c(this, true).b(aa1Var);
        if (j3 != -1) {
            while (true) {
                if (i11 < aa1Var.f34761c0) {
                    if (aa1Var.i(i11) == j3) {
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
