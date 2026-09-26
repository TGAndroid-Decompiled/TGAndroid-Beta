package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
public final class h00 extends wl0 {
    public final Context f24631c;
    public final m00 d;

    public h00(m00 m00Var, Context context) {
        this.d = m00Var;
        this.f24631c = context;
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
        return this.d.f26240k0.get(i10);
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
        k00 k00Var = (k00) c1Var.f42959a;
        if (k00Var.f25565b != null) {
            i11 = k00Var.getId();
        } else {
            i11 = -1;
        }
        i00 i00Var = (i00) this.d.h.get(i10);
        k00Var.f25565b = i00Var;
        k00Var.e = i10;
        k00Var.setContentDescription(i00Var.f24924b);
        k00Var.requestLayout();
        boolean z11 = k00Var.f25579n;
        i00 i00Var2 = k00Var.f25565b;
        if (i00Var2 != null && i00Var2.f24927g) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z11 != z10) {
            z5.release(k00Var, k00Var.f25580r);
            z5.release(k00Var, k00Var.O);
            z5.release(k00Var, k00Var.Q);
            z5.release(k00Var, k00Var.S);
            if (k00Var.f25578l0) {
                int i15 = 26;
                if (k00Var.f25565b.f24927g) {
                    i12 = 26;
                } else {
                    i12 = 0;
                }
                k00Var.f25580r = z5.update(i12, k00Var, k00Var.f25580r, k00Var.f25581s);
                if (k00Var.f25565b.f24927g) {
                    i13 = 26;
                } else {
                    i13 = 0;
                }
                k00Var.O = z5.update(i13, k00Var, k00Var.O, k00Var.P);
                if (k00Var.f25565b.f24927g) {
                    i14 = 26;
                } else {
                    i14 = 0;
                }
                k00Var.Q = z5.update(i14, k00Var, k00Var.Q, k00Var.R);
                if (!k00Var.f25565b.f24927g) {
                    i15 = 0;
                }
                k00Var.S = z5.update(i15, k00Var, k00Var.S, k00Var.T);
            }
            k00Var.f25579n = k00Var.f25565b.f24927g;
        }
        if (i11 != k00Var.getId()) {
            if (k00Var.f25565b.f24926f) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            k00Var.f25577k0 = f7;
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new k00(this.d, this.f24631c));
    }
}
