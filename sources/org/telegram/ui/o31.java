package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class o31 extends l71 {
    public final q31 f35394d2;
    public final c71[] f35395e2;
    public final r31 f35396f2;

    public o31(r31 r31Var, r31 r31Var2, Activity activity, Integer num, q31 q31Var, c71[] c71VarArr) {
        super(r31Var2, activity, false, num, 2, null);
        this.f35396f2 = r31Var;
        this.f35394d2 = q31Var;
        this.f35395e2 = c71VarArr;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l4 != null) {
            r31 r31Var = this.f35396f2;
            i10 = ((org.telegram.ui.ActionBar.p2) r31Var).currentAccount;
            MediaDataController mediaDataController = MediaDataController.getInstance(i10);
            mediaDataController.setDoubleTapReaction("animated_" + l4);
            q31 q31Var = this.f35394d2;
            if (q31Var != null) {
                q31Var.a(true);
            }
            c71 c71Var = this.f35395e2[0];
            if (c71Var != null) {
                r31Var.f36208n = null;
                c71Var.dismiss();
            }
        }
    }

    @Override
    public final void r(u61 u61Var, yg.p0 p0Var) {
        int i10;
        r31 r31Var = this.f35396f2;
        i10 = ((org.telegram.ui.ActionBar.p2) r31Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction(p0Var.f47101f);
        q31 q31Var = this.f35394d2;
        if (q31Var != null) {
            q31Var.a(true);
        }
        c71 c71Var = this.f35395e2[0];
        if (c71Var != null) {
            r31Var.f36208n = null;
            c71Var.dismiss();
        }
    }
}
