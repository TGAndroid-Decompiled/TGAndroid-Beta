package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class pw0 extends sl0 {
    public int f30220c;
    public final yw0 d;

    public pw0(yw0 yw0Var) {
        this.d = yw0Var;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        if (m1Var.f5879f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int length;
        yw0 yw0Var = this.d;
        uw0[] uw0VarArr = yw0Var.V2;
        if (uw0VarArr == null) {
            length = 0;
        } else {
            length = uw0VarArr.length;
        }
        int i10 = length + 1;
        if (i10 != this.f30220c) {
            fg.h0 h0Var = yw0Var.f33601i3;
            if (h0Var != null) {
                h0Var.requestLayout();
            }
            this.f30220c = i10;
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
    public final void v(f2.m1 m1Var, int i10) {
        yw0 yw0Var;
        uw0[] uw0VarArr;
        boolean z4 = true;
        if (m1Var.f5879f == 1 && (uw0VarArr = (yw0Var = this.d).V2) != null) {
            int i11 = i10 - 1;
            uw0 uw0Var = uw0VarArr[i11];
            final tw0 tw0Var = (tw0) m1Var.f5875a;
            if (yw0Var.f33602j3 != i11) {
                z4 = false;
            }
            tw0Var.getClass();
            if (!TextUtils.isEmpty(uw0Var.d)) {
                tw0Var.setContentDescription(uw0Var.d);
            } else if (!TextUtils.isEmpty(uw0Var.f31738a)) {
                tw0Var.setContentDescription(uw0Var.f31738a);
            } else {
                tw0Var.setContentDescription(null);
            }
            ValueAnimator valueAnimator = tw0Var.D;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                tw0Var.D = null;
            }
            tw0Var.setImageResource(0);
            tw0Var.a();
            final boolean A1 = tw0Var.E.A1();
            tw0Var.f31467w = false;
            tw0Var.f31469y = 1.0f;
            l5.h(UserConfig.selectedAccount).b(uw0Var.f31740c, new i5() {
                @Override
                public final void a(TLRPC.Document document) {
                    tw0 tw0Var2 = tw0.this;
                    tw0Var2.setOnlyLastFrame(!A1);
                    tw0Var2.g(24, 24, document);
                    tw0Var2.d();
                }
            });
            AndroidUtilities.runOnUIThread(new oq0(tw0Var, 9), 60L);
            tw0Var.l(z4, false);
            tw0Var.setAlpha(yw0Var.f33604l3);
            tw0Var.setScaleX(yw0Var.f33604l3);
            tw0Var.setScaleY(yw0Var.f33604l3);
            tw0Var.j();
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        tw0 tw0Var;
        yw0 yw0Var = this.d;
        if (i10 == 0) {
            fg.h0 h0Var = new fg.h0(this, yw0Var.getContext(), 20);
            yw0Var.f33601i3 = h0Var;
            tw0Var = h0Var;
        } else {
            tw0Var = new tw0(yw0Var, yw0Var.getContext());
        }
        return new f2.m1(tw0Var);
    }

    @Override
    public final void y(f2.m1 m1Var) {
        boolean z4 = true;
        if (m1Var.f5879f == 1) {
            tw0 tw0Var = (tw0) m1Var.f5875a;
            if (this.d.f33602j3 != m1Var.b() - 1) {
                z4 = false;
            }
            tw0Var.l(z4, false);
            tw0Var.j();
        }
    }
}
