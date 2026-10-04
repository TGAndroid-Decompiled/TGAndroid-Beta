package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class ia1 extends s4.o {
    public int f37359b;
    public final aa1 f37360c;
    public final s4.c0 d;
    public final SparseIntArray f37361e = new SparseIntArray();
    public int f37362f = -1;
    public int f37363g = -1;
    public int h = -1;
    public int f37364i = -1;
    public int f37365j = -1;
    public int f37366k = -1;
    public int f37367l = -1;
    public int f37368m = -1;
    public int f37369n = -1;
    public int f37370o = -1;
    public int f37371p = -1;
    public int f37372q = -1;
    public int f37373r = -1;
    public int f37374s = -1;
    public int f37375t = -1;
    public int f37376u = -1;
    public int v = -1;
    public int f37377w = -1;
    public int f37378x = -1;
    public int f37379y = -1;

    public ia1(aa1 aa1Var, s4.c0 c0Var) {
        this.f37360c = aa1Var;
        this.d = c0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.f37361e.get(i10) == this.f37360c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.f37361e;
        int i12 = sparseIntArray.get(i10);
        aa1 aa1Var = this.f37360c;
        if (i12 == 13 && aa1Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && aa1Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f37378x;
        if (i10 >= i13 && i10 <= this.f37379y) {
            if (i10 - i13 == i11 - aa1Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f37362f && i11 == aa1Var.f34762e) {
            return true;
        } else {
            if (i10 == this.f37363g && i11 == aa1Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == aa1Var.f34765r) {
                return true;
            }
            if (i10 == this.f37364i && i11 == aa1Var.f34766s) {
                return true;
            }
            if (i10 == this.f37365j && i11 == aa1Var.v) {
                return true;
            }
            if (i10 == this.f37366k && i11 == aa1Var.f34767w) {
                return true;
            }
            if (i10 == this.f37367l && i11 == aa1Var.f34768x) {
                return true;
            }
            if (i10 == this.f37368m && i11 == aa1Var.f34764n) {
                return true;
            }
            if (i10 == this.f37369n && i11 == aa1Var.f34769y) {
                return true;
            }
            if (i10 == this.f37373r && i11 == aa1Var.K) {
                return true;
            }
            if (i10 == this.f37374s && i11 == aa1Var.L) {
                return true;
            }
            if (i10 == this.f37375t && i11 == aa1Var.M) {
                return true;
            }
            if (i10 == this.f37376u && i11 == aa1Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == aa1Var.O) {
                return true;
            }
            if (i10 == this.f37377w && i11 == aa1Var.P) {
                return true;
            }
            if (i10 == this.f37370o && i11 == aa1Var.E) {
                return true;
            }
            if (i10 == this.f37371p && i11 == aa1Var.F) {
                return true;
            }
            if (i10 == this.f37372q && i11 == aa1Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f37360c.f34760c0;
    }

    @Override
    public final int e() {
        return this.f37359b;
    }

    public final void f() {
        long j3;
        int i10;
        View m10;
        SparseIntArray sparseIntArray = this.f37361e;
        sparseIntArray.clear();
        aa1 aa1Var = this.f37360c;
        this.f37359b = aa1Var.f34760c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f37359b; i12++) {
            sparseIntArray.put(i12, aa1Var.j(i12));
        }
        this.f37362f = aa1Var.f34762e;
        this.f37363g = aa1Var.h;
        this.h = aa1Var.f34765r;
        this.f37364i = aa1Var.f34766s;
        this.f37365j = aa1Var.v;
        this.f37366k = aa1Var.f34767w;
        this.f37367l = aa1Var.f34768x;
        this.f37368m = aa1Var.f34764n;
        this.f37369n = aa1Var.f34769y;
        this.f37378x = aa1Var.I;
        this.f37379y = aa1Var.J;
        this.f37370o = aa1Var.E;
        this.f37371p = aa1Var.F;
        this.f37372q = aa1Var.G;
        this.f37373r = aa1Var.K;
        this.f37374s = aa1Var.L;
        this.f37375t = aa1Var.M;
        this.f37376u = aa1Var.N;
        this.v = aa1Var.O;
        this.f37377w = aa1Var.P;
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
                if (i11 < aa1Var.f34760c0) {
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
