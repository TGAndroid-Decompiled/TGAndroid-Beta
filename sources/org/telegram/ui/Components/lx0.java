package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class lx0 extends lm0 {
    public int f27135c;
    public final ux0 d;

    public lx0(ux0 ux0Var) {
        this.d = ux0Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f44841f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int length;
        ux0 ux0Var = this.d;
        qx0[] qx0VarArr = ux0Var.W2;
        if (qx0VarArr == null) {
            length = 0;
        } else {
            length = qx0VarArr.length;
        }
        int i10 = length + 1;
        if (i10 != this.f27135c) {
            di.ab abVar = ux0Var.f29806j3;
            if (abVar != null) {
                abVar.requestLayout();
            }
            this.f27135c = i10;
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
        if (b1Var.f44841f == 1 && (qx0VarArr = (ux0Var = this.d).W2) != null) {
            int i11 = i10 - 1;
            qx0 qx0Var = qx0VarArr[i11];
            final px0 px0Var = (px0) b1Var.f44838a;
            if (ux0Var.f29807k3 != i11) {
                z10 = false;
            }
            px0Var.getClass();
            if (!TextUtils.isEmpty(qx0Var.d)) {
                px0Var.setContentDescription(qx0Var.d);
            } else if (!TextUtils.isEmpty(qx0Var.f28689a)) {
                px0Var.setContentDescription(qx0Var.f28689a);
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
            final boolean B1 = px0Var.H.B1();
            px0Var.f28443w = false;
            px0Var.f28445y = 1.0f;
            s5.h(UserConfig.selectedAccount).b(qx0Var.f28691c, new p5() {
                @Override
                public final void a(TLRPC.Document document) {
                    px0 px0Var2 = px0.this;
                    px0Var2.setOnlyLastFrame(!B1);
                    px0Var2.g(24, 24, document);
                    px0Var2.d();
                }
            });
            AndroidUtilities.runOnUIThread(new lr0(px0Var, 10), 60L);
            px0Var.l(z10, false);
            px0Var.setAlpha(ux0Var.f29809m3);
            px0Var.setScaleX(ux0Var.f29809m3);
            px0Var.setScaleY(ux0Var.f29809m3);
            px0Var.j();
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        px0 px0Var;
        ux0 ux0Var = this.d;
        if (i10 == 0) {
            di.ab abVar = new di.ab(this, ux0Var.getContext(), 25);
            ux0Var.f29806j3 = abVar;
            px0Var = abVar;
        } else {
            px0Var = new px0(ux0Var, ux0Var.getContext());
        }
        return new s4.b1(px0Var);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        boolean z10 = true;
        if (b1Var.f44841f == 1) {
            px0 px0Var = (px0) b1Var.f44838a;
            if (this.d.f29807k3 != b1Var.b() - 1) {
                z10 = false;
            }
            px0Var.l(z10, false);
            px0Var.j();
        }
    }
}
