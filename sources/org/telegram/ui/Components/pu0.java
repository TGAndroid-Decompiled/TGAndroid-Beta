package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class pu0 extends oj0 {
    public int f37179c;
    public final yu0 d;

    public pu0(yu0 yu0Var) {
        this.d = yu0Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f56931f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        int length;
        yu0 yu0Var = this.d;
        uu0[] uu0VarArr = yu0Var.f40698f3;
        if (uu0VarArr == null) {
            length = 0;
        } else {
            length = uu0VarArr.length;
        }
        int i7 = length + 1;
        if (i7 != this.f37179c) {
            bi.ec ecVar = yu0Var.f40710s3;
            if (ecVar != null) {
                ecVar.requestLayout();
            }
            this.f37179c = i7;
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
        yu0 yu0Var;
        uu0[] uu0VarArr;
        boolean z9 = true;
        if (d1Var.f56931f == 1 && (uu0VarArr = (yu0Var = this.d).f40698f3) != null) {
            int i10 = i7 - 1;
            uu0 uu0Var = uu0VarArr[i10];
            final tu0 tu0Var = (tu0) d1Var.f56927a;
            if (yu0Var.f40711t3 != i10) {
                z9 = false;
            }
            tu0Var.getClass();
            if (!TextUtils.isEmpty(uu0Var.d)) {
                tu0Var.setContentDescription(uu0Var.d);
            } else if (!TextUtils.isEmpty(uu0Var.f38735a)) {
                tu0Var.setContentDescription(uu0Var.f38735a);
            } else {
                tu0Var.setContentDescription(null);
            }
            ValueAnimator valueAnimator = tu0Var.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                tu0Var.G = null;
            }
            tu0Var.setImageResource(0);
            tu0Var.a();
            final boolean D1 = tu0Var.H.D1();
            tu0Var.f38417x = false;
            tu0Var.D = 1.0f;
            i5.g(org.telegram.messenger.p10.f24459s0).b(uu0Var.f38737c, new f5() {
                @Override
                public final void a(TLRPC.Document document) {
                    tu0 tu0Var2 = tu0.this;
                    tu0Var2.setOnlyLastFrame(!D1);
                    tu0Var2.g(24, 24, document);
                    tu0Var2.d();
                }
            });
            org.telegram.messenger.g0.i3(new ir0(tu0Var, 7), 60L);
            tu0Var.l(z9, false);
            tu0Var.setAlpha(yu0Var.f40713v3);
            tu0Var.setScaleX(yu0Var.f40713v3);
            tu0Var.setScaleY(yu0Var.f40713v3);
            tu0Var.j();
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        tu0 tu0Var;
        yu0 yu0Var = this.d;
        if (i7 == 0) {
            bi.ec ecVar = new bi.ec(27, yu0Var.getContext(), this);
            yu0Var.f40710s3 = ecVar;
            tu0Var = ecVar;
        } else {
            tu0Var = new tu0(yu0Var, yu0Var.getContext());
        }
        return new v4.d1(tu0Var);
    }

    @Override
    public final void y(v4.d1 d1Var) {
        boolean z9 = true;
        if (d1Var.f56931f == 1) {
            tu0 tu0Var = (tu0) d1Var.f56927a;
            if (this.d.f40711t3 != d1Var.b() - 1) {
                z9 = false;
            }
            tu0Var.l(z9, false);
            tu0Var.j();
        }
    }
}
