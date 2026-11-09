package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
public final class h1 implements Runnable {
    public final int f29233a;
    public final q1 f29234b;

    public h1(q1 q1Var, int i7) {
        this.f29233a = i7;
        this.f29234b = q1Var;
    }

    @Override
    public final void run() {
        boolean w22;
        switch (this.f29233a) {
            case 0:
                l1 l1Var = this.f29234b.Ra;
                if (l1Var != null) {
                    l1Var.u();
                    return;
                }
                return;
            default:
                q1 q1Var = this.f29234b;
                h1 h1Var = q1Var.f30050vb;
                ij ijVar = q1Var.P5;
                if (ijVar != null && (w22 = q1Var.w2(ijVar)) != q1Var.f29855g3) {
                    q1Var.f29855g3 = w22;
                    if (!w22) {
                        org.telegram.messenger.g0.i3(h1Var, 1000L);
                        q1Var.eb = true;
                        int L = q1Var.f29780a7 - org.telegram.messenger.g0.L(91.0f);
                        q1Var.f29816d3 = new StaticLayout(TextUtils.ellipsize(id.M0(2131753966, null), org.telegram.ui.ActionBar.l6.H2, L, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.l6.H2, L, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    } else {
                        ij ijVar2 = q1Var.P5;
                        q1Var.P5 = null;
                        q1Var.w3(ijVar2, q1Var.K, q1Var.F, q1Var.E, q1Var.G, false);
                    }
                }
                if (q1Var.f29855g3) {
                    q1Var.invalidate();
                    q1Var.eb = false;
                    return;
                }
                RectF rectF = q1Var.f29791b4;
                q1Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                if (q1Var.eb) {
                    org.telegram.messenger.g0.i3(h1Var, 1000L);
                    return;
                }
                return;
        }
    }
}
