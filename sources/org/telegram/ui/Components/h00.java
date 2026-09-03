package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
public final class h00 extends rl0 {
    public final Context f27324c;
    public final l00 d;

    public h00(l00 l00Var, Context context) {
        this.d = l00Var;
        this.f27324c = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.d.h.size();
    }

    @Override
    public final long i(int i10) {
        return this.d.f28547h0.get(i10);
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        int i11;
        boolean z4;
        float f10;
        int i12;
        int i13;
        int i14;
        j00 j00Var = (j00) m1Var.f5875a;
        if (j00Var.f27930b != null) {
            i11 = j00Var.getId();
        } else {
            i11 = -1;
        }
        i00 i00Var = (i00) this.d.h.get(i10);
        j00Var.f27930b = i00Var;
        j00Var.f27935e = i10;
        j00Var.setContentDescription(i00Var.f27677b);
        j00Var.requestLayout();
        boolean z10 = j00Var.f27943n;
        i00 i00Var2 = j00Var.f27930b;
        if (i00Var2 != null && i00Var2.f27681g) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z10 != z4) {
            u5.release(j00Var, j00Var.f27944r);
            u5.release(j00Var, j00Var.L);
            u5.release(j00Var, j00Var.N);
            u5.release(j00Var, j00Var.P);
            if (j00Var.f27941i0) {
                int i15 = 26;
                if (j00Var.f27930b.f27681g) {
                    i12 = 26;
                } else {
                    i12 = 0;
                }
                j00Var.f27944r = u5.update(i12, j00Var, j00Var.f27944r, j00Var.f27945s);
                if (j00Var.f27930b.f27681g) {
                    i13 = 26;
                } else {
                    i13 = 0;
                }
                j00Var.L = u5.update(i13, j00Var, j00Var.L, j00Var.M);
                if (j00Var.f27930b.f27681g) {
                    i14 = 26;
                } else {
                    i14 = 0;
                }
                j00Var.N = u5.update(i14, j00Var, j00Var.N, j00Var.O);
                if (!j00Var.f27930b.f27681g) {
                    i15 = 0;
                }
                j00Var.P = u5.update(i15, j00Var, j00Var.P, j00Var.Q);
            }
            j00Var.f27943n = j00Var.f27930b.f27681g;
        }
        if (i11 != j00Var.getId()) {
            if (j00Var.f27930b.f27680f) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            j00Var.f27940h0 = f10;
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        return new f2.m1(new j00(this.d, this.f27324c));
    }
}
