package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import org.telegram.messenger.bd;
import org.telegram.messenger.zi;
public final class h1 implements Runnable {
    public final int f29292a;
    public final q1 f29293b;

    public h1(q1 q1Var, int i3) {
        this.f29292a = i3;
        this.f29293b = q1Var;
    }

    @Override
    public final void run() {
        boolean w22;
        switch (this.f29292a) {
            case 0:
                l1 l1Var = this.f29293b.Ra;
                if (l1Var != null) {
                    l1Var.v();
                    return;
                }
                return;
            default:
                q1 q1Var = this.f29293b;
                h1 h1Var = q1Var.f30117vb;
                zi ziVar = q1Var.P5;
                if (ziVar != null && (w22 = q1Var.w2(ziVar)) != q1Var.f29925g3) {
                    q1Var.f29925g3 = w22;
                    if (!w22) {
                        org.telegram.messenger.g0.i3(h1Var, 1000L);
                        q1Var.f29904eb = true;
                        int L = q1Var.f29848a7 - org.telegram.messenger.g0.L(91.0f);
                        q1Var.f29883d3 = new StaticLayout(TextUtils.ellipsize(bd.M0(2131753966, null), org.telegram.ui.ActionBar.k6.H2, L, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.k6.H2, L, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    } else {
                        zi ziVar2 = q1Var.P5;
                        q1Var.P5 = null;
                        q1Var.u3(ziVar2, q1Var.L, q1Var.G, q1Var.F, q1Var.H, false);
                    }
                }
                if (q1Var.f29925g3) {
                    q1Var.invalidate();
                    q1Var.f29904eb = false;
                    return;
                }
                RectF rectF = q1Var.f29858b4;
                q1Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                if (q1Var.f29904eb) {
                    org.telegram.messenger.g0.i3(h1Var, 1000L);
                    return;
                }
                return;
        }
    }
}
