package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class ru0 extends tj0 {
    public int f39065c;
    public final av0 d;

    public ru0(av0 av0Var) {
        this.d = av0Var;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        if (e1Var.f58539f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        int length;
        av0 av0Var = this.d;
        wu0[] wu0VarArr = av0Var.f33076g3;
        if (wu0VarArr == null) {
            length = 0;
        } else {
            length = wu0VarArr.length;
        }
        int i7 = length + 1;
        if (i7 != this.f39065c) {
            bi.o2 o2Var = av0Var.f33088t3;
            if (o2Var != null) {
                o2Var.requestLayout();
            }
            this.f39065c = i7;
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
        av0 av0Var;
        wu0[] wu0VarArr;
        boolean z10 = true;
        if (e1Var.f58539f == 1 && (wu0VarArr = (av0Var = this.d).f33076g3) != null) {
            int i10 = i7 - 1;
            wu0 wu0Var = wu0VarArr[i10];
            final vu0 vu0Var = (vu0) e1Var.f58535a;
            if (av0Var.f33089u3 != i10) {
                z10 = false;
            }
            vu0Var.getClass();
            if (!TextUtils.isEmpty(wu0Var.d)) {
                vu0Var.setContentDescription(wu0Var.d);
            } else if (!TextUtils.isEmpty(wu0Var.f41462a)) {
                vu0Var.setContentDescription(wu0Var.f41462a);
            } else {
                vu0Var.setContentDescription(null);
            }
            ValueAnimator valueAnimator = vu0Var.H;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                vu0Var.H = null;
            }
            vu0Var.setImageResource(0);
            vu0Var.a();
            final boolean D1 = vu0Var.I.D1();
            vu0Var.f41158x = false;
            vu0Var.E = 1.0f;
            g5.g(org.telegram.messenger.m10.f24940t0).b(wu0Var.f41464c, new d5() {
                @Override
                public final void a(TLRPC.Document document) {
                    vu0 vu0Var2 = vu0.this;
                    vu0Var2.setOnlyLastFrame(!D1);
                    vu0Var2.g(24, 24, document);
                    vu0Var2.d();
                }
            });
            org.telegram.messenger.g0.i3(new ro0(vu0Var, 10), 60L);
            vu0Var.l(z10, false);
            vu0Var.setAlpha(av0Var.f33091w3);
            vu0Var.setScaleX(av0Var.f33091w3);
            vu0Var.setScaleY(av0Var.f33091w3);
            vu0Var.j();
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        vu0 vu0Var;
        av0 av0Var = this.d;
        if (i7 == 0) {
            bi.o2 o2Var = new bi.o2(28, av0Var.getContext(), this);
            av0Var.f33088t3 = o2Var;
            vu0Var = o2Var;
        } else {
            vu0Var = new vu0(av0Var, av0Var.getContext());
        }
        return new v4.e1(vu0Var);
    }

    @Override
    public final void y(v4.e1 e1Var) {
        boolean z10 = true;
        if (e1Var.f58539f == 1) {
            vu0 vu0Var = (vu0) e1Var.f58535a;
            if (this.d.f33089u3 != e1Var.b() - 1) {
                z10 = false;
            }
            vu0Var.l(z10, false);
            vu0Var.j();
        }
    }
}
