package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class ma1 extends s4.o {
    public int f35665b;
    public final ea1 f35666c;
    public final s4.c0 d;
    public final SparseIntArray e = new SparseIntArray();
    public int f35667f = -1;
    public int f35668g = -1;
    public int h = -1;
    public int f35669i = -1;
    public int f35670j = -1;
    public int f35671k = -1;
    public int f35672l = -1;
    public int f35673m = -1;
    public int f35674n = -1;
    public int f35675o = -1;
    public int f35676p = -1;
    public int f35677q = -1;
    public int f35678r = -1;
    public int f35679s = -1;
    public int f35680t = -1;
    public int f35681u = -1;
    public int v = -1;
    public int f35682w = -1;
    public int f35683x = -1;
    public int f35684y = -1;

    public ma1(ea1 ea1Var, s4.c0 c0Var) {
        this.f35666c = ea1Var;
        this.d = c0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.e.get(i10) == this.f35666c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        int i12 = sparseIntArray.get(i10);
        ea1 ea1Var = this.f35666c;
        if (i12 == 13 && ea1Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && ea1Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f35683x;
        if (i10 >= i13 && i10 <= this.f35684y) {
            if (i10 - i13 == i11 - ea1Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f35667f && i11 == ea1Var.e) {
            return true;
        } else {
            if (i10 == this.f35668g && i11 == ea1Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == ea1Var.f33253r) {
                return true;
            }
            if (i10 == this.f35669i && i11 == ea1Var.f33254s) {
                return true;
            }
            if (i10 == this.f35670j && i11 == ea1Var.v) {
                return true;
            }
            if (i10 == this.f35671k && i11 == ea1Var.f33255w) {
                return true;
            }
            if (i10 == this.f35672l && i11 == ea1Var.f33256x) {
                return true;
            }
            if (i10 == this.f35673m && i11 == ea1Var.f33252n) {
                return true;
            }
            if (i10 == this.f35674n && i11 == ea1Var.f33257y) {
                return true;
            }
            if (i10 == this.f35678r && i11 == ea1Var.K) {
                return true;
            }
            if (i10 == this.f35679s && i11 == ea1Var.L) {
                return true;
            }
            if (i10 == this.f35680t && i11 == ea1Var.M) {
                return true;
            }
            if (i10 == this.f35681u && i11 == ea1Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == ea1Var.O) {
                return true;
            }
            if (i10 == this.f35682w && i11 == ea1Var.P) {
                return true;
            }
            if (i10 == this.f35675o && i11 == ea1Var.E) {
                return true;
            }
            if (i10 == this.f35676p && i11 == ea1Var.F) {
                return true;
            }
            if (i10 == this.f35677q && i11 == ea1Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f35666c.f33249c0;
    }

    @Override
    public final int e() {
        return this.f35665b;
    }

    public final void f() {
        long j3;
        int i10;
        View m10;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        ea1 ea1Var = this.f35666c;
        this.f35665b = ea1Var.f33249c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f35665b; i12++) {
            sparseIntArray.put(i12, ea1Var.j(i12));
        }
        this.f35667f = ea1Var.e;
        this.f35668g = ea1Var.h;
        this.h = ea1Var.f33253r;
        this.f35669i = ea1Var.f33254s;
        this.f35670j = ea1Var.v;
        this.f35671k = ea1Var.f33255w;
        this.f35672l = ea1Var.f33256x;
        this.f35673m = ea1Var.f33252n;
        this.f35674n = ea1Var.f33257y;
        this.f35683x = ea1Var.I;
        this.f35684y = ea1Var.J;
        this.f35675o = ea1Var.E;
        this.f35676p = ea1Var.F;
        this.f35677q = ea1Var.G;
        this.f35678r = ea1Var.K;
        this.f35679s = ea1Var.L;
        this.f35680t = ea1Var.M;
        this.f35681u = ea1Var.N;
        this.v = ea1Var.O;
        this.f35682w = ea1Var.P;
        ea1Var.E();
        s4.c0 c0Var = this.d;
        int L0 = c0Var.L0();
        int N0 = c0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (ea1Var.i(L0) != -1 && (m10 = c0Var.m(L0)) != null) {
                    j3 = ea1Var.i(L0);
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
        s4.o.c(this, true).b(ea1Var);
        if (j3 != -1) {
            while (true) {
                if (i11 < ea1Var.f33249c0) {
                    if (ea1Var.i(i11) == j3) {
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
