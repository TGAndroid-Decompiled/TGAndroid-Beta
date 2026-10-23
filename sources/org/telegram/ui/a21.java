package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a21 extends b61 {
    public final c21 f35559e2;
    public final s51[] f35560f2;
    public final d21 f35561g2;

    public a21(d21 d21Var, d21 d21Var2, Activity activity, Integer num, c21 c21Var, s51[] s51VarArr) {
        super(d21Var2, activity, false, num, 2, null);
        this.f35561g2 = d21Var;
        this.f35559e2 = c21Var;
        this.f35560f2 = s51VarArr;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l4 != null) {
            d21 d21Var = this.f35561g2;
            i10 = ((org.telegram.ui.ActionBar.o2) d21Var).currentAccount;
            MediaDataController mediaDataController = MediaDataController.getInstance(i10);
            mediaDataController.setDoubleTapReaction("animated_" + l4);
            c21 c21Var = this.f35559e2;
            if (c21Var != null) {
                c21Var.a(true);
            }
            s51 s51Var = this.f35560f2[0];
            if (s51Var != null) {
                d21Var.f36491n = null;
                s51Var.dismiss();
            }
        }
    }

    @Override
    public final void r(k51 k51Var, ah.i1 i1Var) {
        int i10;
        d21 d21Var = this.f35561g2;
        i10 = ((org.telegram.ui.ActionBar.o2) d21Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction(i1Var.f784f);
        c21 c21Var = this.f35559e2;
        if (c21Var != null) {
            c21Var.a(true);
        }
        s51 s51Var = this.f35560f2[0];
        if (s51Var != null) {
            d21Var.f36491n = null;
            s51Var.dismiss();
        }
    }
}
