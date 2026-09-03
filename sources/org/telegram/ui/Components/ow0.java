package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class ow0 extends ql0 {
    public int f27678c;
    public final xw0 d;

    public ow0(xw0 xw0Var) {
        this.d = xw0Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5777f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int length;
        xw0 xw0Var = this.d;
        tw0[] tw0VarArr = xw0Var.V2;
        if (tw0VarArr == null) {
            length = 0;
        } else {
            length = tw0VarArr.length;
        }
        int i10 = length + 1;
        if (i10 != this.f27678c) {
            eg.h0 h0Var = xw0Var.f30735i3;
            if (h0Var != null) {
                h0Var.requestLayout();
            }
            this.f27678c = i10;
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
    public final void v(f2.l1 l1Var, int i10) {
        xw0 xw0Var;
        tw0[] tw0VarArr;
        boolean z4 = true;
        if (l1Var.f5777f == 1 && (tw0VarArr = (xw0Var = this.d).V2) != null) {
            int i11 = i10 - 1;
            tw0 tw0Var = tw0VarArr[i11];
            final sw0 sw0Var = (sw0) l1Var.f5774a;
            if (xw0Var.f30736j3 != i11) {
                z4 = false;
            }
            sw0Var.getClass();
            if (!TextUtils.isEmpty(tw0Var.d)) {
                sw0Var.setContentDescription(tw0Var.d);
            } else if (!TextUtils.isEmpty(tw0Var.f29037a)) {
                sw0Var.setContentDescription(tw0Var.f29037a);
            } else {
                sw0Var.setContentDescription(null);
            }
            ValueAnimator valueAnimator = sw0Var.D;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                sw0Var.D = null;
            }
            sw0Var.setImageResource(0);
            sw0Var.a();
            final boolean z12 = sw0Var.E.z1();
            sw0Var.f28828w = false;
            sw0Var.f28830y = 1.0f;
            l5.h(UserConfig.selectedAccount).b(tw0Var.f29039c, new i5() {
                @Override
                public final void a(TLRPC.Document document) {
                    sw0 sw0Var2 = sw0.this;
                    sw0Var2.setOnlyLastFrame(!z12);
                    sw0Var2.g(24, 24, document);
                    sw0Var2.d();
                }
            });
            AndroidUtilities.runOnUIThread(new nq0(sw0Var, 9), 60L);
            sw0Var.l(z4, false);
            sw0Var.setAlpha(xw0Var.f30738l3);
            sw0Var.setScaleX(xw0Var.f30738l3);
            sw0Var.setScaleY(xw0Var.f30738l3);
            sw0Var.j();
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        sw0 sw0Var;
        xw0 xw0Var = this.d;
        if (i10 == 0) {
            eg.h0 h0Var = new eg.h0(this, xw0Var.getContext(), 20);
            xw0Var.f30735i3 = h0Var;
            sw0Var = h0Var;
        } else {
            sw0Var = new sw0(xw0Var, xw0Var.getContext());
        }
        return new f2.l1(sw0Var);
    }

    @Override
    public final void y(f2.l1 l1Var) {
        boolean z4 = true;
        if (l1Var.f5777f == 1) {
            sw0 sw0Var = (sw0) l1Var.f5774a;
            if (this.d.f30736j3 != l1Var.b() - 1) {
                z4 = false;
            }
            sw0Var.l(z4, false);
            sw0Var.j();
        }
    }
}
