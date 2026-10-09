package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
public final class v00 extends pm0 {
    public final Context f31657c;
    public final a10 d;

    public v00(a10 a10Var, Context context) {
        this.d = a10Var;
        this.f31657c = context;
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
        return this.d.f24513k0.get(i10);
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
        y00 y00Var = (y00) d1Var.f47658a;
        if (y00Var.f33067b != null) {
            i11 = y00Var.getId();
        } else {
            i11 = -1;
        }
        w00 w00Var = (w00) this.d.h.get(i10);
        y00Var.f33067b = w00Var;
        y00Var.f33072e = i10;
        y00Var.setContentDescription(w00Var.f32499b);
        y00Var.requestLayout();
        boolean z11 = y00Var.f33082n;
        w00 w00Var2 = y00Var.f33067b;
        if (w00Var2 != null && w00Var2.f32503g) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z11 != z10) {
            b6.release(y00Var, y00Var.f33083r);
            b6.release(y00Var, y00Var.O);
            b6.release(y00Var, y00Var.Q);
            b6.release(y00Var, y00Var.S);
            if (y00Var.f33081l0) {
                int i15 = 26;
                if (y00Var.f33067b.f32503g) {
                    i12 = 26;
                } else {
                    i12 = 0;
                }
                y00Var.f33083r = b6.update(i12, y00Var, y00Var.f33083r, y00Var.f33084s);
                if (y00Var.f33067b.f32503g) {
                    i13 = 26;
                } else {
                    i13 = 0;
                }
                y00Var.O = b6.update(i13, y00Var, y00Var.O, y00Var.P);
                if (y00Var.f33067b.f32503g) {
                    i14 = 26;
                } else {
                    i14 = 0;
                }
                y00Var.Q = b6.update(i14, y00Var, y00Var.Q, y00Var.R);
                if (!y00Var.f33067b.f32503g) {
                    i15 = 0;
                }
                y00Var.S = b6.update(i15, y00Var, y00Var.S, y00Var.T);
            }
            y00Var.f33082n = y00Var.f33067b.f32503g;
        }
        if (i11 != y00Var.getId()) {
            if (y00Var.f33067b.f32502f) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            y00Var.f33080k0 = f7;
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        return new s4.d1(new y00(this.d, this.f31657c));
    }
}
