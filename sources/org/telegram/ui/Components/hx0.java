package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class hx0 extends hm0 {
    public int f26943c;
    public final qx0 d;

    public hx0(qx0 qx0Var) {
        this.d = qx0Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f45915f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int length;
        qx0 qx0Var = this.d;
        mx0[] mx0VarArr = qx0Var.W2;
        if (mx0VarArr == null) {
            length = 0;
        } else {
            length = mx0VarArr.length;
        }
        int i10 = length + 1;
        if (i10 != this.f26943c) {
            ai.ic icVar = qx0Var.f29743j3;
            if (icVar != null) {
                icVar.requestLayout();
            }
            this.f26943c = i10;
        }
        return i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        qx0 qx0Var;
        mx0[] mx0VarArr;
        boolean z10 = true;
        if (b1Var.f45915f == 1 && (mx0VarArr = (qx0Var = this.d).W2) != null) {
            int i11 = i10 - 1;
            mx0 mx0Var = mx0VarArr[i11];
            final lx0 lx0Var = (lx0) b1Var.f45912a;
            if (qx0Var.f29744k3 != i11) {
                z10 = false;
            }
            lx0Var.getClass();
            if (!TextUtils.isEmpty(mx0Var.d)) {
                lx0Var.setContentDescription(mx0Var.d);
            } else if (!TextUtils.isEmpty(mx0Var.f28618a)) {
                lx0Var.setContentDescription(mx0Var.f28618a);
            } else {
                lx0Var.setContentDescription(null);
            }
            ValueAnimator valueAnimator = lx0Var.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                lx0Var.G = null;
            }
            lx0Var.setImageResource(0);
            lx0Var.a();
            final boolean B1 = lx0Var.H.B1();
            lx0Var.f28328w = false;
            lx0Var.f28330y = 1.0f;
            r5.h(UserConfig.selectedAccount).b(mx0Var.f28620c, new o5() {
                @Override
                public final void a(TLRPC.Document document) {
                    lx0 lx0Var2 = lx0.this;
                    lx0Var2.setOnlyLastFrame(!B1);
                    lx0Var2.g(24, 24, document);
                    lx0Var2.d();
                }
            });
            AndroidUtilities.runOnUIThread(new gr0(lx0Var, 9), 60L);
            lx0Var.l(z10, false);
            lx0Var.setAlpha(qx0Var.f29746m3);
            lx0Var.setScaleX(qx0Var.f29746m3);
            lx0Var.setScaleY(qx0Var.f29746m3);
            lx0Var.j();
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        lx0 lx0Var;
        qx0 qx0Var = this.d;
        if (i10 == 0) {
            ai.ic icVar = new ai.ic(this, qx0Var.getContext(), 26);
            qx0Var.f29743j3 = icVar;
            lx0Var = icVar;
        } else {
            lx0Var = new lx0(qx0Var, qx0Var.getContext());
        }
        return new s4.b1(lx0Var);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        boolean z10 = true;
        if (b1Var.f45915f == 1) {
            lx0 lx0Var = (lx0) b1Var.f45912a;
            if (this.d.f29744k3 != b1Var.b() - 1) {
                z10 = false;
            }
            lx0Var.l(z10, false);
            lx0Var.j();
        }
    }
}
