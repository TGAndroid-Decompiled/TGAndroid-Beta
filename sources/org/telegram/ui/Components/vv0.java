package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class vv0 extends vk0 {
    public int f34008c;
    public final ew0 d;

    public vv0(ew0 ew0Var) {
        this.d = ew0Var;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.f5505f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int length;
        ew0 ew0Var = this.d;
        aw0[] aw0VarArr = ew0Var.U2;
        if (aw0VarArr == null) {
            length = 0;
        } else {
            length = aw0VarArr.length;
        }
        int i9 = length + 1;
        if (i9 != this.f34008c) {
            fh.l2 l2Var = ew0Var.f28199h3;
            if (l2Var != null) {
                l2Var.requestLayout();
            }
            this.f34008c = i9;
        }
        return i9;
    }

    @Override
    public final int j(int i9) {
        if (i9 == 0) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        ew0 ew0Var;
        aw0[] aw0VarArr;
        boolean z10 = true;
        if (q1Var.f5505f == 1 && (aw0VarArr = (ew0Var = this.d).U2) != null) {
            int i10 = i9 - 1;
            aw0 aw0Var = aw0VarArr[i10];
            final zv0 zv0Var = (zv0) q1Var.f5501a;
            if (ew0Var.f28200i3 != i10) {
                z10 = false;
            }
            zv0Var.getClass();
            if (!TextUtils.isEmpty(aw0Var.d)) {
                zv0Var.setContentDescription(aw0Var.d);
            } else if (!TextUtils.isEmpty(aw0Var.f26914a)) {
                zv0Var.setContentDescription(aw0Var.f26914a);
            } else {
                zv0Var.setContentDescription(null);
            }
            ValueAnimator valueAnimator = zv0Var.C;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                zv0Var.C = null;
            }
            zv0Var.setImageResource(0);
            zv0Var.a();
            final boolean A1 = zv0Var.D.A1();
            zv0Var.f35380w = false;
            zv0Var.f35382y = 1.0f;
            k5.h(UserConfig.selectedAccount).b(aw0Var.f26916c, new h5() {
                @Override
                public final void a(TLRPC.Document document) {
                    zv0 zv0Var2 = zv0.this;
                    zv0Var2.setOnlyLastFrame(!A1);
                    zv0Var2.g(24, 24, document);
                    zv0Var2.d();
                }
            });
            AndroidUtilities.runOnUIThread(new tp0(zv0Var, 9), 60L);
            zv0Var.l(z10, false);
            zv0Var.setAlpha(ew0Var.f28202k3);
            zv0Var.setScaleX(ew0Var.f28202k3);
            zv0Var.setScaleY(ew0Var.f28202k3);
            zv0Var.j();
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        zv0 zv0Var;
        ew0 ew0Var = this.d;
        if (i9 == 0) {
            fh.l2 l2Var = new fh.l2(this, ew0Var.getContext(), 24);
            ew0Var.f28199h3 = l2Var;
            zv0Var = l2Var;
        } else {
            zv0Var = new zv0(ew0Var, ew0Var.getContext());
        }
        return new f2.q1(zv0Var);
    }

    @Override
    public final void y(f2.q1 q1Var) {
        boolean z10 = true;
        if (q1Var.f5505f == 1) {
            zv0 zv0Var = (zv0) q1Var.f5501a;
            if (this.d.f28200i3 != q1Var.b() - 1) {
                z10 = false;
            }
            zv0Var.l(z10, false);
            zv0Var.j();
        }
    }
}
