package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class qu0 extends oj0 {
    public int f37409c;
    public final zu0 d;

    public qu0(zu0 zu0Var) {
        this.d = zu0Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f57056f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        int length;
        zu0 zu0Var = this.d;
        vu0[] vu0VarArr = zu0Var.f41123f3;
        if (vu0VarArr == null) {
            length = 0;
        } else {
            length = vu0VarArr.length;
        }
        int i7 = length + 1;
        if (i7 != this.f37409c) {
            bi.ec ecVar = zu0Var.f41135s3;
            if (ecVar != null) {
                ecVar.requestLayout();
            }
            this.f37409c = i7;
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
        zu0 zu0Var;
        vu0[] vu0VarArr;
        boolean z9 = true;
        if (d1Var.f57056f == 1 && (vu0VarArr = (zu0Var = this.d).f41123f3) != null) {
            int i10 = i7 - 1;
            vu0 vu0Var = vu0VarArr[i10];
            final uu0 uu0Var = (uu0) d1Var.f57052a;
            if (zu0Var.f41136t3 != i10) {
                z9 = false;
            }
            uu0Var.getClass();
            if (!TextUtils.isEmpty(vu0Var.d)) {
                uu0Var.setContentDescription(vu0Var.d);
            } else if (!TextUtils.isEmpty(vu0Var.f39747a)) {
                uu0Var.setContentDescription(vu0Var.f39747a);
            } else {
                uu0Var.setContentDescription(null);
            }
            ValueAnimator valueAnimator = uu0Var.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                uu0Var.G = null;
            }
            uu0Var.setImageResource(0);
            uu0Var.a();
            final boolean D1 = uu0Var.H.D1();
            uu0Var.f38749x = false;
            uu0Var.D = 1.0f;
            h5.g(org.telegram.messenger.p10.f24474s0).b(vu0Var.f39749c, new e5() {
                @Override
                public final void a(TLRPC.Document document) {
                    uu0 uu0Var2 = uu0.this;
                    uu0Var2.setOnlyLastFrame(!D1);
                    uu0Var2.g(24, 24, document);
                    uu0Var2.d();
                }
            });
            org.telegram.messenger.g0.i3(new jr0(uu0Var, 7), 60L);
            uu0Var.l(z9, false);
            uu0Var.setAlpha(zu0Var.f41138v3);
            uu0Var.setScaleX(zu0Var.f41138v3);
            uu0Var.setScaleY(zu0Var.f41138v3);
            uu0Var.j();
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        uu0 uu0Var;
        zu0 zu0Var = this.d;
        if (i7 == 0) {
            bi.ec ecVar = new bi.ec(27, zu0Var.getContext(), this);
            zu0Var.f41135s3 = ecVar;
            uu0Var = ecVar;
        } else {
            uu0Var = new uu0(zu0Var, zu0Var.getContext());
        }
        return new v4.d1(uu0Var);
    }

    @Override
    public final void y(v4.d1 d1Var) {
        boolean z9 = true;
        if (d1Var.f57056f == 1) {
            uu0 uu0Var = (uu0) d1Var.f57052a;
            if (this.d.f41136t3 != d1Var.b() - 1) {
                z9 = false;
            }
            uu0Var.l(z9, false);
            uu0Var.j();
        }
    }
}
