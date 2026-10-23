package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class ix0 extends im0 {
    public int f27349c;
    public final rx0 d;

    public ix0(rx0 rx0Var) {
        this.d = rx0Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f45924f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int length;
        rx0 rx0Var = this.d;
        nx0[] nx0VarArr = rx0Var.W2;
        if (nx0VarArr == null) {
            length = 0;
        } else {
            length = nx0VarArr.length;
        }
        int i10 = length + 1;
        if (i10 != this.f27349c) {
            ai.ic icVar = rx0Var.f30047j3;
            if (icVar != null) {
                icVar.requestLayout();
            }
            this.f27349c = i10;
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
        rx0 rx0Var;
        nx0[] nx0VarArr;
        boolean z10 = true;
        if (b1Var.f45924f == 1 && (nx0VarArr = (rx0Var = this.d).W2) != null) {
            int i11 = i10 - 1;
            nx0 nx0Var = nx0VarArr[i11];
            final mx0 mx0Var = (mx0) b1Var.f45921a;
            if (rx0Var.f30048k3 != i11) {
                z10 = false;
            }
            mx0Var.getClass();
            if (!TextUtils.isEmpty(nx0Var.d)) {
                mx0Var.setContentDescription(nx0Var.d);
            } else if (!TextUtils.isEmpty(nx0Var.f28897a)) {
                mx0Var.setContentDescription(nx0Var.f28897a);
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
            final boolean B1 = mx0Var.H.B1();
            mx0Var.f28626w = false;
            mx0Var.f28628y = 1.0f;
            r5.h(UserConfig.selectedAccount).b(nx0Var.f28899c, new o5() {
                @Override
                public final void a(TLRPC.Document document) {
                    mx0 mx0Var2 = mx0.this;
                    mx0Var2.setOnlyLastFrame(!B1);
                    mx0Var2.g(24, 24, document);
                    mx0Var2.d();
                }
            });
            AndroidUtilities.runOnUIThread(new hr0(mx0Var, 9), 60L);
            mx0Var.l(z10, false);
            mx0Var.setAlpha(rx0Var.f30050m3);
            mx0Var.setScaleX(rx0Var.f30050m3);
            mx0Var.setScaleY(rx0Var.f30050m3);
            mx0Var.j();
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        mx0 mx0Var;
        rx0 rx0Var = this.d;
        if (i10 == 0) {
            ai.ic icVar = new ai.ic(this, rx0Var.getContext(), 26);
            rx0Var.f30047j3 = icVar;
            mx0Var = icVar;
        } else {
            mx0Var = new mx0(rx0Var, rx0Var.getContext());
        }
        return new s4.b1(mx0Var);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        boolean z10 = true;
        if (b1Var.f45924f == 1) {
            mx0 mx0Var = (mx0) b1Var.f45921a;
            if (this.d.f30048k3 != b1Var.b() - 1) {
                z10 = false;
            }
            mx0Var.l(z10, false);
            mx0Var.j();
        }
    }
}
