package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class ru0 extends pj0 {
    public int f37822c;
    public final av0 d;

    public ru0(av0 av0Var) {
        this.d = av0Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f57060f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        int length;
        av0 av0Var = this.d;
        wu0[] wu0VarArr = av0Var.f31986f3;
        if (wu0VarArr == null) {
            length = 0;
        } else {
            length = wu0VarArr.length;
        }
        int i7 = length + 1;
        if (i7 != this.f37822c) {
            bi.ec ecVar = av0Var.f31998s3;
            if (ecVar != null) {
                ecVar.requestLayout();
            }
            this.f37822c = i7;
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
    public final void t(v4.d1 d1Var, int i7) {
        av0 av0Var;
        wu0[] wu0VarArr;
        boolean z9 = true;
        if (d1Var.f57060f == 1 && (wu0VarArr = (av0Var = this.d).f31986f3) != null) {
            int i10 = i7 - 1;
            wu0 wu0Var = wu0VarArr[i10];
            final vu0 vu0Var = (vu0) d1Var.f57056a;
            if (av0Var.f31999t3 != i10) {
                z9 = false;
            }
            vu0Var.getClass();
            if (!TextUtils.isEmpty(wu0Var.d)) {
                vu0Var.setContentDescription(wu0Var.d);
            } else if (!TextUtils.isEmpty(wu0Var.f40165a)) {
                vu0Var.setContentDescription(wu0Var.f40165a);
            } else {
                vu0Var.setContentDescription(null);
            }
            ValueAnimator valueAnimator = vu0Var.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                vu0Var.G = null;
            }
            vu0Var.setImageResource(0);
            vu0Var.a();
            final boolean D1 = vu0Var.H.D1();
            vu0Var.f39808x = false;
            vu0Var.D = 1.0f;
            i5.g(org.telegram.messenger.p10.f24470s0).b(wu0Var.f40167c, new f5() {
                @Override
                public final void a(TLRPC.Document document) {
                    vu0 vu0Var2 = vu0.this;
                    vu0Var2.setOnlyLastFrame(!D1);
                    vu0Var2.g(24, 24, document);
                    vu0Var2.d();
                }
            });
            org.telegram.messenger.g0.i3(new kr0(vu0Var, 7), 60L);
            vu0Var.l(z9, false);
            vu0Var.setAlpha(av0Var.f32001v3);
            vu0Var.setScaleX(av0Var.f32001v3);
            vu0Var.setScaleY(av0Var.f32001v3);
            vu0Var.j();
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        vu0 vu0Var;
        av0 av0Var = this.d;
        if (i7 == 0) {
            bi.ec ecVar = new bi.ec(27, av0Var.getContext(), this);
            av0Var.f31998s3 = ecVar;
            vu0Var = ecVar;
        } else {
            vu0Var = new vu0(av0Var, av0Var.getContext());
        }
        return new v4.d1(vu0Var);
    }

    @Override
    public final void y(v4.d1 d1Var) {
        boolean z9 = true;
        if (d1Var.f57060f == 1) {
            vu0 vu0Var = (vu0) d1Var.f57056a;
            if (this.d.f31999t3 != d1Var.b() - 1) {
                z9 = false;
            }
            vu0Var.l(z9, false);
            vu0Var.j();
        }
    }
}
