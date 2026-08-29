package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
public final class b00 extends il0 {
    public final Context f26929c;
    public final f00 d;

    public b00(f00 f00Var, Context context) {
        this.d = f00Var;
        this.f26929c = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.d.h.size();
    }

    @Override
    public final long i(int i10) {
        return this.d.f28237g0.get(i10);
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        boolean z10;
        float f9;
        int i12;
        int i13;
        int i14;
        d00 d00Var = (d00) n1Var.f6432a;
        if (d00Var.f27608b != null) {
            i11 = d00Var.getId();
        } else {
            i11 = -1;
        }
        c00 c00Var = (c00) this.d.h.get(i10);
        d00Var.f27608b = c00Var;
        d00Var.f27613e = i10;
        d00Var.setContentDescription(c00Var.f27252b);
        d00Var.requestLayout();
        boolean z11 = d00Var.f27620n;
        c00 c00Var2 = d00Var.f27608b;
        if (c00Var2 != null && c00Var2.f27256g) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z11 != z10) {
            y5.release(d00Var, d00Var.f27621r);
            y5.release(d00Var, d00Var.K);
            y5.release(d00Var, d00Var.M);
            y5.release(d00Var, d00Var.O);
            if (d00Var.f27618h0) {
                int i15 = 26;
                if (d00Var.f27608b.f27256g) {
                    i12 = 26;
                } else {
                    i12 = 0;
                }
                d00Var.f27621r = y5.update(i12, d00Var, d00Var.f27621r, d00Var.f27622s);
                if (d00Var.f27608b.f27256g) {
                    i13 = 26;
                } else {
                    i13 = 0;
                }
                d00Var.K = y5.update(i13, d00Var, d00Var.K, d00Var.L);
                if (d00Var.f27608b.f27256g) {
                    i14 = 26;
                } else {
                    i14 = 0;
                }
                d00Var.M = y5.update(i14, d00Var, d00Var.M, d00Var.N);
                if (!d00Var.f27608b.f27256g) {
                    i15 = 0;
                }
                d00Var.O = y5.update(i15, d00Var, d00Var.O, d00Var.P);
            }
            d00Var.f27620n = d00Var.f27608b.f27256g;
        }
        if (i11 != d00Var.getId()) {
            if (d00Var.f27608b.f27255f) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            d00Var.f27617g0 = f9;
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        return new f2.n1(new d00(this.d, this.f26929c));
    }
}
