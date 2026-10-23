package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class lx0 extends lm0 {
    public int f28432c;
    public final ux0 d;

    public lx0(ux0 ux0Var) {
        this.d = ux0Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f46346f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int length;
        ux0 ux0Var = this.d;
        qx0[] qx0VarArr = ux0Var.Z2;
        if (qx0VarArr == null) {
            length = 0;
        } else {
            length = qx0VarArr.length;
        }
        int i10 = length + 1;
        if (i10 != this.f28432c) {
            ai.jc jcVar = ux0Var.f31243m3;
            if (jcVar != null) {
                jcVar.requestLayout();
            }
            this.f28432c = i10;
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
        ux0 ux0Var;
        qx0[] qx0VarArr;
        boolean z10 = true;
        if (b1Var.f46346f == 1 && (qx0VarArr = (ux0Var = this.d).Z2) != null) {
            int i11 = i10 - 1;
            qx0 qx0Var = qx0VarArr[i11];
            final px0 px0Var = (px0) b1Var.f46343a;
            if (ux0Var.f31244n3 != i11) {
                z10 = false;
            }
            px0Var.getClass();
            if (!TextUtils.isEmpty(qx0Var.d)) {
                px0Var.setContentDescription(qx0Var.d);
            } else if (!TextUtils.isEmpty(qx0Var.f30024a)) {
                px0Var.setContentDescription(qx0Var.f30024a);
            } else {
                px0Var.setContentDescription(null);
            }
            ValueAnimator valueAnimator = px0Var.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                px0Var.G = null;
            }
            px0Var.setImageResource(0);
            px0Var.a();
            final boolean G1 = px0Var.H.G1();
            px0Var.f29691w = false;
            px0Var.f29693y = 1.0f;
            r5.h(UserConfig.selectedAccount).b(qx0Var.f30026c, new o5() {
                @Override
                public final void a(TLRPC.Document document) {
                    px0 px0Var2 = px0.this;
                    px0Var2.setOnlyLastFrame(!G1);
                    px0Var2.g(24, 24, document);
                    px0Var2.d();
                }
            });
            AndroidUtilities.runOnUIThread(new kr0(px0Var, 10), 60L);
            px0Var.l(z10, false);
            px0Var.setAlpha(ux0Var.f31246p3);
            px0Var.setScaleX(ux0Var.f31246p3);
            px0Var.setScaleY(ux0Var.f31246p3);
            px0Var.j();
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        px0 px0Var;
        ux0 ux0Var = this.d;
        if (i10 == 0) {
            ai.jc jcVar = new ai.jc(this, ux0Var.getContext(), 25);
            ux0Var.f31243m3 = jcVar;
            px0Var = jcVar;
        } else {
            px0Var = new px0(ux0Var, ux0Var.getContext());
        }
        return new s4.b1(px0Var);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        boolean z10 = true;
        if (b1Var.f46346f == 1) {
            px0 px0Var = (px0) b1Var.f46343a;
            if (this.d.f31244n3 != b1Var.b() - 1) {
                z10 = false;
            }
            px0Var.l(z10, false);
            px0Var.j();
        }
    }
}
