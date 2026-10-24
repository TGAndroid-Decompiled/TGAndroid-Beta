package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
public final class m00 extends km0 {
    public final Context f28477c;
    public final q00 d;

    public m00(q00 q00Var, Context context) {
        this.d = q00Var;
        this.f28477c = context;
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
        return this.d.f29719k0.get(i10);
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
        o00 o00Var = (o00) b1Var.f46342a;
        if (o00Var.f29092b != null) {
            i11 = o00Var.getId();
        } else {
            i11 = -1;
        }
        n00 n00Var = (n00) this.d.h.get(i10);
        o00Var.f29092b = n00Var;
        o00Var.e = i10;
        o00Var.setContentDescription(n00Var.f28741b);
        o00Var.requestLayout();
        boolean z11 = o00Var.f29106n;
        n00 n00Var2 = o00Var.f29092b;
        if (n00Var2 != null && n00Var2.f28744g) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z11 != z10) {
            y5.release(o00Var, o00Var.f29107r);
            y5.release(o00Var, o00Var.O);
            y5.release(o00Var, o00Var.Q);
            y5.release(o00Var, o00Var.S);
            if (o00Var.f29105l0) {
                int i15 = 26;
                if (o00Var.f29092b.f28744g) {
                    i12 = 26;
                } else {
                    i12 = 0;
                }
                o00Var.f29107r = y5.update(i12, o00Var, o00Var.f29107r, o00Var.f29108s);
                if (o00Var.f29092b.f28744g) {
                    i13 = 26;
                } else {
                    i13 = 0;
                }
                o00Var.O = y5.update(i13, o00Var, o00Var.O, o00Var.P);
                if (o00Var.f29092b.f28744g) {
                    i14 = 26;
                } else {
                    i14 = 0;
                }
                o00Var.Q = y5.update(i14, o00Var, o00Var.Q, o00Var.R);
                if (!o00Var.f29092b.f28744g) {
                    i15 = 0;
                }
                o00Var.S = y5.update(i15, o00Var, o00Var.S, o00Var.T);
            }
            o00Var.f29106n = o00Var.f29092b.f28744g;
        }
        if (i11 != o00Var.getId()) {
            if (o00Var.f29092b.f28743f) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            o00Var.f29104k0 = f7;
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new s4.b1(new o00(this.d, this.f28477c));
    }
}
