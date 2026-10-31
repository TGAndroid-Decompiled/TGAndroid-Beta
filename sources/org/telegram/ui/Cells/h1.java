package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import org.telegram.messenger.cd;
import org.telegram.messenger.jj;
public final class h1 implements Runnable {
    public final int f21950a;
    public final q1 f21951b;

    public h1(q1 q1Var, int i10) {
        this.f21950a = i10;
        this.f21951b = q1Var;
    }

    @Override
    public final void run() {
        boolean u22;
        switch (this.f21950a) {
            case 0:
                l1 l1Var = this.f21951b.Qa;
                if (l1Var != null) {
                    l1Var.s();
                    return;
                }
                return;
            default:
                q1 q1Var = this.f21951b;
                h1 h1Var = q1Var.f22747ub;
                jj jjVar = q1Var.O5;
                if (jjVar != null && (u22 = q1Var.u2(jjVar)) != q1Var.f22555f3) {
                    q1Var.f22555f3 = u22;
                    if (!u22) {
                        org.telegram.messenger.i0.h3(h1Var, 1000L);
                        q1Var.f22537db = true;
                        int L = q1Var.Z6 - org.telegram.messenger.i0.L(91.0f);
                        q1Var.f22515c3 = new StaticLayout(TextUtils.ellipsize(cd.L0(2131753966, null), org.telegram.ui.ActionBar.t6.H2, L, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.t6.H2, L, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    } else {
                        jj jjVar2 = q1Var.O5;
                        q1Var.O5 = null;
                        q1Var.s3(jjVar2, q1Var.K, q1Var.F, q1Var.E, q1Var.G, false);
                    }
                }
                if (q1Var.f22555f3) {
                    q1Var.invalidate();
                    q1Var.f22537db = false;
                    return;
                }
                RectF rectF = q1Var.f22488a4;
                q1Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                if (q1Var.f22537db) {
                    org.telegram.messenger.i0.h3(h1Var, 1000L);
                    return;
                }
                return;
        }
    }
}
