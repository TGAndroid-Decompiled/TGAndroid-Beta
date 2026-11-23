package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class cv0 extends dk0 {
    public int f34271c;
    public final lv0 d;

    public cv0(lv0 lv0Var) {
        this.d = lv0Var;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        if (e1Var.f59115f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        int length;
        lv0 lv0Var = this.d;
        hv0[] hv0VarArr = lv0Var.f37252g3;
        if (hv0VarArr == null) {
            length = 0;
        } else {
            length = hv0VarArr.length;
        }
        int i7 = length + 1;
        if (i7 != this.f34271c) {
            bi.o3 o3Var = lv0Var.f37264t3;
            if (o3Var != null) {
                o3Var.requestLayout();
            }
            this.f34271c = i7;
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
    public final void t(v4.e1 e1Var, int i7) {
        lv0 lv0Var;
        hv0[] hv0VarArr;
        boolean z10 = true;
        if (e1Var.f59115f == 1 && (hv0VarArr = (lv0Var = this.d).f37252g3) != null) {
            int i10 = i7 - 1;
            hv0 hv0Var = hv0VarArr[i10];
            final gv0 gv0Var = (gv0) e1Var.f59111a;
            if (lv0Var.f37265u3 != i10) {
                z10 = false;
            }
            gv0Var.getClass();
            if (!TextUtils.isEmpty(hv0Var.d)) {
                gv0Var.setContentDescription(hv0Var.d);
            } else if (!TextUtils.isEmpty(hv0Var.f35932a)) {
                gv0Var.setContentDescription(hv0Var.f35932a);
            } else {
                gv0Var.setContentDescription(null);
            }
            ValueAnimator valueAnimator = gv0Var.H;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                gv0Var.H = null;
            }
            gv0Var.setImageResource(0);
            gv0Var.a();
            final boolean D1 = gv0Var.I.D1();
            gv0Var.f35639x = false;
            gv0Var.E = 1.0f;
            p5.g(org.telegram.messenger.k10.f24932t0).b(hv0Var.f35934c, new m5() {
                @Override
                public final void a(TLRPC.Document document) {
                    gv0 gv0Var2 = gv0.this;
                    gv0Var2.setOnlyLastFrame(!D1);
                    gv0Var2.g(24, 24, document);
                    gv0Var2.d();
                }
            });
            org.telegram.messenger.g0.h3(new cp0(gv0Var, 10), 60L);
            gv0Var.l(z10, false);
            gv0Var.setAlpha(lv0Var.f37267w3);
            gv0Var.setScaleX(lv0Var.f37267w3);
            gv0Var.setScaleY(lv0Var.f37267w3);
            gv0Var.j();
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        gv0 gv0Var;
        lv0 lv0Var = this.d;
        if (i7 == 0) {
            bi.o3 o3Var = new bi.o3(28, lv0Var.getContext(), this);
            lv0Var.f37264t3 = o3Var;
            gv0Var = o3Var;
        } else {
            gv0Var = new gv0(lv0Var, lv0Var.getContext());
        }
        return new v4.e1(gv0Var);
    }

    @Override
    public final void y(v4.e1 e1Var) {
        boolean z10 = true;
        if (e1Var.f59115f == 1) {
            gv0 gv0Var = (gv0) e1Var.f59111a;
            if (this.d.f37265u3 != e1Var.b() - 1) {
                z10 = false;
            }
            gv0Var.l(z10, false);
            gv0Var.j();
        }
    }
}
