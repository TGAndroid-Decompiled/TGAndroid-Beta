package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class tx0 extends mm0 {
    public int f33168c;
    public final cy0 d;

    public tx0(cy0 cy0Var) {
        this.d = cy0Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.f47776f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int length;
        cy0 cy0Var = this.d;
        yx0[] yx0VarArr = cy0Var.f27276g3;
        if (yx0VarArr == null) {
            length = 0;
        } else {
            length = yx0VarArr.length;
        }
        int i10 = length + 1;
        if (i10 != this.f33168c) {
            bi.cc ccVar = cy0Var.f27289t3;
            if (ccVar != null) {
                ccVar.requestLayout();
            }
            this.f33168c = i10;
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
        cy0 cy0Var;
        yx0[] yx0VarArr;
        boolean z10 = true;
        if (e1Var.f47776f == 1 && (yx0VarArr = (cy0Var = this.d).f27276g3) != null) {
            int i11 = i10 - 1;
            yx0 yx0Var = yx0VarArr[i11];
            final xx0 xx0Var = (xx0) e1Var.f47773a;
            if (cy0Var.f27290u3 != i11) {
                z10 = false;
            }
            xx0Var.getClass();
            if (!TextUtils.isEmpty(yx0Var.d)) {
                xx0Var.setContentDescription(yx0Var.d);
            } else if (!TextUtils.isEmpty(yx0Var.f35182a)) {
                xx0Var.setContentDescription(yx0Var.f35182a);
            } else {
                xx0Var.setContentDescription(null);
            }
            ValueAnimator valueAnimator = xx0Var.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                xx0Var.G = null;
            }
            xx0Var.setImageResource(0);
            xx0Var.a();
            final boolean G1 = xx0Var.H.G1();
            xx0Var.f34872w = false;
            xx0Var.f34874y = 1.0f;
            t5.h(UserConfig.selectedAccount).b(yx0Var.f35184c, new q5() {
                @Override
                public final void a(TLRPC.Document document) {
                    xx0 xx0Var2 = xx0.this;
                    xx0Var2.setOnlyLastFrame(!G1);
                    xx0Var2.g(24, 24, document);
                    xx0Var2.d();
                }
            });
            AndroidUtilities.runOnUIThread(new np0(xx0Var, 15), 60L);
            xx0Var.l(z10, false);
            xx0Var.setAlpha(cy0Var.f27292w3);
            xx0Var.setScaleX(cy0Var.f27292w3);
            xx0Var.setScaleY(cy0Var.f27292w3);
            xx0Var.j();
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        xx0 xx0Var;
        cy0 cy0Var = this.d;
        if (i10 == 0) {
            bi.cc ccVar = new bi.cc(this, cy0Var.getContext(), 26);
            cy0Var.f27289t3 = ccVar;
            xx0Var = ccVar;
        } else {
            xx0Var = new xx0(cy0Var, cy0Var.getContext());
        }
        return new s4.e1(xx0Var);
    }

    @Override
    public final void y(s4.e1 e1Var) {
        boolean z10 = true;
        if (e1Var.f47776f == 1) {
            xx0 xx0Var = (xx0) e1Var.f47773a;
            if (this.d.f27290u3 != e1Var.b() - 1) {
                z10 = false;
            }
            xx0Var.l(z10, false);
            xx0Var.j();
        }
    }
}
