package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class fa1 extends s4.o {
    public int f33679b;
    public final x91 f33680c;
    public final s4.c0 d;
    public final SparseIntArray e = new SparseIntArray();
    public int f33681f = -1;
    public int f33682g = -1;
    public int h = -1;
    public int f33683i = -1;
    public int f33684j = -1;
    public int f33685k = -1;
    public int f33686l = -1;
    public int f33687m = -1;
    public int f33688n = -1;
    public int f33689o = -1;
    public int f33690p = -1;
    public int f33691q = -1;
    public int f33692r = -1;
    public int f33693s = -1;
    public int f33694t = -1;
    public int f33695u = -1;
    public int v = -1;
    public int f33696w = -1;
    public int f33697x = -1;
    public int f33698y = -1;

    public fa1(x91 x91Var, s4.c0 c0Var) {
        this.f33680c = x91Var;
        this.d = c0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.e.get(i10) == this.f33680c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        int i12 = sparseIntArray.get(i10);
        x91 x91Var = this.f33680c;
        if (i12 == 13 && x91Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && x91Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f33697x;
        if (i10 >= i13 && i10 <= this.f33698y) {
            if (i10 - i13 == i11 - x91Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f33681f && i11 == x91Var.e) {
            return true;
        } else {
            if (i10 == this.f33682g && i11 == x91Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == x91Var.f39986r) {
                return true;
            }
            if (i10 == this.f33683i && i11 == x91Var.f39987s) {
                return true;
            }
            if (i10 == this.f33684j && i11 == x91Var.v) {
                return true;
            }
            if (i10 == this.f33685k && i11 == x91Var.f39988w) {
                return true;
            }
            if (i10 == this.f33686l && i11 == x91Var.f39989x) {
                return true;
            }
            if (i10 == this.f33687m && i11 == x91Var.f39985n) {
                return true;
            }
            if (i10 == this.f33688n && i11 == x91Var.f39990y) {
                return true;
            }
            if (i10 == this.f33692r && i11 == x91Var.K) {
                return true;
            }
            if (i10 == this.f33693s && i11 == x91Var.L) {
                return true;
            }
            if (i10 == this.f33694t && i11 == x91Var.M) {
                return true;
            }
            if (i10 == this.f33695u && i11 == x91Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == x91Var.O) {
                return true;
            }
            if (i10 == this.f33696w && i11 == x91Var.P) {
                return true;
            }
            if (i10 == this.f33689o && i11 == x91Var.E) {
                return true;
            }
            if (i10 == this.f33690p && i11 == x91Var.F) {
                return true;
            }
            if (i10 == this.f33691q && i11 == x91Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f33680c.f39982c0;
    }

    @Override
    public final int e() {
        return this.f33679b;
    }

    public final void f() {
        long j3;
        int i10;
        View m10;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        x91 x91Var = this.f33680c;
        this.f33679b = x91Var.f39982c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f33679b; i12++) {
            sparseIntArray.put(i12, x91Var.j(i12));
        }
        this.f33681f = x91Var.e;
        this.f33682g = x91Var.h;
        this.h = x91Var.f39986r;
        this.f33683i = x91Var.f39987s;
        this.f33684j = x91Var.v;
        this.f33685k = x91Var.f39988w;
        this.f33686l = x91Var.f39989x;
        this.f33687m = x91Var.f39985n;
        this.f33688n = x91Var.f39990y;
        this.f33697x = x91Var.I;
        this.f33698y = x91Var.J;
        this.f33689o = x91Var.E;
        this.f33690p = x91Var.F;
        this.f33691q = x91Var.G;
        this.f33692r = x91Var.K;
        this.f33693s = x91Var.L;
        this.f33694t = x91Var.M;
        this.f33695u = x91Var.N;
        this.v = x91Var.O;
        this.f33696w = x91Var.P;
        x91Var.E();
        s4.c0 c0Var = this.d;
        int L0 = c0Var.L0();
        int N0 = c0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (x91Var.i(L0) != -1 && (m10 = c0Var.m(L0)) != null) {
                    j3 = x91Var.i(L0);
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
        s4.o.c(this, true).b(x91Var);
        if (j3 != -1) {
            while (true) {
                if (i11 < x91Var.f39982c0) {
                    if (x91Var.i(i11) == j3) {
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
