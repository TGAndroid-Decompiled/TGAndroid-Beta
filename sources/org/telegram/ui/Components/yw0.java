package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class yw0 extends ul0 {
    public int f29516c;
    public final hx0 d;

    public yw0(hx0 hx0Var) {
        this.d = hx0Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f41613f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int length;
        hx0 hx0Var = this.d;
        dx0[] dx0VarArr = hx0Var.Y2;
        if (dx0VarArr == null) {
            length = 0;
        } else {
            length = dx0VarArr.length;
        }
        int i10 = length + 1;
        if (i10 != this.f29516c) {
            bi.nc ncVar = hx0Var.f23787l3;
            if (ncVar != null) {
                ncVar.requestLayout();
            }
            this.f29516c = i10;
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
        hx0 hx0Var;
        dx0[] dx0VarArr;
        boolean z10 = true;
        if (c1Var.f41613f == 1 && (dx0VarArr = (hx0Var = this.d).Y2) != null) {
            int i11 = i10 - 1;
            dx0 dx0Var = dx0VarArr[i11];
            final cx0 cx0Var = (cx0) c1Var.f41610a;
            if (hx0Var.f23788m3 != i11) {
                z10 = false;
            }
            cx0Var.getClass();
            if (!TextUtils.isEmpty(dx0Var.d)) {
                cx0Var.setContentDescription(dx0Var.d);
            } else if (!TextUtils.isEmpty(dx0Var.f22495a)) {
                cx0Var.setContentDescription(dx0Var.f22495a);
            } else {
                cx0Var.setContentDescription(null);
            }
            ValueAnimator valueAnimator = cx0Var.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                cx0Var.G = null;
            }
            cx0Var.setImageResource(0);
            cx0Var.a();
            final boolean z12 = cx0Var.H.z1();
            cx0Var.f22244w = false;
            cx0Var.f22246y = 1.0f;
            p5.h(UserConfig.selectedAccount).b(dx0Var.f22497c, new m5() {
                @Override
                public final void a(TLRPC.Document document) {
                    cx0 cx0Var2 = cx0.this;
                    cx0Var2.setOnlyLastFrame(!z12);
                    cx0Var2.g(24, 24, document);
                    cx0Var2.d();
                }
            });
            AndroidUtilities.runOnUIThread(new uq0(cx0Var, 9), 60L);
            cx0Var.l(z10, false);
            cx0Var.setAlpha(hx0Var.f23790o3);
            cx0Var.setScaleX(hx0Var.f23790o3);
            cx0Var.setScaleY(hx0Var.f23790o3);
            cx0Var.j();
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        cx0 cx0Var;
        hx0 hx0Var = this.d;
        if (i10 == 0) {
            bi.nc ncVar = new bi.nc(this, hx0Var.getContext(), 25);
            hx0Var.f23787l3 = ncVar;
            cx0Var = ncVar;
        } else {
            cx0Var = new cx0(hx0Var, hx0Var.getContext());
        }
        return new s4.c1(cx0Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        boolean z10 = true;
        if (c1Var.f41613f == 1) {
            cx0 cx0Var = (cx0) c1Var.f41610a;
            if (this.d.f23788m3 != c1Var.b() - 1) {
                z10 = false;
            }
            cx0Var.l(z10, false);
            cx0Var.j();
        }
    }
}
