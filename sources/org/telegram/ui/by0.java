package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class by0 extends r11 {
    public final dy0 f46319f2;
    public final i11[] f46320g2;
    public final ey0 f46321h2;

    public by0(ey0 ey0Var, ey0 ey0Var2, Activity activity, Integer num, dy0 dy0Var, i11[] i11VarArr) {
        super(ey0Var2, activity, false, num, 2, null);
        this.f46321h2 = ey0Var;
        this.f46319f2 = dy0Var;
        this.f46320g2 = i11VarArr;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i7;
        if (l10 != null) {
            ey0 ey0Var = this.f46321h2;
            i7 = ((org.telegram.ui.ActionBar.h2) ey0Var).currentAccount;
            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i7);
            d02.f2("animated_" + l10);
            dy0 dy0Var = this.f46319f2;
            if (dy0Var != null) {
                dy0Var.a(true);
            }
            i11 i11Var = this.f46320g2[0];
            if (i11Var != null) {
                ey0Var.f47389n = null;
                i11Var.dismiss();
            }
        }
    }

    @Override
    public final void r(b11 b11Var, ch.p0 p0Var) {
        int i7;
        ey0 ey0Var = this.f46321h2;
        i7 = ((org.telegram.ui.ActionBar.h2) ey0Var).currentAccount;
        org.telegram.messenger.ri.d0(i7).f2(p0Var.f5478f);
        dy0 dy0Var = this.f46319f2;
        if (dy0Var != null) {
            dy0Var.a(true);
        }
        i11 i11Var = this.f46320g2[0];
        if (i11Var != null) {
            ey0Var.f47389n = null;
            i11Var.dismiss();
        }
    }
}
