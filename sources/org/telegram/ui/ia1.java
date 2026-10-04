package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class ia1 extends s4.o {
    public int f37365b;
    public final aa1 f37366c;
    public final s4.c0 d;
    public final SparseIntArray f37367e = new SparseIntArray();
    public int f37368f = -1;
    public int f37369g = -1;
    public int h = -1;
    public int f37370i = -1;
    public int f37371j = -1;
    public int f37372k = -1;
    public int f37373l = -1;
    public int f37374m = -1;
    public int f37375n = -1;
    public int f37376o = -1;
    public int f37377p = -1;
    public int f37378q = -1;
    public int f37379r = -1;
    public int f37380s = -1;
    public int f37381t = -1;
    public int f37382u = -1;
    public int v = -1;
    public int f37383w = -1;
    public int f37384x = -1;
    public int f37385y = -1;

    public ia1(aa1 aa1Var, s4.c0 c0Var) {
        this.f37366c = aa1Var;
        this.d = c0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.f37367e.get(i10) == this.f37366c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.f37367e;
        int i12 = sparseIntArray.get(i10);
        aa1 aa1Var = this.f37366c;
        if (i12 == 13 && aa1Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && aa1Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f37384x;
        if (i10 >= i13 && i10 <= this.f37385y) {
            if (i10 - i13 == i11 - aa1Var.I) {
                return true;
            }
            return false;
        } else if (i10 == this.f37368f && i11 == aa1Var.f34768e) {
            return true;
        } else {
            if (i10 == this.f37369g && i11 == aa1Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == aa1Var.f34771r) {
                return true;
            }
            if (i10 == this.f37370i && i11 == aa1Var.f34772s) {
                return true;
            }
            if (i10 == this.f37371j && i11 == aa1Var.v) {
                return true;
            }
            if (i10 == this.f37372k && i11 == aa1Var.f34773w) {
                return true;
            }
            if (i10 == this.f37373l && i11 == aa1Var.f34774x) {
                return true;
            }
            if (i10 == this.f37374m && i11 == aa1Var.f34770n) {
                return true;
            }
            if (i10 == this.f37375n && i11 == aa1Var.f34775y) {
                return true;
            }
            if (i10 == this.f37379r && i11 == aa1Var.K) {
                return true;
            }
            if (i10 == this.f37380s && i11 == aa1Var.L) {
                return true;
            }
            if (i10 == this.f37381t && i11 == aa1Var.M) {
                return true;
            }
            if (i10 == this.f37382u && i11 == aa1Var.N) {
                return true;
            }
            if (i10 == this.v && i11 == aa1Var.O) {
                return true;
            }
            if (i10 == this.f37383w && i11 == aa1Var.P) {
                return true;
            }
            if (i10 == this.f37376o && i11 == aa1Var.E) {
                return true;
            }
            if (i10 == this.f37377p && i11 == aa1Var.F) {
                return true;
            }
            if (i10 == this.f37378q && i11 == aa1Var.G) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f37366c.f34766c0;
    }

    @Override
    public final int e() {
        return this.f37365b;
    }

    public final void f() {
        long j3;
        int i10;
        View m10;
        SparseIntArray sparseIntArray = this.f37367e;
        sparseIntArray.clear();
        aa1 aa1Var = this.f37366c;
        this.f37365b = aa1Var.f34766c0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f37365b; i12++) {
            sparseIntArray.put(i12, aa1Var.j(i12));
        }
        this.f37368f = aa1Var.f34768e;
        this.f37369g = aa1Var.h;
        this.h = aa1Var.f34771r;
        this.f37370i = aa1Var.f34772s;
        this.f37371j = aa1Var.v;
        this.f37372k = aa1Var.f34773w;
        this.f37373l = aa1Var.f34774x;
        this.f37374m = aa1Var.f34770n;
        this.f37375n = aa1Var.f34775y;
        this.f37384x = aa1Var.I;
        this.f37385y = aa1Var.J;
        this.f37376o = aa1Var.E;
        this.f37377p = aa1Var.F;
        this.f37378q = aa1Var.G;
        this.f37379r = aa1Var.K;
        this.f37380s = aa1Var.L;
        this.f37381t = aa1Var.M;
        this.f37382u = aa1Var.N;
        this.v = aa1Var.O;
        this.f37383w = aa1Var.P;
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
                if (i11 < aa1Var.f34766c0) {
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
