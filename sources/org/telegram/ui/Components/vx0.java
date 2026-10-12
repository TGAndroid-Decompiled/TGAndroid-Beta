package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class vx0 extends vm0 {
    public int f32193c;
    public final ey0 d;

    public vx0(ey0 ey0Var) {
        this.d = ey0Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47901f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int length;
        ey0 ey0Var = this.d;
        ay0[] ay0VarArr = ey0Var.W2;
        if (ay0VarArr == null) {
            length = 0;
        } else {
            length = ay0VarArr.length;
        }
        int i10 = length + 1;
        if (i10 != this.f32193c) {
            ci.bb bbVar = ey0Var.j3;
            if (bbVar != null) {
                bbVar.requestLayout();
            }
            this.f32193c = i10;
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
        ey0 ey0Var;
        ay0[] ay0VarArr;
        boolean z10 = true;
        if (d1Var.f47901f == 1 && (ay0VarArr = (ey0Var = this.d).W2) != null) {
            int i11 = i10 - 1;
            ay0 ay0Var = ay0VarArr[i11];
            final zx0 zx0Var = (zx0) d1Var.f47897a;
            if (ey0Var.f25816k3 != i11) {
                z10 = false;
            }
            zx0Var.getClass();
            if (!TextUtils.isEmpty(ay0Var.d)) {
                zx0Var.setContentDescription(ay0Var.d);
            } else if (!TextUtils.isEmpty(ay0Var.f24495a)) {
                zx0Var.setContentDescription(ay0Var.f24495a);
            } else {
                zx0Var.setContentDescription(null);
            }
            ValueAnimator valueAnimator = zx0Var.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                zx0Var.G = null;
            }
            zx0Var.setImageResource(0);
            zx0Var.a();
            final boolean B1 = zx0Var.H.B1();
            zx0Var.f33518w = false;
            zx0Var.f33520y = 1.0f;
            s5.h(UserConfig.selectedAccount).b(ay0Var.f24497c, new p5() {
                @Override
                public final void a(TLRPC.Document document) {
                    zx0 zx0Var2 = zx0.this;
                    zx0Var2.setOnlyLastFrame(!B1);
                    zx0Var2.g(24, 24, document);
                    zx0Var2.d();
                }
            });
            AndroidUtilities.runOnUIThread(new ur0(zx0Var, 10), 60L);
            zx0Var.l(z10, false);
            zx0Var.setAlpha(ey0Var.f25818m3);
            zx0Var.setScaleX(ey0Var.f25818m3);
            zx0Var.setScaleY(ey0Var.f25818m3);
            zx0Var.j();
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        zx0 zx0Var;
        ey0 ey0Var = this.d;
        if (i10 == 0) {
            ci.bb bbVar = new ci.bb(this, ey0Var.getContext(), 25);
            ey0Var.j3 = bbVar;
            zx0Var = bbVar;
        } else {
            zx0Var = new zx0(ey0Var, ey0Var.getContext());
        }
        return new s4.d1(zx0Var);
    }

    @Override
    public final void y(s4.d1 d1Var) {
        boolean z10 = true;
        if (d1Var.f47901f == 1) {
            zx0 zx0Var = (zx0) d1Var.f47897a;
            if (this.d.f25816k3 != d1Var.b() - 1) {
                z10 = false;
            }
            zx0Var.l(z10, false);
            zx0Var.j();
        }
    }
}
