package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class f61 extends s4.n {
    public int f37007b;
    public final x51 f37008c;
    public final s4.a0 d;
    public final SparseIntArray e = new SparseIntArray();
    public int f37009f = -1;
    public int f37010g = -1;
    public int h = -1;
    public int f37011i = -1;
    public int f37012j = -1;
    public int f37013k = -1;
    public int f37014l = -1;
    public int f37015m = -1;
    public int f37016n = -1;
    public int f37017o = -1;
    public int f37018p = -1;
    public int f37019q = -1;
    public int f37020r = -1;
    public int f37021s = -1;
    public int f37022t = -1;
    public int f37023u = -1;
    public int v = -1;
    public int f37024w = -1;
    public int f37025x = -1;
    public int f37026y = -1;

    public f61(x51 x51Var, s4.a0 a0Var) {
        this.f37008c = x51Var;
        this.d = a0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.e.get(i10) == this.f37008c.d(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        int i12 = sparseIntArray.get(i10);
        x51 x51Var = this.f37008c;
        if (i12 == 13 && x51Var.d(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && x51Var.d(i11) == 10) {
            return true;
        }
        int i13 = this.f37025x;
        if (i10 >= i13 && i10 <= this.f37026y) {
            if (i10 - i13 == i11 - x51Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f37009f && i11 == x51Var.e) {
            return true;
        } else {
            if (i10 == this.f37010g && i11 == x51Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == x51Var.f43254r) {
                return true;
            }
            if (i10 == this.f37011i && i11 == x51Var.f43255s) {
                return true;
            }
            if (i10 == this.f37012j && i11 == x51Var.f43256w) {
                return true;
            }
            if (i10 == this.f37013k && i11 == x51Var.f43257x) {
                return true;
            }
            if (i10 == this.f37014l && i11 == x51Var.f43258y) {
                return true;
            }
            if (i10 == this.f37015m && i11 == x51Var.f43253n) {
                return true;
            }
            if (i10 == this.f37016n && i11 == x51Var.D) {
                return true;
            }
            if (i10 == this.f37020r && i11 == x51Var.K) {
                return true;
            }
            if (i10 == this.f37021s && i11 == x51Var.L) {
                return true;
            }
            if (i10 == this.f37022t && i11 == x51Var.M) {
                return true;
            }
            if (i10 == this.f37023u && i11 == x51Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == x51Var.O) {
                return true;
            }
            if (i10 == this.f37024w && i11 == x51Var.P) {
                return true;
            }
            if (i10 == this.f37017o && i11 == x51Var.E) {
                return true;
            }
            if (i10 == this.f37018p && i11 == x51Var.F) {
                return true;
            }
            if (i10 == this.f37019q && i11 == x51Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f37008c.f43250c0;
    }

    @Override
    public final int e() {
        return this.f37007b;
    }

    public final void f() {
        int i10;
        long j10;
        View m10;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        x51 x51Var = this.f37008c;
        this.f37007b = x51Var.f43250c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f37007b; i12++) {
            sparseIntArray.put(i12, x51Var.d(i12));
        }
        this.f37009f = x51Var.e;
        this.f37010g = x51Var.h;
        this.h = x51Var.f43254r;
        this.f37011i = x51Var.f43255s;
        this.f37012j = x51Var.f43256w;
        this.f37013k = x51Var.f43257x;
        this.f37014l = x51Var.f43258y;
        this.f37015m = x51Var.f43253n;
        this.f37016n = x51Var.D;
        this.f37025x = x51Var.I;
        this.f37026y = x51Var.J;
        this.f37017o = x51Var.E;
        this.f37018p = x51Var.F;
        this.f37019q = x51Var.G;
        this.f37020r = x51Var.K;
        this.f37021s = x51Var.L;
        this.f37022t = x51Var.M;
        this.f37023u = x51Var.N;
        this.v = x51Var.O;
        this.f37024w = x51Var.P;
        x51Var.E();
        s4.a0 a0Var = this.d;
        int L0 = a0Var.L0();
        int N0 = a0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (x51Var.c(L0) != -1 && (m10 = a0Var.m(L0)) != null) {
                    j10 = x51Var.c(L0);
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
        s4.n.c(this, true).c(x51Var);
        if (j10 != -1) {
            while (true) {
                if (i11 < x51Var.f43250c0) {
                    if (x51Var.c(i11) == j10) {
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
