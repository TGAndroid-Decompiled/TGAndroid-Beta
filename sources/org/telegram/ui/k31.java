package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class k31 extends n71 {
    public final m31 f39353d2;
    public final e71[] f39354e2;
    public final n31 f39355f2;

    public k31(n31 n31Var, n31 n31Var2, Activity activity, Integer num, m31 m31Var, e71[] e71VarArr) {
        super(n31Var2, activity, false, num, 2, null);
        this.f39355f2 = n31Var;
        this.f39353d2 = m31Var;
        this.f39354e2 = e71VarArr;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l4 != null) {
            n31 n31Var = this.f39355f2;
            i10 = ((org.telegram.ui.ActionBar.m2) n31Var).currentAccount;
            MediaDataController mediaDataController = MediaDataController.getInstance(i10);
            mediaDataController.setDoubleTapReaction("animated_" + l4);
            m31 m31Var = this.f39353d2;
            if (m31Var != null) {
                m31Var.a(true);
            }
            e71 e71Var = this.f39354e2[0];
            if (e71Var != null) {
                n31Var.f40202n = null;
                e71Var.dismiss();
            }
        }
    }

    @Override
    public final void r(w61 w61Var, zg.n0 n0Var) {
        int i10;
        n31 n31Var = this.f39355f2;
        i10 = ((org.telegram.ui.ActionBar.m2) n31Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction(n0Var.f54849f);
        m31 m31Var = this.f39353d2;
        if (m31Var != null) {
            m31Var.a(true);
        }
        e71 e71Var = this.f39354e2[0];
        if (e71Var != null) {
            n31Var.f40202n = null;
            e71Var.dismiss();
        }
    }
}
