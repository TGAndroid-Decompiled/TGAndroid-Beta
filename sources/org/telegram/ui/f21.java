package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class f21 extends f61 {
    public final h21 f39139e2;
    public final w51[] f39140f2;
    public final i21 f39141g2;

    public f21(i21 i21Var, i21 i21Var2, Activity activity, Integer num, h21 h21Var, w51[] w51VarArr) {
        super(i21Var2, activity, false, num, 2, null);
        this.f39141g2 = i21Var;
        this.f39139e2 = h21Var;
        this.f39140f2 = w51VarArr;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l4 != null) {
            i21 i21Var = this.f39141g2;
            i10 = ((org.telegram.ui.ActionBar.r2) i21Var).currentAccount;
            MediaDataController mediaDataController = MediaDataController.getInstance(i10);
            mediaDataController.setDoubleTapReaction("animated_" + l4);
            h21 h21Var = this.f39139e2;
            if (h21Var != null) {
                h21Var.a(true);
            }
            w51 w51Var = this.f39140f2[0];
            if (w51Var != null) {
                i21Var.f40032n = null;
                w51Var.dismiss();
            }
        }
    }

    @Override
    public final void r(o51 o51Var, bh.x0 x0Var) {
        int i10;
        i21 i21Var = this.f39141g2;
        i10 = ((org.telegram.ui.ActionBar.r2) i21Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction(x0Var.f4208f);
        h21 h21Var = this.f39139e2;
        if (h21Var != null) {
            h21Var.a(true);
        }
        w51 w51Var = this.f39140f2[0];
        if (w51Var != null) {
            i21Var.f40032n = null;
            w51Var.dismiss();
        }
    }
}
