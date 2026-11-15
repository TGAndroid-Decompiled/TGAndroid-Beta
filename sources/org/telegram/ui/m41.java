package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class m41 extends v4.o {
    public int f49103b;
    public final e41 f49104c;
    public final v4.b0 d;
    public final SparseIntArray f49105e = new SparseIntArray();
    public int f49106f = -1;
    public int f49107g = -1;
    public int h = -1;
    public int f49108i = -1;
    public int f49109j = -1;
    public int f49110k = -1;
    public int f49111l = -1;
    public int f49112m = -1;
    public int f49113n = -1;
    public int f49114o = -1;
    public int f49115p = -1;
    public int f49116q = -1;
    public int f49117r = -1;
    public int f49118s = -1;
    public int f49119t = -1;
    public int f49120u = -1;
    public int v = -1;
    public int f49121w = -1;
    public int f49122x = -1;
    public int f49123y = -1;

    public m41(e41 e41Var, v4.b0 b0Var) {
        this.f49104c = e41Var;
        this.d = b0Var;
    }

    @Override
    public final boolean a(int i7, int i10) {
        if (this.f49105e.get(i7) == this.f49104c.d(i10)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i7, int i10) {
        SparseIntArray sparseIntArray = this.f49105e;
        int i11 = sparseIntArray.get(i7);
        e41 e41Var = this.f49104c;
        if (i11 == 13 && e41Var.d(i10) == 13) {
            return true;
        }
        if (sparseIntArray.get(i7) == 10 && e41Var.d(i10) == 10) {
            return true;
        }
        int i12 = this.f49122x;
        if (i7 >= i12 && i7 <= this.f49123y) {
            if (i7 - i12 == i10 - e41Var.J) {
                return true;
            }
            return false;
        } else if (i7 == this.f49106f && i10 == e41Var.f46544e) {
            return true;
        } else {
            if (i7 == this.f49107g && i10 == e41Var.h) {
                return true;
            }
            if (i7 == this.h && i10 == e41Var.f46548r) {
                return true;
            }
            if (i7 == this.f49108i && i10 == e41Var.f46549s) {
                return true;
            }
            if (i7 == this.f49109j && i10 == e41Var.f46550w) {
                return true;
            }
            if (i7 == this.f49110k && i10 == e41Var.f46551x) {
                return true;
            }
            if (i7 == this.f49111l && i10 == e41Var.f46552y) {
                return true;
            }
            if (i7 == this.f49112m && i10 == e41Var.f46547n) {
                return true;
            }
            if (i7 == this.f49113n && i10 == e41Var.E) {
                return true;
            }
            if (i7 == this.f49117r && i10 == e41Var.L) {
                return true;
            }
            if (i7 == this.f49118s && i10 == e41Var.M) {
                return true;
            }
            if (i7 == this.f49119t && i10 == e41Var.N) {
                return true;
            }
            if (i7 == this.f49120u && i10 == e41Var.O) {
                return true;
            }
            if (i7 == this.v && i10 == e41Var.P) {
                return true;
            }
            if (i7 == this.f49121w && i10 == e41Var.Q) {
                return true;
            }
            if (i7 == this.f49114o && i10 == e41Var.F) {
                return true;
            }
            if (i7 == this.f49115p && i10 == e41Var.G) {
                return true;
            }
            if (i7 == this.f49116q && i10 == e41Var.H) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f49104c.f46543d0;
    }

    @Override
    public final int e() {
        return this.f49103b;
    }

    public final void f() {
        int i7;
        long j3;
        View m10;
        SparseIntArray sparseIntArray = this.f49105e;
        sparseIntArray.clear();
        e41 e41Var = this.f49104c;
        this.f49103b = e41Var.f46543d0;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f49103b; i11++) {
            sparseIntArray.put(i11, e41Var.d(i11));
        }
        this.f49106f = e41Var.f46544e;
        this.f49107g = e41Var.h;
        this.h = e41Var.f46548r;
        this.f49108i = e41Var.f46549s;
        this.f49109j = e41Var.f46550w;
        this.f49110k = e41Var.f46551x;
        this.f49111l = e41Var.f46552y;
        this.f49112m = e41Var.f46547n;
        this.f49113n = e41Var.E;
        this.f49122x = e41Var.J;
        this.f49123y = e41Var.K;
        this.f49114o = e41Var.F;
        this.f49115p = e41Var.G;
        this.f49116q = e41Var.H;
        this.f49117r = e41Var.L;
        this.f49118s = e41Var.M;
        this.f49119t = e41Var.N;
        this.f49120u = e41Var.O;
        this.v = e41Var.P;
        this.f49121w = e41Var.Q;
        e41Var.E();
        v4.b0 b0Var = this.d;
        int L0 = b0Var.L0();
        int N0 = b0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (e41Var.c(L0) != -1 && (m10 = b0Var.m(L0)) != null) {
                    j3 = e41Var.c(L0);
                    i7 = m10.getTop();
                    break;
                }
                L0++;
            } else {
                i7 = 0;
                j3 = -1;
                break;
            }
        }
        v4.o.c(this, true).c(e41Var);
        if (j3 != -1) {
            while (true) {
                if (i10 < e41Var.f46543d0) {
                    if (e41Var.c(i10) == j3) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 > 0) {
                b0Var.h1(i10, i7);
            }
        }
    }
}
