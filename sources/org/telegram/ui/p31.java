package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class p31 extends r71 {
    public final r31 f39113d2;
    public final i71[] f39114e2;
    public final s31 f39115f2;

    public p31(s31 s31Var, s31 s31Var2, Activity activity, Integer num, r31 r31Var, i71[] i71VarArr) {
        super(s31Var2, activity, false, num, 2, null);
        this.f39115f2 = s31Var;
        this.f39113d2 = r31Var;
        this.f39114e2 = i71VarArr;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l4 != null) {
            s31 s31Var = this.f39115f2;
            i10 = ((org.telegram.ui.ActionBar.m2) s31Var).currentAccount;
            MediaDataController mediaDataController = MediaDataController.getInstance(i10);
            mediaDataController.setDoubleTapReaction("animated_" + l4);
            r31 r31Var = this.f39113d2;
            if (r31Var != null) {
                r31Var.a(true);
            }
            i71 i71Var = this.f39114e2[0];
            if (i71Var != null) {
                s31Var.f39970n = null;
                i71Var.dismiss();
            }
        }
    }

    @Override
    public final void r(a71 a71Var, ah.i1 i1Var) {
        int i10;
        s31 s31Var = this.f39115f2;
        i10 = ((org.telegram.ui.ActionBar.m2) s31Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction(i1Var.f779f);
        r31 r31Var = this.f39113d2;
        if (r31Var != null) {
            r31Var.a(true);
        }
        i71 i71Var = this.f39114e2[0];
        if (i71Var != null) {
            s31Var.f39970n = null;
            i71Var.dismiss();
        }
    }
}
