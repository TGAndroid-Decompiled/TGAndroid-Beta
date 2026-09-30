package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class ax0 extends yl0 {
    public int f22723c;
    public final jx0 d;

    public ax0(jx0 jx0Var) {
        this.d = jx0Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f43071f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int length;
        jx0 jx0Var = this.d;
        fx0[] fx0VarArr = jx0Var.f25565f3;
        if (fx0VarArr == null) {
            length = 0;
        } else {
            length = fx0VarArr.length;
        }
        int i10 = length + 1;
        if (i10 != this.f22723c) {
            ci.bb bbVar = jx0Var.f25577s3;
            if (bbVar != null) {
                bbVar.requestLayout();
            }
            this.f22723c = i10;
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
        jx0 jx0Var;
        fx0[] fx0VarArr;
        boolean z10 = true;
        if (c1Var.f43071f == 1 && (fx0VarArr = (jx0Var = this.d).f25565f3) != null) {
            int i11 = i10 - 1;
            fx0 fx0Var = fx0VarArr[i11];
            final ex0 ex0Var = (ex0) c1Var.f43068a;
            if (jx0Var.f25578t3 != i11) {
                z10 = false;
            }
            ex0Var.getClass();
            if (!TextUtils.isEmpty(fx0Var.d)) {
                ex0Var.setContentDescription(fx0Var.d);
            } else if (!TextUtils.isEmpty(fx0Var.f24375a)) {
                ex0Var.setContentDescription(fx0Var.f24375a);
            } else {
                ex0Var.setContentDescription(null);
            }
            ValueAnimator valueAnimator = ex0Var.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                ex0Var.G = null;
            }
            ex0Var.setImageResource(0);
            ex0Var.a();
            final boolean C1 = ex0Var.H.C1();
            ex0Var.f24070w = false;
            ex0Var.f24072y = 1.0f;
            q5.h(UserConfig.selectedAccount).b(fx0Var.f24377c, new n5() {
                @Override
                public final void a(TLRPC.Document document) {
                    ex0 ex0Var2 = ex0.this;
                    ex0Var2.setOnlyLastFrame(!C1);
                    ex0Var2.g(24, 24, document);
                    ex0Var2.d();
                }
            });
            AndroidUtilities.runOnUIThread(new zq0(ex0Var, 10), 60L);
            ex0Var.l(z10, false);
            ex0Var.setAlpha(jx0Var.f25580v3);
            ex0Var.setScaleX(jx0Var.f25580v3);
            ex0Var.setScaleY(jx0Var.f25580v3);
            ex0Var.j();
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        ex0 ex0Var;
        jx0 jx0Var = this.d;
        if (i10 == 0) {
            ci.bb bbVar = new ci.bb(this, jx0Var.getContext(), 25);
            jx0Var.f25577s3 = bbVar;
            ex0Var = bbVar;
        } else {
            ex0Var = new ex0(jx0Var, jx0Var.getContext());
        }
        return new s4.c1(ex0Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        boolean z10 = true;
        if (c1Var.f43071f == 1) {
            ex0 ex0Var = (ex0) c1Var.f43068a;
            if (this.d.f25578t3 != c1Var.b() - 1) {
                z10 = false;
            }
            ex0Var.l(z10, false);
            ex0Var.j();
        }
    }
}
