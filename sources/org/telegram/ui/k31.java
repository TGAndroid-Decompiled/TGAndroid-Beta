package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class k31 extends j71 {
    public final m31 f37929d2;
    public final a71[] f37930e2;
    public final n31 f37931f2;

    public k31(n31 n31Var, n31 n31Var2, Activity activity, Integer num, m31 m31Var, a71[] a71VarArr) {
        super(n31Var2, activity, false, num, 2, null);
        this.f37931f2 = n31Var;
        this.f37929d2 = m31Var;
        this.f37930e2 = a71VarArr;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l4 != null) {
            n31 n31Var = this.f37931f2;
            i10 = ((org.telegram.ui.ActionBar.n2) n31Var).currentAccount;
            MediaDataController mediaDataController = MediaDataController.getInstance(i10);
            mediaDataController.setDoubleTapReaction("animated_" + l4);
            m31 m31Var = this.f37929d2;
            if (m31Var != null) {
                m31Var.a(true);
            }
            a71 a71Var = this.f37930e2[0];
            if (a71Var != null) {
                n31Var.f38852n = null;
                a71Var.dismiss();
            }
        }
    }

    @Override
    public final void r(s61 s61Var, ah.j1 j1Var) {
        int i10;
        n31 n31Var = this.f37931f2;
        i10 = ((org.telegram.ui.ActionBar.n2) n31Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction(j1Var.f609f);
        m31 m31Var = this.f37929d2;
        if (m31Var != null) {
            m31Var.a(true);
        }
        a71 a71Var = this.f37930e2[0];
        if (a71Var != null) {
            n31Var.f38852n = null;
            a71Var.dismiss();
        }
    }
}
