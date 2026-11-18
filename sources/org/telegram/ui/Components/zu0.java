package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class zu0 extends bk0 {
    public int f42950c;
    public final iv0 d;

    public zu0(iv0 iv0Var) {
        this.d = iv0Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59126f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        int length;
        iv0 iv0Var = this.d;
        ev0[] ev0VarArr = iv0Var.f36212g3;
        if (ev0VarArr == null) {
            length = 0;
        } else {
            length = ev0VarArr.length;
        }
        int i7 = length + 1;
        if (i7 != this.f42950c) {
            bi.i3 i3Var = iv0Var.f36224t3;
            if (i3Var != null) {
                i3Var.requestLayout();
            }
            this.f42950c = i7;
        }
        return i7;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        iv0 iv0Var;
        ev0[] ev0VarArr;
        boolean z10 = true;
        if (f1Var.f59126f == 1 && (ev0VarArr = (iv0Var = this.d).f36212g3) != null) {
            int i10 = i7 - 1;
            ev0 ev0Var = ev0VarArr[i10];
            final dv0 dv0Var = (dv0) f1Var.f59122a;
            if (iv0Var.f36225u3 != i10) {
                z10 = false;
            }
            dv0Var.getClass();
            if (!TextUtils.isEmpty(ev0Var.d)) {
                dv0Var.setContentDescription(ev0Var.d);
            } else if (!TextUtils.isEmpty(ev0Var.f34808a)) {
                dv0Var.setContentDescription(ev0Var.f34808a);
            } else {
                dv0Var.setContentDescription(null);
            }
            ValueAnimator valueAnimator = dv0Var.H;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                dv0Var.H = null;
            }
            dv0Var.setImageResource(0);
            dv0Var.a();
            final boolean D1 = dv0Var.I.D1();
            dv0Var.f34519x = false;
            dv0Var.E = 1.0f;
            o5.g(org.telegram.messenger.j10.f24773t0).b(ev0Var.f34810c, new l5() {
                @Override
                public final void a(TLRPC.Document document) {
                    dv0 dv0Var2 = dv0.this;
                    dv0Var2.setOnlyLastFrame(!D1);
                    dv0Var2.g(24, 24, document);
                    dv0Var2.d();
                }
            });
            org.telegram.messenger.g0.h3(new ap0(dv0Var, 10), 60L);
            dv0Var.l(z10, false);
            dv0Var.setAlpha(iv0Var.f36227w3);
            dv0Var.setScaleX(iv0Var.f36227w3);
            dv0Var.setScaleY(iv0Var.f36227w3);
            dv0Var.j();
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        dv0 dv0Var;
        iv0 iv0Var = this.d;
        if (i7 == 0) {
            bi.i3 i3Var = new bi.i3(28, iv0Var.getContext(), this);
            iv0Var.f36224t3 = i3Var;
            dv0Var = i3Var;
        } else {
            dv0Var = new dv0(iv0Var, iv0Var.getContext());
        }
        return new v4.f1(dv0Var);
    }

    @Override
    public final void y(v4.f1 f1Var) {
        boolean z10 = true;
        if (f1Var.f59126f == 1) {
            dv0 dv0Var = (dv0) f1Var.f59122a;
            if (this.d.f36225u3 != f1Var.b() - 1) {
                z10 = false;
            }
            dv0Var.l(z10, false);
            dv0Var.j();
        }
    }
}
