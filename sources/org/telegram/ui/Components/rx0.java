package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class rx0 extends rm0 {
    public int f30557c;
    public final ay0 d;

    public rx0(ay0 ay0Var) {
        this.d = ay0Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47752f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int length;
        ay0 ay0Var = this.d;
        wx0[] wx0VarArr = ay0Var.W2;
        if (wx0VarArr == null) {
            length = 0;
        } else {
            length = wx0VarArr.length;
        }
        int i10 = length + 1;
        if (i10 != this.f30557c) {
            ci.bb bbVar = ay0Var.j3;
            if (bbVar != null) {
                bbVar.requestLayout();
            }
            this.f30557c = i10;
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
        ay0 ay0Var;
        wx0[] wx0VarArr;
        boolean z10 = true;
        if (d1Var.f47752f == 1 && (wx0VarArr = (ay0Var = this.d).W2) != null) {
            int i11 = i10 - 1;
            wx0 wx0Var = wx0VarArr[i11];
            final vx0 vx0Var = (vx0) d1Var.f47748a;
            if (ay0Var.f24625k3 != i11) {
                z10 = false;
            }
            vx0Var.getClass();
            if (!TextUtils.isEmpty(wx0Var.d)) {
                vx0Var.setContentDescription(wx0Var.d);
            } else if (!TextUtils.isEmpty(wx0Var.f32756a)) {
                vx0Var.setContentDescription(wx0Var.f32756a);
            } else {
                vx0Var.setContentDescription(null);
            }
            ValueAnimator valueAnimator = vx0Var.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                vx0Var.G = null;
            }
            vx0Var.setImageResource(0);
            vx0Var.a();
            final boolean B1 = vx0Var.H.B1();
            vx0Var.f32507w = false;
            vx0Var.f32509y = 1.0f;
            s5.h(UserConfig.selectedAccount).b(wx0Var.f32758c, new p5() {
                @Override
                public final void a(TLRPC.Document document) {
                    vx0 vx0Var2 = vx0.this;
                    vx0Var2.setOnlyLastFrame(!B1);
                    vx0Var2.g(24, 24, document);
                    vx0Var2.d();
                }
            });
            AndroidUtilities.runOnUIThread(new qr0(vx0Var, 9), 60L);
            vx0Var.l(z10, false);
            vx0Var.setAlpha(ay0Var.f24627m3);
            vx0Var.setScaleX(ay0Var.f24627m3);
            vx0Var.setScaleY(ay0Var.f24627m3);
            vx0Var.j();
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        vx0 vx0Var;
        ay0 ay0Var = this.d;
        if (i10 == 0) {
            ci.bb bbVar = new ci.bb(this, ay0Var.getContext(), 25);
            ay0Var.j3 = bbVar;
            vx0Var = bbVar;
        } else {
            vx0Var = new vx0(ay0Var, ay0Var.getContext());
        }
        return new s4.d1(vx0Var);
    }

    @Override
    public final void y(s4.d1 d1Var) {
        boolean z10 = true;
        if (d1Var.f47752f == 1) {
            vx0 vx0Var = (vx0) d1Var.f47748a;
            if (this.d.f24625k3 != d1Var.b() - 1) {
                z10 = false;
            }
            vx0Var.l(z10, false);
            vx0Var.j();
        }
    }
}
