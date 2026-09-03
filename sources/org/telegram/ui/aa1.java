package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class aa1 extends f2.q {
    public int f35101b;
    public final s91 f35102c;
    public final f2.j0 d;
    public final SparseIntArray f35103e = new SparseIntArray();
    public int f35104f = -1;
    public int f35105g = -1;
    public int h = -1;
    public int f35106i = -1;
    public int f35107j = -1;
    public int f35108k = -1;
    public int f35109l = -1;
    public int f35110m = -1;
    public int f35111n = -1;
    public int f35112o = -1;
    public int f35113p = -1;
    public int f35114q = -1;
    public int f35115r = -1;
    public int f35116s = -1;
    public int f35117t = -1;
    public int f35118u = -1;
    public int v = -1;
    public int f35119w = -1;
    public int f35120x = -1;
    public int f35121y = -1;

    public aa1(s91 s91Var, f2.j0 j0Var) {
        this.f35102c = s91Var;
        this.d = j0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.f35103e.get(i10) == this.f35102c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.f35103e;
        int i12 = sparseIntArray.get(i10);
        s91 s91Var = this.f35102c;
        if (i12 == 13 && s91Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && s91Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f35120x;
        if (i10 >= i13 && i10 <= this.f35121y) {
            if (i10 - i13 == i11 - s91Var.F) {
                return true;
            }
            return false;
        } else if (i10 == this.f35104f && i11 == s91Var.f41072e) {
            return true;
        } else {
            if (i10 == this.f35105g && i11 == s91Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == s91Var.f41075r) {
                return true;
            }
            if (i10 == this.f35106i && i11 == s91Var.f41076s) {
                return true;
            }
            if (i10 == this.f35107j && i11 == s91Var.v) {
                return true;
            }
            if (i10 == this.f35108k && i11 == s91Var.f41077w) {
                return true;
            }
            if (i10 == this.f35109l && i11 == s91Var.f41078x) {
                return true;
            }
            if (i10 == this.f35110m && i11 == s91Var.f41074n) {
                return true;
            }
            if (i10 == this.f35111n && i11 == s91Var.f41079y) {
                return true;
            }
            if (i10 == this.f35115r && i11 == s91Var.H) {
                return true;
            }
            if (i10 == this.f35116s && i11 == s91Var.I) {
                return true;
            }
            if (i10 == this.f35117t && i11 == s91Var.J) {
                return true;
            }
            if (i10 == this.f35118u && i11 == s91Var.K) {
                return true;
            }
            if (i10 == this.v && i11 == s91Var.L) {
                return true;
            }
            if (i10 == this.f35119w && i11 == s91Var.M) {
                return true;
            }
            if (i10 == this.f35112o && i11 == s91Var.B) {
                return true;
            }
            if (i10 == this.f35113p && i11 == s91Var.C) {
                return true;
            }
            if (i10 == this.f35114q && i11 == s91Var.D) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f35102c.Z;
    }

    @Override
    public final int e() {
        return this.f35101b;
    }

    public final void f() {
        long j10;
        int i10;
        View m9;
        SparseIntArray sparseIntArray = this.f35103e;
        sparseIntArray.clear();
        s91 s91Var = this.f35102c;
        this.f35101b = s91Var.Z;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f35101b; i12++) {
            sparseIntArray.put(i12, s91Var.j(i12));
        }
        this.f35104f = s91Var.f41072e;
        this.f35105g = s91Var.h;
        this.h = s91Var.f41075r;
        this.f35106i = s91Var.f41076s;
        this.f35107j = s91Var.v;
        this.f35108k = s91Var.f41077w;
        this.f35109l = s91Var.f41078x;
        this.f35110m = s91Var.f41074n;
        this.f35111n = s91Var.f41079y;
        this.f35120x = s91Var.F;
        this.f35121y = s91Var.G;
        this.f35112o = s91Var.B;
        this.f35113p = s91Var.C;
        this.f35114q = s91Var.D;
        this.f35115r = s91Var.H;
        this.f35116s = s91Var.I;
        this.f35117t = s91Var.J;
        this.f35118u = s91Var.K;
        this.v = s91Var.L;
        this.f35119w = s91Var.M;
        s91Var.E();
        f2.j0 j0Var = this.d;
        int L0 = j0Var.L0();
        int N0 = j0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (s91Var.i(L0) != -1 && (m9 = j0Var.m(L0)) != null) {
                    j10 = s91Var.i(L0);
                    i10 = m9.getTop();
                    break;
                }
                L0++;
            } else {
                j10 = -1;
                i10 = 0;
                break;
            }
        }
        f2.q.c(this, true).b(s91Var);
        if (j10 != -1) {
            while (true) {
                if (i11 < s91Var.Z) {
                    if (s91Var.i(i11) == j10) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 > 0) {
                j0Var.h1(i11, i10);
            }
        }
    }
}
