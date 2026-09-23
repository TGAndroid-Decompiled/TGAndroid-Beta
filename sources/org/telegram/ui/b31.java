package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class b31 extends z61 {
    public final d31 f31953d2;
    public final q61[] f31954e2;
    public final e31 f31955f2;

    public b31(e31 e31Var, e31 e31Var2, Activity activity, Integer num, d31 d31Var, q61[] q61VarArr) {
        super(e31Var2, activity, false, num, 2, null);
        this.f31955f2 = e31Var;
        this.f31953d2 = d31Var;
        this.f31954e2 = q61VarArr;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l4 != null) {
            e31 e31Var = this.f31955f2;
            i10 = ((org.telegram.ui.ActionBar.n2) e31Var).currentAccount;
            MediaDataController mediaDataController = MediaDataController.getInstance(i10);
            mediaDataController.setDoubleTapReaction("animated_" + l4);
            d31 d31Var = this.f31953d2;
            if (d31Var != null) {
                d31Var.a(true);
            }
            q61 q61Var = this.f31954e2[0];
            if (q61Var != null) {
                e31Var.f32788n = null;
                q61Var.dismiss();
            }
        }
    }

    @Override
    public final void r(i61 i61Var, zg.p0 p0Var) {
        int i10;
        e31 e31Var = this.f31955f2;
        i10 = ((org.telegram.ui.ActionBar.n2) e31Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction(p0Var.f49071f);
        d31 d31Var = this.f31953d2;
        if (d31Var != null) {
            d31Var.a(true);
        }
        q61 q61Var = this.f31954e2[0];
        if (q61Var != null) {
            e31Var.f32788n = null;
            q61Var.dismiss();
        }
    }
}
