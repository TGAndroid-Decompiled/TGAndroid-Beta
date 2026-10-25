package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class d21 extends c61 {
    public final f21 f38721e2;
    public final t51[] f38722f2;
    public final g21 f38723g2;

    public d21(g21 g21Var, g21 g21Var2, Activity activity, Integer num, f21 f21Var, t51[] t51VarArr) {
        super(g21Var2, activity, false, num, 2, null);
        this.f38723g2 = g21Var;
        this.f38721e2 = f21Var;
        this.f38722f2 = t51VarArr;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l4 != null) {
            g21 g21Var = this.f38723g2;
            i10 = ((org.telegram.ui.ActionBar.r2) g21Var).currentAccount;
            MediaDataController mediaDataController = MediaDataController.getInstance(i10);
            mediaDataController.setDoubleTapReaction("animated_" + l4);
            f21 f21Var = this.f38721e2;
            if (f21Var != null) {
                f21Var.a(true);
            }
            t51 t51Var = this.f38722f2[0];
            if (t51Var != null) {
                g21Var.f39527n = null;
                t51Var.dismiss();
            }
        }
    }

    @Override
    public final void r(l51 l51Var, bh.x0 x0Var) {
        int i10;
        g21 g21Var = this.f38723g2;
        i10 = ((org.telegram.ui.ActionBar.r2) g21Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction(x0Var.f4208f);
        f21 f21Var = this.f38721e2;
        if (f21Var != null) {
            f21Var.a(true);
        }
        t51 t51Var = this.f38722f2[0];
        if (t51Var != null) {
            g21Var.f39527n = null;
            t51Var.dismiss();
        }
    }
}
