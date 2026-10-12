package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
public final class y00 extends vm0 {
    public final Context f32909c;
    public final d10 d;

    public y00(d10 d10Var, Context context) {
        this.d = d10Var;
        this.f32909c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.d.h.size();
    }

    @Override
    public final long i(int i10) {
        return this.d.f25178k0.get(i10);
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        int i11;
        boolean z10;
        float f7;
        int i12;
        int i13;
        int i14;
        b10 b10Var = (b10) d1Var.f47889a;
        if (b10Var.f24527b != null) {
            i11 = b10Var.getId();
        } else {
            i11 = -1;
        }
        z00 z00Var = (z00) this.d.h.get(i10);
        b10Var.f24527b = z00Var;
        b10Var.f24532e = i10;
        b10Var.setContentDescription(z00Var.f33235b);
        b10Var.requestLayout();
        boolean z11 = b10Var.f24542n;
        z00 z00Var2 = b10Var.f24527b;
        if (z00Var2 != null && z00Var2.f33239g) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z11 != z10) {
            b6.release(b10Var, b10Var.f24543r);
            b6.release(b10Var, b10Var.O);
            b6.release(b10Var, b10Var.Q);
            b6.release(b10Var, b10Var.S);
            if (b10Var.f24541l0) {
                int i15 = 26;
                if (b10Var.f24527b.f33239g) {
                    i12 = 26;
                } else {
                    i12 = 0;
                }
                b10Var.f24543r = b6.update(i12, b10Var, b10Var.f24543r, b10Var.f24544s);
                if (b10Var.f24527b.f33239g) {
                    i13 = 26;
                } else {
                    i13 = 0;
                }
                b10Var.O = b6.update(i13, b10Var, b10Var.O, b10Var.P);
                if (b10Var.f24527b.f33239g) {
                    i14 = 26;
                } else {
                    i14 = 0;
                }
                b10Var.Q = b6.update(i14, b10Var, b10Var.Q, b10Var.R);
                if (!b10Var.f24527b.f33239g) {
                    i15 = 0;
                }
                b10Var.S = b6.update(i15, b10Var, b10Var.S, b10Var.T);
            }
            b10Var.f24542n = b10Var.f24527b.f33239g;
        }
        if (i11 != b10Var.getId()) {
            if (b10Var.f24527b.f33238f) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            b10Var.f24540k0 = f7;
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        return new s4.d1(new b10(this.d, this.f32909c));
    }
}
