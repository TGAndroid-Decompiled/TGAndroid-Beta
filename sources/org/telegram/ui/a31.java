package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a31 extends a71 {
    public final c31 f31973d2;
    public final r61[] f31974e2;
    public final d31 f31975f2;

    public a31(d31 d31Var, d31 d31Var2, Activity activity, Integer num, c31 c31Var, r61[] r61VarArr) {
        super(d31Var2, activity, false, num, 2, null);
        this.f31975f2 = d31Var;
        this.f31973d2 = c31Var;
        this.f31974e2 = r61VarArr;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l4 != null) {
            d31 d31Var = this.f31975f2;
            i10 = ((org.telegram.ui.ActionBar.m2) d31Var).currentAccount;
            MediaDataController mediaDataController = MediaDataController.getInstance(i10);
            mediaDataController.setDoubleTapReaction("animated_" + l4);
            c31 c31Var = this.f31973d2;
            if (c31Var != null) {
                c31Var.a(true);
            }
            r61 r61Var = this.f31974e2[0];
            if (r61Var != null) {
                d31Var.f32909n = null;
                r61Var.dismiss();
            }
        }
    }

    @Override
    public final void r(j61 j61Var, zg.o0 o0Var) {
        int i10;
        d31 d31Var = this.f31975f2;
        i10 = ((org.telegram.ui.ActionBar.m2) d31Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction(o0Var.f49396f);
        c31 c31Var = this.f31973d2;
        if (c31Var != null) {
            c31Var.a(true);
        }
        r61 r61Var = this.f31974e2[0];
        if (r61Var != null) {
            d31Var.f32909n = null;
            r61Var.dismiss();
        }
    }
}
