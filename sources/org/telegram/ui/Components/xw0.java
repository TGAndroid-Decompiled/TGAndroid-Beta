package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class xw0 extends vl0 {
    public int f30407c;
    public final gx0 d;

    public xw0(gx0 gx0Var) {
        this.d = gx0Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42949f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int length;
        gx0 gx0Var = this.d;
        cx0[] cx0VarArr = gx0Var.Y2;
        if (cx0VarArr == null) {
            length = 0;
        } else {
            length = cx0VarArr.length;
        }
        int i10 = length + 1;
        if (i10 != this.f30407c) {
            ci.bb bbVar = gx0Var.f24550l3;
            if (bbVar != null) {
                bbVar.requestLayout();
            }
            this.f30407c = i10;
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
        gx0 gx0Var;
        cx0[] cx0VarArr;
        boolean z10 = true;
        if (c1Var.f42949f == 1 && (cx0VarArr = (gx0Var = this.d).Y2) != null) {
            int i11 = i10 - 1;
            cx0 cx0Var = cx0VarArr[i11];
            final bx0 bx0Var = (bx0) c1Var.f42946a;
            if (gx0Var.f24551m3 != i11) {
                z10 = false;
            }
            bx0Var.getClass();
            if (!TextUtils.isEmpty(cx0Var.d)) {
                bx0Var.setContentDescription(cx0Var.d);
            } else if (!TextUtils.isEmpty(cx0Var.f23400a)) {
                bx0Var.setContentDescription(cx0Var.f23400a);
            } else {
                bx0Var.setContentDescription(null);
            }
            ValueAnimator valueAnimator = bx0Var.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                bx0Var.G = null;
            }
            bx0Var.setImageResource(0);
            bx0Var.a();
            final boolean A1 = bx0Var.H.A1();
            bx0Var.f23089w = false;
            bx0Var.f23091y = 1.0f;
            q5.h(UserConfig.selectedAccount).b(cx0Var.f23402c, new n5() {
                @Override
                public final void a(TLRPC.Document document) {
                    bx0 bx0Var2 = bx0.this;
                    bx0Var2.setOnlyLastFrame(!A1);
                    bx0Var2.g(24, 24, document);
                    bx0Var2.d();
                }
            });
            AndroidUtilities.runOnUIThread(new wq0(bx0Var, 10), 60L);
            bx0Var.l(z10, false);
            bx0Var.setAlpha(gx0Var.f24553o3);
            bx0Var.setScaleX(gx0Var.f24553o3);
            bx0Var.setScaleY(gx0Var.f24553o3);
            bx0Var.j();
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        bx0 bx0Var;
        gx0 gx0Var = this.d;
        if (i10 == 0) {
            ci.bb bbVar = new ci.bb(this, gx0Var.getContext(), 25);
            gx0Var.f24550l3 = bbVar;
            bx0Var = bbVar;
        } else {
            bx0Var = new bx0(gx0Var, gx0Var.getContext());
        }
        return new s4.c1(bx0Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        boolean z10 = true;
        if (c1Var.f42949f == 1) {
            bx0 bx0Var = (bx0) c1Var.f42946a;
            if (this.d.f24551m3 != c1Var.b() - 1) {
                z10 = false;
            }
            bx0Var.l(z10, false);
            bx0Var.j();
        }
    }
}
