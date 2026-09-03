package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
public final class g00 extends ql0 {
    public final Context f25011c;
    public final k00 d;

    public g00(k00 k00Var, Context context) {
        this.d = k00Var;
        this.f25011c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.d.h.size();
    }

    @Override
    public final long i(int i10) {
        return this.d.f26101h0.get(i10);
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        boolean z4;
        float f10;
        int i12;
        int i13;
        int i14;
        i00 i00Var = (i00) l1Var.f5774a;
        if (i00Var.f25534b != null) {
            i11 = i00Var.getId();
        } else {
            i11 = -1;
        }
        h00 h00Var = (h00) this.d.h.get(i10);
        i00Var.f25534b = h00Var;
        i00Var.e = i10;
        i00Var.setContentDescription(h00Var.f25281b);
        i00Var.requestLayout();
        boolean z10 = i00Var.f25546n;
        h00 h00Var2 = i00Var.f25534b;
        if (h00Var2 != null && h00Var2.f25284g) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z10 != z4) {
            u5.release(i00Var, i00Var.f25547r);
            u5.release(i00Var, i00Var.L);
            u5.release(i00Var, i00Var.N);
            u5.release(i00Var, i00Var.P);
            if (i00Var.f25544i0) {
                int i15 = 26;
                if (i00Var.f25534b.f25284g) {
                    i12 = 26;
                } else {
                    i12 = 0;
                }
                i00Var.f25547r = u5.update(i12, i00Var, i00Var.f25547r, i00Var.f25548s);
                if (i00Var.f25534b.f25284g) {
                    i13 = 26;
                } else {
                    i13 = 0;
                }
                i00Var.L = u5.update(i13, i00Var, i00Var.L, i00Var.M);
                if (i00Var.f25534b.f25284g) {
                    i14 = 26;
                } else {
                    i14 = 0;
                }
                i00Var.N = u5.update(i14, i00Var, i00Var.N, i00Var.O);
                if (!i00Var.f25534b.f25284g) {
                    i15 = 0;
                }
                i00Var.P = u5.update(i15, i00Var, i00Var.P, i00Var.Q);
            }
            i00Var.f25546n = i00Var.f25534b.f25284g;
        }
        if (i11 != i00Var.getId()) {
            if (i00Var.f25534b.f25283f) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            i00Var.f25543h0 = f10;
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        return new f2.l1(new i00(this.d, this.f25011c));
    }
}
