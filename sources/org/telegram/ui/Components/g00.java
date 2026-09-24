package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
public final class g00 extends vl0 {
    public final Context f24306c;
    public final l00 d;

    public g00(l00 l00Var, Context context) {
        this.d = l00Var;
        this.f24306c = context;
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
        return this.d.f25941k0.get(i10);
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
        j00 j00Var = (j00) c1Var.f42946a;
        if (j00Var.f25184b != null) {
            i11 = j00Var.getId();
        } else {
            i11 = -1;
        }
        h00 h00Var = (h00) this.d.h.get(i10);
        j00Var.f25184b = h00Var;
        j00Var.e = i10;
        j00Var.setContentDescription(h00Var.f24578b);
        j00Var.requestLayout();
        boolean z11 = j00Var.f25198n;
        h00 h00Var2 = j00Var.f25184b;
        if (h00Var2 != null && h00Var2.f24581g) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z11 != z10) {
            z5.release(j00Var, j00Var.f25199r);
            z5.release(j00Var, j00Var.O);
            z5.release(j00Var, j00Var.Q);
            z5.release(j00Var, j00Var.S);
            if (j00Var.f25197l0) {
                int i15 = 26;
                if (j00Var.f25184b.f24581g) {
                    i12 = 26;
                } else {
                    i12 = 0;
                }
                j00Var.f25199r = z5.update(i12, j00Var, j00Var.f25199r, j00Var.f25200s);
                if (j00Var.f25184b.f24581g) {
                    i13 = 26;
                } else {
                    i13 = 0;
                }
                j00Var.O = z5.update(i13, j00Var, j00Var.O, j00Var.P);
                if (j00Var.f25184b.f24581g) {
                    i14 = 26;
                } else {
                    i14 = 0;
                }
                j00Var.Q = z5.update(i14, j00Var, j00Var.Q, j00Var.R);
                if (!j00Var.f25184b.f24581g) {
                    i15 = 0;
                }
                j00Var.S = z5.update(i15, j00Var, j00Var.S, j00Var.T);
            }
            j00Var.f25198n = j00Var.f25184b.f24581g;
        }
        if (i11 != j00Var.getId()) {
            if (j00Var.f25184b.f24580f) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            j00Var.f25196k0 = f7;
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new j00(this.d, this.f24306c));
    }
}
