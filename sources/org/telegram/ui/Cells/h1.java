package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
public final class h1 implements Runnable {
    public final int f30351a;
    public final q1 f30352b;

    public h1(q1 q1Var, int i7) {
        this.f30351a = i7;
        this.f30352b = q1Var;
    }

    @Override
    public final void run() {
        boolean x22;
        switch (this.f30351a) {
            case 0:
                l1 l1Var = this.f30352b.Sa;
                if (l1Var != null) {
                    l1Var.t();
                    return;
                }
                return;
            default:
                q1 q1Var = this.f30352b;
                h1 h1Var = q1Var.f31207wb;
                gj gjVar = q1Var.Q5;
                if (gjVar != null && (x22 = q1Var.x2(gjVar)) != q1Var.f30998h3) {
                    q1Var.f30998h3 = x22;
                    if (!x22) {
                        org.telegram.messenger.g0.i3(h1Var, 1000L);
                        q1Var.f30979fb = true;
                        int L = q1Var.f30923b7 - org.telegram.messenger.g0.L(91.0f);
                        q1Var.f30958e3 = new StaticLayout(TextUtils.ellipsize(hd.M0(2131753966, null), org.telegram.ui.ActionBar.j6.H2, L, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.j6.H2, L, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    } else {
                        gj gjVar2 = q1Var.Q5;
                        q1Var.Q5 = null;
                        q1Var.x3(gjVar2, q1Var.L, q1Var.G, q1Var.F, q1Var.H, false);
                    }
                }
                if (q1Var.f30998h3) {
                    q1Var.invalidate();
                    q1Var.f30979fb = false;
                    return;
                }
                RectF rectF = q1Var.f30933c4;
                q1Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                if (q1Var.f30979fb) {
                    org.telegram.messenger.g0.i3(h1Var, 1000L);
                    return;
                }
                return;
        }
    }
}
