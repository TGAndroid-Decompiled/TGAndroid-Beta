package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
public final class w00 extends rm0 {
    public final Context f32526c;
    public final b10 d;

    public w00(b10 b10Var, Context context) {
        this.d = b10Var;
        this.f32526c = context;
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
        return this.d.f24759k0.get(i10);
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
        z00 z00Var = (z00) d1Var.f47748a;
        if (z00Var.f33361b != null) {
            i11 = z00Var.getId();
        } else {
            i11 = -1;
        }
        x00 x00Var = (x00) this.d.h.get(i10);
        z00Var.f33361b = x00Var;
        z00Var.f33366e = i10;
        z00Var.setContentDescription(x00Var.f32785b);
        z00Var.requestLayout();
        boolean z11 = z00Var.f33376n;
        x00 x00Var2 = z00Var.f33361b;
        if (x00Var2 != null && x00Var2.f32789g) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z11 != z10) {
            b6.release(z00Var, z00Var.f33377r);
            b6.release(z00Var, z00Var.O);
            b6.release(z00Var, z00Var.Q);
            b6.release(z00Var, z00Var.S);
            if (z00Var.f33375l0) {
                int i15 = 26;
                if (z00Var.f33361b.f32789g) {
                    i12 = 26;
                } else {
                    i12 = 0;
                }
                z00Var.f33377r = b6.update(i12, z00Var, z00Var.f33377r, z00Var.f33378s);
                if (z00Var.f33361b.f32789g) {
                    i13 = 26;
                } else {
                    i13 = 0;
                }
                z00Var.O = b6.update(i13, z00Var, z00Var.O, z00Var.P);
                if (z00Var.f33361b.f32789g) {
                    i14 = 26;
                } else {
                    i14 = 0;
                }
                z00Var.Q = b6.update(i14, z00Var, z00Var.Q, z00Var.R);
                if (!z00Var.f33361b.f32789g) {
                    i15 = 0;
                }
                z00Var.S = b6.update(i15, z00Var, z00Var.S, z00Var.T);
            }
            z00Var.f33376n = z00Var.f33361b.f32789g;
        }
        if (i11 != z00Var.getId()) {
            if (z00Var.f33361b.f32788f) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            z00Var.f33374k0 = f7;
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        return new s4.d1(new z00(this.d, this.f32526c));
    }
}
