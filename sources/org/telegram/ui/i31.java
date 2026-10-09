package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class i31 extends k71 {
    public final k31 f38468d2;
    public final b71[] f38469e2;
    public final l31 f38470f2;

    public i31(l31 l31Var, l31 l31Var2, Activity activity, Integer num, k31 k31Var, b71[] b71VarArr) {
        super(l31Var2, activity, false, num, 2, null);
        this.f38470f2 = l31Var;
        this.f38468d2 = k31Var;
        this.f38469e2 = b71VarArr;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l4 != null) {
            l31 l31Var = this.f38470f2;
            i10 = ((org.telegram.ui.ActionBar.n2) l31Var).currentAccount;
            MediaDataController mediaDataController = MediaDataController.getInstance(i10);
            mediaDataController.setDoubleTapReaction("animated_" + l4);
            k31 k31Var = this.f38468d2;
            if (k31Var != null) {
                k31Var.a(true);
            }
            b71 b71Var = this.f38469e2[0];
            if (b71Var != null) {
                l31Var.f39419n = null;
                b71Var.dismiss();
            }
        }
    }

    @Override
    public final void r(t61 t61Var, zg.n0 n0Var) {
        int i10;
        l31 l31Var = this.f38470f2;
        i10 = ((org.telegram.ui.ActionBar.n2) l31Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction(n0Var.f54617f);
        k31 k31Var = this.f38468d2;
        if (k31Var != null) {
            k31Var.a(true);
        }
        b71 b71Var = this.f38469e2[0];
        if (b71Var != null) {
            l31Var.f39419n = null;
            b71Var.dismiss();
        }
    }
}
