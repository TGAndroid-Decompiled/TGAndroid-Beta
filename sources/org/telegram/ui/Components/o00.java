package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
public final class o00 extends hm0 {
    public final Context f28871c;
    public final s00 d;

    public o00(s00 s00Var, Context context) {
        this.d = s00Var;
        this.f28871c = context;
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
        return this.d.f30085k0.get(i10);
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
        q00 q00Var = (q00) b1Var.f45912a;
        if (q00Var.f29458b != null) {
            i11 = q00Var.getId();
        } else {
            i11 = -1;
        }
        p00 p00Var = (p00) this.d.h.get(i10);
        q00Var.f29458b = p00Var;
        q00Var.e = i10;
        q00Var.setContentDescription(p00Var.f29127b);
        q00Var.requestLayout();
        boolean z11 = q00Var.f29472n;
        p00 p00Var2 = q00Var.f29458b;
        if (p00Var2 != null && p00Var2.f29130g) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z11 != z10) {
            a6.release(q00Var, q00Var.f29473r);
            a6.release(q00Var, q00Var.O);
            a6.release(q00Var, q00Var.Q);
            a6.release(q00Var, q00Var.S);
            if (q00Var.f29471l0) {
                int i15 = 26;
                if (q00Var.f29458b.f29130g) {
                    i12 = 26;
                } else {
                    i12 = 0;
                }
                q00Var.f29473r = a6.update(i12, q00Var, q00Var.f29473r, q00Var.f29474s);
                if (q00Var.f29458b.f29130g) {
                    i13 = 26;
                } else {
                    i13 = 0;
                }
                q00Var.O = a6.update(i13, q00Var, q00Var.O, q00Var.P);
                if (q00Var.f29458b.f29130g) {
                    i14 = 26;
                } else {
                    i14 = 0;
                }
                q00Var.Q = a6.update(i14, q00Var, q00Var.Q, q00Var.R);
                if (!q00Var.f29458b.f29130g) {
                    i15 = 0;
                }
                q00Var.S = a6.update(i15, q00Var, q00Var.S, q00Var.T);
            }
            q00Var.f29472n = q00Var.f29458b.f29130g;
        }
        if (i11 != q00Var.getId()) {
            if (q00Var.f29458b.f29129f) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            q00Var.f29470k0 = f7;
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new s4.b1(new q00(this.d, this.f28871c));
    }
}
