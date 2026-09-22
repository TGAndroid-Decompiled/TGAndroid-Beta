package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class ax0 extends xl0 {
    public int f22765c;
    public final jx0 d;

    public ax0(jx0 jx0Var) {
        this.d = jx0Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42998f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int length;
        jx0 jx0Var = this.d;
        fx0[] fx0VarArr = jx0Var.Y2;
        if (fx0VarArr == null) {
            length = 0;
        } else {
            length = fx0VarArr.length;
        }
        int i10 = length + 1;
        if (i10 != this.f22765c) {
            ci.eb ebVar = jx0Var.f25501l3;
            if (ebVar != null) {
                ebVar.requestLayout();
            }
            this.f22765c = i10;
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
        if (c1Var.f42998f == 1 && (fx0VarArr = (jx0Var = this.d).Y2) != null) {
            int i11 = i10 - 1;
            fx0 fx0Var = fx0VarArr[i11];
            final ex0 ex0Var = (ex0) c1Var.f42995a;
            if (jx0Var.f25502m3 != i11) {
                z10 = false;
            }
            ex0Var.getClass();
            if (!TextUtils.isEmpty(fx0Var.d)) {
                ex0Var.setContentDescription(fx0Var.d);
            } else if (!TextUtils.isEmpty(fx0Var.f24370a)) {
                ex0Var.setContentDescription(fx0Var.f24370a);
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
            final boolean B1 = ex0Var.H.B1();
            ex0Var.f24053w = false;
            ex0Var.f24055y = 1.0f;
            p5.h(UserConfig.selectedAccount).b(fx0Var.f24372c, new m5() {
                @Override
                public final void a(TLRPC.Document document) {
                    ex0 ex0Var2 = ex0.this;
                    ex0Var2.setOnlyLastFrame(!B1);
                    ex0Var2.g(24, 24, document);
                    ex0Var2.d();
                }
            });
            AndroidUtilities.runOnUIThread(new yq0(ex0Var, 10), 60L);
            ex0Var.l(z10, false);
            ex0Var.setAlpha(jx0Var.f25504o3);
            ex0Var.setScaleX(jx0Var.f25504o3);
            ex0Var.setScaleY(jx0Var.f25504o3);
            ex0Var.j();
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        ex0 ex0Var;
        jx0 jx0Var = this.d;
        if (i10 == 0) {
            ci.eb ebVar = new ci.eb(this, jx0Var.getContext(), 25);
            jx0Var.f25501l3 = ebVar;
            ex0Var = ebVar;
        } else {
            ex0Var = new ex0(jx0Var, jx0Var.getContext());
        }
        return new s4.c1(ex0Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        boolean z10 = true;
        if (c1Var.f42998f == 1) {
            ex0 ex0Var = (ex0) c1Var.f42995a;
            if (this.d.f25502m3 != c1Var.b() - 1) {
                z10 = false;
            }
            ex0Var.l(z10, false);
            ex0Var.j();
        }
    }
}
