package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class h61 extends s4.n {
    public int f37766b;
    public final z51 f37767c;
    public final s4.a0 d;
    public final SparseIntArray e = new SparseIntArray();
    public int f37768f = -1;
    public int f37769g = -1;
    public int h = -1;
    public int f37770i = -1;
    public int f37771j = -1;
    public int f37772k = -1;
    public int f37773l = -1;
    public int f37774m = -1;
    public int f37775n = -1;
    public int f37776o = -1;
    public int f37777p = -1;
    public int f37778q = -1;
    public int f37779r = -1;
    public int f37780s = -1;
    public int f37781t = -1;
    public int f37782u = -1;
    public int v = -1;
    public int f37783w = -1;
    public int f37784x = -1;
    public int f37785y = -1;

    public h61(z51 z51Var, s4.a0 a0Var) {
        this.f37767c = z51Var;
        this.d = a0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.e.get(i10) == this.f37767c.d(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        int i12 = sparseIntArray.get(i10);
        z51 z51Var = this.f37767c;
        if (i12 == 13 && z51Var.d(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && z51Var.d(i11) == 10) {
            return true;
        }
        int i13 = this.f37784x;
        if (i10 >= i13 && i10 <= this.f37785y) {
            if (i10 - i13 == i11 - z51Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f37768f && i11 == z51Var.e) {
            return true;
        } else {
            if (i10 == this.f37769g && i11 == z51Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == z51Var.f44028r) {
                return true;
            }
            if (i10 == this.f37770i && i11 == z51Var.f44029s) {
                return true;
            }
            if (i10 == this.f37771j && i11 == z51Var.f44030w) {
                return true;
            }
            if (i10 == this.f37772k && i11 == z51Var.f44031x) {
                return true;
            }
            if (i10 == this.f37773l && i11 == z51Var.f44032y) {
                return true;
            }
            if (i10 == this.f37774m && i11 == z51Var.f44027n) {
                return true;
            }
            if (i10 == this.f37775n && i11 == z51Var.D) {
                return true;
            }
            if (i10 == this.f37779r && i11 == z51Var.K) {
                return true;
            }
            if (i10 == this.f37780s && i11 == z51Var.L) {
                return true;
            }
            if (i10 == this.f37781t && i11 == z51Var.M) {
                return true;
            }
            if (i10 == this.f37782u && i11 == z51Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == z51Var.O) {
                return true;
            }
            if (i10 == this.f37783w && i11 == z51Var.P) {
                return true;
            }
            if (i10 == this.f37776o && i11 == z51Var.E) {
                return true;
            }
            if (i10 == this.f37777p && i11 == z51Var.F) {
                return true;
            }
            if (i10 == this.f37778q && i11 == z51Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f37767c.f44024c0;
    }

    @Override
    public final int e() {
        return this.f37766b;
    }

    public final void f() {
        int i10;
        long j10;
        View m10;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        z51 z51Var = this.f37767c;
        this.f37766b = z51Var.f44024c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f37766b; i12++) {
            sparseIntArray.put(i12, z51Var.d(i12));
        }
        this.f37768f = z51Var.e;
        this.f37769g = z51Var.h;
        this.h = z51Var.f44028r;
        this.f37770i = z51Var.f44029s;
        this.f37771j = z51Var.f44030w;
        this.f37772k = z51Var.f44031x;
        this.f37773l = z51Var.f44032y;
        this.f37774m = z51Var.f44027n;
        this.f37775n = z51Var.D;
        this.f37784x = z51Var.I;
        this.f37785y = z51Var.J;
        this.f37776o = z51Var.E;
        this.f37777p = z51Var.F;
        this.f37778q = z51Var.G;
        this.f37779r = z51Var.K;
        this.f37780s = z51Var.L;
        this.f37781t = z51Var.M;
        this.f37782u = z51Var.N;
        this.v = z51Var.O;
        this.f37783w = z51Var.P;
        z51Var.E();
        s4.a0 a0Var = this.d;
        int L0 = a0Var.L0();
        int N0 = a0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (z51Var.c(L0) != -1 && (m10 = a0Var.m(L0)) != null) {
                    j10 = z51Var.c(L0);
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
        s4.n.c(this, true).c(z51Var);
        if (j10 != -1) {
            while (true) {
                if (i11 < z51Var.f44024c0) {
                    if (z51Var.c(i11) == j10) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 > 0) {
                a0Var.h1(i11, i10);
            }
        }
    }
}
