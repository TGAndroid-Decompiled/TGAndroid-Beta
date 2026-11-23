package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
public final class i1 implements Runnable {
    public final int f30773a;
    public final r1 f30774b;

    public i1(r1 r1Var, int i7) {
        this.f30773a = i7;
        this.f30774b = r1Var;
    }

    @Override
    public final void run() {
        boolean z22;
        switch (this.f30773a) {
            case 0:
                m1 m1Var = this.f30774b.Sa;
                if (m1Var != null) {
                    m1Var.v();
                    return;
                }
                return;
            default:
                r1 r1Var = this.f30774b;
                i1 i1Var = r1Var.f31626wb;
                gj gjVar = r1Var.Q5;
                if (gjVar != null && (z22 = r1Var.z2(gjVar)) != r1Var.f31417h3) {
                    r1Var.f31417h3 = z22;
                    if (!z22) {
                        org.telegram.messenger.g0.h3(i1Var, 1000L);
                        r1Var.f31398fb = true;
                        int L = r1Var.f31342b7 - org.telegram.messenger.g0.L(91.0f);
                        r1Var.f31377e3 = new StaticLayout(TextUtils.ellipsize(hd.N0(2131753963, null), org.telegram.ui.ActionBar.m6.H2, L, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.m6.H2, L, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    } else {
                        gj gjVar2 = r1Var.Q5;
                        r1Var.Q5 = null;
                        r1Var.y3(gjVar2, r1Var.L, r1Var.G, r1Var.F, r1Var.H, false);
                    }
                }
                if (r1Var.f31417h3) {
                    r1Var.invalidate();
                    r1Var.f31398fb = false;
                    return;
                }
                RectF rectF = r1Var.f31352c4;
                r1Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                if (r1Var.f31398fb) {
                    org.telegram.messenger.g0.h3(i1Var, 1000L);
                    return;
                }
                return;
        }
    }
}
