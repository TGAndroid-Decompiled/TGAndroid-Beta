package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
public final class i00 extends yl0 {
    public final Context f27350c;
    public final n00 d;

    public i00(n00 n00Var, Context context) {
        this.d = n00Var;
        this.f27350c = context;
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
        return this.d.f28889k0.get(i10);
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
        l00 l00Var = (l00) c1Var.f46538a;
        if (l00Var.f28314b != null) {
            i11 = l00Var.getId();
        } else {
            i11 = -1;
        }
        j00 j00Var = (j00) this.d.h.get(i10);
        l00Var.f28314b = j00Var;
        l00Var.f28319e = i10;
        l00Var.setContentDescription(j00Var.f27638b);
        l00Var.requestLayout();
        boolean z11 = l00Var.f28329n;
        j00 j00Var2 = l00Var.f28314b;
        if (j00Var2 != null && j00Var2.f27642g) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z11 != z10) {
            z5.release(l00Var, l00Var.f28330r);
            z5.release(l00Var, l00Var.O);
            z5.release(l00Var, l00Var.Q);
            z5.release(l00Var, l00Var.S);
            if (l00Var.f28328l0) {
                int i15 = 26;
                if (l00Var.f28314b.f27642g) {
                    i12 = 26;
                } else {
                    i12 = 0;
                }
                l00Var.f28330r = z5.update(i12, l00Var, l00Var.f28330r, l00Var.f28331s);
                if (l00Var.f28314b.f27642g) {
                    i13 = 26;
                } else {
                    i13 = 0;
                }
                l00Var.O = z5.update(i13, l00Var, l00Var.O, l00Var.P);
                if (l00Var.f28314b.f27642g) {
                    i14 = 26;
                } else {
                    i14 = 0;
                }
                l00Var.Q = z5.update(i14, l00Var, l00Var.Q, l00Var.R);
                if (!l00Var.f28314b.f27642g) {
                    i15 = 0;
                }
                l00Var.S = z5.update(i15, l00Var, l00Var.S, l00Var.T);
            }
            l00Var.f28329n = l00Var.f28314b.f27642g;
        }
        if (i11 != l00Var.getId()) {
            if (l00Var.f28314b.f27641f) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            l00Var.f28327k0 = f7;
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new l00(this.d, this.f27350c));
    }
}
