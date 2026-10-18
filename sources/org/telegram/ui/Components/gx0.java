package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class gx0 extends hm0 {
    public int f26696c;
    public final px0 d;

    public gx0(px0 px0Var) {
        this.d = px0Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f45961f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int length;
        px0 px0Var = this.d;
        lx0[] lx0VarArr = px0Var.W2;
        if (lx0VarArr == null) {
            length = 0;
        } else {
            length = lx0VarArr.length;
        }
        int i10 = length + 1;
        if (i10 != this.f26696c) {
            ai.ic icVar = px0Var.f29461j3;
            if (icVar != null) {
                icVar.requestLayout();
            }
            this.f26696c = i10;
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
        px0 px0Var;
        lx0[] lx0VarArr;
        boolean z10 = true;
        if (b1Var.f45961f == 1 && (lx0VarArr = (px0Var = this.d).W2) != null) {
            int i11 = i10 - 1;
            lx0 lx0Var = lx0VarArr[i11];
            final kx0 kx0Var = (kx0) b1Var.f45958a;
            if (px0Var.f29462k3 != i11) {
                z10 = false;
            }
            kx0Var.getClass();
            if (!TextUtils.isEmpty(lx0Var.d)) {
                kx0Var.setContentDescription(lx0Var.d);
            } else if (!TextUtils.isEmpty(lx0Var.f28347a)) {
                kx0Var.setContentDescription(lx0Var.f28347a);
            } else {
                kx0Var.setContentDescription(null);
            }
            ValueAnimator valueAnimator = kx0Var.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                kx0Var.G = null;
            }
            kx0Var.setImageResource(0);
            kx0Var.a();
            final boolean B1 = kx0Var.H.B1();
            kx0Var.f28025w = false;
            kx0Var.f28027y = 1.0f;
            r5.h(UserConfig.selectedAccount).b(lx0Var.f28349c, new o5() {
                @Override
                public final void a(TLRPC.Document document) {
                    kx0 kx0Var2 = kx0.this;
                    kx0Var2.setOnlyLastFrame(!B1);
                    kx0Var2.g(24, 24, document);
                    kx0Var2.d();
                }
            });
            AndroidUtilities.runOnUIThread(new fr0(kx0Var, 9), 60L);
            kx0Var.l(z10, false);
            kx0Var.setAlpha(px0Var.f29464m3);
            kx0Var.setScaleX(px0Var.f29464m3);
            kx0Var.setScaleY(px0Var.f29464m3);
            kx0Var.j();
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        kx0 kx0Var;
        px0 px0Var = this.d;
        if (i10 == 0) {
            ai.ic icVar = new ai.ic(this, px0Var.getContext(), 26);
            px0Var.f29461j3 = icVar;
            kx0Var = icVar;
        } else {
            kx0Var = new kx0(px0Var, px0Var.getContext());
        }
        return new s4.b1(kx0Var);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        boolean z10 = true;
        if (b1Var.f45961f == 1) {
            kx0 kx0Var = (kx0) b1Var.f45958a;
            if (this.d.f29462k3 != b1Var.b() - 1) {
                z10 = false;
            }
            kx0Var.l(z10, false);
            kx0Var.j();
        }
    }
}
