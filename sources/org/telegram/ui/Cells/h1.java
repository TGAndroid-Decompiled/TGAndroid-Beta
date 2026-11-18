package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
public final class h1 implements Runnable {
    public final int f30728a;
    public final q1 f30729b;

    public h1(q1 q1Var, int i7) {
        this.f30728a = i7;
        this.f30729b = q1Var;
    }

    @Override
    public final void run() {
        boolean z22;
        switch (this.f30728a) {
            case 0:
                l1 l1Var = this.f30729b.Sa;
                if (l1Var != null) {
                    l1Var.v();
                    return;
                }
                return;
            default:
                q1 q1Var = this.f30729b;
                h1 h1Var = q1Var.f31579wb;
                fj fjVar = q1Var.Q5;
                if (fjVar != null && (z22 = q1Var.z2(fjVar)) != q1Var.f31370h3) {
                    q1Var.f31370h3 = z22;
                    if (!z22) {
                        org.telegram.messenger.g0.h3(h1Var, 1000L);
                        q1Var.f31351fb = true;
                        int L = q1Var.f31295b7 - org.telegram.messenger.g0.L(91.0f);
                        q1Var.f31330e3 = new StaticLayout(TextUtils.ellipsize(gd.M0(2131753964, null), org.telegram.ui.ActionBar.n6.H2, L, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.n6.H2, L, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    } else {
                        fj fjVar2 = q1Var.Q5;
                        q1Var.Q5 = null;
                        q1Var.y3(fjVar2, q1Var.L, q1Var.G, q1Var.F, q1Var.H, false);
                    }
                }
                if (q1Var.f31370h3) {
                    q1Var.invalidate();
                    q1Var.f31351fb = false;
                    return;
                }
                RectF rectF = q1Var.f31305c4;
                q1Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                if (q1Var.f31351fb) {
                    org.telegram.messenger.g0.h3(h1Var, 1000L);
                    return;
                }
                return;
        }
    }
}
