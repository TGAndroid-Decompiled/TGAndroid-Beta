package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class zw0 extends vl0 {
    public int f30898c;
    public final ix0 d;

    public zw0(ix0 ix0Var) {
        this.d = ix0Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42932f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int length;
        ix0 ix0Var = this.d;
        ex0[] ex0VarArr = ix0Var.Y2;
        if (ex0VarArr == null) {
            length = 0;
        } else {
            length = ex0VarArr.length;
        }
        int i10 = length + 1;
        if (i10 != this.f30898c) {
            ci.eb ebVar = ix0Var.f25075l3;
            if (ebVar != null) {
                ebVar.requestLayout();
            }
            this.f30898c = i10;
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
        ix0 ix0Var;
        ex0[] ex0VarArr;
        boolean z10 = true;
        if (c1Var.f42932f == 1 && (ex0VarArr = (ix0Var = this.d).Y2) != null) {
            int i11 = i10 - 1;
            ex0 ex0Var = ex0VarArr[i11];
            final dx0 dx0Var = (dx0) c1Var.f42929a;
            if (ix0Var.f25076m3 != i11) {
                z10 = false;
            }
            dx0Var.getClass();
            if (!TextUtils.isEmpty(ex0Var.d)) {
                dx0Var.setContentDescription(ex0Var.d);
            } else if (!TextUtils.isEmpty(ex0Var.f23978a)) {
                dx0Var.setContentDescription(ex0Var.f23978a);
            } else {
                dx0Var.setContentDescription(null);
            }
            ValueAnimator valueAnimator = dx0Var.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                dx0Var.G = null;
            }
            dx0Var.setImageResource(0);
            dx0Var.a();
            final boolean B1 = dx0Var.H.B1();
            dx0Var.f23694w = false;
            dx0Var.f23696y = 1.0f;
            q5.h(UserConfig.selectedAccount).b(ex0Var.f23980c, new n5() {
                @Override
                public final void a(TLRPC.Document document) {
                    dx0 dx0Var2 = dx0.this;
                    dx0Var2.setOnlyLastFrame(!B1);
                    dx0Var2.g(24, 24, document);
                    dx0Var2.d();
                }
            });
            AndroidUtilities.runOnUIThread(new xq0(dx0Var, 9), 60L);
            dx0Var.l(z10, false);
            dx0Var.setAlpha(ix0Var.f25078o3);
            dx0Var.setScaleX(ix0Var.f25078o3);
            dx0Var.setScaleY(ix0Var.f25078o3);
            dx0Var.j();
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        dx0 dx0Var;
        ix0 ix0Var = this.d;
        if (i10 == 0) {
            ci.eb ebVar = new ci.eb(this, ix0Var.getContext(), 25);
            ix0Var.f25075l3 = ebVar;
            dx0Var = ebVar;
        } else {
            dx0Var = new dx0(ix0Var, ix0Var.getContext());
        }
        return new s4.c1(dx0Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        boolean z10 = true;
        if (c1Var.f42932f == 1) {
            dx0 dx0Var = (dx0) c1Var.f42929a;
            if (this.d.f25076m3 != c1Var.b() - 1) {
                z10 = false;
            }
            dx0Var.l(z10, false);
            dx0Var.j();
        }
    }
}
