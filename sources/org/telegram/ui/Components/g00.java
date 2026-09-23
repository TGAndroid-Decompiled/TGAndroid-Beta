package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
public final class g00 extends ll0 {
    public final Context f24124c;
    public final l00 d;

    public g00(l00 l00Var, Context context) {
        this.d = l00Var;
        this.f24124c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.d.h.size();
    }

    @Override
    public final long i(int i10) {
        return this.d.f25747k0.get(i10);
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        boolean z10;
        float f7;
        int i12;
        int i13;
        int i14;
        j00 j00Var = (j00) c1Var.f42627a;
        if (j00Var.f25089b != null) {
            i11 = j00Var.getId();
        } else {
            i11 = -1;
        }
        h00 h00Var = (h00) this.d.h.get(i10);
        j00Var.f25089b = h00Var;
        j00Var.e = i10;
        j00Var.setContentDescription(h00Var.f24469b);
        j00Var.requestLayout();
        boolean z11 = j00Var.f25103n;
        h00 h00Var2 = j00Var.f25089b;
        if (h00Var2 != null && h00Var2.f24472g) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z11 != z10) {
            z5.release(j00Var, j00Var.f25104r);
            z5.release(j00Var, j00Var.O);
            z5.release(j00Var, j00Var.Q);
            z5.release(j00Var, j00Var.S);
            if (j00Var.f25102l0) {
                int i15 = 26;
                if (j00Var.f25089b.f24472g) {
                    i12 = 26;
                } else {
                    i12 = 0;
                }
                j00Var.f25104r = z5.update(i12, j00Var, j00Var.f25104r, j00Var.f25105s);
                if (j00Var.f25089b.f24472g) {
                    i13 = 26;
                } else {
                    i13 = 0;
                }
                j00Var.O = z5.update(i13, j00Var, j00Var.O, j00Var.P);
                if (j00Var.f25089b.f24472g) {
                    i14 = 26;
                } else {
                    i14 = 0;
                }
                j00Var.Q = z5.update(i14, j00Var, j00Var.Q, j00Var.R);
                if (!j00Var.f25089b.f24472g) {
                    i15 = 0;
                }
                j00Var.S = z5.update(i15, j00Var, j00Var.S, j00Var.T);
            }
            j00Var.f25103n = j00Var.f25089b.f24472g;
        }
        if (i11 != j00Var.getId()) {
            if (j00Var.f25089b.f24471f) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            j00Var.f25101k0 = f7;
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new j00(this.d, this.f24124c));
    }
}
