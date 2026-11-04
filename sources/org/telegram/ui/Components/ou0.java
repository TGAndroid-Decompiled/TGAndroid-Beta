package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class ou0 extends sj0 {
    public int f36946c;
    public final xu0 d;

    public ou0(xu0 xu0Var) {
        this.d = xu0Var;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        if (d1Var.f55544f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        int length;
        xu0 xu0Var = this.d;
        tu0[] tu0VarArr = xu0Var.f40484g3;
        if (tu0VarArr == null) {
            length = 0;
        } else {
            length = tu0VarArr.length;
        }
        int i3 = length + 1;
        if (i3 != this.f36946c) {
            ai.x2 x2Var = xu0Var.f40496t3;
            if (x2Var != null) {
                x2Var.requestLayout();
            }
            this.f36946c = i3;
        }
        return i3;
    }

    @Override
    public final int d(int i3) {
        if (i3 == 0) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        xu0 xu0Var;
        tu0[] tu0VarArr;
        boolean z10 = true;
        if (d1Var.f55544f == 1 && (tu0VarArr = (xu0Var = this.d).f40484g3) != null) {
            int i10 = i3 - 1;
            tu0 tu0Var = tu0VarArr[i10];
            final su0 su0Var = (su0) d1Var.f55540a;
            if (xu0Var.f40497u3 != i10) {
                z10 = false;
            }
            su0Var.getClass();
            if (!TextUtils.isEmpty(tu0Var.d)) {
                su0Var.setContentDescription(tu0Var.d);
            } else if (!TextUtils.isEmpty(tu0Var.f38555a)) {
                su0Var.setContentDescription(tu0Var.f38555a);
            } else {
                su0Var.setContentDescription(null);
            }
            ValueAnimator valueAnimator = su0Var.H;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                su0Var.H = null;
            }
            su0Var.setImageResource(0);
            su0Var.a();
            final boolean D1 = su0Var.I.D1();
            su0Var.f38122x = false;
            su0Var.E = 1.0f;
            g5.g(org.telegram.messenger.h10.f22829t0).b(tu0Var.f38557c, new d5() {
                @Override
                public final void a(TLRPC.Document document) {
                    su0 su0Var2 = su0.this;
                    su0Var2.setOnlyLastFrame(!D1);
                    su0Var2.g(24, 24, document);
                    su0Var2.d();
                }
            });
            org.telegram.messenger.g0.i3(new sp0(su0Var, 9), 60L);
            su0Var.l(z10, false);
            su0Var.setAlpha(xu0Var.f40499w3);
            su0Var.setScaleX(xu0Var.f40499w3);
            su0Var.setScaleY(xu0Var.f40499w3);
            su0Var.j();
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        su0 su0Var;
        xu0 xu0Var = this.d;
        if (i3 == 0) {
            ai.x2 x2Var = new ai.x2(28, xu0Var.getContext(), this);
            xu0Var.f40496t3 = x2Var;
            su0Var = x2Var;
        } else {
            su0Var = new su0(xu0Var, xu0Var.getContext());
        }
        return new u4.d1(su0Var);
    }

    @Override
    public final void y(u4.d1 d1Var) {
        boolean z10 = true;
        if (d1Var.f55544f == 1) {
            su0 su0Var = (su0) d1Var.f55540a;
            if (this.d.f40497u3 != d1Var.b() - 1) {
                z10 = false;
            }
            su0Var.l(z10, false);
            su0Var.j();
        }
    }
}
