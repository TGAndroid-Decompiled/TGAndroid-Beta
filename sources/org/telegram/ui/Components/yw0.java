package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class yw0 extends wl0 {
    public int f30716c;
    public final hx0 d;

    public yw0(hx0 hx0Var) {
        this.d = hx0Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42962f == 1) {
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
        if (i10 != this.f30716c) {
            ci.bb bbVar = hx0Var.f24895l3;
            if (bbVar != null) {
                bbVar.requestLayout();
            }
            this.f30716c = i10;
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
        if (c1Var.f42962f == 1 && (dx0VarArr = (hx0Var = this.d).Y2) != null) {
            int i11 = i10 - 1;
            dx0 dx0Var = dx0VarArr[i11];
            final cx0 cx0Var = (cx0) c1Var.f42959a;
            if (hx0Var.f24896m3 != i11) {
                z10 = false;
            }
            cx0Var.getClass();
            if (!TextUtils.isEmpty(dx0Var.d)) {
                cx0Var.setContentDescription(dx0Var.d);
            } else if (!TextUtils.isEmpty(dx0Var.f23766a)) {
                cx0Var.setContentDescription(dx0Var.f23766a);
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
            final boolean A1 = cx0Var.H.A1();
            cx0Var.f23428w = false;
            cx0Var.f23430y = 1.0f;
            q5.h(UserConfig.selectedAccount).b(dx0Var.f23768c, new n5() {
                @Override
                public final void a(TLRPC.Document document) {
                    cx0 cx0Var2 = cx0.this;
                    cx0Var2.setOnlyLastFrame(!A1);
                    cx0Var2.g(24, 24, document);
                    cx0Var2.d();
                }
            });
            AndroidUtilities.runOnUIThread(new xq0(cx0Var, 10), 60L);
            cx0Var.l(z10, false);
            cx0Var.setAlpha(hx0Var.f24898o3);
            cx0Var.setScaleX(hx0Var.f24898o3);
            cx0Var.setScaleY(hx0Var.f24898o3);
            cx0Var.j();
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        cx0 cx0Var;
        hx0 hx0Var = this.d;
        if (i10 == 0) {
            ci.bb bbVar = new ci.bb(this, hx0Var.getContext(), 25);
            hx0Var.f24895l3 = bbVar;
            cx0Var = bbVar;
        } else {
            cx0Var = new cx0(hx0Var, hx0Var.getContext());
        }
        return new s4.c1(cx0Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        boolean z10 = true;
        if (c1Var.f42962f == 1) {
            cx0 cx0Var = (cx0) c1Var.f42959a;
            if (this.d.f24896m3 != c1Var.b() - 1) {
                z10 = false;
            }
            cx0Var.l(z10, false);
            cx0Var.j();
        }
    }
}
