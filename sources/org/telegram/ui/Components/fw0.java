package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class fw0 extends il0 {
    public int f28557c;
    public final ow0 d;

    public fw0(ow0 ow0Var) {
        this.d = ow0Var;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        if (n1Var.f6436f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int length;
        ow0 ow0Var = this.d;
        kw0[] kw0VarArr = ow0Var.U2;
        if (kw0VarArr == null) {
            length = 0;
        } else {
            length = kw0VarArr.length;
        }
        int i10 = length + 1;
        if (i10 != this.f28557c) {
            cg.h0 h0Var = ow0Var.f31496h3;
            if (h0Var != null) {
                h0Var.requestLayout();
            }
            this.f28557c = i10;
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
    public final void v(f2.n1 n1Var, int i10) {
        ow0 ow0Var;
        kw0[] kw0VarArr;
        boolean z10 = true;
        if (n1Var.f6436f == 1 && (kw0VarArr = (ow0Var = this.d).U2) != null) {
            int i11 = i10 - 1;
            kw0 kw0Var = kw0VarArr[i11];
            final jw0 jw0Var = (jw0) n1Var.f6432a;
            if (ow0Var.f31497i3 != i11) {
                z10 = false;
            }
            jw0Var.getClass();
            if (!TextUtils.isEmpty(kw0Var.d)) {
                jw0Var.setContentDescription(kw0Var.d);
            } else if (!TextUtils.isEmpty(kw0Var.f30158a)) {
                jw0Var.setContentDescription(kw0Var.f30158a);
            } else {
                jw0Var.setContentDescription(null);
            }
            ValueAnimator valueAnimator = jw0Var.C;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                jw0Var.C = null;
            }
            jw0Var.setImageResource(0);
            jw0Var.a();
            final boolean A1 = jw0Var.D.A1();
            jw0Var.f29837w = false;
            jw0Var.f29839y = 1.0f;
            p5.h(UserConfig.selectedAccount).b(kw0Var.f30160c, new m5() {
                @Override
                public final void a(TLRPC.Document document) {
                    jw0 jw0Var2 = jw0.this;
                    jw0Var2.setOnlyLastFrame(!A1);
                    jw0Var2.g(24, 24, document);
                    jw0Var2.d();
                }
            });
            AndroidUtilities.runOnUIThread(new fq0(jw0Var, 9), 60L);
            jw0Var.l(z10, false);
            jw0Var.setAlpha(ow0Var.f31499k3);
            jw0Var.setScaleX(ow0Var.f31499k3);
            jw0Var.setScaleY(ow0Var.f31499k3);
            jw0Var.j();
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        jw0 jw0Var;
        ow0 ow0Var = this.d;
        if (i10 == 0) {
            cg.h0 h0Var = new cg.h0(this, ow0Var.getContext(), 22);
            ow0Var.f31496h3 = h0Var;
            jw0Var = h0Var;
        } else {
            jw0Var = new jw0(ow0Var, ow0Var.getContext());
        }
        return new f2.n1(jw0Var);
    }

    @Override
    public final void y(f2.n1 n1Var) {
        boolean z10 = true;
        if (n1Var.f6436f == 1) {
            jw0 jw0Var = (jw0) n1Var.f6432a;
            if (this.d.f31497i3 != n1Var.b() - 1) {
                z10 = false;
            }
            jw0Var.l(z10, false);
            jw0Var.j();
        }
    }
}
