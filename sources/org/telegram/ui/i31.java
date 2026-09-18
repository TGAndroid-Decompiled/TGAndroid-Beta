package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class i31 extends g71 {
    public final k31 f34305d2;
    public final x61[] f34306e2;
    public final l31 f34307f2;

    public i31(l31 l31Var, l31 l31Var2, Activity activity, Integer num, k31 k31Var, x61[] x61VarArr) {
        super(l31Var2, activity, false, num, 2, null);
        this.f34307f2 = l31Var;
        this.f34305d2 = k31Var;
        this.f34306e2 = x61VarArr;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l4 != null) {
            l31 l31Var = this.f34307f2;
            i10 = ((org.telegram.ui.ActionBar.n2) l31Var).currentAccount;
            MediaDataController mediaDataController = MediaDataController.getInstance(i10);
            mediaDataController.setDoubleTapReaction("animated_" + l4);
            k31 k31Var = this.f34305d2;
            if (k31Var != null) {
                k31Var.a(true);
            }
            x61 x61Var = this.f34306e2[0];
            if (x61Var != null) {
                l31Var.f35237n = null;
                x61Var.dismiss();
            }
        }
    }

    @Override
    public final void r(p61 p61Var, zg.o0 o0Var) {
        int i10;
        l31 l31Var = this.f34307f2;
        i10 = ((org.telegram.ui.ActionBar.n2) l31Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction(o0Var.f49377f);
        k31 k31Var = this.f34305d2;
        if (k31Var != null) {
            k31Var.a(true);
        }
        x61 x61Var = this.f34306e2[0];
        if (x61Var != null) {
            l31Var.f35237n = null;
            x61Var.dismiss();
        }
    }
}
