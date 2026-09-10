package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
public final class m00 extends ul0 {
    public final Context f25136c;
    public final r00 d;

    public m00(r00 r00Var, Context context) {
        this.d = r00Var;
        this.f25136c = context;
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
        return this.d.f26526k0.get(i10);
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
        p00 p00Var = (p00) c1Var.f41610a;
        if (p00Var.f25950b != null) {
            i11 = p00Var.getId();
        } else {
            i11 = -1;
        }
        n00 n00Var = (n00) this.d.h.get(i10);
        p00Var.f25950b = n00Var;
        p00Var.e = i10;
        p00Var.setContentDescription(n00Var.f25350b);
        p00Var.requestLayout();
        boolean z11 = p00Var.f25964n;
        n00 n00Var2 = p00Var.f25950b;
        if (n00Var2 != null && n00Var2.f25353g) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z11 != z10) {
            y5.release(p00Var, p00Var.f25965r);
            y5.release(p00Var, p00Var.O);
            y5.release(p00Var, p00Var.Q);
            y5.release(p00Var, p00Var.S);
            if (p00Var.f25963l0) {
                int i15 = 26;
                if (p00Var.f25950b.f25353g) {
                    i12 = 26;
                } else {
                    i12 = 0;
                }
                p00Var.f25965r = y5.update(i12, p00Var, p00Var.f25965r, p00Var.f25966s);
                if (p00Var.f25950b.f25353g) {
                    i13 = 26;
                } else {
                    i13 = 0;
                }
                p00Var.O = y5.update(i13, p00Var, p00Var.O, p00Var.P);
                if (p00Var.f25950b.f25353g) {
                    i14 = 26;
                } else {
                    i14 = 0;
                }
                p00Var.Q = y5.update(i14, p00Var, p00Var.Q, p00Var.R);
                if (!p00Var.f25950b.f25353g) {
                    i15 = 0;
                }
                p00Var.S = y5.update(i15, p00Var, p00Var.S, p00Var.T);
            }
            p00Var.f25964n = p00Var.f25950b.f25353g;
        }
        if (i11 != p00Var.getId()) {
            if (p00Var.f25950b.f25352f) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            p00Var.f25962k0 = f7;
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new p00(this.d, this.f25136c));
    }
}
