package org.telegram.ui;

import android.util.SparseIntArray;
import android.view.View;
public final class ba1 extends f2.q {
    public int f32808b;
    public final t91 f32809c;
    public final f2.i0 d;
    public final SparseIntArray e = new SparseIntArray();
    public int f32810f = -1;
    public int f32811g = -1;
    public int h = -1;
    public int f32812i = -1;
    public int f32813j = -1;
    public int f32814k = -1;
    public int f32815l = -1;
    public int f32816m = -1;
    public int f32817n = -1;
    public int f32818o = -1;
    public int f32819p = -1;
    public int f32820q = -1;
    public int f32821r = -1;
    public int f32822s = -1;
    public int f32823t = -1;
    public int f32824u = -1;
    public int v = -1;
    public int f32825w = -1;
    public int f32826x = -1;
    public int f32827y = -1;

    public ba1(t91 t91Var, f2.i0 i0Var) {
        this.f32809c = t91Var;
        this.d = i0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (this.e.get(i10) == this.f32809c.j(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        int i12 = sparseIntArray.get(i10);
        t91 t91Var = this.f32809c;
        if (i12 == 13 && t91Var.j(i11) == 13) {
            return true;
        }
        if (sparseIntArray.get(i10) == 10 && t91Var.j(i11) == 10) {
            return true;
        }
        int i13 = this.f32826x;
        if (i10 >= i13 && i10 <= this.f32827y) {
            if (i10 - i13 == i11 - t91Var.F) {
                return true;
            }
            return false;
        } else if (i10 == this.f32810f && i11 == t91Var.e) {
            return true;
        } else {
            if (i10 == this.f32811g && i11 == t91Var.h) {
                return true;
            }
            if (i10 == this.h && i11 == t91Var.f38434r) {
                return true;
            }
            if (i10 == this.f32812i && i11 == t91Var.f38435s) {
                return true;
            }
            if (i10 == this.f32813j && i11 == t91Var.v) {
                return true;
            }
            if (i10 == this.f32814k && i11 == t91Var.f38436w) {
                return true;
            }
            if (i10 == this.f32815l && i11 == t91Var.f38437x) {
                return true;
            }
            if (i10 == this.f32816m && i11 == t91Var.f38433n) {
                return true;
            }
            if (i10 == this.f32817n && i11 == t91Var.f38438y) {
                return true;
            }
            if (i10 == this.f32821r && i11 == t91Var.H) {
                return true;
            }
            if (i10 == this.f32822s && i11 == t91Var.I) {
                return true;
            }
            if (i10 == this.f32823t && i11 == t91Var.J) {
                return true;
            }
            if (i10 == this.f32824u && i11 == t91Var.K) {
                return true;
            }
            if (i10 == this.v && i11 == t91Var.L) {
                return true;
            }
            if (i10 == this.f32825w && i11 == t91Var.M) {
                return true;
            }
            if (i10 == this.f32818o && i11 == t91Var.B) {
                return true;
            }
            if (i10 == this.f32819p && i11 == t91Var.C) {
                return true;
            }
            if (i10 == this.f32820q && i11 == t91Var.D) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int d() {
        return this.f32809c.Z;
    }

    @Override
    public final int e() {
        return this.f32808b;
    }

    public final void f() {
        long j10;
        int i10;
        View m9;
        SparseIntArray sparseIntArray = this.e;
        sparseIntArray.clear();
        t91 t91Var = this.f32809c;
        this.f32808b = t91Var.Z;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f32808b; i12++) {
            sparseIntArray.put(i12, t91Var.j(i12));
        }
        this.f32810f = t91Var.e;
        this.f32811g = t91Var.h;
        this.h = t91Var.f38434r;
        this.f32812i = t91Var.f38435s;
        this.f32813j = t91Var.v;
        this.f32814k = t91Var.f38436w;
        this.f32815l = t91Var.f38437x;
        this.f32816m = t91Var.f38433n;
        this.f32817n = t91Var.f38438y;
        this.f32826x = t91Var.F;
        this.f32827y = t91Var.G;
        this.f32818o = t91Var.B;
        this.f32819p = t91Var.C;
        this.f32820q = t91Var.D;
        this.f32821r = t91Var.H;
        this.f32822s = t91Var.I;
        this.f32823t = t91Var.J;
        this.f32824u = t91Var.K;
        this.v = t91Var.L;
        this.f32825w = t91Var.M;
        t91Var.E();
        f2.i0 i0Var = this.d;
        int L0 = i0Var.L0();
        int N0 = i0Var.N0();
        while (true) {
            if (L0 <= N0) {
                if (t91Var.i(L0) != -1 && (m9 = i0Var.m(L0)) != null) {
                    j10 = t91Var.i(L0);
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
        f2.q.c(this, true).b(t91Var);
        if (j10 != -1) {
            while (true) {
                if (i11 < t91Var.Z) {
                    if (t91Var.i(i11) == j10) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 > 0) {
                i0Var.h1(i11, i10);
            }
        }
    }
}
