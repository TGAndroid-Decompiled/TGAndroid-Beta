package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class k31 extends i71 {
    public final m31 f34981d2;
    public final z61[] f34982e2;
    public final n31 f34983f2;

    public k31(n31 n31Var, n31 n31Var2, Activity activity, Integer num, m31 m31Var, z61[] z61VarArr) {
        super(n31Var2, activity, false, num, 2, null);
        this.f34983f2 = n31Var;
        this.f34981d2 = m31Var;
        this.f34982e2 = z61VarArr;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l4 != null) {
            n31 n31Var = this.f34983f2;
            i10 = ((org.telegram.ui.ActionBar.o2) n31Var).currentAccount;
            MediaDataController mediaDataController = MediaDataController.getInstance(i10);
            mediaDataController.setDoubleTapReaction("animated_" + l4);
            m31 m31Var = this.f34981d2;
            if (m31Var != null) {
                m31Var.a(true);
            }
            z61 z61Var = this.f34982e2[0];
            if (z61Var != null) {
                n31Var.f35932n = null;
                z61Var.dismiss();
            }
        }
    }

    @Override
    public final void r(r61 r61Var, zg.p0 p0Var) {
        int i10;
        n31 n31Var = this.f34983f2;
        i10 = ((org.telegram.ui.ActionBar.o2) n31Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction(p0Var.f49150f);
        m31 m31Var = this.f34981d2;
        if (m31Var != null) {
            m31Var.a(true);
        }
        z61 z61Var = this.f34982e2[0];
        if (z61Var != null) {
            n31Var.f35932n = null;
            z61Var.dismiss();
        }
    }
}
