package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class j31 extends j71 {
    public final l31 f34779d2;
    public final a71[] f34780e2;
    public final m31 f34781f2;

    public j31(m31 m31Var, m31 m31Var2, Activity activity, Integer num, l31 l31Var, a71[] a71VarArr) {
        super(m31Var2, activity, false, num, 2, null);
        this.f34781f2 = m31Var;
        this.f34779d2 = l31Var;
        this.f34780e2 = a71VarArr;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l4 != null) {
            m31 m31Var = this.f34781f2;
            i10 = ((org.telegram.ui.ActionBar.n2) m31Var).currentAccount;
            MediaDataController mediaDataController = MediaDataController.getInstance(i10);
            mediaDataController.setDoubleTapReaction("animated_" + l4);
            l31 l31Var = this.f34779d2;
            if (l31Var != null) {
                l31Var.a(true);
            }
            a71 a71Var = this.f34780e2[0];
            if (a71Var != null) {
                m31Var.f35615n = null;
                a71Var.dismiss();
            }
        }
    }

    @Override
    public final void r(s61 s61Var, zg.p0 p0Var) {
        int i10;
        m31 m31Var = this.f34781f2;
        i10 = ((org.telegram.ui.ActionBar.n2) m31Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction(p0Var.f49447f);
        l31 l31Var = this.f34779d2;
        if (l31Var != null) {
            l31Var.a(true);
        }
        a71 a71Var = this.f34780e2[0];
        if (a71Var != null) {
            m31Var.f35615n = null;
            a71Var.dismiss();
        }
    }
}
