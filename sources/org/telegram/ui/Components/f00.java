package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
public final class f00 extends rl0 {
    public final Context f24735c;
    public final j00 d;

    public f00(j00 j00Var, Context context) {
        this.d = j00Var;
        this.f24735c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.d.h.size();
    }

    @Override
    public final long i(int i10) {
        return this.d.f25825h0.get(i10);
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        boolean z4;
        float f10;
        int i12;
        int i13;
        int i14;
        h00 h00Var = (h00) l1Var.f5785a;
        if (h00Var.f25286b != null) {
            i11 = h00Var.getId();
        } else {
            i11 = -1;
        }
        g00 g00Var = (g00) this.d.h.get(i10);
        h00Var.f25286b = g00Var;
        h00Var.e = i10;
        h00Var.setContentDescription(g00Var.f25006b);
        h00Var.requestLayout();
        boolean z10 = h00Var.f25298n;
        g00 g00Var2 = h00Var.f25286b;
        if (g00Var2 != null && g00Var2.f25009g) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z10 != z4) {
            u5.release(h00Var, h00Var.f25299r);
            u5.release(h00Var, h00Var.L);
            u5.release(h00Var, h00Var.N);
            u5.release(h00Var, h00Var.P);
            if (h00Var.f25296i0) {
                int i15 = 26;
                if (h00Var.f25286b.f25009g) {
                    i12 = 26;
                } else {
                    i12 = 0;
                }
                h00Var.f25299r = u5.update(i12, h00Var, h00Var.f25299r, h00Var.f25300s);
                if (h00Var.f25286b.f25009g) {
                    i13 = 26;
                } else {
                    i13 = 0;
                }
                h00Var.L = u5.update(i13, h00Var, h00Var.L, h00Var.M);
                if (h00Var.f25286b.f25009g) {
                    i14 = 26;
                } else {
                    i14 = 0;
                }
                h00Var.N = u5.update(i14, h00Var, h00Var.N, h00Var.O);
                if (!h00Var.f25286b.f25009g) {
                    i15 = 0;
                }
                h00Var.P = u5.update(i15, h00Var, h00Var.P, h00Var.Q);
            }
            h00Var.f25298n = h00Var.f25286b.f25009g;
        }
        if (i11 != h00Var.getId()) {
            if (h00Var.f25286b.f25008f) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            h00Var.f25295h0 = f10;
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        return new f2.l1(new h00(this.d, this.f24735c));
    }
}
