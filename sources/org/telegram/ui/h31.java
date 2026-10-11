package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class h31 extends j71 {
    public final j31 f38272d2;
    public final a71[] f38273e2;
    public final k31 f38274f2;

    public h31(k31 k31Var, k31 k31Var2, Activity activity, Integer num, j31 j31Var, a71[] a71VarArr) {
        super(k31Var2, activity, false, num, 2, null);
        this.f38274f2 = k31Var;
        this.f38272d2 = j31Var;
        this.f38273e2 = a71VarArr;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l4 != null) {
            k31 k31Var = this.f38274f2;
            i10 = ((org.telegram.ui.ActionBar.m2) k31Var).currentAccount;
            MediaDataController mediaDataController = MediaDataController.getInstance(i10);
            mediaDataController.setDoubleTapReaction("animated_" + l4);
            j31 j31Var = this.f38272d2;
            if (j31Var != null) {
                j31Var.a(true);
            }
            a71 a71Var = this.f38273e2[0];
            if (a71Var != null) {
                k31Var.f39219n = null;
                a71Var.dismiss();
            }
        }
    }

    @Override
    public final void r(s61 s61Var, zg.n0 n0Var) {
        int i10;
        k31 k31Var = this.f38274f2;
        i10 = ((org.telegram.ui.ActionBar.m2) k31Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction(n0Var.f54738f);
        j31 j31Var = this.f38272d2;
        if (j31Var != null) {
            j31Var.a(true);
        }
        a71 a71Var = this.f38273e2[0];
        if (a71Var != null) {
            k31Var.f39219n = null;
            a71Var.dismiss();
        }
    }
}
