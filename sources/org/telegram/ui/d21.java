package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

public final class d21 extends a61 {
    public final f21 Z1;
    public final r51[] a2;

    public final g21 f37245b2;

    public d21(g21 g21Var, g21 g21Var2, Activity activity, Integer num, f21 f21Var, r51[] r51VarArr) {
        super(g21Var2, activity, false, num, 2, null);
        this.f37245b2 = g21Var;
        this.Z1 = f21Var;
        this.a2 = r51VarArr;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        if (l10 == null) {
            return;
        }
        g21 g21Var = this.f37245b2;
        MediaDataController.getInstance(((org.telegram.ui.ActionBar.n2) g21Var).currentAccount).setDoubleTapReaction("animated_" + l10);
        f21 f21Var = this.Z1;
        if (f21Var != null) {
            f21Var.a(true);
        }
        r51 r51Var = this.a2[0];
        if (r51Var != null) {
            g21Var.f38293n = null;
            r51Var.dismiss();
        }
    }

    @Override
    public final void r(j51 j51Var, ig.q0 q0Var) {
        g21 g21Var = this.f37245b2;
        MediaDataController.getInstance(((org.telegram.ui.ActionBar.n2) g21Var).currentAccount).setDoubleTapReaction(q0Var.f11412f);
        f21 f21Var = this.Z1;
        if (f21Var != null) {
            f21Var.a(true);
        }
        r51 r51Var = this.a2[0];
        if (r51Var != null) {
            g21Var.f38293n = null;
            r51Var.dismiss();
        }
    }
}
