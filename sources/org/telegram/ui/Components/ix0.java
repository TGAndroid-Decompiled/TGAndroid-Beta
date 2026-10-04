package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class ix0 extends yl0 {
    public int f27516c;
    public final rx0 d;

    public ix0(rx0 rx0Var) {
        this.d = rx0Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f46535f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int length;
        rx0 rx0Var = this.d;
        nx0[] nx0VarArr = rx0Var.f30528f3;
        if (nx0VarArr == null) {
            length = 0;
        } else {
            length = nx0VarArr.length;
        }
        int i10 = length + 1;
        if (i10 != this.f27516c) {
            ci.ab abVar = rx0Var.f30540s3;
            if (abVar != null) {
                abVar.requestLayout();
            }
            this.f27516c = i10;
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
    public final void v(s4.c1 c1Var, int i10) {
        rx0 rx0Var;
        nx0[] nx0VarArr;
        boolean z10 = true;
        if (c1Var.f46535f == 1 && (nx0VarArr = (rx0Var = this.d).f30528f3) != null) {
            int i11 = i10 - 1;
            nx0 nx0Var = nx0VarArr[i11];
            final mx0 mx0Var = (mx0) c1Var.f46531a;
            if (rx0Var.f30541t3 != i11) {
                z10 = false;
            }
            mx0Var.getClass();
            if (!TextUtils.isEmpty(nx0Var.d)) {
                mx0Var.setContentDescription(nx0Var.d);
            } else if (!TextUtils.isEmpty(nx0Var.f29076a)) {
                mx0Var.setContentDescription(nx0Var.f29076a);
            } else {
                mx0Var.setContentDescription(null);
            }
            ValueAnimator valueAnimator = mx0Var.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                mx0Var.G = null;
            }
            mx0Var.setImageResource(0);
            mx0Var.a();
            final boolean C1 = mx0Var.H.C1();
            mx0Var.f28751w = false;
            mx0Var.f28753y = 1.0f;
            q5.h(UserConfig.selectedAccount).b(nx0Var.f29078c, new n5() {
                @Override
                public final void a(TLRPC.Document document) {
                    mx0 mx0Var2 = mx0.this;
                    mx0Var2.setOnlyLastFrame(!C1);
                    mx0Var2.g(24, 24, document);
                    mx0Var2.d();
                }
            });
            AndroidUtilities.runOnUIThread(new br0(mx0Var, 11), 60L);
            mx0Var.l(z10, false);
            mx0Var.setAlpha(rx0Var.f30543v3);
            mx0Var.setScaleX(rx0Var.f30543v3);
            mx0Var.setScaleY(rx0Var.f30543v3);
            mx0Var.j();
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        mx0 mx0Var;
        rx0 rx0Var = this.d;
        if (i10 == 0) {
            ci.ab abVar = new ci.ab(this, rx0Var.getContext(), 26);
            rx0Var.f30540s3 = abVar;
            mx0Var = abVar;
        } else {
            mx0Var = new mx0(rx0Var, rx0Var.getContext());
        }
        return new s4.c1(mx0Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        boolean z10 = true;
        if (c1Var.f46535f == 1) {
            mx0 mx0Var = (mx0) c1Var.f46531a;
            if (this.d.f30541t3 != c1Var.b() - 1) {
                z10 = false;
            }
            mx0Var.l(z10, false);
            mx0Var.j();
        }
    }
}
