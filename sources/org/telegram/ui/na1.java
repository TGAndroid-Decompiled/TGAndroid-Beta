package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class na1 extends s4.o {
    public int f35988b;
    public final fa1 f35989c;
    public final s4.c0 d;
    public final SparseIntArray e = new SparseIntArray();
    public int f35990f = -1;
    public int f35991g = -1;
    public int h = -1;
    public int f35992i = -1;
    public int f35993j = -1;
    public int f35994k = -1;
    public int f35995l = -1;
    public int f35996m = -1;
    public int f35997n = -1;
    public int f35998o = -1;
    public int f35999p = -1;
    public int f36000q = -1;
    public int f36001r = -1;
    public int f36002s = -1;
    public int f36003t = -1;
    public int f36004u = -1;
    public int v = -1;
    public int f36005w = -1;
    public int f36006x = -1;
    public int f36007y = -1;

    public na1(fa1 fa1Var, s4.c0 c0Var) {
        this.f35989c = fa1Var;
        this.d = c0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.e.get(i10) == this.f35989c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        int i12 = sparseIntArray.get(i10);
        fa1 fa1Var = this.f35989c;
        if (i12 == 13 && fa1Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && fa1Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f36006x;
        if (i10 >= i13 && i10 <= this.f36007y) {
            if (i10 - i13 == i11 - fa1Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f35990f && i11 == fa1Var.e) {
            return true;
        } else {
            if (i10 == this.f35991g && i11 == fa1Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == fa1Var.f33606r) {
                return true;
            }
            if (i10 == this.f35992i && i11 == fa1Var.f33607s) {
                return true;
            }
            if (i10 == this.f35993j && i11 == fa1Var.v) {
                return true;
            }
            if (i10 == this.f35994k && i11 == fa1Var.f33608w) {
                return true;
            }
            if (i10 == this.f35995l && i11 == fa1Var.f33609x) {
                return true;
            }
            if (i10 == this.f35996m && i11 == fa1Var.f33605n) {
                return true;
            }
            if (i10 == this.f35997n && i11 == fa1Var.f33610y) {
                return true;
            }
            if (i10 == this.f36001r && i11 == fa1Var.K) {
                return true;
            }
            if (i10 == this.f36002s && i11 == fa1Var.L) {
                return true;
            }
            if (i10 == this.f36003t && i11 == fa1Var.M) {
                return true;
            }
            if (i10 == this.f36004u && i11 == fa1Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == fa1Var.O) {
                return true;
            }
            if (i10 == this.f36005w && i11 == fa1Var.P) {
                return true;
            }
            if (i10 == this.f35998o && i11 == fa1Var.E) {
                return true;
            }
            if (i10 == this.f35999p && i11 == fa1Var.F) {
                return true;
            }
            if (i10 == this.f36000q && i11 == fa1Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f35989c.f33602c0;
    }

    @Override
    public final int e() {
        return this.f35988b;
    }

    public final void f() {
        long j3;
        int i10;
        View m10;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        fa1 fa1Var = this.f35989c;
        this.f35988b = fa1Var.f33602c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f35988b; i12++) {
            sparseIntArray.put(i12, fa1Var.j(i12));
        }
        this.f35990f = fa1Var.e;
        this.f35991g = fa1Var.h;
        this.h = fa1Var.f33606r;
        this.f35992i = fa1Var.f33607s;
        this.f35993j = fa1Var.v;
        this.f35994k = fa1Var.f33608w;
        this.f35995l = fa1Var.f33609x;
        this.f35996m = fa1Var.f33605n;
        this.f35997n = fa1Var.f33610y;
        this.f36006x = fa1Var.I;
        this.f36007y = fa1Var.J;
        this.f35998o = fa1Var.E;
        this.f35999p = fa1Var.F;
        this.f36000q = fa1Var.G;
        this.f36001r = fa1Var.K;
        this.f36002s = fa1Var.L;
        this.f36003t = fa1Var.M;
        this.f36004u = fa1Var.N;
        this.v = fa1Var.O;
        this.f36005w = fa1Var.P;
        fa1Var.E();
        s4.c0 c0Var = this.d;
        int L0 = c0Var.L0();
        int N0 = c0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (fa1Var.i(L0) != -1 && (m10 = c0Var.m(L0)) != null) {
                    j3 = fa1Var.i(L0);
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
        s4.o.c(this, true).b(fa1Var);
        if (j3 != -1) {
            while (true) {
                if (i11 < fa1Var.f33602c0) {
                    if (fa1Var.i(i11) == j3) {
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
