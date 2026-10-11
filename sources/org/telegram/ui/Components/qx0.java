package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class qx0 extends qm0 {
    public int f30340c;
    public final zx0 d;

    public qx0(zx0 zx0Var) {
        this.d = zx0Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47786f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int length;
        zx0 zx0Var = this.d;
        vx0[] vx0VarArr = zx0Var.W2;
        if (vx0VarArr == null) {
            length = 0;
        } else {
            length = vx0VarArr.length;
        }
        int i10 = length + 1;
        if (i10 != this.f30340c) {
            ci.bb bbVar = zx0Var.j3;
            if (bbVar != null) {
                bbVar.requestLayout();
            }
            this.f30340c = i10;
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
    public final void v(s4.d1 d1Var, int i10) {
        zx0 zx0Var;
        vx0[] vx0VarArr;
        boolean z10 = true;
        if (d1Var.f47786f == 1 && (vx0VarArr = (zx0Var = this.d).W2) != null) {
            int i11 = i10 - 1;
            vx0 vx0Var = vx0VarArr[i11];
            final ux0 ux0Var = (ux0) d1Var.f47782a;
            if (zx0Var.f33739k3 != i11) {
                z10 = false;
            }
            ux0Var.getClass();
            if (!TextUtils.isEmpty(vx0Var.d)) {
                ux0Var.setContentDescription(vx0Var.d);
            } else if (!TextUtils.isEmpty(vx0Var.f32565a)) {
                ux0Var.setContentDescription(vx0Var.f32565a);
            } else {
                ux0Var.setContentDescription(null);
            }
            ValueAnimator valueAnimator = ux0Var.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                ux0Var.G = null;
            }
            ux0Var.setImageResource(0);
            ux0Var.a();
            final boolean B1 = ux0Var.H.B1();
            ux0Var.f31742w = false;
            ux0Var.f31744y = 1.0f;
            s5.h(UserConfig.selectedAccount).b(vx0Var.f32567c, new p5() {
                @Override
                public final void a(TLRPC.Document document) {
                    ux0 ux0Var2 = ux0.this;
                    ux0Var2.setOnlyLastFrame(!B1);
                    ux0Var2.g(24, 24, document);
                    ux0Var2.d();
                }
            });
            AndroidUtilities.runOnUIThread(new pr0(ux0Var, 10), 60L);
            ux0Var.l(z10, false);
            ux0Var.setAlpha(zx0Var.f33741m3);
            ux0Var.setScaleX(zx0Var.f33741m3);
            ux0Var.setScaleY(zx0Var.f33741m3);
            ux0Var.j();
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        ux0 ux0Var;
        zx0 zx0Var = this.d;
        if (i10 == 0) {
            ci.bb bbVar = new ci.bb(this, zx0Var.getContext(), 25);
            zx0Var.j3 = bbVar;
            ux0Var = bbVar;
        } else {
            ux0Var = new ux0(zx0Var, zx0Var.getContext());
        }
        return new s4.d1(ux0Var);
    }

    @Override
    public final void y(s4.d1 d1Var) {
        boolean z10 = true;
        if (d1Var.f47786f == 1) {
            ux0 ux0Var = (ux0) d1Var.f47782a;
            if (this.d.f33739k3 != d1Var.b() - 1) {
                z10 = false;
            }
            ux0Var.l(z10, false);
            ux0Var.j();
        }
    }
}
