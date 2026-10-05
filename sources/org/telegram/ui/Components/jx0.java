package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class jx0 extends yl0 {
    public int f27988c;
    public final sx0 d;

    public jx0(sx0 sx0Var) {
        this.d = sx0Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f46542f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int length;
        sx0 sx0Var = this.d;
        ox0[] ox0VarArr = sx0Var.f30959f3;
        if (ox0VarArr == null) {
            length = 0;
        } else {
            length = ox0VarArr.length;
        }
        int i10 = length + 1;
        if (i10 != this.f27988c) {
            ci.ab abVar = sx0Var.f30971s3;
            if (abVar != null) {
                abVar.requestLayout();
            }
            this.f27988c = i10;
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
        sx0 sx0Var;
        ox0[] ox0VarArr;
        boolean z10 = true;
        if (c1Var.f46542f == 1 && (ox0VarArr = (sx0Var = this.d).f30959f3) != null) {
            int i11 = i10 - 1;
            ox0 ox0Var = ox0VarArr[i11];
            final nx0 nx0Var = (nx0) c1Var.f46538a;
            if (sx0Var.f30972t3 != i11) {
                z10 = false;
            }
            nx0Var.getClass();
            if (!TextUtils.isEmpty(ox0Var.d)) {
                nx0Var.setContentDescription(ox0Var.d);
            } else if (!TextUtils.isEmpty(ox0Var.f29557a)) {
                nx0Var.setContentDescription(ox0Var.f29557a);
            } else {
                nx0Var.setContentDescription(null);
            }
            ValueAnimator valueAnimator = nx0Var.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                nx0Var.G = null;
            }
            nx0Var.setImageResource(0);
            nx0Var.a();
            final boolean B1 = nx0Var.H.B1();
            nx0Var.f29168w = false;
            nx0Var.f29170y = 1.0f;
            q5.h(UserConfig.selectedAccount).b(ox0Var.f29559c, new n5() {
                @Override
                public final void a(TLRPC.Document document) {
                    nx0 nx0Var2 = nx0.this;
                    nx0Var2.setOnlyLastFrame(!B1);
                    nx0Var2.g(24, 24, document);
                    nx0Var2.d();
                }
            });
            AndroidUtilities.runOnUIThread(new gq0(nx0Var, 12), 60L);
            nx0Var.l(z10, false);
            nx0Var.setAlpha(sx0Var.f30974v3);
            nx0Var.setScaleX(sx0Var.f30974v3);
            nx0Var.setScaleY(sx0Var.f30974v3);
            nx0Var.j();
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        nx0 nx0Var;
        sx0 sx0Var = this.d;
        if (i10 == 0) {
            ci.ab abVar = new ci.ab(this, sx0Var.getContext(), 26);
            sx0Var.f30971s3 = abVar;
            nx0Var = abVar;
        } else {
            nx0Var = new nx0(sx0Var, sx0Var.getContext());
        }
        return new s4.c1(nx0Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        boolean z10 = true;
        if (c1Var.f46542f == 1) {
            nx0 nx0Var = (nx0) c1Var.f46538a;
            if (this.d.f30972t3 != c1Var.b() - 1) {
                z10 = false;
            }
            nx0Var.l(z10, false);
            nx0Var.j();
        }
    }
}
