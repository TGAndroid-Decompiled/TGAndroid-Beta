package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class sx0 extends lm0 {
    public int f32698c;
    public final by0 d;

    public sx0(by0 by0Var) {
        this.d = by0Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.f47738f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int length;
        by0 by0Var = this.d;
        xx0[] xx0VarArr = by0Var.f26979g3;
        if (xx0VarArr == null) {
            length = 0;
        } else {
            length = xx0VarArr.length;
        }
        int i10 = length + 1;
        if (i10 != this.f32698c) {
            bi.cc ccVar = by0Var.f26992t3;
            if (ccVar != null) {
                ccVar.requestLayout();
            }
            this.f32698c = i10;
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
    public final void v(s4.e1 e1Var, int i10) {
        by0 by0Var;
        xx0[] xx0VarArr;
        boolean z10 = true;
        if (e1Var.f47738f == 1 && (xx0VarArr = (by0Var = this.d).f26979g3) != null) {
            int i11 = i10 - 1;
            xx0 xx0Var = xx0VarArr[i11];
            final wx0 wx0Var = (wx0) e1Var.f47735a;
            if (by0Var.f26993u3 != i11) {
                z10 = false;
            }
            wx0Var.getClass();
            if (!TextUtils.isEmpty(xx0Var.d)) {
                wx0Var.setContentDescription(xx0Var.d);
            } else if (!TextUtils.isEmpty(xx0Var.f34842a)) {
                wx0Var.setContentDescription(xx0Var.f34842a);
            } else {
                wx0Var.setContentDescription(null);
            }
            ValueAnimator valueAnimator = wx0Var.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                wx0Var.G = null;
            }
            wx0Var.setImageResource(0);
            wx0Var.a();
            final boolean G1 = wx0Var.H.G1();
            wx0Var.f34545w = false;
            wx0Var.f34547y = 1.0f;
            t5.h(UserConfig.selectedAccount).b(xx0Var.f34844c, new q5() {
                @Override
                public final void a(TLRPC.Document document) {
                    wx0 wx0Var2 = wx0.this;
                    wx0Var2.setOnlyLastFrame(!G1);
                    wx0Var2.g(24, 24, document);
                    wx0Var2.d();
                }
            });
            AndroidUtilities.runOnUIThread(new mp0(wx0Var, 15), 60L);
            wx0Var.l(z10, false);
            wx0Var.setAlpha(by0Var.f26995w3);
            wx0Var.setScaleX(by0Var.f26995w3);
            wx0Var.setScaleY(by0Var.f26995w3);
            wx0Var.j();
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        wx0 wx0Var;
        by0 by0Var = this.d;
        if (i10 == 0) {
            bi.cc ccVar = new bi.cc(this, by0Var.getContext(), 26);
            by0Var.f26992t3 = ccVar;
            wx0Var = ccVar;
        } else {
            wx0Var = new wx0(by0Var, by0Var.getContext());
        }
        return new s4.e1(wx0Var);
    }

    @Override
    public final void y(s4.e1 e1Var) {
        boolean z10 = true;
        if (e1Var.f47738f == 1) {
            wx0 wx0Var = (wx0) e1Var.f47735a;
            if (this.d.f26993u3 != e1Var.b() - 1) {
                z10 = false;
            }
            wx0Var.l(z10, false);
            wx0Var.j();
        }
    }
}
