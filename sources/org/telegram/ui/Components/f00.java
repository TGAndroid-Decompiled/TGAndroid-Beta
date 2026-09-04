package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
public final class f00 extends kl0 {
    public final Context f25844c;
    public final k00 d;

    public f00(k00 k00Var, Context context) {
        this.d = k00Var;
        this.f25844c = context;
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
        return this.d.f27619k0.get(i10);
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
        i00 i00Var = (i00) c1Var.f45738a;
        if (i00Var.f26900b != null) {
            i11 = i00Var.getId();
        } else {
            i11 = -1;
        }
        g00 g00Var = (g00) this.d.h.get(i10);
        i00Var.f26900b = g00Var;
        i00Var.f26905e = i10;
        i00Var.setContentDescription(g00Var.f26218b);
        i00Var.requestLayout();
        boolean z11 = i00Var.f26915n;
        g00 g00Var2 = i00Var.f26900b;
        if (g00Var2 != null && g00Var2.f26222g) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z11 != z10) {
            z5.release(i00Var, i00Var.f26916r);
            z5.release(i00Var, i00Var.O);
            z5.release(i00Var, i00Var.Q);
            z5.release(i00Var, i00Var.S);
            if (i00Var.f26914l0) {
                int i15 = 26;
                if (i00Var.f26900b.f26222g) {
                    i12 = 26;
                } else {
                    i12 = 0;
                }
                i00Var.f26916r = z5.update(i12, i00Var, i00Var.f26916r, i00Var.f26917s);
                if (i00Var.f26900b.f26222g) {
                    i13 = 26;
                } else {
                    i13 = 0;
                }
                i00Var.O = z5.update(i13, i00Var, i00Var.O, i00Var.P);
                if (i00Var.f26900b.f26222g) {
                    i14 = 26;
                } else {
                    i14 = 0;
                }
                i00Var.Q = z5.update(i14, i00Var, i00Var.Q, i00Var.R);
                if (!i00Var.f26900b.f26222g) {
                    i15 = 0;
                }
                i00Var.S = z5.update(i15, i00Var, i00Var.S, i00Var.T);
            }
            i00Var.f26915n = i00Var.f26900b.f26222g;
        }
        if (i11 != i00Var.getId()) {
            if (i00Var.f26900b.f26221f) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            i00Var.f26913k0 = f7;
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new i00(this.d, this.f25844c));
    }
}
