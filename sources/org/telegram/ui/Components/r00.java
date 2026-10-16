package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
public final class r00 extends lm0 {
    public final Context f28389c;
    public final w00 d;

    public r00(w00 w00Var, Context context) {
        this.d = w00Var;
        this.f28389c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.d.h.size();
    }

    @Override
    public final long i(int i10) {
        return this.d.f30375k0.get(i10);
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        boolean z10;
        float f7;
        int i12;
        int i13;
        int i14;
        u00 u00Var = (u00) b1Var.f44838a;
        if (u00Var.f29213b != null) {
            i11 = u00Var.getId();
        } else {
            i11 = -1;
        }
        s00 s00Var = (s00) this.d.h.get(i10);
        u00Var.f29213b = s00Var;
        u00Var.e = i10;
        u00Var.setContentDescription(s00Var.f28687b);
        u00Var.requestLayout();
        boolean z11 = u00Var.f29227n;
        s00 s00Var2 = u00Var.f29213b;
        if (s00Var2 != null && s00Var2.f28690g) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z11 != z10) {
            b6.release(u00Var, u00Var.f29228r);
            b6.release(u00Var, u00Var.O);
            b6.release(u00Var, u00Var.Q);
            b6.release(u00Var, u00Var.S);
            if (u00Var.f29226l0) {
                int i15 = 26;
                if (u00Var.f29213b.f28690g) {
                    i12 = 26;
                } else {
                    i12 = 0;
                }
                u00Var.f29228r = b6.update(i12, u00Var, u00Var.f29228r, u00Var.f29229s);
                if (u00Var.f29213b.f28690g) {
                    i13 = 26;
                } else {
                    i13 = 0;
                }
                u00Var.O = b6.update(i13, u00Var, u00Var.O, u00Var.P);
                if (u00Var.f29213b.f28690g) {
                    i14 = 26;
                } else {
                    i14 = 0;
                }
                u00Var.Q = b6.update(i14, u00Var, u00Var.Q, u00Var.R);
                if (!u00Var.f29213b.f28690g) {
                    i15 = 0;
                }
                u00Var.S = b6.update(i15, u00Var, u00Var.S, u00Var.T);
            }
            u00Var.f29227n = u00Var.f29213b.f28690g;
        }
        if (i11 != u00Var.getId()) {
            if (u00Var.f29213b.f28689f) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            u00Var.f29225k0 = f7;
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new s4.b1(new u00(this.d, this.f28389c));
    }
}
