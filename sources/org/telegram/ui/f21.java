package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class f21 extends d61 {
    public final h21 Z1;
    public final u51[] a2;
    public final i21 f37966b2;

    public f21(i21 i21Var, i21 i21Var2, Activity activity, Integer num, h21 h21Var, u51[] u51VarArr) {
        super(i21Var2, activity, false, num, 2, null);
        this.f37966b2 = i21Var;
        this.Z1 = h21Var;
        this.a2 = u51VarArr;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l10 != null) {
            i21 i21Var = this.f37966b2;
            i10 = ((org.telegram.ui.ActionBar.o2) i21Var).currentAccount;
            MediaDataController mediaDataController = MediaDataController.getInstance(i10);
            mediaDataController.setDoubleTapReaction("animated_" + l10);
            h21 h21Var = this.Z1;
            if (h21Var != null) {
                h21Var.a(true);
            }
            u51 u51Var = this.a2[0];
            if (u51Var != null) {
                i21Var.f39115n = null;
                u51Var.dismiss();
            }
        }
    }

    @Override
    public final void r(m51 m51Var, kg.q0 q0Var) {
        int i10;
        i21 i21Var = this.f37966b2;
        i10 = ((org.telegram.ui.ActionBar.o2) i21Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction(q0Var.f13825f);
        h21 h21Var = this.Z1;
        if (h21Var != null) {
            h21Var.a(true);
        }
        u51 u51Var = this.a2[0];
        if (u51Var != null) {
            i21Var.f39115n = null;
            u51Var.dismiss();
        }
    }
}
