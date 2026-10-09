package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class px0 extends pm0 {
    public int f29959c;
    public final yx0 d;

    public px0(yx0 yx0Var) {
        this.d = yx0Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47662f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int length;
        yx0 yx0Var = this.d;
        ux0[] ux0VarArr = yx0Var.W2;
        if (ux0VarArr == null) {
            length = 0;
        } else {
            length = ux0VarArr.length;
        }
        int i10 = length + 1;
        if (i10 != this.f29959c) {
            ci.bb bbVar = yx0Var.j3;
            if (bbVar != null) {
                bbVar.requestLayout();
            }
            this.f29959c = i10;
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
    public final void v(s4.d1 d1Var, int i10) {
        yx0 yx0Var;
        ux0[] ux0VarArr;
        boolean z10 = true;
        if (d1Var.f47662f == 1 && (ux0VarArr = (yx0Var = this.d).W2) != null) {
            int i11 = i10 - 1;
            ux0 ux0Var = ux0VarArr[i11];
            final tx0 tx0Var = (tx0) d1Var.f47658a;
            if (yx0Var.f33392k3 != i11) {
                z10 = false;
            }
            tx0Var.getClass();
            if (!TextUtils.isEmpty(ux0Var.d)) {
                tx0Var.setContentDescription(ux0Var.d);
            } else if (!TextUtils.isEmpty(ux0Var.f31634a)) {
                tx0Var.setContentDescription(ux0Var.f31634a);
            } else {
                tx0Var.setContentDescription(null);
            }
            ValueAnimator valueAnimator = tx0Var.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                tx0Var.G = null;
            }
            tx0Var.setImageResource(0);
            tx0Var.a();
            final boolean B1 = tx0Var.H.B1();
            tx0Var.f31301w = false;
            tx0Var.f31303y = 1.0f;
            s5.h(UserConfig.selectedAccount).b(ux0Var.f31636c, new p5() {
                @Override
                public final void a(TLRPC.Document document) {
                    tx0 tx0Var2 = tx0.this;
                    tx0Var2.setOnlyLastFrame(!B1);
                    tx0Var2.g(24, 24, document);
                    tx0Var2.d();
                }
            });
            AndroidUtilities.runOnUIThread(new or0(tx0Var, 9), 60L);
            tx0Var.l(z10, false);
            tx0Var.setAlpha(yx0Var.f33394m3);
            tx0Var.setScaleX(yx0Var.f33394m3);
            tx0Var.setScaleY(yx0Var.f33394m3);
            tx0Var.j();
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        tx0 tx0Var;
        yx0 yx0Var = this.d;
        if (i10 == 0) {
            ci.bb bbVar = new ci.bb(this, yx0Var.getContext(), 25);
            yx0Var.j3 = bbVar;
            tx0Var = bbVar;
        } else {
            tx0Var = new tx0(yx0Var, yx0Var.getContext());
        }
        return new s4.d1(tx0Var);
    }

    @Override
    public final void y(s4.d1 d1Var) {
        boolean z10 = true;
        if (d1Var.f47662f == 1) {
            tx0 tx0Var = (tx0) d1Var.f47658a;
            if (this.d.f33392k3 != d1Var.b() - 1) {
                z10 = false;
            }
            tx0Var.l(z10, false);
            tx0Var.j();
        }
    }
}
